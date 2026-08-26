package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import androidx.emoji2.text.MetadataRepo;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoFile;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.DataEntryUrlBox;
import com.coremedia.iso.boxes.FileTypeBox;
import com.coremedia.iso.boxes.HandlerBox;
import com.coremedia.iso.boxes.MediaBox;
import com.coremedia.iso.boxes.MediaHeaderBox;
import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.MovieHeaderBox;
import com.coremedia.iso.boxes.SampleSizeBox;
import com.coremedia.iso.boxes.SampleTableBox;
import com.coremedia.iso.boxes.SampleToChunkBox;
import com.coremedia.iso.boxes.StaticChunkOffsetBox;
import com.coremedia.iso.boxes.SyncSampleBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.DateHelper;
import com.googlecode.mp4parser.util.Matrix;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.aspectj.runtime.reflect.Factory;
import org.telegram.messenger.AndroidUtilities;

public class MP4Builder {
    private boolean splitMdat;
    private boolean wasFirstVideoFrame;
    private InterleaveChunkMdat mdat = null;
    private Mp4Movie currentMp4Movie = null;
    private FileOutputStream fos = null;
    private FileChannel fc = null;
    private long dataOffset = 0;
    private long wroteSinceLastMdat = 0;
    private boolean writeNewMdat = true;
    private HashMap<Track, long[]> track2SampleSizes = new HashMap<>();
    private ByteBuffer sizeBuffer = null;
    private boolean allowSyncFiles = true;

    public static class InterleaveChunkMdat implements Box {
        private long contentSize;
        private long dataOffset;
        private Container parent;

        private InterleaveChunkMdat() {
            this.contentSize = 1073741824L;
            this.dataOffset = 0L;
        }

        private boolean isSmallBox(long j) {
            return j + 8 < 4294967296L;
        }

        @Override
        public void getBox(WritableByteChannel writableByteChannel) throws IOException {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            long size = getSize();
            if (isSmallBox(size)) {
                byteBufferAllocate.putInt((int) size);
            } else {
                byteBufferAllocate.putInt((int) 1);
            }
            byteBufferAllocate.put(IsoFile.fourCCtoBytes("mdat"));
            if (isSmallBox(size)) {
                byteBufferAllocate.put(new byte[8]);
            } else {
                byteBufferAllocate.putLong(size);
            }
            byteBufferAllocate.rewind();
            writableByteChannel.write(byteBufferAllocate);
        }

        public long getContentSize() {
            return this.contentSize;
        }

        public long getOffset() {
            return this.dataOffset;
        }

        @Override
        public Container getParent() {
            return this.parent;
        }

        @Override
        public long getSize() {
            return this.contentSize + 16;
        }

        @Override
        public String getType() {
            return "mdat";
        }

        public void parse(DataSource dataSource, ByteBuffer byteBuffer, long j, BoxParser boxParser) {
        }

        public void setContentSize(long j) {
            this.contentSize = j;
        }

        public void setDataOffset(long j) {
            this.dataOffset = j;
        }

        @Override
        public void setParent(Container container) {
            this.parent = container;
        }
    }

    private void flushCurrentMdat() throws IOException {
        long jPosition = this.fc.position();
        this.fc.position(this.mdat.getOffset());
        this.mdat.getBox(this.fc);
        this.fc.position(jPosition);
        this.mdat.setDataOffset(0L);
        this.mdat.setContentSize(0L);
        this.fos.flush();
        if (this.allowSyncFiles) {
            this.fos.getFD().sync();
        }
    }

    public static long gcd(long j, long j2) {
        return j2 == 0 ? j : gcd(j2, j % j2);
    }

    public int addTrack(MediaFormat mediaFormat, boolean z) {
        return this.currentMp4Movie.addTrack(mediaFormat, z);
    }

    public void createCtts(Track track, SampleTableBox sampleTableBox) {
        int[] sampleCompositions = track.getSampleCompositions();
        if (sampleCompositions == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        CompositionTimeToSample.Entry entry = null;
        for (int i : sampleCompositions) {
            if (entry == null || entry.offset != i) {
                entry = new CompositionTimeToSample.Entry(1, i);
                arrayList.add(entry);
            } else {
                entry.count++;
            }
        }
        CompositionTimeToSample compositionTimeToSample = new CompositionTimeToSample("ctts");
        compositionTimeToSample.entries = Collections.EMPTY_LIST;
        Fragment$$ExternalSyntheticOutline0.m(Factory.makeJP(CompositionTimeToSample.ajc$tjp_1, compositionTimeToSample, compositionTimeToSample, arrayList));
        compositionTimeToSample.entries = arrayList;
        sampleTableBox.addBox(compositionTimeToSample);
    }

    public FileTypeBox createFileTypeBox(boolean z) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("isom");
        linkedList.add("iso2");
        linkedList.add(z ? "hvc1" : "avc1");
        linkedList.add("mp41");
        FileTypeBox fileTypeBox = new FileTypeBox("ftyp");
        List list = Collections.EMPTY_LIST;
        fileTypeBox.majorBrand = "isom";
        fileTypeBox.minorVersion = 512L;
        fileTypeBox.compatibleBrands = linkedList;
        return fileTypeBox;
    }

    public MP4Builder createMovie(Mp4Movie mp4Movie, boolean z, boolean z2) {
        this.currentMp4Movie = mp4Movie;
        FileOutputStream fileOutputStream = new FileOutputStream(mp4Movie.getCacheFile());
        this.fos = fileOutputStream;
        this.fc = fileOutputStream.getChannel();
        FileTypeBox fileTypeBoxCreateFileTypeBox = createFileTypeBox(z2);
        fileTypeBoxCreateFileTypeBox.getBox(this.fc);
        long size = fileTypeBoxCreateFileTypeBox.getSize() + this.dataOffset;
        this.dataOffset = size;
        this.wroteSinceLastMdat += size;
        this.splitMdat = z;
        this.mdat = new InterleaveChunkMdat();
        this.sizeBuffer = ByteBuffer.allocateDirect(4);
        return this;
    }

    public MovieBox createMovieBox(Mp4Movie mp4Movie) {
        MovieBox movieBox = new MovieBox("moov");
        MovieHeaderBox movieHeaderBox = new MovieHeaderBox("mvhd");
        movieHeaderBox.rate = 1.0d;
        movieHeaderBox.volume = 1.0f;
        Matrix matrix = Matrix.ROTATE_0;
        movieHeaderBox.matrix = matrix;
        Date date = new Date();
        Fragment$$ExternalSyntheticOutline0.m(Factory.makeJP(MovieHeaderBox.ajc$tjp_9, movieHeaderBox, movieHeaderBox, date));
        movieHeaderBox.creationTime = date;
        long j = 4294967296L;
        if (DateHelper.convert(date) >= 4294967296L) {
            movieHeaderBox.setVersion();
        }
        Date date2 = new Date();
        Fragment$$ExternalSyntheticOutline0.m(Factory.makeJP(MovieHeaderBox.ajc$tjp_10, movieHeaderBox, movieHeaderBox, date2));
        movieHeaderBox.modificationTime = date2;
        if (DateHelper.convert(date2) >= 4294967296L) {
            movieHeaderBox.setVersion();
        }
        Fragment$$ExternalSyntheticOutline0.m(Factory.makeJP(MovieHeaderBox.ajc$tjp_15, movieHeaderBox, movieHeaderBox, matrix));
        movieHeaderBox.matrix = matrix;
        long timescale = getTimescale(mp4Movie);
        ArrayList<Track> tracks = mp4Movie.getTracks();
        int size = tracks.size();
        int i = 0;
        long j2 = 0;
        int i2 = 0;
        while (i2 < size) {
            Track track = tracks.get(i2);
            i2++;
            Track track2 = track;
            track2.prepare();
            long j3 = j;
            long duration = (track2.getDuration() * timescale) / ((long) track2.getTimeScale());
            if (duration > j2) {
                j2 = duration;
            }
            j = j3;
        }
        long j4 = j;
        Fragment$$ExternalSyntheticOutline0.m(Factory.makeJP(MovieHeaderBox.ajc$tjp_12, movieHeaderBox, movieHeaderBox, new Long(j2)));
        movieHeaderBox.duration = j2;
        if (j2 >= j4) {
            movieHeaderBox.setVersion();
        }
        Fragment$$ExternalSyntheticOutline0.m(Factory.makeJP(MovieHeaderBox.ajc$tjp_11, movieHeaderBox, movieHeaderBox, new Long(timescale)));
        movieHeaderBox.timescale = timescale;
        long size2 = mp4Movie.getTracks().size() + 1;
        Fragment$$ExternalSyntheticOutline0.m(Factory.makeJP(MovieHeaderBox.ajc$tjp_16, movieHeaderBox, movieHeaderBox, new Long(size2)));
        movieHeaderBox.nextTrackId = size2;
        movieBox.addBox(movieHeaderBox);
        ArrayList<Track> tracks2 = mp4Movie.getTracks();
        int size3 = tracks2.size();
        while (i < size3) {
            Track track3 = tracks2.get(i);
            i++;
            movieBox.addBox(createTrackBox(track3, mp4Movie));
        }
        return movieBox;
    }

    public void createSidx(Track track, SampleTableBox sampleTableBox) {
    }

    public Box createStbl(Track track) {
        SampleTableBox sampleTableBox = new SampleTableBox("stbl");
        createStsd(track, sampleTableBox);
        createStts(track, sampleTableBox);
        createCtts(track, sampleTableBox);
        createStss(track, sampleTableBox);
        createStsc(track, sampleTableBox);
        createStsz(track, sampleTableBox);
        createStco(track, sampleTableBox);
        return sampleTableBox;
    }

    public void createStco(Track track, SampleTableBox sampleTableBox) {
        ArrayList arrayList = new ArrayList();
        ArrayList<Sample> samples = track.getSamples();
        int size = samples.size();
        long size2 = -1;
        int i = 0;
        while (i < size) {
            Sample sample = samples.get(i);
            i++;
            Sample sample2 = sample;
            long offset = sample2.getOffset();
            if (size2 != -1 && size2 != offset) {
                size2 = -1;
            }
            if (size2 == -1) {
                arrayList.add(Long.valueOf(offset));
            }
            size2 = sample2.getSize() + offset;
        }
        long[] jArr = new long[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            jArr[i2] = ((Long) arrayList.get(i2)).longValue();
        }
        StaticChunkOffsetBox staticChunkOffsetBox = new StaticChunkOffsetBox("stco");
        staticChunkOffsetBox.chunkOffsets = new long[0];
        Fragment$$ExternalSyntheticOutline0.m(Factory.makeJP(StaticChunkOffsetBox.ajc$tjp_1, staticChunkOffsetBox, staticChunkOffsetBox, jArr));
        staticChunkOffsetBox.chunkOffsets = jArr;
        sampleTableBox.addBox(staticChunkOffsetBox);
    }

    public void createStsc(Track track, SampleTableBox sampleTableBox) {
        SampleToChunkBox sampleToChunkBox = new SampleToChunkBox("stsc");
        sampleToChunkBox.entries = Collections.EMPTY_LIST;
        LinkedList linkedList = new LinkedList();
        Fragment$$ExternalSyntheticOutline0.m(Factory.makeJP(SampleToChunkBox.ajc$tjp_1, sampleToChunkBox, sampleToChunkBox, linkedList));
        sampleToChunkBox.entries = linkedList;
        int size = track.getSamples().size();
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        for (int i4 = 0; i4 < size; i4++) {
            Sample sample = track.getSamples().get(i4);
            long size2 = sample.getSize() + sample.getOffset();
            i2++;
            if (i4 == size - 1 || size2 != track.getSamples().get(i4 + 1).getOffset()) {
                if (i != i2) {
                    Fragment$$ExternalSyntheticOutline0.m(Factory.makeJP(SampleToChunkBox.ajc$tjp_0, sampleToChunkBox, sampleToChunkBox));
                    sampleToChunkBox.entries.add(new SampleToChunkBox.Entry(i3, i2, 1L));
                    i = i2;
                }
                i3++;
                i2 = 0;
            }
        }
        sampleTableBox.addBox(sampleToChunkBox);
    }

    public void createStsd(Track track, SampleTableBox sampleTableBox) {
        sampleTableBox.addBox(track.getSampleDescriptionBox());
    }

    public void createStss(Track track, SampleTableBox sampleTableBox) {
        long[] syncSamples = track.getSyncSamples();
        if (syncSamples == null || syncSamples.length <= 0) {
            return;
        }
        SyncSampleBox syncSampleBox = new SyncSampleBox("stss");
        Fragment$$ExternalSyntheticOutline0.m(Factory.makeJP(SyncSampleBox.ajc$tjp_2, syncSampleBox, syncSampleBox, syncSamples));
        syncSampleBox.sampleNumber = syncSamples;
        sampleTableBox.addBox(syncSampleBox);
    }

    public void createStsz(Track track, SampleTableBox sampleTableBox) {
        SampleSizeBox sampleSizeBox = new SampleSizeBox("stsz");
        sampleSizeBox.sampleSizes = new long[0];
        long[] jArr = this.track2SampleSizes.get(track);
        Fragment$$ExternalSyntheticOutline0.m(Factory.makeJP(SampleSizeBox.ajc$tjp_5, sampleSizeBox, sampleSizeBox, jArr));
        sampleSizeBox.sampleSizes = jArr;
        sampleTableBox.addBox(sampleSizeBox);
    }

    public void createStts(Track track, SampleTableBox sampleTableBox) {
        ArrayList arrayList = new ArrayList();
        TimeToSampleBox.Entry entry = null;
        for (long j : track.getSampleDurations()) {
            if (entry == null || entry.delta != j) {
                entry = new TimeToSampleBox.Entry(1L, j);
                arrayList.add(entry);
            } else {
                entry.count++;
            }
        }
        TimeToSampleBox timeToSampleBox = new TimeToSampleBox("stts");
        timeToSampleBox.entries = Collections.EMPTY_LIST;
        Fragment$$ExternalSyntheticOutline0.m(Factory.makeJP(TimeToSampleBox.ajc$tjp_1, timeToSampleBox, timeToSampleBox, arrayList));
        timeToSampleBox.entries = arrayList;
        sampleTableBox.addBox(timeToSampleBox);
    }

    public TrackBox createTrackBox(Track track, Mp4Movie mp4Movie) {
        TrackBox trackBox = new TrackBox("trak");
        TrackHeaderBox trackHeaderBox = new TrackHeaderBox("tkhd");
        Matrix matrix = Matrix.ROTATE_0;
        trackHeaderBox.matrix = matrix;
        MetadataRepo metadataRepoMakeJP = Factory.makeJP(TrackHeaderBox.ajc$tjp_26, trackHeaderBox, trackHeaderBox, new Boolean(true));
        RequiresParseDetailAspect.aspectOf().getClass();
        RequiresParseDetailAspect.before(metadataRepoMakeJP);
        trackHeaderBox.setFlags(trackHeaderBox.getFlags() | 1);
        MetadataRepo metadataRepoMakeJP2 = Factory.makeJP(TrackHeaderBox.ajc$tjp_27, trackHeaderBox, trackHeaderBox, new Boolean(true));
        RequiresParseDetailAspect.aspectOf().getClass();
        RequiresParseDetailAspect.before(metadataRepoMakeJP2);
        trackHeaderBox.setFlags(trackHeaderBox.getFlags() | 2);
        MetadataRepo metadataRepoMakeJP3 = Factory.makeJP(TrackHeaderBox.ajc$tjp_28, trackHeaderBox, trackHeaderBox, new Boolean(true));
        RequiresParseDetailAspect.aspectOf().getClass();
        RequiresParseDetailAspect.before(metadataRepoMakeJP3);
        trackHeaderBox.setFlags(trackHeaderBox.getFlags() | 4);
        if (track.isAudio()) {
            Fragment$$ExternalSyntheticOutline0.m(Factory.makeJP(TrackHeaderBox.ajc$tjp_19, trackHeaderBox, trackHeaderBox, matrix));
            trackHeaderBox.matrix = matrix;
        } else {
            Matrix matrix2 = mp4Movie.getMatrix();
            Fragment$$ExternalSyntheticOutline0.m(Factory.makeJP(TrackHeaderBox.ajc$tjp_19, trackHeaderBox, trackHeaderBox, matrix2));
            trackHeaderBox.matrix = matrix2;
        }
        Fragment$$ExternalSyntheticOutline0.m(Factory.makeJP(TrackHeaderBox.ajc$tjp_17, trackHeaderBox, trackHeaderBox, new Integer(0)));
        trackHeaderBox.alternateGroup = 0;
        Date creationTime = track.getCreationTime();
        Fragment$$ExternalSyntheticOutline0.m(Factory.makeJP(TrackHeaderBox.ajc$tjp_12, trackHeaderBox, trackHeaderBox, creationTime));
        trackHeaderBox.creationTime = creationTime;
        if (DateHelper.convert(creationTime) >= 4294967296L) {
            trackHeaderBox.setVersion();
        }
        long timescale = (getTimescale(mp4Movie) * track.getDuration()) / ((long) track.getTimeScale());
        Fragment$$ExternalSyntheticOutline0.m(Factory.makeJP(TrackHeaderBox.ajc$tjp_15, trackHeaderBox, trackHeaderBox, new Long(timescale)));
        trackHeaderBox.duration = timescale;
        if (timescale >= 4294967296L) {
            trackHeaderBox.setFlags(1);
        }
        double height = track.getHeight();
        Fragment$$ExternalSyntheticOutline0.m(Factory.makeJP(TrackHeaderBox.ajc$tjp_21, trackHeaderBox, trackHeaderBox, new Double(height)));
        trackHeaderBox.height = height;
        double width = track.getWidth();
        Fragment$$ExternalSyntheticOutline0.m(Factory.makeJP(TrackHeaderBox.ajc$tjp_20, trackHeaderBox, trackHeaderBox, new Double(width)));
        trackHeaderBox.width = width;
        Fragment$$ExternalSyntheticOutline0.m(Factory.makeJP(TrackHeaderBox.ajc$tjp_16, trackHeaderBox, trackHeaderBox, new Integer(0)));
        trackHeaderBox.layer = 0;
        Date date = new Date();
        Fragment$$ExternalSyntheticOutline0.m(Factory.makeJP(TrackHeaderBox.ajc$tjp_13, trackHeaderBox, trackHeaderBox, date));
        trackHeaderBox.modificationTime = date;
        if (DateHelper.convert(date) >= 4294967296L) {
            trackHeaderBox.setVersion();
        }
        long trackId = track.getTrackId() + 1;
        Fragment$$ExternalSyntheticOutline0.m(Factory.makeJP(TrackHeaderBox.ajc$tjp_14, trackHeaderBox, trackHeaderBox, new Long(trackId)));
        trackHeaderBox.trackId = trackId;
        float volume = track.getVolume();
        Fragment$$ExternalSyntheticOutline0.m(Factory.makeJP(TrackHeaderBox.ajc$tjp_18, trackHeaderBox, trackHeaderBox, new Float(volume)));
        trackHeaderBox.volume = volume;
        trackBox.addBox(trackHeaderBox);
        MediaBox mediaBox = new MediaBox("mdia", 0);
        trackBox.addBox(mediaBox);
        MediaHeaderBox mediaHeaderBox = new MediaHeaderBox("mdhd");
        mediaHeaderBox.creationTime = new Date();
        mediaHeaderBox.modificationTime = new Date();
        mediaHeaderBox.language = "eng";
        Date creationTime2 = track.getCreationTime();
        Fragment$$ExternalSyntheticOutline0.m(Factory.makeJP(MediaHeaderBox.ajc$tjp_5, mediaHeaderBox, mediaHeaderBox, creationTime2));
        mediaHeaderBox.creationTime = creationTime2;
        long duration = track.getDuration();
        Fragment$$ExternalSyntheticOutline0.m(Factory.makeJP(MediaHeaderBox.ajc$tjp_8, mediaHeaderBox, mediaHeaderBox, new Long(duration)));
        mediaHeaderBox.duration = duration;
        long timeScale = track.getTimeScale();
        Fragment$$ExternalSyntheticOutline0.m(Factory.makeJP(MediaHeaderBox.ajc$tjp_7, mediaHeaderBox, mediaHeaderBox, new Long(timeScale)));
        mediaHeaderBox.timescale = timeScale;
        Fragment$$ExternalSyntheticOutline0.m(Factory.makeJP(MediaHeaderBox.ajc$tjp_9, mediaHeaderBox, mediaHeaderBox, "eng"));
        mediaHeaderBox.language = "eng";
        mediaBox.addBox(mediaHeaderBox);
        HandlerBox handlerBox = new HandlerBox("hdlr");
        handlerBox.name = null;
        handlerBox.zeroTerm = true;
        String str = track.isAudio() ? "SoundHandle" : "VideoHandle";
        Fragment$$ExternalSyntheticOutline0.m(Factory.makeJP(HandlerBox.ajc$tjp_1, handlerBox, handlerBox, str));
        handlerBox.name = str;
        String handler = track.getHandler();
        Fragment$$ExternalSyntheticOutline0.m(Factory.makeJP(HandlerBox.ajc$tjp_2, handlerBox, handlerBox, handler));
        handlerBox.handlerType = handler;
        mediaBox.addBox(handlerBox);
        MediaBox mediaBox2 = new MediaBox("minf", 3);
        mediaBox2.addBox(track.getMediaHeaderBox());
        MediaBox mediaBox3 = new MediaBox("dinf", 1);
        MediaBox mediaBox4 = new MediaBox("dref", 2);
        mediaBox3.addBox(mediaBox4);
        DataEntryUrlBox dataEntryUrlBox = new DataEntryUrlBox("url ");
        dataEntryUrlBox.setFlags(1);
        mediaBox4.addBox(dataEntryUrlBox);
        mediaBox2.addBox(mediaBox3);
        mediaBox2.addBox(createStbl(track));
        mediaBox.addBox(mediaBox2);
        return trackBox;
    }

    public void finishMovie() {
        if (this.mdat.getContentSize() != 0) {
            flushCurrentMdat();
        }
        ArrayList<Track> tracks = this.currentMp4Movie.getTracks();
        int size = tracks.size();
        int i = 0;
        while (i < size) {
            Track track = tracks.get(i);
            i++;
            Track track2 = track;
            ArrayList<Sample> samples = track2.getSamples();
            int size2 = samples.size();
            long[] jArr = new long[size2];
            for (int i2 = 0; i2 < size2; i2++) {
                jArr[i2] = samples.get(i2).getSize();
            }
            this.track2SampleSizes.put(track2, jArr);
        }
        createMovieBox(this.currentMp4Movie).getBox(this.fc);
        this.fos.flush();
        if (this.allowSyncFiles) {
            this.fos.getFD().sync();
        }
        this.fc.close();
        this.fos.close();
    }

    public long getLastFrameTimestamp(int i) {
        return this.currentMp4Movie.getLastFrameTimestamp(i);
    }

    public long getTimescale(Mp4Movie mp4Movie) {
        long timeScale = !mp4Movie.getTracks().isEmpty() ? mp4Movie.getTracks().iterator().next().getTimeScale() : 0L;
        ArrayList<Track> tracks = mp4Movie.getTracks();
        int size = tracks.size();
        int i = 0;
        while (i < size) {
            Track track = tracks.get(i);
            i++;
            timeScale = gcd(track.getTimeScale(), timeScale);
        }
        return timeScale;
    }

    public void setAllowSyncFiles(boolean z) {
        this.allowSyncFiles = z;
    }

    public long writeSampleData(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, boolean z) {
        boolean z2;
        if (this.writeNewMdat) {
            this.mdat.setContentSize(0L);
            this.mdat.getBox(this.fc);
            this.mdat.setDataOffset(this.dataOffset);
            this.dataOffset += 16;
            this.wroteSinceLastMdat += 16;
            this.writeNewMdat = false;
        }
        InterleaveChunkMdat interleaveChunkMdat = this.mdat;
        interleaveChunkMdat.setContentSize(interleaveChunkMdat.getContentSize() + ((long) bufferInfo.size));
        long j = this.wroteSinceLastMdat + ((long) bufferInfo.size);
        this.wroteSinceLastMdat = j;
        if (j >= 32768) {
            z2 = true;
            if (this.splitMdat) {
                flushCurrentMdat();
                this.writeNewMdat = true;
            }
            this.wroteSinceLastMdat = 0L;
        } else {
            z2 = false;
        }
        this.currentMp4Movie.addSample(i, this.dataOffset, bufferInfo);
        if (z) {
            this.sizeBuffer.position(0);
            this.sizeBuffer.putInt(bufferInfo.size - 4);
            this.sizeBuffer.position(0);
            this.fc.write(this.sizeBuffer);
            byteBuffer.position(bufferInfo.offset + 4);
        } else {
            byteBuffer.position(bufferInfo.offset);
        }
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        this.fc.write(byteBuffer);
        this.dataOffset += (long) bufferInfo.size;
        if (!z2) {
            return 0L;
        }
        this.fos.flush();
        if (this.allowSyncFiles) {
            this.fos.getFD().sync();
        }
        return this.fc.position();
    }

    public void finishMovie(File file) {
        if (file == null) {
            finishMovie();
            return;
        }
        this.fos.flush();
        long jPosition = this.fc.position();
        if (this.allowSyncFiles) {
            this.fos.getFD().sync();
        }
        AndroidUtilities.copyFile(this.currentMp4Movie.getCacheFile(), file);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        try {
            FileChannel channel = randomAccessFile.getChannel();
            try {
                channel.position(jPosition);
                if (this.mdat.getContentSize() != 0) {
                    channel.position(this.mdat.getOffset());
                    this.mdat.getBox(channel);
                    channel.position(jPosition);
                }
                this.track2SampleSizes.clear();
                ArrayList<Track> tracks = this.currentMp4Movie.getTracks();
                int size = tracks.size();
                int i = 0;
                while (i < size) {
                    Track track = tracks.get(i);
                    i++;
                    Track track2 = track;
                    ArrayList<Sample> samples = track2.getSamples();
                    int size2 = samples.size();
                    long[] jArr = new long[size2];
                    for (int i2 = 0; i2 < size2; i2++) {
                        jArr[i2] = samples.get(i2).getSize();
                    }
                    this.track2SampleSizes.put(track2, jArr);
                }
                createMovieBox(this.currentMp4Movie).getBox(channel);
                channel.close();
                randomAccessFile.close();
            } catch (Throwable th) {
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                randomAccessFile.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
