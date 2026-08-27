package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import h7.x8;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.pa;
import q2.r;
import q2.t;
import q2.u;
import q2.v;
import q2.w;
import q2.x;
import q2.y;

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

    public static long gcd(long j10, long j11) {
        return j11 == 0 ? j10 : gcd(j11, j10 % j11);
    }

    public int addTrack(MediaFormat mediaFormat, boolean z10) {
        return this.currentMp4Movie.addTrack(mediaFormat, z10);
    }

    public void createCtts(Track track, q2.p pVar) {
        int[] sampleCompositions = track.getSampleCompositions();
        if (sampleCompositions == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        q2.d dVar = null;
        for (int i10 : sampleCompositions) {
            if (dVar == null || dVar.f46081b != i10) {
                dVar = new q2.d(1, i10);
                arrayList.add(dVar);
            } else {
                dVar.f46080a++;
            }
        }
        q2.e eVar = new q2.e("ctts");
        eVar.f46083e = Collections.EMPTY_LIST;
        pa.u(ae.a.c(q2.e.f46082f, eVar, eVar, arrayList));
        eVar.f46083e = arrayList;
        pVar.a(eVar);
    }

    public q2.i createFileTypeBox(boolean z10) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("isom");
        linkedList.add("iso2");
        linkedList.add(z10 ? "hvc1" : "avc1");
        linkedList.add("mp41");
        q2.i iVar = new q2.i("ftyp");
        List list = Collections.EMPTY_LIST;
        iVar.f46087a = "isom";
        iVar.f46088b = 512L;
        iVar.f46089c = linkedList;
        return iVar;
    }

    public MP4Builder createMovie(Mp4Movie mp4Movie, boolean z10, boolean z11) {
        this.currentMp4Movie = mp4Movie;
        FileOutputStream fileOutputStream = new FileOutputStream(mp4Movie.getCacheFile());
        this.fos = fileOutputStream;
        this.fc = fileOutputStream.getChannel();
        q2.i iVarCreateFileTypeBox = createFileTypeBox(z11);
        iVarCreateFileTypeBox.getBox(this.fc);
        long size = iVarCreateFileTypeBox.getSize() + this.dataOffset;
        this.dataOffset = size;
        this.wroteSinceLastMdat += size;
        this.splitMdat = z10;
        this.mdat = new InterleaveChunkMdat();
        this.sizeBuffer = ByteBuffer.allocateDirect(4);
        return this;
    }

    public q2.l createMovieBox(Mp4Movie mp4Movie) {
        q2.l lVar = new q2.l("moov");
        q2.m mVar = new q2.m("mvhd");
        mVar.f46109r = 1.0d;
        mVar.f46110s = 1.0f;
        zb.d dVar = zb.d.f50320j;
        mVar.v = dVar;
        Date date = new Date();
        pa.u(ae.a.c(q2.m.M, mVar, mVar, date));
        mVar.f46106e = date;
        long j10 = 4294967296L;
        if (x8.a(date) >= 4294967296L) {
            mVar.h();
        }
        Date date2 = new Date();
        pa.u(ae.a.c(q2.m.N, mVar, mVar, date2));
        mVar.f46107f = date2;
        if (x8.a(date2) >= 4294967296L) {
            mVar.h();
        }
        pa.u(ae.a.c(q2.m.Q, mVar, mVar, dVar));
        mVar.v = dVar;
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
            long duration = (track2.getDuration() * timescale) / ((long) track2.getTimeScale());
            if (duration > j11) {
                j11 = duration;
            }
            j10 = j12;
        }
        long j13 = j10;
        pa.u(ae.a.c(q2.m.P, mVar, mVar, new Long(j11)));
        mVar.f46108n = j11;
        if (j11 >= j13) {
            mVar.h();
        }
        pa.u(ae.a.c(q2.m.O, mVar, mVar, new Long(timescale)));
        mVar.h = timescale;
        long size2 = mp4Movie.getTracks().size() + 1;
        pa.u(ae.a.c(q2.m.R, mVar, mVar, new Long(size2)));
        mVar.f46111w = size2;
        lVar.a(mVar);
        ArrayList<Track> tracks2 = mp4Movie.getTracks();
        int size3 = tracks2.size();
        while (i10 < size3) {
            Track track3 = tracks2.get(i10);
            i10++;
            lVar.a(createTrackBox(track3, mp4Movie));
        }
        return lVar;
    }

    public q2.b createStbl(Track track) {
        q2.p pVar = new q2.p("stbl");
        createStsd(track, pVar);
        createStts(track, pVar);
        createCtts(track, pVar);
        createStss(track, pVar);
        createStsc(track, pVar);
        createStsz(track, pVar);
        createStco(track, pVar);
        return pVar;
    }

    public void createStco(Track track, q2.p pVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList<Sample> samples = track.getSamples();
        int size = samples.size();
        long size2 = -1;
        int i10 = 0;
        while (i10 < size) {
            Sample sample = samples.get(i10);
            i10++;
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
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            jArr[i11] = ((Long) arrayList.get(i11)).longValue();
        }
        t tVar = new t("stco");
        tVar.f46128f = new long[0];
        pa.u(ae.a.c(t.f46127n, tVar, tVar, jArr));
        tVar.f46128f = jArr;
        pVar.a(tVar);
    }

    public void createStsc(Track track, q2.p pVar) {
        r rVar = new r("stsc");
        rVar.f46124e = Collections.EMPTY_LIST;
        LinkedList linkedList = new LinkedList();
        pa.u(ae.a.c(r.h, rVar, rVar, linkedList));
        rVar.f46124e = linkedList;
        int size = track.getSamples().size();
        int i10 = -1;
        int i11 = 0;
        int i12 = 1;
        for (int i13 = 0; i13 < size; i13++) {
            Sample sample = track.getSamples().get(i13);
            long size2 = sample.getSize() + sample.getOffset();
            i11++;
            if (i13 == size - 1 || size2 != track.getSamples().get(i13 + 1).getOffset()) {
                if (i10 != i11) {
                    pa.u(ae.a.b(r.f46122f, rVar, rVar));
                    rVar.f46124e.add(new q2.q(i12, i11, 1L));
                    i10 = i11;
                }
                i12++;
                i11 = 0;
            }
        }
        pVar.a(rVar);
    }

    public void createStsd(Track track, q2.p pVar) {
        pVar.a(track.getSampleDescriptionBox());
    }

    public void createStss(Track track, q2.p pVar) {
        long[] syncSamples = track.getSyncSamples();
        if (syncSamples == null || syncSamples.length <= 0) {
            return;
        }
        u uVar = new u("stss");
        pa.u(ae.a.c(u.h, uVar, uVar, syncSamples));
        uVar.f46130e = syncSamples;
        pVar.a(uVar);
    }

    public void createStsz(Track track, q2.p pVar) {
        q2.o oVar = new q2.o("stsz");
        oVar.f46118f = new long[0];
        long[] jArr = this.track2SampleSizes.get(track);
        pa.u(ae.a.c(q2.o.f46116s, oVar, oVar, jArr));
        oVar.f46118f = jArr;
        pVar.a(oVar);
    }

    public void createStts(Track track, q2.p pVar) {
        ArrayList arrayList = new ArrayList();
        v vVar = null;
        for (long j10 : track.getSampleDurations()) {
            if (vVar == null || vVar.f46132b != j10) {
                vVar = new v(1L, j10);
                arrayList.add(vVar);
            } else {
                vVar.f46131a++;
            }
        }
        w wVar = new w("stts");
        wVar.f46134e = Collections.EMPTY_LIST;
        pa.u(ae.a.c(w.f46133f, wVar, wVar, arrayList));
        wVar.f46134e = arrayList;
        pVar.a(wVar);
    }

    public x createTrackBox(Track track, Mp4Movie mp4Movie) {
        x xVar = new x("trak");
        y yVar = new y("tkhd");
        zb.d dVar = zb.d.f50320j;
        yVar.f46140w = dVar;
        com.google.firebase.messaging.t tVarC = ae.a.c(y.V, yVar, yVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(tVarC);
        yVar.g(yVar.d() | 1);
        com.google.firebase.messaging.t tVarC2 = ae.a.c(y.W, yVar, yVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(tVarC2);
        yVar.g(yVar.d() | 2);
        com.google.firebase.messaging.t tVarC3 = ae.a.c(y.X, yVar, yVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(tVarC3);
        yVar.g(yVar.d() | 4);
        if (track.isAudio()) {
            pa.u(ae.a.c(y.S, yVar, yVar, dVar));
            yVar.f46140w = dVar;
        } else {
            zb.d matrix = mp4Movie.getMatrix();
            pa.u(ae.a.c(y.S, yVar, yVar, matrix));
            yVar.f46140w = matrix;
        }
        pa.u(ae.a.c(y.Q, yVar, yVar, new Integer(0)));
        yVar.f46139s = 0;
        Date creationTime = track.getCreationTime();
        pa.u(ae.a.c(y.L, yVar, yVar, creationTime));
        yVar.f46135e = creationTime;
        if (x8.a(creationTime) >= 4294967296L) {
            yVar.h();
        }
        long timescale = (getTimescale(mp4Movie) * track.getDuration()) / ((long) track.getTimeScale());
        pa.u(ae.a.c(y.O, yVar, yVar, new Long(timescale)));
        yVar.f46137n = timescale;
        if (timescale >= 4294967296L) {
            yVar.g(1);
        }
        double height = track.getHeight();
        pa.u(ae.a.c(y.U, yVar, yVar, new Double(height)));
        yVar.f46142y = height;
        double width = track.getWidth();
        pa.u(ae.a.c(y.T, yVar, yVar, new Double(width)));
        yVar.f46141x = width;
        pa.u(ae.a.c(y.P, yVar, yVar, new Integer(0)));
        yVar.f46138r = 0;
        Date date = new Date();
        pa.u(ae.a.c(y.M, yVar, yVar, date));
        yVar.f46136f = date;
        if (x8.a(date) >= 4294967296L) {
            yVar.h();
        }
        long trackId = track.getTrackId() + 1;
        pa.u(ae.a.c(y.N, yVar, yVar, new Long(trackId)));
        yVar.h = trackId;
        float volume = track.getVolume();
        pa.u(ae.a.c(y.R, yVar, yVar, new Float(volume)));
        yVar.v = volume;
        xVar.a(yVar);
        q2.h hVar = new q2.h("mdia", 2);
        xVar.a(hVar);
        q2.k kVar = new q2.k("mdhd");
        kVar.f46102e = new Date();
        kVar.f46103f = new Date();
        kVar.f46105r = "eng";
        Date creationTime2 = track.getCreationTime();
        pa.u(ae.a.c(q2.k.A, kVar, kVar, creationTime2));
        kVar.f46102e = creationTime2;
        long duration = track.getDuration();
        pa.u(ae.a.c(q2.k.C, kVar, kVar, new Long(duration)));
        kVar.f46104n = duration;
        long timeScale = track.getTimeScale();
        pa.u(ae.a.c(q2.k.B, kVar, kVar, new Long(timeScale)));
        kVar.h = timeScale;
        pa.u(ae.a.c(q2.k.D, kVar, kVar, "eng"));
        kVar.f46105r = "eng";
        hVar.a(kVar);
        q2.j jVar = new q2.j("hdlr");
        jVar.f46094f = null;
        jVar.f46097s = true;
        String str = track.isAudio() ? "SoundHandle" : "VideoHandle";
        pa.u(ae.a.c(q2.j.f46091x, jVar, jVar, str));
        jVar.f46094f = str;
        String handler = track.getHandler();
        pa.u(ae.a.c(q2.j.f46092y, jVar, jVar, handler));
        jVar.f46093e = handler;
        hVar.a(jVar);
        q2.h hVar2 = new q2.h("minf", 3);
        hVar2.a(track.getMediaHeaderBox());
        q2.h hVar3 = new q2.h("dinf", 0);
        q2.h hVar4 = new q2.h("dref", 1);
        hVar3.a(hVar4);
        q2.g gVar = new q2.g("url ");
        gVar.g(1);
        hVar4.a(gVar);
        hVar2.a(hVar3);
        hVar2.a(createStbl(track));
        hVar.a(hVar2);
        return xVar;
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
        createMovieBox(this.currentMp4Movie).getBox(this.fc);
        this.fos.flush();
        if (this.allowSyncFiles) {
            this.fos.getFD().sync();
        }
        this.fc.close();
        this.fos.close();
    }

    public long getLastFrameTimestamp(int i10) {
        return this.currentMp4Movie.getLastFrameTimestamp(i10);
    }

    public long getTimescale(Mp4Movie mp4Movie) {
        long timeScale = !mp4Movie.getTracks().isEmpty() ? mp4Movie.getTracks().iterator().next().getTimeScale() : 0L;
        ArrayList<Track> tracks = mp4Movie.getTracks();
        int size = tracks.size();
        int i10 = 0;
        while (i10 < size) {
            Track track = tracks.get(i10);
            i10++;
            timeScale = gcd(track.getTimeScale(), timeScale);
        }
        return timeScale;
    }

    public void setAllowSyncFiles(boolean z10) {
        this.allowSyncFiles = z10;
    }

    public long writeSampleData(int i10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, boolean z10) {
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
        interleaveChunkMdat.setContentSize(interleaveChunkMdat.getContentSize() + ((long) bufferInfo.size));
        long j10 = this.wroteSinceLastMdat + ((long) bufferInfo.size);
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
            this.fc.write(this.sizeBuffer);
            byteBuffer.position(bufferInfo.offset + 4);
        } else {
            byteBuffer.position(bufferInfo.offset);
        }
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        this.fc.write(byteBuffer);
        this.dataOffset += (long) bufferInfo.size;
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

    public void createSidx(Track track, q2.p pVar) {
    }

    public static class InterleaveChunkMdat implements q2.b {
        private long contentSize;
        private long dataOffset;
        private q2.f parent;

        private InterleaveChunkMdat() {
            this.contentSize = 1073741824L;
            this.dataOffset = 0L;
        }

        private boolean isSmallBox(long j10) {
            return j10 + 8 < 4294967296L;
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
            byteBufferAllocate.put(p2.c.d("mdat"));
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
        public q2.f getParent() {
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
        public void setParent(q2.f fVar) {
            this.parent = fVar;
        }

        public void parse(com.googlecode.mp4parser.f fVar, ByteBuffer byteBuffer, long j10, p2.a aVar) {
        }
    }
}
