package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import c3.h0;
import g5.q;
import g5.r;
import g5.t;
import g5.u;
import g5.v;
import g5.w;
import g5.x;
import g5.y;
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
import org.telegram.messenger.AndroidUtilities;
public class MP4Builder {
    private boolean splitMdat;
    private boolean wasFirstVideoFrame;
    private InterleaveChunkMdat mdat = null;
    private Mp4Movie currentMp4Movie = null;
    private FileOutputStream fos = null;
    private FileChannel f21533fc = null;
    private long dataOffset = 0;
    private long wroteSinceLastMdat = 0;
    private boolean writeNewMdat = true;
    private HashMap<Track, long[]> track2SampleSizes = new HashMap<>();
    private ByteBuffer sizeBuffer = null;
    private boolean allowSyncFiles = true;

    private void flushCurrentMdat() {
        long position = this.f21533fc.position();
        this.f21533fc.position(this.mdat.getOffset());
        this.mdat.getBox(this.f21533fc);
        this.f21533fc.position(position);
        this.mdat.setDataOffset(0L);
        this.mdat.setContentSize(0L);
        this.fos.flush();
        if (this.allowSyncFiles) {
            this.fos.getFD().sync();
        }
    }

    public static long gcd(long j10, long j11) {
        if (j11 == 0) {
            return j10;
        }
        return gcd(j11, j10 % j11);
    }

    public int addTrack(MediaFormat mediaFormat, boolean z10) {
        return this.currentMp4Movie.addTrack(mediaFormat, z10);
    }

    public void createCtts(Track track, g5.p pVar) {
        int[] sampleCompositions = track.getSampleCompositions();
        if (sampleCompositions == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        g5.d dVar = null;
        for (int i10 : sampleCompositions) {
            if (dVar != null && dVar.f12298b == i10) {
                dVar.f12297a++;
            } else {
                dVar = new g5.d(1, i10);
                arrayList.add(dVar);
            }
        }
        ?? aVar = new com.googlecode.mp4parser.a("ctts");
        aVar.e = Collections.EMPTY_LIST;
        h0.s(ue.a.c(g5.e.f12299f, aVar, aVar, arrayList));
        aVar.e = arrayList;
        pVar.a(aVar);
    }

    public g5.i createFileTypeBox(boolean z10) {
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
        aVar.f12301a = "isom";
        aVar.f12302b = 512L;
        aVar.f12303c = linkedList;
        return aVar;
    }

    public MP4Builder createMovie(Mp4Movie mp4Movie, boolean z10, boolean z11) {
        this.currentMp4Movie = mp4Movie;
        FileOutputStream fileOutputStream = new FileOutputStream(mp4Movie.getCacheFile());
        this.fos = fileOutputStream;
        this.f21533fc = fileOutputStream.getChannel();
        g5.i createFileTypeBox = createFileTypeBox(z11);
        createFileTypeBox.getBox(this.f21533fc);
        long size = createFileTypeBox.getSize() + this.dataOffset;
        this.dataOffset = size;
        this.wroteSinceLastMdat += size;
        this.splitMdat = z10;
        this.mdat = new InterleaveChunkMdat();
        this.sizeBuffer = ByteBuffer.allocateDirect(4);
        return this;
    }

    public g5.l createMovieBox(Mp4Movie mp4Movie) {
        ?? bVar = new com.googlecode.mp4parser.b("moov");
        ?? aVar = new com.googlecode.mp4parser.a("mvhd");
        aVar.f12320r = 1.0d;
        aVar.f12321s = 1.0f;
        sc.d dVar = sc.d.f48120j;
        aVar.v = dVar;
        Date date = new Date();
        h0.s(ue.a.c(g5.m.Q, aVar, aVar, date));
        aVar.e = date;
        long j10 = 4294967296L;
        if (i8.e.a(date) >= 4294967296L) {
            aVar.h();
        }
        Date date2 = new Date();
        h0.s(ue.a.c(g5.m.R, aVar, aVar, date2));
        aVar.f12318f = date2;
        if (i8.e.a(date2) >= 4294967296L) {
            aVar.h();
        }
        h0.s(ue.a.c(g5.m.U, aVar, aVar, dVar));
        aVar.v = dVar;
        long timescale = getTimescale(mp4Movie);
        ArrayList<Track> tracks = mp4Movie.getTracks();
        int size = tracks.size();
        int i10 = 0;
        long j11 = 0;
        int i11 = 0;
        while (i11 < size) {
            Track track = tracks.get(i11);
            i11++;
            Track track2 = track;
            track2.prepare();
            long j12 = j10;
            long duration = (track2.getDuration() * timescale) / track2.getTimeScale();
            if (duration > j11) {
                j11 = duration;
            }
            j10 = j12;
        }
        long j13 = j10;
        h0.s(ue.a.c(g5.m.T, aVar, aVar, new Long(j11)));
        aVar.f12319n = j11;
        if (j11 >= j13) {
            aVar.h();
        }
        h0.s(ue.a.c(g5.m.S, aVar, aVar, new Long(timescale)));
        aVar.h = timescale;
        long size2 = mp4Movie.getTracks().size() + 1;
        h0.s(ue.a.c(g5.m.V, aVar, aVar, new Long(size2)));
        aVar.f12322w = size2;
        bVar.a(aVar);
        ArrayList<Track> tracks2 = mp4Movie.getTracks();
        int size3 = tracks2.size();
        while (i10 < size3) {
            Track track3 = tracks2.get(i10);
            i10++;
            bVar.a(createTrackBox(track3, mp4Movie));
        }
        return bVar;
    }

    public g5.b createStbl(Track track) {
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

    public void createStco(Track track, g5.p pVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList<Sample> samples = track.getSamples();
        int size = samples.size();
        long j10 = -1;
        int i10 = 0;
        while (i10 < size) {
            Sample sample = samples.get(i10);
            i10++;
            Sample sample2 = sample;
            long offset = sample2.getOffset();
            if (j10 != -1 && j10 != offset) {
                j10 = -1;
            }
            if (j10 == -1) {
                arrayList.add(Long.valueOf(offset));
            }
            j10 = sample2.getSize() + offset;
        }
        long[] jArr = new long[arrayList.size()];
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            jArr[i11] = ((Long) arrayList.get(i11)).longValue();
        }
        ?? aVar = new com.googlecode.mp4parser.a("stco");
        aVar.f12336f = new long[0];
        h0.s(ue.a.c(t.f12335n, aVar, aVar, jArr));
        aVar.f12336f = jArr;
        pVar.a(aVar);
    }

    public void createStsc(Track track, g5.p pVar) {
        ?? aVar = new com.googlecode.mp4parser.a("stsc");
        aVar.e = Collections.EMPTY_LIST;
        LinkedList linkedList = new LinkedList();
        h0.s(ue.a.c(r.h, aVar, aVar, linkedList));
        aVar.e = linkedList;
        int size = track.getSamples().size();
        int i10 = -1;
        int i11 = 1;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            Sample sample = track.getSamples().get(i13);
            long size2 = sample.getSize() + sample.getOffset();
            i12++;
            if (i13 == size - 1 || size2 != track.getSamples().get(i13 + 1).getOffset()) {
                if (i10 != i12) {
                    h0.s(ue.a.b(r.f12332f, aVar, aVar));
                    aVar.e.add(new q(i11, i12, 1L));
                    i10 = i12;
                }
                i11++;
                i12 = 0;
            }
        }
        pVar.a(aVar);
    }

    public void createStsd(Track track, g5.p pVar) {
        pVar.a(track.getSampleDescriptionBox());
    }

    public void createStss(Track track, g5.p pVar) {
        long[] syncSamples = track.getSyncSamples();
        if (syncSamples != null && syncSamples.length > 0) {
            ?? aVar = new com.googlecode.mp4parser.a("stss");
            h0.s(ue.a.c(u.h, aVar, aVar, syncSamples));
            aVar.e = syncSamples;
            pVar.a(aVar);
        }
    }

    public void createStsz(Track track, g5.p pVar) {
        ?? aVar = new com.googlecode.mp4parser.a("stsz");
        aVar.f12328f = new long[0];
        long[] jArr = this.track2SampleSizes.get(track);
        h0.s(ue.a.c(g5.o.f12327s, aVar, aVar, jArr));
        aVar.f12328f = jArr;
        pVar.a(aVar);
    }

    public void createStts(Track track, g5.p pVar) {
        long[] sampleDurations;
        ArrayList arrayList = new ArrayList();
        v vVar = null;
        for (long j10 : track.getSampleDurations()) {
            if (vVar != null && vVar.f12339b == j10) {
                vVar.f12338a++;
            } else {
                vVar = new v(1L, j10);
                arrayList.add(vVar);
            }
        }
        ?? aVar = new com.googlecode.mp4parser.a("stts");
        aVar.e = Collections.EMPTY_LIST;
        h0.s(ue.a.c(w.f12340f, aVar, aVar, arrayList));
        aVar.e = arrayList;
        pVar.a(aVar);
    }

    public x createTrackBox(Track track, Mp4Movie mp4Movie) {
        String str;
        ?? bVar = new com.googlecode.mp4parser.b("trak");
        ?? aVar = new com.googlecode.mp4parser.a("tkhd");
        sc.d dVar = sc.d.f48120j;
        aVar.f12347w = dVar;
        ti.e c10 = ue.a.c(y.Z, aVar, aVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c10);
        aVar.g(aVar.d() | 1);
        ti.e c11 = ue.a.c(y.f12341a0, aVar, aVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c11);
        aVar.g(aVar.d() | 2);
        ti.e c12 = ue.a.c(y.f12342b0, aVar, aVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c12);
        aVar.g(aVar.d() | 4);
        if (track.isAudio()) {
            h0.s(ue.a.c(y.W, aVar, aVar, dVar));
            aVar.f12347w = dVar;
        } else {
            sc.d matrix = mp4Movie.getMatrix();
            h0.s(ue.a.c(y.W, aVar, aVar, matrix));
            aVar.f12347w = matrix;
        }
        h0.s(ue.a.c(y.U, aVar, aVar, new Integer(0)));
        aVar.f12346s = 0;
        Date creationTime = track.getCreationTime();
        h0.s(ue.a.c(y.P, aVar, aVar, creationTime));
        aVar.e = creationTime;
        if (i8.e.a(creationTime) >= 4294967296L) {
            aVar.h();
        }
        long timescale = (getTimescale(mp4Movie) * track.getDuration()) / track.getTimeScale();
        h0.s(ue.a.c(y.S, aVar, aVar, new Long(timescale)));
        aVar.f12344n = timescale;
        if (timescale >= 4294967296L) {
            aVar.g(1);
        }
        double height = track.getHeight();
        h0.s(ue.a.c(y.Y, aVar, aVar, new Double(height)));
        aVar.f12349y = height;
        double width = track.getWidth();
        h0.s(ue.a.c(y.X, aVar, aVar, new Double(width)));
        aVar.f12348x = width;
        h0.s(ue.a.c(y.T, aVar, aVar, new Integer(0)));
        aVar.f12345r = 0;
        Date date = new Date();
        h0.s(ue.a.c(y.Q, aVar, aVar, date));
        aVar.f12343f = date;
        if (i8.e.a(date) >= 4294967296L) {
            aVar.h();
        }
        long trackId = track.getTrackId() + 1;
        h0.s(ue.a.c(y.R, aVar, aVar, new Long(trackId)));
        aVar.h = trackId;
        float volume = track.getVolume();
        h0.s(ue.a.c(y.V, aVar, aVar, new Float(volume)));
        aVar.v = volume;
        bVar.a(aVar);
        g5.h hVar = new g5.h("mdia", 2);
        bVar.a(hVar);
        ?? aVar2 = new com.googlecode.mp4parser.a("mdhd");
        aVar2.e = new Date();
        aVar2.f12315f = new Date();
        aVar2.f12317r = "eng";
        Date creationTime2 = track.getCreationTime();
        h0.s(ue.a.c(g5.k.E, aVar2, aVar2, creationTime2));
        aVar2.e = creationTime2;
        long duration = track.getDuration();
        h0.s(ue.a.c(g5.k.G, aVar2, aVar2, new Long(duration)));
        aVar2.f12316n = duration;
        long timeScale = track.getTimeScale();
        h0.s(ue.a.c(g5.k.F, aVar2, aVar2, new Long(timeScale)));
        aVar2.h = timeScale;
        h0.s(ue.a.c(g5.k.H, aVar2, aVar2, "eng"));
        aVar2.f12317r = "eng";
        hVar.a(aVar2);
        ?? aVar3 = new com.googlecode.mp4parser.a("hdlr");
        aVar3.f12307f = null;
        aVar3.f12310s = true;
        if (track.isAudio()) {
            str = "SoundHandle";
        } else {
            str = "VideoHandle";
        }
        h0.s(ue.a.c(g5.j.f12305x, aVar3, aVar3, str));
        aVar3.f12307f = str;
        String handler = track.getHandler();
        h0.s(ue.a.c(g5.j.f12306y, aVar3, aVar3, handler));
        aVar3.e = handler;
        hVar.a(aVar3);
        g5.h hVar2 = new g5.h("minf", 3);
        hVar2.a(track.getMediaHeaderBox());
        g5.h hVar3 = new g5.h("dinf", 0);
        g5.h hVar4 = new g5.h("dref", 1);
        hVar3.a(hVar4);
        ?? aVar4 = new com.googlecode.mp4parser.a("url ");
        aVar4.g(1);
        hVar4.a(aVar4);
        hVar2.a(hVar3);
        hVar2.a(createStbl(track));
        hVar.a(hVar2);
        return bVar;
    }

    public void finishMovie() {
        if (this.mdat.getContentSize() != 0) {
            flushCurrentMdat();
        }
        ArrayList<Track> tracks = this.currentMp4Movie.getTracks();
        int size = tracks.size();
        int i10 = 0;
        while (i10 < size) {
            Track track = tracks.get(i10);
            i10++;
            Track track2 = track;
            ArrayList<Sample> samples = track2.getSamples();
            int size2 = samples.size();
            long[] jArr = new long[size2];
            for (int i11 = 0; i11 < size2; i11++) {
                jArr[i11] = samples.get(i11).getSize();
            }
            this.track2SampleSizes.put(track2, jArr);
        }
        createMovieBox(this.currentMp4Movie).getBox(this.f21533fc);
        this.fos.flush();
        if (this.allowSyncFiles) {
            this.fos.getFD().sync();
        }
        this.f21533fc.close();
        this.fos.close();
    }

    public long getLastFrameTimestamp(int i10) {
        return this.currentMp4Movie.getLastFrameTimestamp(i10);
    }

    public long getTimescale(Mp4Movie mp4Movie) {
        long j10;
        if (!mp4Movie.getTracks().isEmpty()) {
            j10 = mp4Movie.getTracks().iterator().next().getTimeScale();
        } else {
            j10 = 0;
        }
        ArrayList<Track> tracks = mp4Movie.getTracks();
        int size = tracks.size();
        int i10 = 0;
        while (i10 < size) {
            Track track = tracks.get(i10);
            i10++;
            j10 = gcd(track.getTimeScale(), j10);
        }
        return j10;
    }

    public void setAllowSyncFiles(boolean z10) {
        this.allowSyncFiles = z10;
    }

    public long writeSampleData(int i10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, boolean z10) {
        boolean z11;
        if (this.writeNewMdat) {
            this.mdat.setContentSize(0L);
            this.mdat.getBox(this.f21533fc);
            this.mdat.setDataOffset(this.dataOffset);
            this.dataOffset += 16;
            this.wroteSinceLastMdat += 16;
            this.writeNewMdat = false;
        }
        InterleaveChunkMdat interleaveChunkMdat = this.mdat;
        interleaveChunkMdat.setContentSize(interleaveChunkMdat.getContentSize() + bufferInfo.size);
        long j10 = this.wroteSinceLastMdat + bufferInfo.size;
        this.wroteSinceLastMdat = j10;
        if (j10 >= 32768) {
            z11 = true;
            if (this.splitMdat) {
                flushCurrentMdat();
                this.writeNewMdat = true;
            }
            this.wroteSinceLastMdat = 0L;
        } else {
            z11 = false;
        }
        this.currentMp4Movie.addSample(i10, this.dataOffset, bufferInfo);
        if (z10) {
            this.sizeBuffer.position(0);
            this.sizeBuffer.putInt(bufferInfo.size - 4);
            this.sizeBuffer.position(0);
            this.f21533fc.write(this.sizeBuffer);
            byteBuffer.position(bufferInfo.offset + 4);
        } else {
            byteBuffer.position(bufferInfo.offset);
        }
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        this.f21533fc.write(byteBuffer);
        this.dataOffset += bufferInfo.size;
        if (!z11) {
            return 0L;
        }
        this.fos.flush();
        if (this.allowSyncFiles) {
            this.fos.getFD().sync();
        }
        return this.f21533fc.position();
    }

    public void finishMovie(File file) {
        if (file == null) {
            finishMovie();
            return;
        }
        this.fos.flush();
        long position = this.f21533fc.position();
        if (this.allowSyncFiles) {
            this.fos.getFD().sync();
        }
        AndroidUtilities.copyFile(this.currentMp4Movie.getCacheFile(), file);
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
            int i10 = 0;
            while (i10 < size) {
                Track track = tracks.get(i10);
                i10++;
                Track track2 = track;
                ArrayList<Sample> samples = track2.getSamples();
                int size2 = samples.size();
                long[] jArr = new long[size2];
                for (int i11 = 0; i11 < size2; i11++) {
                    jArr[i11] = samples.get(i11).getSize();
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

    public void createSidx(Track track, g5.p pVar) {
    }

    public static class InterleaveChunkMdat implements g5.b {
        private long contentSize;
        private long dataOffset;
        private g5.f parent;

        private InterleaveChunkMdat() {
            this.contentSize = 1073741824L;
            this.dataOffset = 0L;
        }

        private boolean isSmallBox(long j10) {
            if (j10 + 8 < 4294967296L) {
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
            allocate.put(f5.c.d("mdat"));
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
        public g5.f getParent() {
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

        public void setContentSize(long j10) {
            this.contentSize = j10;
        }

        public void setDataOffset(long j10) {
            this.dataOffset = j10;
        }

        @Override
        public void setParent(g5.f fVar) {
            this.parent = fVar;
        }

        public void parse(com.googlecode.mp4parser.f fVar, ByteBuffer byteBuffer, long j10, f5.a aVar) {
        }
    }
}
