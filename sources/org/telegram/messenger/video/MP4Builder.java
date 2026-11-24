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

    public void createCtts(Track track, jp9 jp9Var) {
        int[] sampleCompositions = track.getSampleCompositions();
        if (sampleCompositions == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        mq2 mq2Var = null;
        for (int i : sampleCompositions) {
            if (mq2Var != null && mq2Var.b == i) {
                mq2Var.a++;
            } else {
                mq2Var = new mq2(1, i);
                arrayList.add(mq2Var);
            }
        }
        ?? y1Var = new y1("ctts");
        y1Var.e = Collections.EMPTY_LIST;
        oo1.r(z74.c(nq2.f, y1Var, y1Var, arrayList));
        y1Var.e = arrayList;
        jp9Var.a(y1Var);
    }

    public lb4 createFileTypeBox(boolean z) {
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
        ?? y1Var = new y1("ftyp");
        List list = Collections.EMPTY_LIST;
        y1Var.a = "isom";
        y1Var.b = 512L;
        y1Var.c = linkedList;
        return y1Var;
    }

    public MP4Builder createMovie(Mp4Movie mp4Movie, boolean z, boolean z2) {
        this.currentMp4Movie = mp4Movie;
        FileOutputStream fileOutputStream = new FileOutputStream(mp4Movie.getCacheFile());
        this.fos = fileOutputStream;
        this.fc = fileOutputStream.getChannel();
        lb4 createFileTypeBox = createFileTypeBox(z2);
        createFileTypeBox.getBox(this.fc);
        long size = createFileTypeBox.getSize() + this.dataOffset;
        this.dataOffset = size;
        this.wroteSinceLastMdat += size;
        this.splitMdat = z;
        this.mdat = new InterleaveChunkMdat();
        this.sizeBuffer = ByteBuffer.allocateDirect(4);
        return this;
    }

    public ff7 createMovieBox(Mp4Movie mp4Movie) {
        ?? a2Var = new a2("moov");
        ?? y1Var = new y1("mvhd");
        y1Var.r = 1.0d;
        y1Var.s = 1.0f;
        jj6 jj6Var = jj6.j;
        y1Var.w = jj6Var;
        Date date = new Date();
        oo1.r(z74.c(gf7.R, y1Var, y1Var, date));
        y1Var.e = date;
        long j = 4294967296L;
        if (nce.a(date) >= 4294967296L) {
            y1Var.h();
        }
        Date date2 = new Date();
        oo1.r(z74.c(gf7.S, y1Var, y1Var, date2));
        y1Var.f = date2;
        if (nce.a(date2) >= 4294967296L) {
            y1Var.h();
        }
        oo1.r(z74.c(gf7.V, y1Var, y1Var, jj6Var));
        y1Var.w = jj6Var;
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
        oo1.r(z74.c(gf7.U, y1Var, y1Var, new Long(j2)));
        y1Var.n = j2;
        if (j2 >= j4) {
            y1Var.h();
        }
        oo1.r(z74.c(gf7.T, y1Var, y1Var, new Long(timescale)));
        y1Var.h = timescale;
        long size2 = mp4Movie.getTracks().size() + 1;
        oo1.r(z74.c(gf7.W, y1Var, y1Var, new Long(size2)));
        y1Var.x = size2;
        a2Var.a(y1Var);
        ArrayList<Track> tracks2 = mp4Movie.getTracks();
        int size3 = tracks2.size();
        while (i < size3) {
            Track track3 = tracks2.get(i);
            i++;
            a2Var.a(createTrackBox(track3, mp4Movie));
        }
        return a2Var;
    }

    public iy0 createStbl(Track track) {
        ?? a2Var = new a2("stbl");
        createStsd(track, a2Var);
        createStts(track, a2Var);
        createCtts(track, a2Var);
        createStss(track, a2Var);
        createStsc(track, a2Var);
        createStsz(track, a2Var);
        createStco(track, a2Var);
        return a2Var;
    }

    public void createStco(Track track, jp9 jp9Var) {
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
        ?? y1Var = new y1("stco");
        y1Var.f = new long[0];
        oo1.r(z74.c(kwa.n, y1Var, y1Var, jArr));
        y1Var.f = jArr;
        jp9Var.a(y1Var);
    }

    public void createStsc(Track track, jp9 jp9Var) {
        ?? y1Var = new y1("stsc");
        y1Var.e = Collections.EMPTY_LIST;
        LinkedList linkedList = new LinkedList();
        oo1.r(z74.c(lp9.h, y1Var, y1Var, linkedList));
        y1Var.e = linkedList;
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
                    oo1.r(z74.b(lp9.f, y1Var, y1Var));
                    y1Var.e.add(new kp9(i2, i3, 1L));
                    i = i3;
                }
                i2++;
                i3 = 0;
            }
        }
        jp9Var.a(y1Var);
    }

    public void createStsd(Track track, jp9 jp9Var) {
        jp9Var.a(track.getSampleDescriptionBox());
    }

    public void createStss(Track track, jp9 jp9Var) {
        long[] syncSamples = track.getSyncSamples();
        if (syncSamples != null && syncSamples.length > 0) {
            ?? y1Var = new y1("stss");
            oo1.r(z74.c(tcb.h, y1Var, y1Var, syncSamples));
            y1Var.e = syncSamples;
            jp9Var.a(y1Var);
        }
    }

    public void createStsz(Track track, jp9 jp9Var) {
        ?? y1Var = new y1("stsz");
        y1Var.f = new long[0];
        long[] jArr = this.track2SampleSizes.get(track);
        oo1.r(z74.c(hp9.s, y1Var, y1Var, jArr));
        y1Var.f = jArr;
        jp9Var.a(y1Var);
    }

    public void createStts(Track track, jp9 jp9Var) {
        long[] sampleDurations;
        ArrayList arrayList = new ArrayList();
        tnb tnbVar = null;
        for (long j : track.getSampleDurations()) {
            if (tnbVar != null && tnbVar.b == j) {
                tnbVar.a++;
            } else {
                tnbVar = new tnb(1L, j);
                arrayList.add(tnbVar);
            }
        }
        ?? y1Var = new y1("stts");
        y1Var.e = Collections.EMPTY_LIST;
        oo1.r(z74.c(unb.f, y1Var, y1Var, arrayList));
        y1Var.e = arrayList;
        jp9Var.a(y1Var);
    }

    public pxb createTrackBox(Track track, Mp4Movie mp4Movie) {
        String str;
        ?? a2Var = new a2("trak");
        ?? y1Var = new y1("tkhd");
        jj6 jj6Var = jj6.j;
        y1Var.x = jj6Var;
        c5a c = z74.c(uxb.a0, y1Var, y1Var, new Boolean(true));
        n89.a().getClass();
        n89.b(c);
        y1Var.g(y1Var.d() | 1);
        c5a c2 = z74.c(uxb.b0, y1Var, y1Var, new Boolean(true));
        n89.a().getClass();
        n89.b(c2);
        y1Var.g(y1Var.d() | 2);
        c5a c3 = z74.c(uxb.c0, y1Var, y1Var, new Boolean(true));
        n89.a().getClass();
        n89.b(c3);
        y1Var.g(y1Var.d() | 4);
        if (track.isAudio()) {
            oo1.r(z74.c(uxb.X, y1Var, y1Var, jj6Var));
            y1Var.x = jj6Var;
        } else {
            jj6 matrix = mp4Movie.getMatrix();
            oo1.r(z74.c(uxb.X, y1Var, y1Var, matrix));
            y1Var.x = matrix;
        }
        oo1.r(z74.c(uxb.V, y1Var, y1Var, new Integer(0)));
        y1Var.s = 0;
        Date creationTime = track.getCreationTime();
        oo1.r(z74.c(uxb.Q, y1Var, y1Var, creationTime));
        y1Var.e = creationTime;
        if (nce.a(creationTime) >= 4294967296L) {
            y1Var.h();
        }
        long timescale = (getTimescale(mp4Movie) * track.getDuration()) / track.getTimeScale();
        oo1.r(z74.c(uxb.T, y1Var, y1Var, new Long(timescale)));
        y1Var.n = timescale;
        if (timescale >= 4294967296L) {
            y1Var.g(1);
        }
        double height = track.getHeight();
        oo1.r(z74.c(uxb.Z, y1Var, y1Var, new Double(height)));
        y1Var.E = height;
        double width = track.getWidth();
        oo1.r(z74.c(uxb.Y, y1Var, y1Var, new Double(width)));
        y1Var.y = width;
        oo1.r(z74.c(uxb.U, y1Var, y1Var, new Integer(0)));
        y1Var.r = 0;
        Date date = new Date();
        oo1.r(z74.c(uxb.R, y1Var, y1Var, date));
        y1Var.f = date;
        if (nce.a(date) >= 4294967296L) {
            y1Var.h();
        }
        long trackId = track.getTrackId() + 1;
        oo1.r(z74.c(uxb.S, y1Var, y1Var, new Long(trackId)));
        y1Var.h = trackId;
        float volume = track.getVolume();
        oo1.r(z74.c(uxb.W, y1Var, y1Var, new Float(volume)));
        y1Var.w = volume;
        a2Var.a(y1Var);
        c63 c63Var = new c63("mdia", (byte) 2);
        a2Var.a(c63Var);
        ?? y1Var2 = new y1("mdhd");
        y1Var2.e = new Date();
        y1Var2.f = new Date();
        y1Var2.r = "eng";
        Date creationTime2 = track.getCreationTime();
        oo1.r(z74.c(nq6.F, y1Var2, y1Var2, creationTime2));
        y1Var2.e = creationTime2;
        long duration = track.getDuration();
        oo1.r(z74.c(nq6.H, y1Var2, y1Var2, new Long(duration)));
        y1Var2.n = duration;
        long timeScale = track.getTimeScale();
        oo1.r(z74.c(nq6.G, y1Var2, y1Var2, new Long(timeScale)));
        y1Var2.h = timeScale;
        oo1.r(z74.c(nq6.I, y1Var2, y1Var2, "eng"));
        y1Var2.r = "eng";
        c63Var.a(y1Var2);
        ?? y1Var3 = new y1("hdlr");
        y1Var3.f = null;
        y1Var3.s = true;
        if (track.isAudio()) {
            str = "SoundHandle";
        } else {
            str = "VideoHandle";
        }
        oo1.r(z74.c(ic5.y, y1Var3, y1Var3, str));
        y1Var3.f = str;
        String handler = track.getHandler();
        oo1.r(z74.c(ic5.E, y1Var3, y1Var3, handler));
        y1Var3.e = handler;
        c63Var.a(y1Var3);
        c63 c63Var2 = new c63("minf", (byte) 3);
        c63Var2.a(track.getMediaHeaderBox());
        c63 c63Var3 = new c63("dinf", (byte) 0);
        c63 c63Var4 = new c63("dref", (byte) 1);
        c63Var3.a(c63Var4);
        ?? y1Var4 = new y1("url ");
        y1Var4.g(1);
        c63Var4.a(y1Var4);
        c63Var2.a(c63Var3);
        c63Var2.a(createStbl(track));
        c63Var.a(c63Var2);
        return a2Var;
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
        gl.E(this.currentMp4Movie.getCacheFile(), file);
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

    public void createSidx(Track track, jp9 jp9Var) {
    }

    public static class InterleaveChunkMdat implements iy0 {
        private long contentSize;
        private long dataOffset;
        private wu2 parent;

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
            allocate.put(or5.d("mdat"));
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
        public wu2 getParent() {
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
        public void setParent(wu2 wu2Var) {
            this.parent = wu2Var;
        }

        public void parse(n63 n63Var, ByteBuffer byteBuffer, long j, qy0 qy0Var) {
        }
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
