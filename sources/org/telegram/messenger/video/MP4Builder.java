package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.google.android.gms.internal.vision.e2;
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
import w7.t6;
public class MP4Builder {
    private boolean splitMdat;
    private boolean wasFirstVideoFrame;
    private InterleaveChunkMdat mdat = null;
    private Mp4Movie currentMp4Movie = null;
    private FileOutputStream fos = null;
    private FileChannel f16616fc = null;
    private long dataOffset = 0;
    private long wroteSinceLastMdat = 0;
    private boolean writeNewMdat = true;
    private HashMap<Track, long[]> track2SampleSizes = new HashMap<>();
    private ByteBuffer sizeBuffer = null;
    private boolean allowSyncFiles = true;

    private void flushCurrentMdat() {
        long position = this.f16616fc.position();
        this.f16616fc.position(this.mdat.getOffset());
        this.mdat.getBox(this.f16616fc);
        this.f16616fc.position(position);
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

    public void createCtts(Track track, f5.p pVar) {
        int[] sampleCompositions = track.getSampleCompositions();
        if (sampleCompositions == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        f5.d dVar = null;
        for (int i10 : sampleCompositions) {
            if (dVar != null && dVar.f7792b == i10) {
                dVar.f7791a++;
            } else {
                dVar = new f5.d(1, i10);
                arrayList.add(dVar);
            }
        }
        ?? aVar = new com.googlecode.mp4parser.a("ctts");
        aVar.e = Collections.EMPTY_LIST;
        e2.q(re.a.c(f5.e.f7793f, aVar, aVar, arrayList));
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
        aVar.f7795a = "isom";
        aVar.f7796b = 512L;
        aVar.f7797c = linkedList;
        return aVar;
    }

    public MP4Builder createMovie(Mp4Movie mp4Movie, boolean z10, boolean z11) {
        this.currentMp4Movie = mp4Movie;
        FileOutputStream fileOutputStream = new FileOutputStream(mp4Movie.getCacheFile());
        this.fos = fileOutputStream;
        this.f16616fc = fileOutputStream.getChannel();
        f5.i createFileTypeBox = createFileTypeBox(z11);
        createFileTypeBox.getBox(this.f16616fc);
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
        aVar.f7814r = 1.0d;
        aVar.f7815s = 1.0f;
        qc.d dVar = qc.d.f40649j;
        aVar.v = dVar;
        Date date = new Date();
        e2.q(re.a.c(f5.m.Q, aVar, aVar, date));
        aVar.e = date;
        long j3 = 4294967296L;
        if (t6.a(date) >= 4294967296L) {
            aVar.h();
        }
        Date date2 = new Date();
        e2.q(re.a.c(f5.m.R, aVar, aVar, date2));
        aVar.f7812f = date2;
        if (t6.a(date2) >= 4294967296L) {
            aVar.h();
        }
        e2.q(re.a.c(f5.m.U, aVar, aVar, dVar));
        aVar.v = dVar;
        long timescale = getTimescale(mp4Movie);
        ArrayList<Track> tracks = mp4Movie.getTracks();
        int size = tracks.size();
        int i10 = 0;
        long j10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Track track = tracks.get(i11);
            i11++;
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
        e2.q(re.a.c(f5.m.T, aVar, aVar, new Long(j10)));
        aVar.f7813n = j10;
        if (j10 >= j12) {
            aVar.h();
        }
        e2.q(re.a.c(f5.m.S, aVar, aVar, new Long(timescale)));
        aVar.h = timescale;
        long size2 = mp4Movie.getTracks().size() + 1;
        e2.q(re.a.c(f5.m.V, aVar, aVar, new Long(size2)));
        aVar.f7816w = size2;
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
        long j3 = -1;
        int i10 = 0;
        while (i10 < size) {
            Sample sample = samples.get(i10);
            i10++;
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
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            jArr[i11] = ((Long) arrayList.get(i11)).longValue();
        }
        ?? aVar = new com.googlecode.mp4parser.a("stco");
        aVar.f7830f = new long[0];
        e2.q(re.a.c(t.f7829n, aVar, aVar, jArr));
        aVar.f7830f = jArr;
        pVar.a(aVar);
    }

    public void createStsc(Track track, f5.p pVar) {
        ?? aVar = new com.googlecode.mp4parser.a("stsc");
        aVar.e = Collections.EMPTY_LIST;
        LinkedList linkedList = new LinkedList();
        e2.q(re.a.c(r.h, aVar, aVar, linkedList));
        aVar.e = linkedList;
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
                    e2.q(re.a.b(r.f7826f, aVar, aVar));
                    aVar.e.add(new f5.q(i12, i11, 1L));
                    i10 = i11;
                }
                i12++;
                i11 = 0;
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
            e2.q(re.a.c(u.h, aVar, aVar, syncSamples));
            aVar.e = syncSamples;
            pVar.a(aVar);
        }
    }

    public void createStsz(Track track, f5.p pVar) {
        ?? aVar = new com.googlecode.mp4parser.a("stsz");
        aVar.f7822f = new long[0];
        long[] jArr = this.track2SampleSizes.get(track);
        e2.q(re.a.c(f5.o.f7821s, aVar, aVar, jArr));
        aVar.f7822f = jArr;
        pVar.a(aVar);
    }

    public void createStts(Track track, f5.p pVar) {
        long[] sampleDurations;
        ArrayList arrayList = new ArrayList();
        v vVar = null;
        for (long j3 : track.getSampleDurations()) {
            if (vVar != null && vVar.f7833b == j3) {
                vVar.f7832a++;
            } else {
                vVar = new v(1L, j3);
                arrayList.add(vVar);
            }
        }
        ?? aVar = new com.googlecode.mp4parser.a("stts");
        aVar.e = Collections.EMPTY_LIST;
        e2.q(re.a.c(w.f7834f, aVar, aVar, arrayList));
        aVar.e = arrayList;
        pVar.a(aVar);
    }

    public x createTrackBox(Track track, Mp4Movie mp4Movie) {
        String str;
        ?? bVar = new com.googlecode.mp4parser.b("trak");
        ?? aVar = new com.googlecode.mp4parser.a("tkhd");
        qc.d dVar = qc.d.f40649j;
        aVar.f7841w = dVar;
        s c10 = re.a.c(y.Z, aVar, aVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c10);
        aVar.g(aVar.d() | 1);
        s c11 = re.a.c(y.f7835a0, aVar, aVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c11);
        aVar.g(aVar.d() | 2);
        s c12 = re.a.c(y.f7836b0, aVar, aVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c12);
        aVar.g(aVar.d() | 4);
        if (track.isAudio()) {
            e2.q(re.a.c(y.W, aVar, aVar, dVar));
            aVar.f7841w = dVar;
        } else {
            qc.d matrix = mp4Movie.getMatrix();
            e2.q(re.a.c(y.W, aVar, aVar, matrix));
            aVar.f7841w = matrix;
        }
        e2.q(re.a.c(y.U, aVar, aVar, new Integer(0)));
        aVar.f7840s = 0;
        Date creationTime = track.getCreationTime();
        e2.q(re.a.c(y.P, aVar, aVar, creationTime));
        aVar.e = creationTime;
        if (t6.a(creationTime) >= 4294967296L) {
            aVar.h();
        }
        long timescale = (getTimescale(mp4Movie) * track.getDuration()) / track.getTimeScale();
        e2.q(re.a.c(y.S, aVar, aVar, new Long(timescale)));
        aVar.f7838n = timescale;
        if (timescale >= 4294967296L) {
            aVar.g(1);
        }
        double height = track.getHeight();
        e2.q(re.a.c(y.Y, aVar, aVar, new Double(height)));
        aVar.f7843y = height;
        double width = track.getWidth();
        e2.q(re.a.c(y.X, aVar, aVar, new Double(width)));
        aVar.f7842x = width;
        e2.q(re.a.c(y.T, aVar, aVar, new Integer(0)));
        aVar.f7839r = 0;
        Date date = new Date();
        e2.q(re.a.c(y.Q, aVar, aVar, date));
        aVar.f7837f = date;
        if (t6.a(date) >= 4294967296L) {
            aVar.h();
        }
        long trackId = track.getTrackId() + 1;
        e2.q(re.a.c(y.R, aVar, aVar, new Long(trackId)));
        aVar.h = trackId;
        float volume = track.getVolume();
        e2.q(re.a.c(y.V, aVar, aVar, new Float(volume)));
        aVar.v = volume;
        bVar.a(aVar);
        f5.h hVar = new f5.h("mdia", 2);
        bVar.a(hVar);
        ?? aVar2 = new com.googlecode.mp4parser.a("mdhd");
        aVar2.e = new Date();
        aVar2.f7809f = new Date();
        aVar2.f7811r = "eng";
        Date creationTime2 = track.getCreationTime();
        e2.q(re.a.c(f5.k.E, aVar2, aVar2, creationTime2));
        aVar2.e = creationTime2;
        long duration = track.getDuration();
        e2.q(re.a.c(f5.k.G, aVar2, aVar2, new Long(duration)));
        aVar2.f7810n = duration;
        long timeScale = track.getTimeScale();
        e2.q(re.a.c(f5.k.F, aVar2, aVar2, new Long(timeScale)));
        aVar2.h = timeScale;
        e2.q(re.a.c(f5.k.H, aVar2, aVar2, "eng"));
        aVar2.f7811r = "eng";
        hVar.a(aVar2);
        ?? aVar3 = new com.googlecode.mp4parser.a("hdlr");
        aVar3.f7801f = null;
        aVar3.f7804s = true;
        if (track.isAudio()) {
            str = "SoundHandle";
        } else {
            str = "VideoHandle";
        }
        e2.q(re.a.c(f5.j.f7799x, aVar3, aVar3, str));
        aVar3.f7801f = str;
        String handler = track.getHandler();
        e2.q(re.a.c(f5.j.f7800y, aVar3, aVar3, handler));
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
        createMovieBox(this.currentMp4Movie).getBox(this.f16616fc);
        this.fos.flush();
        if (this.allowSyncFiles) {
            this.fos.getFD().sync();
        }
        this.f16616fc.close();
        this.fos.close();
    }

    public long getLastFrameTimestamp(int i10) {
        return this.currentMp4Movie.getLastFrameTimestamp(i10);
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
        int i10 = 0;
        while (i10 < size) {
            Track track = tracks.get(i10);
            i10++;
            j3 = gcd(track.getTimeScale(), j3);
        }
        return j3;
    }

    public void setAllowSyncFiles(boolean z10) {
        this.allowSyncFiles = z10;
    }

    public long writeSampleData(int i10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, boolean z10) {
        boolean z11;
        if (this.writeNewMdat) {
            this.mdat.setContentSize(0L);
            this.mdat.getBox(this.f16616fc);
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
        this.currentMp4Movie.addSample(i10, this.dataOffset, bufferInfo);
        if (z10) {
            this.sizeBuffer.position(0);
            this.sizeBuffer.putInt(bufferInfo.size - 4);
            this.sizeBuffer.position(0);
            this.f16616fc.write(this.sizeBuffer);
            byteBuffer.position(bufferInfo.offset + 4);
        } else {
            byteBuffer.position(bufferInfo.offset);
        }
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        this.f16616fc.write(byteBuffer);
        this.dataOffset += bufferInfo.size;
        if (!z11) {
            return 0L;
        }
        this.fos.flush();
        if (this.allowSyncFiles) {
            this.fos.getFD().sync();
        }
        return this.f16616fc.position();
    }

    public void finishMovie(File file) {
        if (file == null) {
            finishMovie();
            return;
        }
        this.fos.flush();
        long position = this.f16616fc.position();
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

        public void setContentSize(long j3) {
            this.contentSize = j3;
        }

        public void setDataOffset(long j3) {
            this.dataOffset = j3;
        }

        @Override
        public void setParent(f5.f fVar) {
            this.parent = fVar;
        }

        public void parse(com.googlecode.mp4parser.f fVar, ByteBuffer byteBuffer, long j3, e5.a aVar) {
        }
    }
}
