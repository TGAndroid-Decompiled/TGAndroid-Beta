package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.google.firebase.messaging.s;
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
import org.telegram.ui.th;
import s2.r;
import s2.t;
import s2.u;
import s2.v;
import s2.w;
import s2.x;
import s2.y;
public class MP4Builder {
    private boolean splitMdat;
    private boolean wasFirstVideoFrame;
    private InterleaveChunkMdat mdat = null;
    private Mp4Movie currentMp4Movie = null;
    private FileOutputStream fos = null;
    private FileChannel f21847fc = null;
    private long dataOffset = 0;
    private long wroteSinceLastMdat = 0;
    private boolean writeNewMdat = true;
    private HashMap<Track, long[]> track2SampleSizes = new HashMap<>();
    private ByteBuffer sizeBuffer = null;
    private boolean allowSyncFiles = true;

    private void flushCurrentMdat() {
        long position = this.f21847fc.position();
        this.f21847fc.position(this.mdat.getOffset());
        this.mdat.getBox(this.f21847fc);
        this.f21847fc.position(position);
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

    public void createCtts(Track track, s2.p pVar) {
        int[] sampleCompositions = track.getSampleCompositions();
        if (sampleCompositions == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        s2.d dVar = null;
        for (int i10 : sampleCompositions) {
            if (dVar != null && dVar.f47488b == i10) {
                dVar.f47487a++;
            } else {
                dVar = new s2.d(1, i10);
                arrayList.add(dVar);
            }
        }
        ?? aVar = new com.googlecode.mp4parser.a("ctts");
        aVar.f47490e = Collections.EMPTY_LIST;
        th.u(be.a.c(s2.e.f47489f, aVar, aVar, arrayList));
        aVar.f47490e = arrayList;
        pVar.a(aVar);
    }

    public s2.i createFileTypeBox(boolean z10) {
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
        aVar.f47494a = "isom";
        aVar.f47495b = 512L;
        aVar.f47496c = linkedList;
        return aVar;
    }

    public MP4Builder createMovie(Mp4Movie mp4Movie, boolean z10, boolean z11) {
        this.currentMp4Movie = mp4Movie;
        FileOutputStream fileOutputStream = new FileOutputStream(mp4Movie.getCacheFile());
        this.fos = fileOutputStream;
        this.f21847fc = fileOutputStream.getChannel();
        s2.i createFileTypeBox = createFileTypeBox(z11);
        createFileTypeBox.getBox(this.f21847fc);
        long size = createFileTypeBox.getSize() + this.dataOffset;
        this.dataOffset = size;
        this.wroteSinceLastMdat += size;
        this.splitMdat = z10;
        this.mdat = new InterleaveChunkMdat();
        this.sizeBuffer = ByteBuffer.allocateDirect(4);
        return this;
    }

    public s2.l createMovieBox(Mp4Movie mp4Movie) {
        ?? bVar = new com.googlecode.mp4parser.b("moov");
        ?? aVar = new com.googlecode.mp4parser.a("mvhd");
        aVar.f47516r = 1.0d;
        aVar.f47517s = 1.0f;
        ac.d dVar = ac.d.f352j;
        aVar.v = dVar;
        Date date = new Date();
        th.u(be.a.c(s2.m.M, aVar, aVar, date));
        aVar.f47513e = date;
        long j10 = 4294967296L;
        if (h7.p.a(date) >= 4294967296L) {
            aVar.h();
        }
        Date date2 = new Date();
        th.u(be.a.c(s2.m.N, aVar, aVar, date2));
        aVar.f47514f = date2;
        if (h7.p.a(date2) >= 4294967296L) {
            aVar.h();
        }
        th.u(be.a.c(s2.m.Q, aVar, aVar, dVar));
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
        th.u(be.a.c(s2.m.P, aVar, aVar, new Long(j11)));
        aVar.f47515n = j11;
        if (j11 >= j13) {
            aVar.h();
        }
        th.u(be.a.c(s2.m.O, aVar, aVar, new Long(timescale)));
        aVar.h = timescale;
        long size2 = mp4Movie.getTracks().size() + 1;
        th.u(be.a.c(s2.m.R, aVar, aVar, new Long(size2)));
        aVar.f47518w = size2;
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

    public s2.b createStbl(Track track) {
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

    public void createStco(Track track, s2.p pVar) {
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
        aVar.f47535f = new long[0];
        th.u(be.a.c(t.f47534n, aVar, aVar, jArr));
        aVar.f47535f = jArr;
        pVar.a(aVar);
    }

    public void createStsc(Track track, s2.p pVar) {
        ?? aVar = new com.googlecode.mp4parser.a("stsc");
        aVar.f47531e = Collections.EMPTY_LIST;
        LinkedList linkedList = new LinkedList();
        th.u(be.a.c(r.h, aVar, aVar, linkedList));
        aVar.f47531e = linkedList;
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
                    th.u(be.a.b(r.f47529f, aVar, aVar));
                    aVar.f47531e.add(new s2.q(i12, i11, 1L));
                    i10 = i11;
                }
                i12++;
                i11 = 0;
            }
        }
        pVar.a(aVar);
    }

    public void createStsd(Track track, s2.p pVar) {
        pVar.a(track.getSampleDescriptionBox());
    }

    public void createStss(Track track, s2.p pVar) {
        long[] syncSamples = track.getSyncSamples();
        if (syncSamples != null && syncSamples.length > 0) {
            ?? aVar = new com.googlecode.mp4parser.a("stss");
            th.u(be.a.c(u.h, aVar, aVar, syncSamples));
            aVar.f47537e = syncSamples;
            pVar.a(aVar);
        }
    }

    public void createStsz(Track track, s2.p pVar) {
        ?? aVar = new com.googlecode.mp4parser.a("stsz");
        aVar.f47525f = new long[0];
        long[] jArr = this.track2SampleSizes.get(track);
        th.u(be.a.c(s2.o.f47523s, aVar, aVar, jArr));
        aVar.f47525f = jArr;
        pVar.a(aVar);
    }

    public void createStts(Track track, s2.p pVar) {
        long[] sampleDurations;
        ArrayList arrayList = new ArrayList();
        v vVar = null;
        for (long j10 : track.getSampleDurations()) {
            if (vVar != null && vVar.f47539b == j10) {
                vVar.f47538a++;
            } else {
                vVar = new v(1L, j10);
                arrayList.add(vVar);
            }
        }
        ?? aVar = new com.googlecode.mp4parser.a("stts");
        aVar.f47541e = Collections.EMPTY_LIST;
        th.u(be.a.c(w.f47540f, aVar, aVar, arrayList));
        aVar.f47541e = arrayList;
        pVar.a(aVar);
    }

    public x createTrackBox(Track track, Mp4Movie mp4Movie) {
        String str;
        ?? bVar = new com.googlecode.mp4parser.b("trak");
        ?? aVar = new com.googlecode.mp4parser.a("tkhd");
        ac.d dVar = ac.d.f352j;
        aVar.f47547w = dVar;
        s c3 = be.a.c(y.V, aVar, aVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c3);
        aVar.g(aVar.d() | 1);
        s c6 = be.a.c(y.W, aVar, aVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c6);
        aVar.g(aVar.d() | 2);
        s c10 = be.a.c(y.X, aVar, aVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c10);
        aVar.g(aVar.d() | 4);
        if (track.isAudio()) {
            th.u(be.a.c(y.S, aVar, aVar, dVar));
            aVar.f47547w = dVar;
        } else {
            ac.d matrix = mp4Movie.getMatrix();
            th.u(be.a.c(y.S, aVar, aVar, matrix));
            aVar.f47547w = matrix;
        }
        th.u(be.a.c(y.Q, aVar, aVar, new Integer(0)));
        aVar.f47546s = 0;
        Date creationTime = track.getCreationTime();
        th.u(be.a.c(y.L, aVar, aVar, creationTime));
        aVar.f47542e = creationTime;
        if (h7.p.a(creationTime) >= 4294967296L) {
            aVar.h();
        }
        long timescale = (getTimescale(mp4Movie) * track.getDuration()) / track.getTimeScale();
        th.u(be.a.c(y.O, aVar, aVar, new Long(timescale)));
        aVar.f47544n = timescale;
        if (timescale >= 4294967296L) {
            aVar.g(1);
        }
        double height = track.getHeight();
        th.u(be.a.c(y.U, aVar, aVar, new Double(height)));
        aVar.f47549y = height;
        double width = track.getWidth();
        th.u(be.a.c(y.T, aVar, aVar, new Double(width)));
        aVar.f47548x = width;
        th.u(be.a.c(y.P, aVar, aVar, new Integer(0)));
        aVar.f47545r = 0;
        Date date = new Date();
        th.u(be.a.c(y.M, aVar, aVar, date));
        aVar.f47543f = date;
        if (h7.p.a(date) >= 4294967296L) {
            aVar.h();
        }
        long trackId = track.getTrackId() + 1;
        th.u(be.a.c(y.N, aVar, aVar, new Long(trackId)));
        aVar.h = trackId;
        float volume = track.getVolume();
        th.u(be.a.c(y.R, aVar, aVar, new Float(volume)));
        aVar.v = volume;
        bVar.a(aVar);
        s2.h hVar = new s2.h("mdia", 2);
        bVar.a(hVar);
        ?? aVar2 = new com.googlecode.mp4parser.a("mdhd");
        aVar2.f47509e = new Date();
        aVar2.f47510f = new Date();
        aVar2.f47512r = "eng";
        Date creationTime2 = track.getCreationTime();
        th.u(be.a.c(s2.k.A, aVar2, aVar2, creationTime2));
        aVar2.f47509e = creationTime2;
        long duration = track.getDuration();
        th.u(be.a.c(s2.k.C, aVar2, aVar2, new Long(duration)));
        aVar2.f47511n = duration;
        long timeScale = track.getTimeScale();
        th.u(be.a.c(s2.k.B, aVar2, aVar2, new Long(timeScale)));
        aVar2.h = timeScale;
        th.u(be.a.c(s2.k.D, aVar2, aVar2, "eng"));
        aVar2.f47512r = "eng";
        hVar.a(aVar2);
        ?? aVar3 = new com.googlecode.mp4parser.a("hdlr");
        aVar3.f47501f = null;
        aVar3.f47504s = true;
        if (track.isAudio()) {
            str = "SoundHandle";
        } else {
            str = "VideoHandle";
        }
        th.u(be.a.c(s2.j.f47498x, aVar3, aVar3, str));
        aVar3.f47501f = str;
        String handler = track.getHandler();
        th.u(be.a.c(s2.j.f47499y, aVar3, aVar3, handler));
        aVar3.f47500e = handler;
        hVar.a(aVar3);
        s2.h hVar2 = new s2.h("minf", 3);
        hVar2.a(track.getMediaHeaderBox());
        s2.h hVar3 = new s2.h("dinf", 0);
        s2.h hVar4 = new s2.h("dref", 1);
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
        createMovieBox(this.currentMp4Movie).getBox(this.f21847fc);
        this.fos.flush();
        if (this.allowSyncFiles) {
            this.fos.getFD().sync();
        }
        this.f21847fc.close();
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
            this.mdat.getBox(this.f21847fc);
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
            this.f21847fc.write(this.sizeBuffer);
            byteBuffer.position(bufferInfo.offset + 4);
        } else {
            byteBuffer.position(bufferInfo.offset);
        }
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        this.f21847fc.write(byteBuffer);
        this.dataOffset += bufferInfo.size;
        if (!z11) {
            return 0L;
        }
        this.fos.flush();
        if (this.allowSyncFiles) {
            this.fos.getFD().sync();
        }
        return this.f21847fc.position();
    }

    public void finishMovie(File file) {
        if (file == null) {
            finishMovie();
            return;
        }
        this.fos.flush();
        long position = this.f21847fc.position();
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

    public void createSidx(Track track, s2.p pVar) {
    }

    public static class InterleaveChunkMdat implements s2.b {
        private long contentSize;
        private long dataOffset;
        private s2.f parent;

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
            allocate.put(r2.c.d("mdat"));
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
        public s2.f getParent() {
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
        public void setParent(s2.f fVar) {
            this.parent = fVar;
        }

        public void parse(com.googlecode.mp4parser.f fVar, ByteBuffer byteBuffer, long j10, r2.a aVar) {
        }
    }
}
