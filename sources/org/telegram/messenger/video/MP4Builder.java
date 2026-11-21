package org.telegram.messenger.video;

import ab.c0;
import android.media.MediaCodec;
import android.media.MediaFormat;
import c8.pb;
import i5.q;
import i5.r;
import i5.s;
import i5.u;
import i5.v;
import i5.w;
import i5.x;
import i5.y;
import i5.z;
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
import org.telegram.messenger.g0;
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

    public static long gcd(long j3, long j10) {
        if (j10 == 0) {
            return j3;
        }
        return gcd(j10, j3 % j10);
    }

    public int addTrack(MediaFormat mediaFormat, boolean z10) {
        return this.currentMp4Movie.addTrack(mediaFormat, z10);
    }

    public void createCtts(Track track, q qVar) {
        int[] sampleCompositions = track.getSampleCompositions();
        if (sampleCompositions == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        i5.e eVar = null;
        for (int i7 : sampleCompositions) {
            if (eVar != null && eVar.f16083b == i7) {
                eVar.f16082a++;
            } else {
                eVar = new i5.e(1, i7);
                arrayList.add(eVar);
            }
        }
        ?? aVar = new com.googlecode.mp4parser.a("ctts");
        aVar.f16085e = Collections.EMPTY_LIST;
        i5.c.w(ze.a.c(i5.f.f16084f, aVar, aVar, arrayList));
        aVar.f16085e = arrayList;
        qVar.a(aVar);
    }

    public i5.j createFileTypeBox(boolean z10) {
        String str;
        LinkedList linkedList = new LinkedList();
        linkedList.add("isom");
        linkedList.add("iso2");
        if (z10) {
            str = "hvc1";
        } else {
            str = "avc1";
        }
        linkedList.add(str);
        linkedList.add("mp41");
        ?? aVar = new com.googlecode.mp4parser.a("ftyp");
        List list = Collections.EMPTY_LIST;
        aVar.f16089a = "isom";
        aVar.f16090b = 512L;
        aVar.f16091c = linkedList;
        return aVar;
    }

    public MP4Builder createMovie(Mp4Movie mp4Movie, boolean z10, boolean z11) {
        this.currentMp4Movie = mp4Movie;
        FileOutputStream fileOutputStream = new FileOutputStream(mp4Movie.getCacheFile());
        this.fos = fileOutputStream;
        this.fc = fileOutputStream.getChannel();
        i5.j createFileTypeBox = createFileTypeBox(z11);
        createFileTypeBox.getBox(this.fc);
        long size = createFileTypeBox.getSize() + this.dataOffset;
        this.dataOffset = size;
        this.wroteSinceLastMdat += size;
        this.splitMdat = z10;
        this.mdat = new InterleaveChunkMdat();
        this.sizeBuffer = ByteBuffer.allocateDirect(4);
        return this;
    }

    public i5.m createMovieBox(Mp4Movie mp4Movie) {
        ?? bVar = new com.googlecode.mp4parser.b("moov");
        ?? aVar = new com.googlecode.mp4parser.a("mvhd");
        aVar.f16111r = 1.0d;
        aVar.f16112s = 1.0f;
        pc.d dVar = pc.d.f55600j;
        aVar.f16113w = dVar;
        Date date = new Date();
        i5.c.w(ze.a.c(i5.n.R, aVar, aVar, date));
        aVar.f16108e = date;
        long j3 = 4294967296L;
        if (pb.a(date) >= 4294967296L) {
            aVar.h();
        }
        Date date2 = new Date();
        i5.c.w(ze.a.c(i5.n.S, aVar, aVar, date2));
        aVar.f16109f = date2;
        if (pb.a(date2) >= 4294967296L) {
            aVar.h();
        }
        i5.c.w(ze.a.c(i5.n.V, aVar, aVar, dVar));
        aVar.f16113w = dVar;
        long timescale = getTimescale(mp4Movie);
        ArrayList<Track> tracks = mp4Movie.getTracks();
        int size = tracks.size();
        int i7 = 0;
        long j10 = 0;
        int i10 = 0;
        while (i10 < size) {
            Track track = tracks.get(i10);
            i10++;
            Track track2 = track;
            track2.prepare();
            long j11 = j3;
            long duration = (track2.getDuration() * timescale) / track2.getTimeScale();
            if (duration > j10) {
                j10 = duration;
            }
            j3 = j11;
        }
        long j12 = j3;
        i5.c.w(ze.a.c(i5.n.U, aVar, aVar, new Long(j10)));
        aVar.f16110n = j10;
        if (j10 >= j12) {
            aVar.h();
        }
        i5.c.w(ze.a.c(i5.n.T, aVar, aVar, new Long(timescale)));
        aVar.h = timescale;
        long size2 = mp4Movie.getTracks().size() + 1;
        i5.c.w(ze.a.c(i5.n.W, aVar, aVar, new Long(size2)));
        aVar.f16114x = size2;
        bVar.a(aVar);
        ArrayList<Track> tracks2 = mp4Movie.getTracks();
        int size3 = tracks2.size();
        while (i7 < size3) {
            Track track3 = tracks2.get(i7);
            i7++;
            bVar.a(createTrackBox(track3, mp4Movie));
        }
        return bVar;
    }

    public i5.b createStbl(Track track) {
        ?? bVar = new com.googlecode.mp4parser.b("stbl");
        createStsd(track, bVar);
        createStts(track, bVar);
        createCtts(track, bVar);
        createStss(track, bVar);
        createStsc(track, bVar);
        createStsz(track, bVar);
        createStco(track, bVar);
        return bVar;
    }

    public void createStco(Track track, q qVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList<Sample> samples = track.getSamples();
        int size = samples.size();
        long j3 = -1;
        int i7 = 0;
        while (i7 < size) {
            Sample sample = samples.get(i7);
            i7++;
            Sample sample2 = sample;
            long offset = sample2.getOffset();
            if (j3 != -1 && j3 != offset) {
                j3 = -1;
            }
            if (j3 == -1) {
                arrayList.add(Long.valueOf(offset));
            }
            j3 = sample2.getSize() + offset;
        }
        long[] jArr = new long[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            jArr[i10] = ((Long) arrayList.get(i10)).longValue();
        }
        ?? aVar = new com.googlecode.mp4parser.a("stco");
        aVar.f16131f = new long[0];
        i5.c.w(ze.a.c(u.f16130n, aVar, aVar, jArr));
        aVar.f16131f = jArr;
        qVar.a(aVar);
    }

    public void createStsc(Track track, q qVar) {
        ?? aVar = new com.googlecode.mp4parser.a("stsc");
        aVar.f16127e = Collections.EMPTY_LIST;
        LinkedList linkedList = new LinkedList();
        i5.c.w(ze.a.c(s.h, aVar, aVar, linkedList));
        aVar.f16127e = linkedList;
        int size = track.getSamples().size();
        int i7 = -1;
        int i10 = 1;
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Sample sample = track.getSamples().get(i12);
            long size2 = sample.getSize() + sample.getOffset();
            i11++;
            if (i12 == size - 1 || size2 != track.getSamples().get(i12 + 1).getOffset()) {
                if (i7 != i11) {
                    i5.c.w(ze.a.b(s.f16125f, aVar, aVar));
                    aVar.f16127e.add(new r(i10, i11, 1L));
                    i7 = i11;
                }
                i10++;
                i11 = 0;
            }
        }
        qVar.a(aVar);
    }

    public void createStsd(Track track, q qVar) {
        qVar.a(track.getSampleDescriptionBox());
    }

    public void createStss(Track track, q qVar) {
        long[] syncSamples = track.getSyncSamples();
        if (syncSamples != null && syncSamples.length > 0) {
            ?? aVar = new com.googlecode.mp4parser.a("stss");
            i5.c.w(ze.a.c(v.h, aVar, aVar, syncSamples));
            aVar.f16133e = syncSamples;
            qVar.a(aVar);
        }
    }

    public void createStsz(Track track, q qVar) {
        ?? aVar = new com.googlecode.mp4parser.a("stsz");
        aVar.f16121f = new long[0];
        long[] jArr = this.track2SampleSizes.get(track);
        i5.c.w(ze.a.c(i5.p.f16118s, aVar, aVar, jArr));
        aVar.f16121f = jArr;
        qVar.a(aVar);
    }

    public void createStts(Track track, q qVar) {
        long[] sampleDurations;
        ArrayList arrayList = new ArrayList();
        w wVar = null;
        for (long j3 : track.getSampleDurations()) {
            if (wVar != null && wVar.f16135b == j3) {
                wVar.f16134a++;
            } else {
                wVar = new w(1L, j3);
                arrayList.add(wVar);
            }
        }
        ?? aVar = new com.googlecode.mp4parser.a("stts");
        aVar.f16137e = Collections.EMPTY_LIST;
        i5.c.w(ze.a.c(x.f16136f, aVar, aVar, arrayList));
        aVar.f16137e = arrayList;
        qVar.a(aVar);
    }

    public y createTrackBox(Track track, Mp4Movie mp4Movie) {
        String str;
        ?? bVar = new com.googlecode.mp4parser.b("trak");
        ?? aVar = new com.googlecode.mp4parser.a("tkhd");
        pc.d dVar = pc.d.f55600j;
        aVar.f16147x = dVar;
        c0 c10 = ze.a.c(z.f16138a0, aVar, aVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c10);
        aVar.g(aVar.d() | 1);
        c0 c11 = ze.a.c(z.f16139b0, aVar, aVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c11);
        aVar.g(aVar.d() | 2);
        c0 c12 = ze.a.c(z.f16140c0, aVar, aVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c12);
        aVar.g(aVar.d() | 4);
        if (track.isAudio()) {
            i5.c.w(ze.a.c(z.X, aVar, aVar, dVar));
            aVar.f16147x = dVar;
        } else {
            pc.d matrix = mp4Movie.getMatrix();
            i5.c.w(ze.a.c(z.X, aVar, aVar, matrix));
            aVar.f16147x = matrix;
        }
        i5.c.w(ze.a.c(z.V, aVar, aVar, new Integer(0)));
        aVar.f16145s = 0;
        Date creationTime = track.getCreationTime();
        i5.c.w(ze.a.c(z.Q, aVar, aVar, creationTime));
        aVar.f16141e = creationTime;
        if (pb.a(creationTime) >= 4294967296L) {
            aVar.h();
        }
        long timescale = (getTimescale(mp4Movie) * track.getDuration()) / track.getTimeScale();
        i5.c.w(ze.a.c(z.T, aVar, aVar, new Long(timescale)));
        aVar.f16143n = timescale;
        if (timescale >= 4294967296L) {
            aVar.g(1);
        }
        double height = track.getHeight();
        i5.c.w(ze.a.c(z.Z, aVar, aVar, new Double(height)));
        aVar.E = height;
        double width = track.getWidth();
        i5.c.w(ze.a.c(z.Y, aVar, aVar, new Double(width)));
        aVar.f16148y = width;
        i5.c.w(ze.a.c(z.U, aVar, aVar, new Integer(0)));
        aVar.f16144r = 0;
        Date date = new Date();
        i5.c.w(ze.a.c(z.R, aVar, aVar, date));
        aVar.f16142f = date;
        if (pb.a(date) >= 4294967296L) {
            aVar.h();
        }
        long trackId = track.getTrackId() + 1;
        i5.c.w(ze.a.c(z.S, aVar, aVar, new Long(trackId)));
        aVar.h = trackId;
        float volume = track.getVolume();
        i5.c.w(ze.a.c(z.W, aVar, aVar, new Float(volume)));
        aVar.f16146w = volume;
        bVar.a(aVar);
        i5.i iVar = new i5.i("mdia", 2);
        bVar.a(iVar);
        ?? aVar2 = new com.googlecode.mp4parser.a("mdhd");
        aVar2.f16104e = new Date();
        aVar2.f16105f = new Date();
        aVar2.f16107r = "eng";
        Date creationTime2 = track.getCreationTime();
        i5.c.w(ze.a.c(i5.l.F, aVar2, aVar2, creationTime2));
        aVar2.f16104e = creationTime2;
        long duration = track.getDuration();
        i5.c.w(ze.a.c(i5.l.H, aVar2, aVar2, new Long(duration)));
        aVar2.f16106n = duration;
        long timeScale = track.getTimeScale();
        i5.c.w(ze.a.c(i5.l.G, aVar2, aVar2, new Long(timeScale)));
        aVar2.h = timeScale;
        i5.c.w(ze.a.c(i5.l.I, aVar2, aVar2, "eng"));
        aVar2.f16107r = "eng";
        iVar.a(aVar2);
        ?? aVar3 = new com.googlecode.mp4parser.a("hdlr");
        aVar3.f16095f = null;
        aVar3.f16098s = true;
        if (track.isAudio()) {
            str = "SoundHandle";
        } else {
            str = "VideoHandle";
        }
        i5.c.w(ze.a.c(i5.k.f16093y, aVar3, aVar3, str));
        aVar3.f16095f = str;
        String handler = track.getHandler();
        i5.c.w(ze.a.c(i5.k.E, aVar3, aVar3, handler));
        aVar3.f16094e = handler;
        iVar.a(aVar3);
        i5.i iVar2 = new i5.i("minf", 3);
        iVar2.a(track.getMediaHeaderBox());
        i5.i iVar3 = new i5.i("dinf", 0);
        i5.i iVar4 = new i5.i("dref", 1);
        iVar3.a(iVar4);
        ?? aVar4 = new com.googlecode.mp4parser.a("url ");
        aVar4.g(1);
        iVar4.a(aVar4);
        iVar2.a(iVar3);
        iVar2.a(createStbl(track));
        iVar.a(iVar2);
        return bVar;
    }

    public void finishMovie() {
        if (this.mdat.getContentSize() != 0) {
            flushCurrentMdat();
        }
        ArrayList<Track> tracks = this.currentMp4Movie.getTracks();
        int size = tracks.size();
        int i7 = 0;
        while (i7 < size) {
            Track track = tracks.get(i7);
            i7++;
            Track track2 = track;
            ArrayList<Sample> samples = track2.getSamples();
            int size2 = samples.size();
            long[] jArr = new long[size2];
            for (int i10 = 0; i10 < size2; i10++) {
                jArr[i10] = samples.get(i10).getSize();
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

    public long getLastFrameTimestamp(int i7) {
        return this.currentMp4Movie.getLastFrameTimestamp(i7);
    }

    public long getTimescale(Mp4Movie mp4Movie) {
        long j3;
        if (!mp4Movie.getTracks().isEmpty()) {
            j3 = mp4Movie.getTracks().iterator().next().getTimeScale();
        } else {
            j3 = 0;
        }
        ArrayList<Track> tracks = mp4Movie.getTracks();
        int size = tracks.size();
        int i7 = 0;
        while (i7 < size) {
            Track track = tracks.get(i7);
            i7++;
            j3 = gcd(track.getTimeScale(), j3);
        }
        return j3;
    }

    public void setAllowSyncFiles(boolean z10) {
        this.allowSyncFiles = z10;
    }

    public long writeSampleData(int i7, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, boolean z10) {
        boolean z11;
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
        long j3 = this.wroteSinceLastMdat + bufferInfo.size;
        this.wroteSinceLastMdat = j3;
        if (j3 >= 32768) {
            z11 = true;
            if (this.splitMdat) {
                flushCurrentMdat();
                this.writeNewMdat = true;
            }
            this.wroteSinceLastMdat = 0L;
        } else {
            z11 = false;
        }
        this.currentMp4Movie.addSample(i7, this.dataOffset, bufferInfo);
        if (z10) {
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
        if (!z11) {
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
        long position = this.fc.position();
        if (this.allowSyncFiles) {
            this.fos.getFD().sync();
        }
        g0.E(this.currentMp4Movie.getCacheFile(), file);
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
            int i7 = 0;
            while (i7 < size) {
                Track track = tracks.get(i7);
                i7++;
                Track track2 = track;
                ArrayList<Sample> samples = track2.getSamples();
                int size2 = samples.size();
                long[] jArr = new long[size2];
                for (int i10 = 0; i10 < size2; i10++) {
                    jArr[i10] = samples.get(i10).getSize();
                }
                this.track2SampleSizes.put(track2, jArr);
            }
            createMovieBox(this.currentMp4Movie).getBox(channel);
            channel.close();
            randomAccessFile.close();
        } catch (Throwable th2) {
            try {
                randomAccessFile.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public void createSidx(Track track, q qVar) {
    }

    public static class InterleaveChunkMdat implements i5.b {
        private long contentSize;
        private long dataOffset;
        private i5.g parent;

        private InterleaveChunkMdat() {
            this.contentSize = 1073741824L;
            this.dataOffset = 0L;
        }

        private boolean isSmallBox(long j3) {
            if (j3 + 8 < 4294967296L) {
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
                allocate.putInt((int) 1);
            }
            allocate.put(h5.c.d("mdat"));
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
        public i5.g getParent() {
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

        public void setContentSize(long j3) {
            this.contentSize = j3;
        }

        public void setDataOffset(long j3) {
            this.dataOffset = j3;
        }

        @Override
        public void setParent(i5.g gVar) {
            this.parent = gVar;
        }

        public void parse(com.googlecode.mp4parser.f fVar, ByteBuffer byteBuffer, long j3, h5.a aVar) {
        }
    }
}
