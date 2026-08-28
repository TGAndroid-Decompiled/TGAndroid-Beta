package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import g7.v8;
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
import org.telegram.ui.Cells.j2;
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

    public static long gcd(long j10, long j11) {
        if (j11 == 0) {
            return j10;
        }
        return gcd(j11, j10 % j11);
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
        for (int i9 : sampleCompositions) {
            if (dVar != null && dVar.f45917b == i9) {
                dVar.f45916a++;
            } else {
                dVar = new q2.d(1, i9);
                arrayList.add(dVar);
            }
        }
        ?? aVar = new com.googlecode.mp4parser.a("ctts");
        aVar.f45919e = Collections.EMPTY_LIST;
        j2.t(zd.a.c(q2.e.f45918f, aVar, aVar, arrayList));
        aVar.f45919e = arrayList;
        pVar.a(aVar);
    }

    public q2.i createFileTypeBox(boolean z10) {
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
        aVar.f45923a = "isom";
        aVar.f45924b = 512L;
        aVar.f45925c = linkedList;
        return aVar;
    }

    public MP4Builder createMovie(Mp4Movie mp4Movie, boolean z10, boolean z11) {
        this.currentMp4Movie = mp4Movie;
        FileOutputStream fileOutputStream = new FileOutputStream(mp4Movie.getCacheFile());
        this.fos = fileOutputStream;
        this.fc = fileOutputStream.getChannel();
        q2.i createFileTypeBox = createFileTypeBox(z11);
        createFileTypeBox.getBox(this.fc);
        long size = createFileTypeBox.getSize() + this.dataOffset;
        this.dataOffset = size;
        this.wroteSinceLastMdat += size;
        this.splitMdat = z10;
        this.mdat = new InterleaveChunkMdat();
        this.sizeBuffer = ByteBuffer.allocateDirect(4);
        return this;
    }

    public q2.l createMovieBox(Mp4Movie mp4Movie) {
        ?? bVar = new com.googlecode.mp4parser.b("moov");
        ?? aVar = new com.googlecode.mp4parser.a("mvhd");
        aVar.f45945r = 1.0d;
        aVar.f45946s = 1.0f;
        yb.d dVar = yb.d.f49725j;
        aVar.v = dVar;
        Date date = new Date();
        j2.t(zd.a.c(q2.m.M, aVar, aVar, date));
        aVar.f45942e = date;
        long j10 = 4294967296L;
        if (v8.a(date) >= 4294967296L) {
            aVar.h();
        }
        Date date2 = new Date();
        j2.t(zd.a.c(q2.m.N, aVar, aVar, date2));
        aVar.f45943f = date2;
        if (v8.a(date2) >= 4294967296L) {
            aVar.h();
        }
        j2.t(zd.a.c(q2.m.Q, aVar, aVar, dVar));
        aVar.v = dVar;
        long timescale = getTimescale(mp4Movie);
        ArrayList<Track> tracks = mp4Movie.getTracks();
        int size = tracks.size();
        int i9 = 0;
        long j11 = 0;
        int i10 = 0;
        while (i10 < size) {
            Track track = tracks.get(i10);
            i10++;
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
        j2.t(zd.a.c(q2.m.P, aVar, aVar, new Long(j11)));
        aVar.f45944n = j11;
        if (j11 >= j13) {
            aVar.h();
        }
        j2.t(zd.a.c(q2.m.O, aVar, aVar, new Long(timescale)));
        aVar.h = timescale;
        long size2 = mp4Movie.getTracks().size() + 1;
        j2.t(zd.a.c(q2.m.R, aVar, aVar, new Long(size2)));
        aVar.f45947w = size2;
        bVar.a(aVar);
        ArrayList<Track> tracks2 = mp4Movie.getTracks();
        int size3 = tracks2.size();
        while (i9 < size3) {
            Track track3 = tracks2.get(i9);
            i9++;
            bVar.a(createTrackBox(track3, mp4Movie));
        }
        return bVar;
    }

    public q2.b createStbl(Track track) {
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

    public void createStco(Track track, q2.p pVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList<Sample> samples = track.getSamples();
        int size = samples.size();
        long j10 = -1;
        int i9 = 0;
        while (i9 < size) {
            Sample sample = samples.get(i9);
            i9++;
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
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            jArr[i10] = ((Long) arrayList.get(i10)).longValue();
        }
        ?? aVar = new com.googlecode.mp4parser.a("stco");
        aVar.f45964f = new long[0];
        j2.t(zd.a.c(t.f45963n, aVar, aVar, jArr));
        aVar.f45964f = jArr;
        pVar.a(aVar);
    }

    public void createStsc(Track track, q2.p pVar) {
        ?? aVar = new com.googlecode.mp4parser.a("stsc");
        aVar.f45960e = Collections.EMPTY_LIST;
        LinkedList linkedList = new LinkedList();
        j2.t(zd.a.c(q2.r.h, aVar, aVar, linkedList));
        aVar.f45960e = linkedList;
        int size = track.getSamples().size();
        int i9 = -1;
        int i10 = 0;
        int i11 = 1;
        for (int i12 = 0; i12 < size; i12++) {
            Sample sample = track.getSamples().get(i12);
            long size2 = sample.getSize() + sample.getOffset();
            i10++;
            if (i12 == size - 1 || size2 != track.getSamples().get(i12 + 1).getOffset()) {
                if (i9 != i10) {
                    j2.t(zd.a.b(q2.r.f45958f, aVar, aVar));
                    aVar.f45960e.add(new q2.q(i11, i10, 1L));
                    i9 = i10;
                }
                i11++;
                i10 = 0;
            }
        }
        pVar.a(aVar);
    }

    public void createStsd(Track track, q2.p pVar) {
        pVar.a(track.getSampleDescriptionBox());
    }

    public void createStss(Track track, q2.p pVar) {
        long[] syncSamples = track.getSyncSamples();
        if (syncSamples != null && syncSamples.length > 0) {
            ?? aVar = new com.googlecode.mp4parser.a("stss");
            j2.t(zd.a.c(u.h, aVar, aVar, syncSamples));
            aVar.f45966e = syncSamples;
            pVar.a(aVar);
        }
    }

    public void createStsz(Track track, q2.p pVar) {
        ?? aVar = new com.googlecode.mp4parser.a("stsz");
        aVar.f45954f = new long[0];
        long[] jArr = this.track2SampleSizes.get(track);
        j2.t(zd.a.c(q2.o.f45952s, aVar, aVar, jArr));
        aVar.f45954f = jArr;
        pVar.a(aVar);
    }

    public void createStts(Track track, q2.p pVar) {
        long[] sampleDurations;
        ArrayList arrayList = new ArrayList();
        v vVar = null;
        for (long j10 : track.getSampleDurations()) {
            if (vVar != null && vVar.f45968b == j10) {
                vVar.f45967a++;
            } else {
                vVar = new v(1L, j10);
                arrayList.add(vVar);
            }
        }
        ?? aVar = new com.googlecode.mp4parser.a("stts");
        aVar.f45970e = Collections.EMPTY_LIST;
        j2.t(zd.a.c(w.f45969f, aVar, aVar, arrayList));
        aVar.f45970e = arrayList;
        pVar.a(aVar);
    }

    public x createTrackBox(Track track, Mp4Movie mp4Movie) {
        String str;
        ?? bVar = new com.googlecode.mp4parser.b("trak");
        ?? aVar = new com.googlecode.mp4parser.a("tkhd");
        yb.d dVar = yb.d.f49725j;
        aVar.f45976w = dVar;
        com.google.firebase.messaging.t c10 = zd.a.c(y.V, aVar, aVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c10);
        aVar.g(aVar.d() | 1);
        com.google.firebase.messaging.t c11 = zd.a.c(y.W, aVar, aVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c11);
        aVar.g(aVar.d() | 2);
        com.google.firebase.messaging.t c12 = zd.a.c(y.X, aVar, aVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c12);
        aVar.g(aVar.d() | 4);
        if (track.isAudio()) {
            j2.t(zd.a.c(y.S, aVar, aVar, dVar));
            aVar.f45976w = dVar;
        } else {
            yb.d matrix = mp4Movie.getMatrix();
            j2.t(zd.a.c(y.S, aVar, aVar, matrix));
            aVar.f45976w = matrix;
        }
        j2.t(zd.a.c(y.Q, aVar, aVar, new Integer(0)));
        aVar.f45975s = 0;
        Date creationTime = track.getCreationTime();
        j2.t(zd.a.c(y.L, aVar, aVar, creationTime));
        aVar.f45971e = creationTime;
        if (v8.a(creationTime) >= 4294967296L) {
            aVar.h();
        }
        long timescale = (getTimescale(mp4Movie) * track.getDuration()) / track.getTimeScale();
        j2.t(zd.a.c(y.O, aVar, aVar, new Long(timescale)));
        aVar.f45973n = timescale;
        if (timescale >= 4294967296L) {
            aVar.g(1);
        }
        double height = track.getHeight();
        j2.t(zd.a.c(y.U, aVar, aVar, new Double(height)));
        aVar.f45978y = height;
        double width = track.getWidth();
        j2.t(zd.a.c(y.T, aVar, aVar, new Double(width)));
        aVar.f45977x = width;
        j2.t(zd.a.c(y.P, aVar, aVar, new Integer(0)));
        aVar.f45974r = 0;
        Date date = new Date();
        j2.t(zd.a.c(y.M, aVar, aVar, date));
        aVar.f45972f = date;
        if (v8.a(date) >= 4294967296L) {
            aVar.h();
        }
        long trackId = track.getTrackId() + 1;
        j2.t(zd.a.c(y.N, aVar, aVar, new Long(trackId)));
        aVar.h = trackId;
        float volume = track.getVolume();
        j2.t(zd.a.c(y.R, aVar, aVar, new Float(volume)));
        aVar.v = volume;
        bVar.a(aVar);
        q2.h hVar = new q2.h("mdia", 2);
        bVar.a(hVar);
        ?? aVar2 = new com.googlecode.mp4parser.a("mdhd");
        aVar2.f45938e = new Date();
        aVar2.f45939f = new Date();
        aVar2.f45941r = "eng";
        Date creationTime2 = track.getCreationTime();
        j2.t(zd.a.c(q2.k.A, aVar2, aVar2, creationTime2));
        aVar2.f45938e = creationTime2;
        long duration = track.getDuration();
        j2.t(zd.a.c(q2.k.C, aVar2, aVar2, new Long(duration)));
        aVar2.f45940n = duration;
        long timeScale = track.getTimeScale();
        j2.t(zd.a.c(q2.k.B, aVar2, aVar2, new Long(timeScale)));
        aVar2.h = timeScale;
        j2.t(zd.a.c(q2.k.D, aVar2, aVar2, "eng"));
        aVar2.f45941r = "eng";
        hVar.a(aVar2);
        ?? aVar3 = new com.googlecode.mp4parser.a("hdlr");
        aVar3.f45930f = null;
        aVar3.f45933s = true;
        if (track.isAudio()) {
            str = "SoundHandle";
        } else {
            str = "VideoHandle";
        }
        j2.t(zd.a.c(q2.j.f45927x, aVar3, aVar3, str));
        aVar3.f45930f = str;
        String handler = track.getHandler();
        j2.t(zd.a.c(q2.j.f45928y, aVar3, aVar3, handler));
        aVar3.f45929e = handler;
        hVar.a(aVar3);
        q2.h hVar2 = new q2.h("minf", 3);
        hVar2.a(track.getMediaHeaderBox());
        q2.h hVar3 = new q2.h("dinf", 0);
        q2.h hVar4 = new q2.h("dref", 1);
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
        int i9 = 0;
        while (i9 < size) {
            Track track = tracks.get(i9);
            i9++;
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

    public long getLastFrameTimestamp(int i9) {
        return this.currentMp4Movie.getLastFrameTimestamp(i9);
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
        int i9 = 0;
        while (i9 < size) {
            Track track = tracks.get(i9);
            i9++;
            j10 = gcd(track.getTimeScale(), j10);
        }
        return j10;
    }

    public void setAllowSyncFiles(boolean z10) {
        this.allowSyncFiles = z10;
    }

    public long writeSampleData(int i9, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, boolean z10) {
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
        this.currentMp4Movie.addSample(i9, this.dataOffset, bufferInfo);
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
            int i9 = 0;
            while (i9 < size) {
                Track track = tracks.get(i9);
                i9++;
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
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
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
            allocate.put(p2.c.d("mdat"));
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
