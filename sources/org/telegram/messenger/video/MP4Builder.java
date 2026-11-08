package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import c8.kb;
import i5.r;
import i5.t;
import i5.u;
import i5.v;
import i5.w;
import i5.x;
import i5.y;
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

    public int addTrack(MediaFormat mediaFormat, boolean z9) {
        return this.currentMp4Movie.addTrack(mediaFormat, z9);
    }

    public void createCtts(Track track, i5.p pVar) {
        int[] sampleCompositions = track.getSampleCompositions();
        if (sampleCompositions == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        i5.d dVar = null;
        for (int i7 : sampleCompositions) {
            if (dVar != null && dVar.f15285b == i7) {
                dVar.f15284a++;
            } else {
                dVar = new i5.d(1, i7);
                arrayList.add(dVar);
            }
        }
        ?? aVar = new com.googlecode.mp4parser.a("ctts");
        aVar.f15287e = Collections.EMPTY_LIST;
        com.google.android.recaptcha.internal.a.t(ze.a.c(i5.e.f15286f, aVar, aVar, arrayList));
        aVar.f15287e = arrayList;
        pVar.a(aVar);
    }

    public i5.i createFileTypeBox(boolean z9) {
        String str;
        LinkedList linkedList = new LinkedList();
        linkedList.add("isom");
        linkedList.add("iso2");
        if (z9) {
            str = "hvc1";
        } else {
            str = "avc1";
        }
        linkedList.add(str);
        linkedList.add("mp41");
        ?? aVar = new com.googlecode.mp4parser.a("ftyp");
        List list = Collections.EMPTY_LIST;
        aVar.f15291a = "isom";
        aVar.f15292b = 512L;
        aVar.f15293c = linkedList;
        return aVar;
    }

    public MP4Builder createMovie(Mp4Movie mp4Movie, boolean z9, boolean z10) {
        this.currentMp4Movie = mp4Movie;
        FileOutputStream fileOutputStream = new FileOutputStream(mp4Movie.getCacheFile());
        this.fos = fileOutputStream;
        this.fc = fileOutputStream.getChannel();
        i5.i createFileTypeBox = createFileTypeBox(z10);
        createFileTypeBox.getBox(this.fc);
        long size = createFileTypeBox.getSize() + this.dataOffset;
        this.dataOffset = size;
        this.wroteSinceLastMdat += size;
        this.splitMdat = z9;
        this.mdat = new InterleaveChunkMdat();
        this.sizeBuffer = ByteBuffer.allocateDirect(4);
        return this;
    }

    public i5.l createMovieBox(Mp4Movie mp4Movie) {
        ?? bVar = new com.googlecode.mp4parser.b("moov");
        ?? aVar = new com.googlecode.mp4parser.a("mvhd");
        aVar.f15313r = 1.0d;
        aVar.f15314s = 1.0f;
        pc.d dVar = pc.d.f53563j;
        aVar.f15315w = dVar;
        Date date = new Date();
        com.google.android.recaptcha.internal.a.t(ze.a.c(i5.m.Q, aVar, aVar, date));
        aVar.f15310e = date;
        long j3 = 4294967296L;
        if (kb.a(date) >= 4294967296L) {
            aVar.h();
        }
        Date date2 = new Date();
        com.google.android.recaptcha.internal.a.t(ze.a.c(i5.m.R, aVar, aVar, date2));
        aVar.f15311f = date2;
        if (kb.a(date2) >= 4294967296L) {
            aVar.h();
        }
        com.google.android.recaptcha.internal.a.t(ze.a.c(i5.m.U, aVar, aVar, dVar));
        aVar.f15315w = dVar;
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
        com.google.android.recaptcha.internal.a.t(ze.a.c(i5.m.T, aVar, aVar, new Long(j10)));
        aVar.f15312n = j10;
        if (j10 >= j12) {
            aVar.h();
        }
        com.google.android.recaptcha.internal.a.t(ze.a.c(i5.m.S, aVar, aVar, new Long(timescale)));
        aVar.h = timescale;
        long size2 = mp4Movie.getTracks().size() + 1;
        com.google.android.recaptcha.internal.a.t(ze.a.c(i5.m.V, aVar, aVar, new Long(size2)));
        aVar.f15316x = size2;
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

    public void createStco(Track track, i5.p pVar) {
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
        aVar.f15333f = new long[0];
        com.google.android.recaptcha.internal.a.t(ze.a.c(t.f15332n, aVar, aVar, jArr));
        aVar.f15333f = jArr;
        pVar.a(aVar);
    }

    public void createStsc(Track track, i5.p pVar) {
        ?? aVar = new com.googlecode.mp4parser.a("stsc");
        aVar.f15329e = Collections.EMPTY_LIST;
        LinkedList linkedList = new LinkedList();
        com.google.android.recaptcha.internal.a.t(ze.a.c(r.h, aVar, aVar, linkedList));
        aVar.f15329e = linkedList;
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
                    com.google.android.recaptcha.internal.a.t(ze.a.b(r.f15327f, aVar, aVar));
                    aVar.f15329e.add(new i5.q(i10, i11, 1L));
                    i7 = i11;
                }
                i10++;
                i11 = 0;
            }
        }
        pVar.a(aVar);
    }

    public void createStsd(Track track, i5.p pVar) {
        pVar.a(track.getSampleDescriptionBox());
    }

    public void createStss(Track track, i5.p pVar) {
        long[] syncSamples = track.getSyncSamples();
        if (syncSamples != null && syncSamples.length > 0) {
            ?? aVar = new com.googlecode.mp4parser.a("stss");
            com.google.android.recaptcha.internal.a.t(ze.a.c(u.h, aVar, aVar, syncSamples));
            aVar.f15335e = syncSamples;
            pVar.a(aVar);
        }
    }

    public void createStsz(Track track, i5.p pVar) {
        ?? aVar = new com.googlecode.mp4parser.a("stsz");
        aVar.f15323f = new long[0];
        long[] jArr = this.track2SampleSizes.get(track);
        com.google.android.recaptcha.internal.a.t(ze.a.c(i5.o.f15320s, aVar, aVar, jArr));
        aVar.f15323f = jArr;
        pVar.a(aVar);
    }

    public void createStts(Track track, i5.p pVar) {
        long[] sampleDurations;
        ArrayList arrayList = new ArrayList();
        v vVar = null;
        for (long j3 : track.getSampleDurations()) {
            if (vVar != null && vVar.f15337b == j3) {
                vVar.f15336a++;
            } else {
                vVar = new v(1L, j3);
                arrayList.add(vVar);
            }
        }
        ?? aVar = new com.googlecode.mp4parser.a("stts");
        aVar.f15339e = Collections.EMPTY_LIST;
        com.google.android.recaptcha.internal.a.t(ze.a.c(w.f15338f, aVar, aVar, arrayList));
        aVar.f15339e = arrayList;
        pVar.a(aVar);
    }

    public x createTrackBox(Track track, Mp4Movie mp4Movie) {
        String str;
        ?? bVar = new com.googlecode.mp4parser.b("trak");
        ?? aVar = new com.googlecode.mp4parser.a("tkhd");
        pc.d dVar = pc.d.f53563j;
        aVar.f15348x = dVar;
        ui.e c10 = ze.a.c(y.Z, aVar, aVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c10);
        aVar.g(aVar.d() | 1);
        ui.e c11 = ze.a.c(y.f15340a0, aVar, aVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c11);
        aVar.g(aVar.d() | 2);
        ui.e c12 = ze.a.c(y.f15341b0, aVar, aVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c12);
        aVar.g(aVar.d() | 4);
        if (track.isAudio()) {
            com.google.android.recaptcha.internal.a.t(ze.a.c(y.W, aVar, aVar, dVar));
            aVar.f15348x = dVar;
        } else {
            pc.d matrix = mp4Movie.getMatrix();
            com.google.android.recaptcha.internal.a.t(ze.a.c(y.W, aVar, aVar, matrix));
            aVar.f15348x = matrix;
        }
        com.google.android.recaptcha.internal.a.t(ze.a.c(y.U, aVar, aVar, new Integer(0)));
        aVar.f15346s = 0;
        Date creationTime = track.getCreationTime();
        com.google.android.recaptcha.internal.a.t(ze.a.c(y.P, aVar, aVar, creationTime));
        aVar.f15342e = creationTime;
        if (kb.a(creationTime) >= 4294967296L) {
            aVar.h();
        }
        long timescale = (getTimescale(mp4Movie) * track.getDuration()) / track.getTimeScale();
        com.google.android.recaptcha.internal.a.t(ze.a.c(y.S, aVar, aVar, new Long(timescale)));
        aVar.f15344n = timescale;
        if (timescale >= 4294967296L) {
            aVar.g(1);
        }
        double height = track.getHeight();
        com.google.android.recaptcha.internal.a.t(ze.a.c(y.Y, aVar, aVar, new Double(height)));
        aVar.D = height;
        double width = track.getWidth();
        com.google.android.recaptcha.internal.a.t(ze.a.c(y.X, aVar, aVar, new Double(width)));
        aVar.f15349y = width;
        com.google.android.recaptcha.internal.a.t(ze.a.c(y.T, aVar, aVar, new Integer(0)));
        aVar.f15345r = 0;
        Date date = new Date();
        com.google.android.recaptcha.internal.a.t(ze.a.c(y.Q, aVar, aVar, date));
        aVar.f15343f = date;
        if (kb.a(date) >= 4294967296L) {
            aVar.h();
        }
        long trackId = track.getTrackId() + 1;
        com.google.android.recaptcha.internal.a.t(ze.a.c(y.R, aVar, aVar, new Long(trackId)));
        aVar.h = trackId;
        float volume = track.getVolume();
        com.google.android.recaptcha.internal.a.t(ze.a.c(y.V, aVar, aVar, new Float(volume)));
        aVar.f15347w = volume;
        bVar.a(aVar);
        i5.h hVar = new i5.h("mdia", 2);
        bVar.a(hVar);
        ?? aVar2 = new com.googlecode.mp4parser.a("mdhd");
        aVar2.f15306e = new Date();
        aVar2.f15307f = new Date();
        aVar2.f15309r = "eng";
        Date creationTime2 = track.getCreationTime();
        com.google.android.recaptcha.internal.a.t(ze.a.c(i5.k.E, aVar2, aVar2, creationTime2));
        aVar2.f15306e = creationTime2;
        long duration = track.getDuration();
        com.google.android.recaptcha.internal.a.t(ze.a.c(i5.k.G, aVar2, aVar2, new Long(duration)));
        aVar2.f15308n = duration;
        long timeScale = track.getTimeScale();
        com.google.android.recaptcha.internal.a.t(ze.a.c(i5.k.F, aVar2, aVar2, new Long(timeScale)));
        aVar2.h = timeScale;
        com.google.android.recaptcha.internal.a.t(ze.a.c(i5.k.H, aVar2, aVar2, "eng"));
        aVar2.f15309r = "eng";
        hVar.a(aVar2);
        ?? aVar3 = new com.googlecode.mp4parser.a("hdlr");
        aVar3.f15297f = null;
        aVar3.f15300s = true;
        if (track.isAudio()) {
            str = "SoundHandle";
        } else {
            str = "VideoHandle";
        }
        com.google.android.recaptcha.internal.a.t(ze.a.c(i5.j.f15295y, aVar3, aVar3, str));
        aVar3.f15297f = str;
        String handler = track.getHandler();
        com.google.android.recaptcha.internal.a.t(ze.a.c(i5.j.D, aVar3, aVar3, handler));
        aVar3.f15296e = handler;
        hVar.a(aVar3);
        i5.h hVar2 = new i5.h("minf", 3);
        hVar2.a(track.getMediaHeaderBox());
        i5.h hVar3 = new i5.h("dinf", 0);
        i5.h hVar4 = new i5.h("dref", 1);
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

    public void setAllowSyncFiles(boolean z9) {
        this.allowSyncFiles = z9;
    }

    public long writeSampleData(int i7, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, boolean z9) {
        boolean z10;
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
            z10 = true;
            if (this.splitMdat) {
                flushCurrentMdat();
                this.writeNewMdat = true;
            }
            this.wroteSinceLastMdat = 0L;
        } else {
            z10 = false;
        }
        this.currentMp4Movie.addSample(i7, this.dataOffset, bufferInfo);
        if (z9) {
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
        if (!z10) {
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

    public void createSidx(Track track, i5.p pVar) {
    }

    public static class InterleaveChunkMdat implements i5.b {
        private long contentSize;
        private long dataOffset;
        private i5.f parent;

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
        public i5.f getParent() {
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
        public void setParent(i5.f fVar) {
            this.parent = fVar;
        }

        public void parse(com.googlecode.mp4parser.f fVar, ByteBuffer byteBuffer, long j3, h5.a aVar) {
        }
    }
}
