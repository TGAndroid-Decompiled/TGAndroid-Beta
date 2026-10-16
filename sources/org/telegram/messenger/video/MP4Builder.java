package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.google.android.gms.internal.play_billing.k3;
import com.google.firebase.messaging.s;
import f5.r;
import f5.t;
import f5.u;
import f5.v;
import f5.w;
import f5.x;
import f5.y;
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
import w7.g7;
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

    public void createCtts(Track track, f5.p pVar) {
        int[] sampleCompositions = track.getSampleCompositions();
        if (sampleCompositions == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        f5.d dVar = null;
        for (int i10 : sampleCompositions) {
            if (dVar != null && dVar.f8967b == i10) {
                dVar.f8966a++;
            } else {
                dVar = new f5.d(1, i10);
                arrayList.add(dVar);
            }
        }
        ?? aVar = new com.googlecode.mp4parser.a("ctts");
        aVar.e = Collections.EMPTY_LIST;
        k3.p(te.a.c(f5.e.f8968f, aVar, aVar, arrayList));
        aVar.e = arrayList;
        pVar.a(aVar);
    }

    public f5.i createFileTypeBox(boolean z10) {
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
        aVar.f8970a = "isom";
        aVar.f8971b = 512L;
        aVar.f8972c = linkedList;
        return aVar;
    }

    public MP4Builder createMovie(Mp4Movie mp4Movie, boolean z10, boolean z11) {
        this.currentMp4Movie = mp4Movie;
        FileOutputStream fileOutputStream = new FileOutputStream(mp4Movie.getCacheFile());
        this.fos = fileOutputStream;
        this.fc = fileOutputStream.getChannel();
        f5.i createFileTypeBox = createFileTypeBox(z11);
        createFileTypeBox.getBox(this.fc);
        long size = createFileTypeBox.getSize() + this.dataOffset;
        this.dataOffset = size;
        this.wroteSinceLastMdat += size;
        this.splitMdat = z10;
        this.mdat = new InterleaveChunkMdat();
        this.sizeBuffer = ByteBuffer.allocateDirect(4);
        return this;
    }

    public f5.l createMovieBox(Mp4Movie mp4Movie) {
        ?? bVar = new com.googlecode.mp4parser.b("moov");
        ?? aVar = new com.googlecode.mp4parser.a("mvhd");
        aVar.f8989r = 1.0d;
        aVar.f8990s = 1.0f;
        rc.d dVar = rc.d.f43887j;
        aVar.v = dVar;
        Date date = new Date();
        k3.p(te.a.c(f5.m.Q, aVar, aVar, date));
        aVar.e = date;
        long j10 = 4294967296L;
        if (g7.a(date) >= 4294967296L) {
            aVar.h();
        }
        Date date2 = new Date();
        k3.p(te.a.c(f5.m.R, aVar, aVar, date2));
        aVar.f8987f = date2;
        if (g7.a(date2) >= 4294967296L) {
            aVar.h();
        }
        k3.p(te.a.c(f5.m.U, aVar, aVar, dVar));
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
        k3.p(te.a.c(f5.m.T, aVar, aVar, new Long(j11)));
        aVar.f8988n = j11;
        if (j11 >= j13) {
            aVar.h();
        }
        k3.p(te.a.c(f5.m.S, aVar, aVar, new Long(timescale)));
        aVar.h = timescale;
        long size2 = mp4Movie.getTracks().size() + 1;
        k3.p(te.a.c(f5.m.V, aVar, aVar, new Long(size2)));
        aVar.f8991w = size2;
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

    public f5.b createStbl(Track track) {
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

    public void createStco(Track track, f5.p pVar) {
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
        aVar.f9005f = new long[0];
        k3.p(te.a.c(t.f9004n, aVar, aVar, jArr));
        aVar.f9005f = jArr;
        pVar.a(aVar);
    }

    public void createStsc(Track track, f5.p pVar) {
        ?? aVar = new com.googlecode.mp4parser.a("stsc");
        aVar.e = Collections.EMPTY_LIST;
        LinkedList linkedList = new LinkedList();
        k3.p(te.a.c(r.h, aVar, aVar, linkedList));
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
                    k3.p(te.a.b(r.f9001f, aVar, aVar));
                    aVar.e.add(new f5.q(i11, i12, 1L));
                    i10 = i12;
                }
                i11++;
                i12 = 0;
            }
        }
        pVar.a(aVar);
    }

    public void createStsd(Track track, f5.p pVar) {
        pVar.a(track.getSampleDescriptionBox());
    }

    public void createStss(Track track, f5.p pVar) {
        long[] syncSamples = track.getSyncSamples();
        if (syncSamples != null && syncSamples.length > 0) {
            ?? aVar = new com.googlecode.mp4parser.a("stss");
            k3.p(te.a.c(u.h, aVar, aVar, syncSamples));
            aVar.e = syncSamples;
            pVar.a(aVar);
        }
    }

    public void createStsz(Track track, f5.p pVar) {
        ?? aVar = new com.googlecode.mp4parser.a("stsz");
        aVar.f8997f = new long[0];
        long[] jArr = this.track2SampleSizes.get(track);
        k3.p(te.a.c(f5.o.f8996s, aVar, aVar, jArr));
        aVar.f8997f = jArr;
        pVar.a(aVar);
    }

    public void createStts(Track track, f5.p pVar) {
        long[] sampleDurations;
        ArrayList arrayList = new ArrayList();
        v vVar = null;
        for (long j10 : track.getSampleDurations()) {
            if (vVar != null && vVar.f9008b == j10) {
                vVar.f9007a++;
            } else {
                vVar = new v(1L, j10);
                arrayList.add(vVar);
            }
        }
        ?? aVar = new com.googlecode.mp4parser.a("stts");
        aVar.e = Collections.EMPTY_LIST;
        k3.p(te.a.c(w.f9009f, aVar, aVar, arrayList));
        aVar.e = arrayList;
        pVar.a(aVar);
    }

    public x createTrackBox(Track track, Mp4Movie mp4Movie) {
        String str;
        ?? bVar = new com.googlecode.mp4parser.b("trak");
        ?? aVar = new com.googlecode.mp4parser.a("tkhd");
        rc.d dVar = rc.d.f43887j;
        aVar.f9016w = dVar;
        s c10 = te.a.c(y.Z, aVar, aVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c10);
        aVar.g(aVar.d() | 1);
        s c11 = te.a.c(y.f9010a0, aVar, aVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c11);
        aVar.g(aVar.d() | 2);
        s c12 = te.a.c(y.f9011b0, aVar, aVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c12);
        aVar.g(aVar.d() | 4);
        if (track.isAudio()) {
            k3.p(te.a.c(y.W, aVar, aVar, dVar));
            aVar.f9016w = dVar;
        } else {
            rc.d matrix = mp4Movie.getMatrix();
            k3.p(te.a.c(y.W, aVar, aVar, matrix));
            aVar.f9016w = matrix;
        }
        k3.p(te.a.c(y.U, aVar, aVar, new Integer(0)));
        aVar.f9015s = 0;
        Date creationTime = track.getCreationTime();
        k3.p(te.a.c(y.P, aVar, aVar, creationTime));
        aVar.e = creationTime;
        if (g7.a(creationTime) >= 4294967296L) {
            aVar.h();
        }
        long timescale = (getTimescale(mp4Movie) * track.getDuration()) / track.getTimeScale();
        k3.p(te.a.c(y.S, aVar, aVar, new Long(timescale)));
        aVar.f9013n = timescale;
        if (timescale >= 4294967296L) {
            aVar.g(1);
        }
        double height = track.getHeight();
        k3.p(te.a.c(y.Y, aVar, aVar, new Double(height)));
        aVar.f9018y = height;
        double width = track.getWidth();
        k3.p(te.a.c(y.X, aVar, aVar, new Double(width)));
        aVar.f9017x = width;
        k3.p(te.a.c(y.T, aVar, aVar, new Integer(0)));
        aVar.f9014r = 0;
        Date date = new Date();
        k3.p(te.a.c(y.Q, aVar, aVar, date));
        aVar.f9012f = date;
        if (g7.a(date) >= 4294967296L) {
            aVar.h();
        }
        long trackId = track.getTrackId() + 1;
        k3.p(te.a.c(y.R, aVar, aVar, new Long(trackId)));
        aVar.h = trackId;
        float volume = track.getVolume();
        k3.p(te.a.c(y.V, aVar, aVar, new Float(volume)));
        aVar.v = volume;
        bVar.a(aVar);
        f5.h hVar = new f5.h("mdia", 2);
        bVar.a(hVar);
        ?? aVar2 = new com.googlecode.mp4parser.a("mdhd");
        aVar2.e = new Date();
        aVar2.f8984f = new Date();
        aVar2.f8986r = "eng";
        Date creationTime2 = track.getCreationTime();
        k3.p(te.a.c(f5.k.E, aVar2, aVar2, creationTime2));
        aVar2.e = creationTime2;
        long duration = track.getDuration();
        k3.p(te.a.c(f5.k.G, aVar2, aVar2, new Long(duration)));
        aVar2.f8985n = duration;
        long timeScale = track.getTimeScale();
        k3.p(te.a.c(f5.k.F, aVar2, aVar2, new Long(timeScale)));
        aVar2.h = timeScale;
        k3.p(te.a.c(f5.k.H, aVar2, aVar2, "eng"));
        aVar2.f8986r = "eng";
        hVar.a(aVar2);
        ?? aVar3 = new com.googlecode.mp4parser.a("hdlr");
        aVar3.f8976f = null;
        aVar3.f8979s = true;
        if (track.isAudio()) {
            str = "SoundHandle";
        } else {
            str = "VideoHandle";
        }
        k3.p(te.a.c(f5.j.f8974x, aVar3, aVar3, str));
        aVar3.f8976f = str;
        String handler = track.getHandler();
        k3.p(te.a.c(f5.j.f8975y, aVar3, aVar3, handler));
        aVar3.e = handler;
        hVar.a(aVar3);
        f5.h hVar2 = new f5.h("minf", 3);
        hVar2.a(track.getMediaHeaderBox());
        f5.h hVar3 = new f5.h("dinf", 0);
        f5.h hVar4 = new f5.h("dref", 1);
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

    public void createSidx(Track track, f5.p pVar) {
    }

    public static class InterleaveChunkMdat implements f5.b {
        private long contentSize;
        private long dataOffset;
        private f5.f parent;

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
            allocate.put(e5.c.d("mdat"));
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
        public f5.f getParent() {
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
        public void setParent(f5.f fVar) {
            this.parent = fVar;
        }

        public void parse(com.googlecode.mp4parser.f fVar, ByteBuffer byteBuffer, long j10, e5.a aVar) {
        }
    }
}
