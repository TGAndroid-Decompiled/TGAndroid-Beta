package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.telegram.ui.Cells.pa;
import q2.s;
import q2.z;

public class Track {
    private static Map<Integer, Integer> samplingFrequencyIndexMap;
    private String handler;
    private q2.a headerBox;
    private int height;
    private boolean isAudio;
    private int[] sampleCompositions;
    private q2.n sampleDescriptionBox;
    private long[] sampleDurations;
    private LinkedList<Integer> syncSamples;
    private int timeScale;
    private long trackId;
    private float volume;
    private int width;
    private ArrayList<Sample> samples = new ArrayList<>();
    private long duration = 0;
    private Date creationTime = new Date();
    private ArrayList<SamplePresentationTime> samplePresentationTimes = new ArrayList<>();
    private boolean first = true;

    public static class SamplePresentationTime {
        private long dt;
        private int index;
        private long presentationTime;

        public SamplePresentationTime(int i10, long j10) {
            this.index = i10;
            this.presentationTime = j10;
        }
    }

    static {
        HashMap map = new HashMap();
        samplingFrequencyIndexMap = map;
        map.put(96000, 0);
        samplingFrequencyIndexMap.put(88200, 1);
        samplingFrequencyIndexMap.put(64000, 2);
        samplingFrequencyIndexMap.put(48000, 3);
        samplingFrequencyIndexMap.put(44100, 4);
        samplingFrequencyIndexMap.put(32000, 5);
        samplingFrequencyIndexMap.put(24000, 6);
        samplingFrequencyIndexMap.put(22050, 7);
        samplingFrequencyIndexMap.put(16000, 8);
        samplingFrequencyIndexMap.put(12000, 9);
        samplingFrequencyIndexMap.put(11025, 10);
        samplingFrequencyIndexMap.put(8000, 11);
    }

    public Track(int i10, MediaFormat mediaFormat, boolean z10) {
        int i11;
        int i12;
        this.syncSamples = null;
        this.volume = 0.0f;
        this.trackId = i10;
        this.isAudio = z10;
        int i13 = 0;
        if (z10) {
            this.volume = 1.0f;
            this.timeScale = mediaFormat.getInteger("sample-rate");
            this.handler = "soun";
            this.headerBox = new s("smhd");
            this.sampleDescriptionBox = new q2.n();
            r2.b bVar = new r2.b("mp4a");
            bVar.h = mediaFormat.getInteger("channel-count");
            bVar.f46697r = mediaFormat.getInteger("sample-rate");
            bVar.f46695f = 1;
            bVar.f46696n = 16;
            ub.b bVar2 = new ub.b("esds");
            vb.g gVar = new vb.g();
            gVar.f48865i = 0;
            gVar.f48871o = new ArrayList();
            gVar.d = 0;
            vb.m mVar = new vb.m();
            mVar.d = 2;
            gVar.f48870n = mVar;
            String string = mediaFormat.containsKey("mime") ? mediaFormat.getString("mime") : "audio/mp4-latm";
            vb.d dVar = new vb.d();
            dVar.f48859k = new ArrayList();
            if ("audio/mpeg".equals(string)) {
                dVar.d = 105;
            } else {
                dVar.d = 64;
            }
            dVar.f48854e = 5;
            dVar.f48856g = 1536;
            if (mediaFormat.containsKey("max-bitrate")) {
                i11 = 13;
                dVar.h = mediaFormat.getInteger("max-bitrate");
            } else {
                i11 = 13;
                dVar.h = 96000L;
            }
            dVar.f48857i = this.timeScale;
            vb.a aVar = new vb.a();
            aVar.f48827e = 2;
            aVar.f48828f = samplingFrequencyIndexMap.get(Integer.valueOf((int) bVar.f46697r)).intValue();
            aVar.h = bVar.h;
            dVar.f48858j = aVar;
            gVar.f48869m = dVar;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(gVar.c());
            p2.b.r(3, byteBufferAllocate);
            byteBufferAllocate.put((byte) ((gVar.c() - 2) & 255));
            p2.b.p(gVar.d, byteBufferAllocate);
            byteBufferAllocate.put((byte) (((gVar.f48862e << 7) | (gVar.f48863f << 6) | (gVar.f48864g << 5) | (31 & gVar.h)) & 255));
            if (gVar.f48862e > 0) {
                p2.b.p(gVar.f48867k, byteBufferAllocate);
            }
            if (gVar.f48863f > 0) {
                byteBufferAllocate.put((byte) (gVar.f48865i & 255));
                byteBufferAllocate.put(p2.b.b(gVar.f48866j));
                byteBufferAllocate.put((byte) 0);
            }
            if (gVar.f48864g > 0) {
                p2.b.p(gVar.f48868l, byteBufferAllocate);
            }
            vb.d dVar2 = gVar.f48869m;
            vb.a aVar2 = dVar2.f48858j;
            if (aVar2 == null) {
                i12 = 0;
            } else {
                if (aVar2.f48827e != 2) {
                    throw new UnsupportedOperationException("can't serialize that yet");
                }
                i12 = 4;
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i12 + 15);
            p2.b.r(4, byteBufferAllocate2);
            vb.a aVar3 = dVar2.f48858j;
            if (aVar3 != null) {
                if (aVar3.f48827e != 2) {
                    throw new UnsupportedOperationException("can't serialize that yet");
                }
                i13 = 4;
            }
            byteBufferAllocate2.put((byte) ((i13 + i11) & 255));
            byteBufferAllocate2.put((byte) (dVar2.d & 255));
            byteBufferAllocate2.put((byte) (((dVar2.f48854e << 2) | (dVar2.f48855f << 1) | 1) & 255));
            p2.b.q(dVar2.f48856g, byteBufferAllocate2);
            byteBufferAllocate2.putInt((int) dVar2.h);
            byteBufferAllocate2.putInt((int) dVar2.f48857i);
            vb.a aVar4 = dVar2.f48858j;
            if (aVar4 != null) {
                if (aVar4.f48827e != 2) {
                    throw new UnsupportedOperationException("can't serialize that yet");
                }
                ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(4);
                p2.b.r(5, byteBufferAllocate3);
                if (aVar4.f48827e != 2) {
                    throw new UnsupportedOperationException("can't serialize that yet");
                }
                byteBufferAllocate3.put((byte) 2);
                vb.c cVar = new vb.c(1, byteBufferAllocate3);
                cVar.c(aVar4.f48827e, 5);
                cVar.c(aVar4.f48828f, 4);
                if (aVar4.f48828f == 15) {
                    throw new UnsupportedOperationException("can't serialize that yet");
                }
                cVar.c(aVar4.h, 4);
                byteBufferAllocate2.put(byteBufferAllocate3.array());
            }
            vb.m mVar2 = gVar.f48870n;
            mVar2.getClass();
            ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(3);
            p2.b.r(6, byteBufferAllocate4);
            byteBufferAllocate4.put((byte) 1);
            byteBufferAllocate4.put((byte) (mVar2.d & 255));
            byteBufferAllocate.put(byteBufferAllocate2.array());
            byteBufferAllocate.put(byteBufferAllocate4.array());
            pa.u(ae.a.c(ub.a.h, bVar2, bVar2, byteBufferAllocate));
            bVar2.f48490e = byteBufferAllocate;
            bVar.a(bVar2);
            this.sampleDescriptionBox.a(bVar);
            return;
        }
        this.width = mediaFormat.getInteger("width");
        this.height = mediaFormat.getInteger("height");
        this.timeScale = 90000;
        this.syncSamples = new LinkedList<>();
        this.handler = "vide";
        z zVar = new z("vmhd");
        zVar.f46145e = 0;
        zVar.f46146f = new int[3];
        zVar.g(1);
        this.headerBox = zVar;
        this.sampleDescriptionBox = new q2.n();
        String string2 = mediaFormat.getString("mime");
        if (!string2.equals("video/avc")) {
            if (string2.equals("video/mp4v")) {
                r2.c cVar2 = new r2.c("mp4v");
                cVar2.f46695f = 1;
                cVar2.f46702x = 24;
                cVar2.v = 1;
                cVar2.f46699r = 72.0d;
                cVar2.f46700s = 72.0d;
                cVar2.h = this.width;
                cVar2.f46698n = this.height;
                this.sampleDescriptionBox.a(cVar2);
                return;
            }
            if (!string2.equals("video/hevc") || mediaFormat.getByteBuffer("csd-0") == null) {
                return;
            }
            byte[] bArrArray = mediaFormat.getByteBuffer("csd-0").array();
            int i14 = -1;
            int i15 = -1;
            int i16 = 0;
            int i17 = -1;
            for (int i18 = 0; i18 < bArrArray.length; i18++) {
                if (i16 == 3 && bArrArray[i18] == 1) {
                    if (i17 == -1) {
                        i17 = i18 - 3;
                    } else if (i14 == -1) {
                        i14 = i18 - 3;
                    } else if (i15 == -1) {
                        i15 = i18 - 3;
                    }
                }
                i16 = bArrArray[i18] == 0 ? i16 + 1 : 0;
            }
            byte[] bArr = new byte[i14 - 4];
            byte[] bArr2 = new byte[(i15 - i14) - 4];
            byte[] bArr3 = new byte[(bArrArray.length - i15) - 4];
            for (int i19 = 0; i19 < bArrArray.length; i19++) {
                if (i19 < i14) {
                    int i20 = i19 - 4;
                    if (i20 >= 0) {
                        bArr[i20] = bArrArray[i19];
                    }
                } else if (i19 < i15) {
                    int i21 = (i19 - i14) - 4;
                    if (i21 >= 0) {
                        bArr2[i21] = bArrArray[i19];
                    }
                } else {
                    int i22 = (i19 - i15) - 4;
                    if (i22 >= 0) {
                        bArr3[i22] = bArrArray[i19];
                    }
                }
            }
            try {
                r2.c fromCsd = HevcDecoderConfigurationRecord.parseFromCsd(Arrays.asList(ByteBuffer.wrap(bArr), ByteBuffer.wrap(bArr3), ByteBuffer.wrap(bArr2)));
                fromCsd.h = this.width;
                fromCsd.f46698n = this.height;
                this.sampleDescriptionBox.a(fromCsd);
                return;
            } catch (IOException e9) {
                e9.printStackTrace();
                return;
            }
        }
        r2.c cVar3 = new r2.c("avc1");
        cVar3.f46695f = 1;
        cVar3.f46702x = 24;
        cVar3.v = 1;
        cVar3.f46699r = 72.0d;
        cVar3.f46700s = 72.0d;
        cVar3.h = this.width;
        cVar3.f46698n = this.height;
        ac.a aVar5 = new ac.a("avcC");
        ac.b bVar3 = new ac.b();
        bVar3.f230f = new ArrayList();
        bVar3.f231g = new ArrayList();
        bVar3.h = true;
        bVar3.f232i = 1;
        bVar3.f233j = 0;
        bVar3.f234k = 0;
        bVar3.f235l = new ArrayList();
        bVar3.f236m = 63;
        bVar3.f237n = 7;
        bVar3.f238o = 31;
        bVar3.f239p = 31;
        bVar3.f240q = 31;
        aVar5.f225a = bVar3;
        if (mediaFormat.getByteBuffer("csd-0") != null) {
            ArrayList arrayList = new ArrayList();
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-0");
            byteBuffer.position(4);
            byte[] bArr4 = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr4);
            arrayList.add(bArr4);
            ArrayList arrayList2 = new ArrayList();
            ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-1");
            byteBuffer2.position(4);
            byte[] bArr5 = new byte[byteBuffer2.remaining()];
            byteBuffer2.get(bArr5);
            arrayList2.add(bArr5);
            pa.u(ae.a.c(ac.a.h, aVar5, aVar5, arrayList));
            aVar5.f225a.f230f = arrayList;
            pa.u(ae.a.c(ac.a.f219n, aVar5, aVar5, arrayList2));
            aVar5.f225a.f231g = arrayList2;
        }
        if (mediaFormat.containsKey("level")) {
            int integer = mediaFormat.getInteger("level");
            if (integer == 1) {
                aVar5.d(1);
            } else if (integer == 32) {
                aVar5.d(2);
            } else if (integer == 4) {
                aVar5.d(11);
            } else if (integer == 8) {
                aVar5.d(12);
            } else if (integer == 16) {
                aVar5.d(13);
            } else if (integer == 64) {
                aVar5.d(21);
            } else if (integer == 128) {
                aVar5.d(22);
            } else if (integer == 256) {
                aVar5.d(3);
            } else if (integer == 512) {
                aVar5.d(31);
            } else if (integer == 1024) {
                aVar5.d(32);
            } else if (integer == 2048) {
                aVar5.d(4);
            } else if (integer == 4096) {
                aVar5.d(41);
            } else if (integer == 8192) {
                aVar5.d(42);
            } else if (integer == 16384) {
                aVar5.d(5);
            } else if (integer == 32768) {
                aVar5.d(51);
            } else if (integer == 65536) {
                aVar5.d(52);
            } else if (integer == 2) {
                aVar5.d(27);
            }
        } else {
            aVar5.d(13);
        }
        if (mediaFormat.containsKey("profile")) {
            int integer2 = mediaFormat.getInteger("profile");
            if (integer2 == 1) {
                aVar5.e(66);
            } else if (integer2 == 2) {
                aVar5.e(77);
            } else if (integer2 == 4) {
                aVar5.e(88);
            } else if (integer2 == 8) {
                aVar5.e(100);
            } else if (integer2 == 16) {
                aVar5.e(110);
            } else if (integer2 == 32) {
                aVar5.e(122);
            } else if (integer2 == 64) {
                aVar5.e(244);
            }
        } else {
            aVar5.e(100);
        }
        pa.u(ae.a.c(ac.a.f221s, aVar5, aVar5, new Integer(-1)));
        aVar5.f225a.f233j = -1;
        pa.u(ae.a.c(ac.a.v, aVar5, aVar5, new Integer(-1)));
        aVar5.f225a.f234k = -1;
        pa.u(ae.a.c(ac.a.f220r, aVar5, aVar5, new Integer(-1)));
        aVar5.f225a.f232i = -1;
        pa.u(ae.a.c(ac.a.f215b, aVar5, aVar5, new Integer(1)));
        aVar5.f225a.f226a = 1;
        pa.u(ae.a.c(ac.a.f218f, aVar5, aVar5, new Integer(3)));
        aVar5.f225a.f229e = 3;
        pa.u(ae.a.c(ac.a.d, aVar5, aVar5, new Integer(0)));
        aVar5.f225a.f228c = 0;
        cVar3.a(aVar5);
        this.sampleDescriptionBox.a(cVar3);
    }

    public static int lambda$prepare$0(SamplePresentationTime samplePresentationTime, SamplePresentationTime samplePresentationTime2) {
        if (samplePresentationTime.presentationTime > samplePresentationTime2.presentationTime) {
            return 1;
        }
        return samplePresentationTime.presentationTime < samplePresentationTime2.presentationTime ? -1 : 0;
    }

    public void addSample(long j10, MediaCodec.BufferInfo bufferInfo) {
        boolean z10;
        if (!this.isAudio) {
            z10 = (bufferInfo.flags & 1) != 0;
        }
        this.samples.add(new Sample(j10, bufferInfo.size));
        LinkedList<Integer> linkedList = this.syncSamples;
        if (linkedList != null && z10) {
            linkedList.add(Integer.valueOf(this.samples.size()));
        }
        ArrayList<SamplePresentationTime> arrayList = this.samplePresentationTimes;
        arrayList.add(new SamplePresentationTime(arrayList.size(), ((bufferInfo.presentationTimeUs * ((long) this.timeScale)) + 500000) / 1000000));
    }

    public Date getCreationTime() {
        return this.creationTime;
    }

    public long getDuration() {
        return this.duration;
    }

    public String getHandler() {
        return this.handler;
    }

    public int getHeight() {
        return this.height;
    }

    public long getLastFrameTimestamp() {
        long j10 = this.duration;
        long[] jArr = this.sampleDurations;
        return (((j10 - jArr[jArr.length - 1]) * 1000000) - 500000) / ((long) this.timeScale);
    }

    public q2.a getMediaHeaderBox() {
        return this.headerBox;
    }

    public int[] getSampleCompositions() {
        return this.sampleCompositions;
    }

    public q2.n getSampleDescriptionBox() {
        return this.sampleDescriptionBox;
    }

    public long[] getSampleDurations() {
        return this.sampleDurations;
    }

    public ArrayList<Sample> getSamples() {
        return this.samples;
    }

    public long[] getSyncSamples() {
        LinkedList<Integer> linkedList = this.syncSamples;
        if (linkedList == null || linkedList.isEmpty()) {
            return null;
        }
        long[] jArr = new long[this.syncSamples.size()];
        for (int i10 = 0; i10 < this.syncSamples.size(); i10++) {
            jArr[i10] = this.syncSamples.get(i10).intValue();
        }
        return jArr;
    }

    public int getTimeScale() {
        return this.timeScale;
    }

    public long getTrackId() {
        return this.trackId;
    }

    public float getVolume() {
        return this.volume;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isAudio() {
        return this.isAudio;
    }

    public void prepare() {
        int i10;
        long j10 = 0;
        this.duration = 0L;
        ArrayList arrayList = new ArrayList(this.samplePresentationTimes);
        int i11 = 0;
        Collections.sort(this.samplePresentationTimes, new b(i11));
        this.sampleDurations = new long[this.samplePresentationTimes.size()];
        long jMin = Long.MAX_VALUE;
        long j11 = 0;
        int i12 = 0;
        boolean z10 = false;
        while (true) {
            if (i12 >= this.samplePresentationTimes.size()) {
                break;
            }
            SamplePresentationTime samplePresentationTime = this.samplePresentationTimes.get(i12);
            long j12 = samplePresentationTime.presentationTime - j11;
            j11 = samplePresentationTime.presentationTime;
            this.sampleDurations[samplePresentationTime.index] = j12;
            if (samplePresentationTime.index != 0) {
                this.duration += j12;
            }
            if (j12 > j10 && j12 < 2147483647L) {
                jMin = Math.min(jMin, j12);
            }
            if (samplePresentationTime.index != i12) {
                z10 = true;
            }
            i12++;
            j10 = j10;
        }
        long[] jArr = this.sampleDurations;
        if (jArr.length > 0) {
            jArr[0] = jMin;
            this.duration += jMin;
        }
        for (i10 = 1; i10 < arrayList.size(); i10++) {
            ((SamplePresentationTime) arrayList.get(i10)).dt = this.sampleDurations[i10] + ((SamplePresentationTime) arrayList.get(i10 - 1)).dt;
        }
        if (z10) {
            this.sampleCompositions = new int[this.samplePresentationTimes.size()];
            while (i11 < this.samplePresentationTimes.size()) {
                SamplePresentationTime samplePresentationTime2 = this.samplePresentationTimes.get(i11);
                this.sampleCompositions[samplePresentationTime2.index] = (int) (samplePresentationTime2.presentationTime - samplePresentationTime2.dt);
                i11++;
            }
        }
    }
}
