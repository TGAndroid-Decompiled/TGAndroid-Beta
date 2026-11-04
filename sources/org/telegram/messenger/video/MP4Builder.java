package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import b8.fe;
import h5.t;
import h5.u;
import h5.v;
import h5.w;
import h5.x;
import h5.y;
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
    private FileChannel f25888fc = null;
    private long dataOffset = 0;
    private long wroteSinceLastMdat = 0;
    private boolean writeNewMdat = true;
    private HashMap<Track, long[]> track2SampleSizes = new HashMap<>();
    private ByteBuffer sizeBuffer = null;
    private boolean allowSyncFiles = true;

    private void flushCurrentMdat() {
        long position = this.f25888fc.position();
        this.f25888fc.position(this.mdat.getOffset());
        this.mdat.getBox(this.f25888fc);
        this.f25888fc.position(position);
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

    public void createCtts(Track track, h5.p pVar) {
        int[] sampleCompositions = track.getSampleCompositions();
        if (sampleCompositions == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        h5.d dVar = null;
        for (int i3 : sampleCompositions) {
            if (dVar != null && dVar.f14238b == i3) {
                dVar.f14237a++;
            } else {
                dVar = new h5.d(1, i3);
                arrayList.add(dVar);
            }
        }
        ?? aVar = new com.googlecode.mp4parser.a("ctts");
        aVar.f14240e = Collections.EMPTY_LIST;
        com.google.android.recaptcha.internal.a.t(we.a.c(h5.e.f14239f, aVar, aVar, arrayList));
        aVar.f14240e = arrayList;
        pVar.a(aVar);
    }

    public h5.i createFileTypeBox(boolean z10) {
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
        aVar.f14244a = "isom";
        aVar.f14245b = 512L;
        aVar.f14246c = linkedList;
        return aVar;
    }

    public MP4Builder createMovie(Mp4Movie mp4Movie, boolean z10, boolean z11) {
        this.currentMp4Movie = mp4Movie;
        FileOutputStream fileOutputStream = new FileOutputStream(mp4Movie.getCacheFile());
        this.fos = fileOutputStream;
        this.f25888fc = fileOutputStream.getChannel();
        h5.i createFileTypeBox = createFileTypeBox(z11);
        createFileTypeBox.getBox(this.f25888fc);
        long size = createFileTypeBox.getSize() + this.dataOffset;
        this.dataOffset = size;
        this.wroteSinceLastMdat += size;
        this.splitMdat = z10;
        this.mdat = new InterleaveChunkMdat();
        this.sizeBuffer = ByteBuffer.allocateDirect(4);
        return this;
    }

    public h5.l createMovieBox(Mp4Movie mp4Movie) {
        ?? bVar = new com.googlecode.mp4parser.b("moov");
        ?? aVar = new com.googlecode.mp4parser.a("mvhd");
        aVar.f14266r = 1.0d;
        aVar.f14267s = 1.0f;
        mc.d dVar = mc.d.f19264j;
        aVar.f14268w = dVar;
        Date date = new Date();
        com.google.android.recaptcha.internal.a.t(we.a.c(h5.m.R, aVar, aVar, date));
        aVar.f14263e = date;
        long j10 = 4294967296L;
        if (fe.a(date) >= 4294967296L) {
            aVar.h();
        }
        Date date2 = new Date();
        com.google.android.recaptcha.internal.a.t(we.a.c(h5.m.S, aVar, aVar, date2));
        aVar.f14264f = date2;
        if (fe.a(date2) >= 4294967296L) {
            aVar.h();
        }
        com.google.android.recaptcha.internal.a.t(we.a.c(h5.m.V, aVar, aVar, dVar));
        aVar.f14268w = dVar;
        long timescale = getTimescale(mp4Movie);
        ArrayList<Track> tracks = mp4Movie.getTracks();
        int size = tracks.size();
        int i3 = 0;
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
        com.google.android.recaptcha.internal.a.t(we.a.c(h5.m.U, aVar, aVar, new Long(j11)));
        aVar.f14265n = j11;
        if (j11 >= j13) {
            aVar.h();
        }
        com.google.android.recaptcha.internal.a.t(we.a.c(h5.m.T, aVar, aVar, new Long(timescale)));
        aVar.h = timescale;
        long size2 = mp4Movie.getTracks().size() + 1;
        com.google.android.recaptcha.internal.a.t(we.a.c(h5.m.W, aVar, aVar, new Long(size2)));
        aVar.f14269x = size2;
        bVar.a(aVar);
        ArrayList<Track> tracks2 = mp4Movie.getTracks();
        int size3 = tracks2.size();
        while (i3 < size3) {
            Track track3 = tracks2.get(i3);
            i3++;
            bVar.a(createTrackBox(track3, mp4Movie));
        }
        return bVar;
    }

    public h5.b createStbl(Track track) {
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

    public void createStco(Track track, h5.p pVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList<Sample> samples = track.getSamples();
        int size = samples.size();
        long j10 = -1;
        int i3 = 0;
        while (i3 < size) {
            Sample sample = samples.get(i3);
            i3++;
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
        aVar.f14286f = new long[0];
        com.google.android.recaptcha.internal.a.t(we.a.c(t.f14285n, aVar, aVar, jArr));
        aVar.f14286f = jArr;
        pVar.a(aVar);
    }

    public void createStsc(Track track, h5.p pVar) {
        ?? aVar = new com.googlecode.mp4parser.a("stsc");
        aVar.f14282e = Collections.EMPTY_LIST;
        LinkedList linkedList = new LinkedList();
        com.google.android.recaptcha.internal.a.t(we.a.c(h5.r.h, aVar, aVar, linkedList));
        aVar.f14282e = linkedList;
        int size = track.getSamples().size();
        int i3 = -1;
        int i10 = 1;
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Sample sample = track.getSamples().get(i12);
            long size2 = sample.getSize() + sample.getOffset();
            i11++;
            if (i12 == size - 1 || size2 != track.getSamples().get(i12 + 1).getOffset()) {
                if (i3 != i11) {
                    com.google.android.recaptcha.internal.a.t(we.a.b(h5.r.f14280f, aVar, aVar));
                    aVar.f14282e.add(new h5.q(i10, i11, 1L));
                    i3 = i11;
                }
                i10++;
                i11 = 0;
            }
        }
        pVar.a(aVar);
    }

    public void createStsd(Track track, h5.p pVar) {
        pVar.a(track.getSampleDescriptionBox());
    }

    public void createStss(Track track, h5.p pVar) {
        long[] syncSamples = track.getSyncSamples();
        if (syncSamples != null && syncSamples.length > 0) {
            ?? aVar = new com.googlecode.mp4parser.a("stss");
            com.google.android.recaptcha.internal.a.t(we.a.c(u.h, aVar, aVar, syncSamples));
            aVar.f14288e = syncSamples;
            pVar.a(aVar);
        }
    }

    public void createStsz(Track track, h5.p pVar) {
        ?? aVar = new com.googlecode.mp4parser.a("stsz");
        aVar.f14276f = new long[0];
        long[] jArr = this.track2SampleSizes.get(track);
        com.google.android.recaptcha.internal.a.t(we.a.c(h5.o.f14273s, aVar, aVar, jArr));
        aVar.f14276f = jArr;
        pVar.a(aVar);
    }

    public void createStts(Track track, h5.p pVar) {
        long[] sampleDurations;
        ArrayList arrayList = new ArrayList();
        v vVar = null;
        for (long j10 : track.getSampleDurations()) {
            if (vVar != null && vVar.f14290b == j10) {
                vVar.f14289a++;
            } else {
                vVar = new v(1L, j10);
                arrayList.add(vVar);
            }
        }
        ?? aVar = new com.googlecode.mp4parser.a("stts");
        aVar.f14292e = Collections.EMPTY_LIST;
        com.google.android.recaptcha.internal.a.t(we.a.c(w.f14291f, aVar, aVar, arrayList));
        aVar.f14292e = arrayList;
        pVar.a(aVar);
    }

    public x createTrackBox(Track track, Mp4Movie mp4Movie) {
        String str;
        ?? bVar = new com.googlecode.mp4parser.b("trak");
        ?? aVar = new com.googlecode.mp4parser.a("tkhd");
        mc.d dVar = mc.d.f19264j;
        aVar.f14302x = dVar;
        ui.f c2 = we.a.c(y.f14293a0, aVar, aVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c2);
        aVar.g(aVar.d() | 1);
        ui.f c10 = we.a.c(y.f14294b0, aVar, aVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c10);
        aVar.g(aVar.d() | 2);
        ui.f c11 = we.a.c(y.f14295c0, aVar, aVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c11);
        aVar.g(aVar.d() | 4);
        if (track.isAudio()) {
            com.google.android.recaptcha.internal.a.t(we.a.c(y.X, aVar, aVar, dVar));
            aVar.f14302x = dVar;
        } else {
            mc.d matrix = mp4Movie.getMatrix();
            com.google.android.recaptcha.internal.a.t(we.a.c(y.X, aVar, aVar, matrix));
            aVar.f14302x = matrix;
        }
        com.google.android.recaptcha.internal.a.t(we.a.c(y.V, aVar, aVar, new Integer(0)));
        aVar.f14300s = 0;
        Date creationTime = track.getCreationTime();
        com.google.android.recaptcha.internal.a.t(we.a.c(y.Q, aVar, aVar, creationTime));
        aVar.f14296e = creationTime;
        if (fe.a(creationTime) >= 4294967296L) {
            aVar.h();
        }
        long timescale = (getTimescale(mp4Movie) * track.getDuration()) / track.getTimeScale();
        com.google.android.recaptcha.internal.a.t(we.a.c(y.T, aVar, aVar, new Long(timescale)));
        aVar.f14298n = timescale;
        if (timescale >= 4294967296L) {
            aVar.g(1);
        }
        double height = track.getHeight();
        com.google.android.recaptcha.internal.a.t(we.a.c(y.Z, aVar, aVar, new Double(height)));
        aVar.E = height;
        double width = track.getWidth();
        com.google.android.recaptcha.internal.a.t(we.a.c(y.Y, aVar, aVar, new Double(width)));
        aVar.f14303y = width;
        com.google.android.recaptcha.internal.a.t(we.a.c(y.U, aVar, aVar, new Integer(0)));
        aVar.f14299r = 0;
        Date date = new Date();
        com.google.android.recaptcha.internal.a.t(we.a.c(y.R, aVar, aVar, date));
        aVar.f14297f = date;
        if (fe.a(date) >= 4294967296L) {
            aVar.h();
        }
        long trackId = track.getTrackId() + 1;
        com.google.android.recaptcha.internal.a.t(we.a.c(y.S, aVar, aVar, new Long(trackId)));
        aVar.h = trackId;
        float volume = track.getVolume();
        com.google.android.recaptcha.internal.a.t(we.a.c(y.W, aVar, aVar, new Float(volume)));
        aVar.f14301w = volume;
        bVar.a(aVar);
        h5.h hVar = new h5.h("mdia", 2);
        bVar.a(hVar);
        ?? aVar2 = new com.googlecode.mp4parser.a("mdhd");
        aVar2.f14259e = new Date();
        aVar2.f14260f = new Date();
        aVar2.f14262r = "eng";
        Date creationTime2 = track.getCreationTime();
        com.google.android.recaptcha.internal.a.t(we.a.c(h5.k.F, aVar2, aVar2, creationTime2));
        aVar2.f14259e = creationTime2;
        long duration = track.getDuration();
        com.google.android.recaptcha.internal.a.t(we.a.c(h5.k.H, aVar2, aVar2, new Long(duration)));
        aVar2.f14261n = duration;
        long timeScale = track.getTimeScale();
        com.google.android.recaptcha.internal.a.t(we.a.c(h5.k.G, aVar2, aVar2, new Long(timeScale)));
        aVar2.h = timeScale;
        com.google.android.recaptcha.internal.a.t(we.a.c(h5.k.I, aVar2, aVar2, "eng"));
        aVar2.f14262r = "eng";
        hVar.a(aVar2);
        ?? aVar3 = new com.googlecode.mp4parser.a("hdlr");
        aVar3.f14250f = null;
        aVar3.f14253s = true;
        if (track.isAudio()) {
            str = "SoundHandle";
        } else {
            str = "VideoHandle";
        }
        com.google.android.recaptcha.internal.a.t(we.a.c(h5.j.f14248y, aVar3, aVar3, str));
        aVar3.f14250f = str;
        String handler = track.getHandler();
        com.google.android.recaptcha.internal.a.t(we.a.c(h5.j.E, aVar3, aVar3, handler));
        aVar3.f14249e = handler;
        hVar.a(aVar3);
        h5.h hVar2 = new h5.h("minf", 3);
        hVar2.a(track.getMediaHeaderBox());
        h5.h hVar3 = new h5.h("dinf", 0);
        h5.h hVar4 = new h5.h("dref", 1);
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
        int i3 = 0;
        while (i3 < size) {
            Track track = tracks.get(i3);
            i3++;
            Track track2 = track;
            ArrayList<Sample> samples = track2.getSamples();
            int size2 = samples.size();
            long[] jArr = new long[size2];
            for (int i10 = 0; i10 < size2; i10++) {
                jArr[i10] = samples.get(i10).getSize();
            }
            this.track2SampleSizes.put(track2, jArr);
        }
        createMovieBox(this.currentMp4Movie).getBox(this.f25888fc);
        this.fos.flush();
        if (this.allowSyncFiles) {
            this.fos.getFD().sync();
        }
        this.f25888fc.close();
        this.fos.close();
    }

    public long getLastFrameTimestamp(int i3) {
        return this.currentMp4Movie.getLastFrameTimestamp(i3);
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
        int i3 = 0;
        while (i3 < size) {
            Track track = tracks.get(i3);
            i3++;
            j10 = gcd(track.getTimeScale(), j10);
        }
        return j10;
    }

    public void setAllowSyncFiles(boolean z10) {
        this.allowSyncFiles = z10;
    }

    public long writeSampleData(int i3, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, boolean z10) {
        boolean z11;
        if (this.writeNewMdat) {
            this.mdat.setContentSize(0L);
            this.mdat.getBox(this.f25888fc);
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
        this.currentMp4Movie.addSample(i3, this.dataOffset, bufferInfo);
        if (z10) {
            this.sizeBuffer.position(0);
            this.sizeBuffer.putInt(bufferInfo.size - 4);
            this.sizeBuffer.position(0);
            this.f25888fc.write(this.sizeBuffer);
            byteBuffer.position(bufferInfo.offset + 4);
        } else {
            byteBuffer.position(bufferInfo.offset);
        }
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        this.f25888fc.write(byteBuffer);
        this.dataOffset += bufferInfo.size;
        if (!z11) {
            return 0L;
        }
        this.fos.flush();
        if (this.allowSyncFiles) {
            this.fos.getFD().sync();
        }
        return this.f25888fc.position();
    }

    public void finishMovie(File file) {
        if (file == null) {
            finishMovie();
            return;
        }
        this.fos.flush();
        long position = this.f25888fc.position();
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
            int i3 = 0;
            while (i3 < size) {
                Track track = tracks.get(i3);
                i3++;
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

    public void createSidx(Track track, h5.p pVar) {
    }

    public static class InterleaveChunkMdat implements h5.b {
        private long contentSize;
        private long dataOffset;
        private h5.f parent;

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
            allocate.put(g5.c.d("mdat"));
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
        public h5.f getParent() {
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
        public void setParent(h5.f fVar) {
            this.parent = fVar;
        }

        public void parse(com.googlecode.mp4parser.f fVar, ByteBuffer byteBuffer, long j10, g5.a aVar) {
        }
    }
}
