package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.io.FileOutputStream;
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

    private void flushCurrentMdat() {
        long position = this.fc.position();
        this.fc.position(this.mdat.getOffset());
        this.mdat.getBox(this.fc);
        this.fc.position(position);
        this.mdat.setDataOffset(0L);
        this.mdat.setContentSize(0L);
        this.fos.flush();
        if (this.allowSyncFiles) {
            this.fos.getFD().sync();
        }
    }

    public static long gcd(long j, long j2) {
        if (j2 == 0) {
            return j;
        }
        return gcd(j2, j % j2);
    }

    public int addTrack(MediaFormat mediaFormat, boolean z) {
        return this.currentMp4Movie.addTrack(mediaFormat, z);
    }

    public void createCtts(Track track, bt9 bt9Var) {
        int[] sampleCompositions = track.getSampleCompositions();
        if (sampleCompositions == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        fr2 fr2Var = null;
        for (int i : sampleCompositions) {
            if (fr2Var != null && fr2Var.b == i) {
                fr2Var.a++;
            } else {
                fr2Var = new fr2(1, i);
                arrayList.add(fr2Var);
            }
        }
        ?? z1Var = new z1("ctts");
        z1Var.e = Collections.EMPTY_LIST;
        bp1.r(u84.c(gr2.f, z1Var, z1Var, arrayList));
        z1Var.e = arrayList;
        bt9Var.a(z1Var);
    }

    public id4 createFileTypeBox(boolean z) {
        String str;
        LinkedList linkedList = new LinkedList();
        linkedList.add("isom");
        linkedList.add("iso2");
        if (z) {
            str = "hvc1";
        } else {
            str = "avc1";
        }
        linkedList.add(str);
        linkedList.add("mp41");
        ?? z1Var = new z1("ftyp");
        List list = Collections.EMPTY_LIST;
        z1Var.a = "isom";
        z1Var.b = 512L;
        z1Var.c = linkedList;
        return z1Var;
    }

    public MP4Builder createMovie(Mp4Movie mp4Movie, boolean z, boolean z2) {
        this.currentMp4Movie = mp4Movie;
        FileOutputStream fileOutputStream = new FileOutputStream(mp4Movie.getCacheFile());
        this.fos = fileOutputStream;
        this.fc = fileOutputStream.getChannel();
        id4 createFileTypeBox = createFileTypeBox(z2);
        createFileTypeBox.getBox(this.fc);
        long size = createFileTypeBox.getSize() + this.dataOffset;
        this.dataOffset = size;
        this.wroteSinceLastMdat += size;
        this.splitMdat = z;
        this.mdat = new InterleaveChunkMdat(0);
        this.sizeBuffer = ByteBuffer.allocateDirect(4);
        return this;
    }

    public oh7 createMovieBox(Mp4Movie mp4Movie) {
        ?? b2Var = new b2("moov");
        ?? z1Var = new z1("mvhd");
        z1Var.r = 1.0d;
        z1Var.s = 1.0f;
        ol6 ol6Var = ol6.j;
        z1Var.w = ol6Var;
        Date date = new Date();
        bp1.r(u84.c(ph7.R, z1Var, z1Var, date));
        z1Var.e = date;
        long j = 4294967296L;
        if (ehe.a(date) >= 4294967296L) {
            z1Var.h();
        }
        Date date2 = new Date();
        bp1.r(u84.c(ph7.S, z1Var, z1Var, date2));
        z1Var.f = date2;
        if (ehe.a(date2) >= 4294967296L) {
            z1Var.h();
        }
        bp1.r(u84.c(ph7.V, z1Var, z1Var, ol6Var));
        z1Var.w = ol6Var;
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
            long duration = (track2.getDuration() * timescale) / track2.getTimeScale();
            if (duration > j2) {
                j2 = duration;
            }
            j = j3;
        }
        long j4 = j;
        bp1.r(u84.c(ph7.U, z1Var, z1Var, new Long(j2)));
        z1Var.n = j2;
        if (j2 >= j4) {
            z1Var.h();
        }
        bp1.r(u84.c(ph7.T, z1Var, z1Var, new Long(timescale)));
        z1Var.h = timescale;
        long size2 = mp4Movie.getTracks().size() + 1;
        bp1.r(u84.c(ph7.W, z1Var, z1Var, new Long(size2)));
        z1Var.x = size2;
        b2Var.a(z1Var);
        ArrayList<Track> tracks2 = mp4Movie.getTracks();
        int size3 = tracks2.size();
        while (i < size3) {
            Track track3 = tracks2.get(i);
            i++;
            b2Var.a(createTrackBox(track3, mp4Movie));
        }
        return b2Var;
    }

    public qy0 createStbl(Track track) {
        ?? b2Var = new b2("stbl");
        createStsd(track, b2Var);
        createStts(track, b2Var);
        createCtts(track, b2Var);
        createStss(track, b2Var);
        createStsc(track, b2Var);
        createStsz(track, b2Var);
        createStco(track, b2Var);
        return b2Var;
    }

    public void createStco(Track track, bt9 bt9Var) {
        ArrayList arrayList = new ArrayList();
        ArrayList<Sample> samples = track.getSamples();
        int size = samples.size();
        long j = -1;
        int i = 0;
        while (i < size) {
            Sample sample = samples.get(i);
            i++;
            Sample sample2 = sample;
            long offset = sample2.getOffset();
            if (j != -1 && j != offset) {
                j = -1;
            }
            if (j == -1) {
                arrayList.add(Long.valueOf(offset));
            }
            j = sample2.getSize() + offset;
        }
        long[] jArr = new long[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            jArr[i2] = ((Long) arrayList.get(i2)).longValue();
        }
        ?? z1Var = new z1("stco");
        z1Var.f = new long[0];
        bp1.r(u84.c(n0b.n, z1Var, z1Var, jArr));
        z1Var.f = jArr;
        bt9Var.a(z1Var);
    }

    public void createStsc(Track track, bt9 bt9Var) {
        ?? z1Var = new z1("stsc");
        z1Var.e = Collections.EMPTY_LIST;
        LinkedList linkedList = new LinkedList();
        bp1.r(u84.c(dt9.h, z1Var, z1Var, linkedList));
        z1Var.e = linkedList;
        int size = track.getSamples().size();
        int i = -1;
        int i2 = 1;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Sample sample = track.getSamples().get(i4);
            long size2 = sample.getSize() + sample.getOffset();
            i3++;
            if (i4 == size - 1 || size2 != track.getSamples().get(i4 + 1).getOffset()) {
                if (i != i3) {
                    bp1.r(u84.b(dt9.f, z1Var, z1Var));
                    z1Var.e.add(new ct9(i2, i3, 1L));
                    i = i3;
                }
                i2++;
                i3 = 0;
            }
        }
        bt9Var.a(z1Var);
    }

    public void createStsd(Track track, bt9 bt9Var) {
        bt9Var.a(track.getSampleDescriptionBox());
    }

    public void createStss(Track track, bt9 bt9Var) {
        long[] syncSamples = track.getSyncSamples();
        if (syncSamples != null && syncSamples.length > 0) {
            ?? z1Var = new z1("stss");
            bp1.r(u84.c(pgb.h, z1Var, z1Var, syncSamples));
            z1Var.e = syncSamples;
            bt9Var.a(z1Var);
        }
    }

    public void createStsz(Track track, bt9 bt9Var) {
        ?? z1Var = new z1("stsz");
        z1Var.f = new long[0];
        long[] jArr = this.track2SampleSizes.get(track);
        bp1.r(u84.c(zs9.s, z1Var, z1Var, jArr));
        z1Var.f = jArr;
        bt9Var.a(z1Var);
    }

    public void createStts(Track track, bt9 bt9Var) {
        long[] sampleDurations;
        ArrayList arrayList = new ArrayList();
        trb trbVar = null;
        for (long j : track.getSampleDurations()) {
            if (trbVar != null && trbVar.b == j) {
                trbVar.a++;
            } else {
                trbVar = new trb(1L, j);
                arrayList.add(trbVar);
            }
        }
        ?? z1Var = new z1("stts");
        z1Var.e = Collections.EMPTY_LIST;
        bp1.r(u84.c(urb.f, z1Var, z1Var, arrayList));
        z1Var.e = arrayList;
        bt9Var.a(z1Var);
    }

    public q1c createTrackBox(Track track, Mp4Movie mp4Movie) {
        String str;
        ?? b2Var = new b2("trak");
        ?? z1Var = new z1("tkhd");
        ol6 ol6Var = ol6.j;
        z1Var.x = ol6Var;
        lyc c = u84.c(v1c.a0, z1Var, z1Var, new Boolean(true));
        zb9.a().getClass();
        zb9.b(c);
        z1Var.g(z1Var.d() | 1);
        lyc c2 = u84.c(v1c.b0, z1Var, z1Var, new Boolean(true));
        zb9.a().getClass();
        zb9.b(c2);
        z1Var.g(z1Var.d() | 2);
        lyc c3 = u84.c(v1c.c0, z1Var, z1Var, new Boolean(true));
        zb9.a().getClass();
        zb9.b(c3);
        z1Var.g(z1Var.d() | 4);
        if (track.isAudio()) {
            bp1.r(u84.c(v1c.X, z1Var, z1Var, ol6Var));
            z1Var.x = ol6Var;
        } else {
            ol6 matrix = mp4Movie.getMatrix();
            bp1.r(u84.c(v1c.X, z1Var, z1Var, matrix));
            z1Var.x = matrix;
        }
        bp1.r(u84.c(v1c.V, z1Var, z1Var, new Integer(0)));
        z1Var.s = 0;
        Date creationTime = track.getCreationTime();
        bp1.r(u84.c(v1c.Q, z1Var, z1Var, creationTime));
        z1Var.e = creationTime;
        if (ehe.a(creationTime) >= 4294967296L) {
            z1Var.h();
        }
        long timescale = (getTimescale(mp4Movie) * track.getDuration()) / track.getTimeScale();
        bp1.r(u84.c(v1c.T, z1Var, z1Var, new Long(timescale)));
        z1Var.n = timescale;
        if (timescale >= 4294967296L) {
            z1Var.g(1);
        }
        double height = track.getHeight();
        bp1.r(u84.c(v1c.Z, z1Var, z1Var, new Double(height)));
        z1Var.E = height;
        double width = track.getWidth();
        bp1.r(u84.c(v1c.Y, z1Var, z1Var, new Double(width)));
        z1Var.y = width;
        bp1.r(u84.c(v1c.U, z1Var, z1Var, new Integer(0)));
        z1Var.r = 0;
        Date date = new Date();
        bp1.r(u84.c(v1c.R, z1Var, z1Var, date));
        z1Var.f = date;
        if (ehe.a(date) >= 4294967296L) {
            z1Var.h();
        }
        long trackId = track.getTrackId() + 1;
        bp1.r(u84.c(v1c.S, z1Var, z1Var, new Long(trackId)));
        z1Var.h = trackId;
        float volume = track.getVolume();
        bp1.r(u84.c(v1c.W, z1Var, z1Var, new Float(volume)));
        z1Var.w = volume;
        b2Var.a(z1Var);
        v63 v63Var = new v63("mdia", (byte) 2);
        b2Var.a(v63Var);
        ?? z1Var2 = new z1("mdhd");
        z1Var2.e = new Date();
        z1Var2.f = new Date();
        z1Var2.r = "eng";
        Date creationTime2 = track.getCreationTime();
        bp1.r(u84.c(rs6.F, z1Var2, z1Var2, creationTime2));
        z1Var2.e = creationTime2;
        long duration = track.getDuration();
        bp1.r(u84.c(rs6.H, z1Var2, z1Var2, new Long(duration)));
        z1Var2.n = duration;
        long timeScale = track.getTimeScale();
        bp1.r(u84.c(rs6.G, z1Var2, z1Var2, new Long(timeScale)));
        z1Var2.h = timeScale;
        bp1.r(u84.c(rs6.I, z1Var2, z1Var2, "eng"));
        z1Var2.r = "eng";
        v63Var.a(z1Var2);
        ?? z1Var3 = new z1("hdlr");
        z1Var3.f = null;
        z1Var3.s = true;
        if (track.isAudio()) {
            str = "SoundHandle";
        } else {
            str = "VideoHandle";
        }
        bp1.r(u84.c(je5.y, z1Var3, z1Var3, str));
        z1Var3.f = str;
        String handler = track.getHandler();
        bp1.r(u84.c(je5.E, z1Var3, z1Var3, handler));
        z1Var3.e = handler;
        v63Var.a(z1Var3);
        v63 v63Var2 = new v63("minf", (byte) 3);
        v63Var2.a(track.getMediaHeaderBox());
        v63 v63Var3 = new v63("dinf", (byte) 0);
        v63 v63Var4 = new v63("dref", (byte) 1);
        v63Var3.a(v63Var4);
        ?? z1Var4 = new z1("url ");
        z1Var4.g(1);
        v63Var4.a(z1Var4);
        v63Var2.a(v63Var3);
        v63Var2.a(createStbl(track));
        v63Var.a(v63Var2);
        return b2Var;
    }

    public void finishMovie(File file) {
        if (file == null) {
            finishMovie();
            return;
        }
        this.fos.flush();
        long position = this.fc.position();
        if (this.allowSyncFiles) {
            this.fos.getFD().sync();
        }
        hl.E(this.currentMp4Movie.getCacheFile(), file);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        try {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(position);
            if (this.mdat.getContentSize() != 0) {
                channel.position(this.mdat.getOffset());
                this.mdat.getBox(channel);
                channel.position(position);
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
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public long getLastFrameTimestamp(int i) {
        return this.currentMp4Movie.getLastFrameTimestamp(i);
    }

    public long getTimescale(Mp4Movie mp4Movie) {
        long j;
        if (!mp4Movie.getTracks().isEmpty()) {
            j = mp4Movie.getTracks().iterator().next().getTimeScale();
        } else {
            j = 0;
        }
        ArrayList<Track> tracks = mp4Movie.getTracks();
        int size = tracks.size();
        int i = 0;
        while (i < size) {
            Track track = tracks.get(i);
            i++;
            j = gcd(track.getTimeScale(), j);
        }
        return j;
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
        interleaveChunkMdat.setContentSize(interleaveChunkMdat.getContentSize() + bufferInfo.size);
        long j = this.wroteSinceLastMdat + bufferInfo.size;
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
        this.dataOffset += bufferInfo.size;
        if (!z2) {
            return 0L;
        }
        this.fos.flush();
        if (this.allowSyncFiles) {
            this.fos.getFD().sync();
        }
        return this.fc.position();
    }

    public static class InterleaveChunkMdat implements qy0 {
        private long contentSize;
        private long dataOffset;
        private qv2 parent;

        private InterleaveChunkMdat() {
            this.contentSize = 1073741824L;
            this.dataOffset = 0L;
        }

        private boolean isSmallBox(long j) {
            if (j + 8 < 4294967296L) {
                return true;
            }
            return false;
        }

        @Override
        public void getBox(WritableByteChannel writableByteChannel) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            long size = getSize();
            if (isSmallBox(size)) {
                allocate.putInt((int) size);
            } else {
                allocate.putInt(1);
            }
            allocate.put(qt5.d("mdat"));
            if (isSmallBox(size)) {
                allocate.put(new byte[8]);
            } else {
                allocate.putLong(size);
            }
            allocate.rewind();
            writableByteChannel.write(allocate);
        }

        public long getContentSize() {
            return this.contentSize;
        }

        public long getOffset() {
            return this.dataOffset;
        }

        @Override
        public qv2 getParent() {
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

        public void setContentSize(long j) {
            this.contentSize = j;
        }

        public void setDataOffset(long j) {
            this.dataOffset = j;
        }

        @Override
        public void setParent(qv2 qv2Var) {
            this.parent = qv2Var;
        }

        public InterleaveChunkMdat(int i) {
            this();
        }

        public void parse(g73 g73Var, ByteBuffer byteBuffer, long j, yy0 yy0Var) {
        }
    }

    public void createSidx(Track track, bt9 bt9Var) {
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
}
