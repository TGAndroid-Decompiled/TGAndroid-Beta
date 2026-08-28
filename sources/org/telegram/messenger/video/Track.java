package org.telegram.messenger.video;

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
import org.telegram.ui.Cells.j2;
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

        public SamplePresentationTime(int i9, long j10) {
            this.index = i9;
            this.presentationTime = j10;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        samplingFrequencyIndexMap = hashMap;
        hashMap.put(96000, 0);
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

    public Track(int i9, MediaFormat mediaFormat, boolean z10) {
        String str;
        int i10;
        int i11;
        this.syncSamples = null;
        this.volume = 0.0f;
        this.trackId = i9;
        this.isAudio = z10;
        int i12 = 0;
        if (!z10) {
            this.width = mediaFormat.getInteger("width");
            this.height = mediaFormat.getInteger("height");
            this.timeScale = 90000;
            this.syncSamples = new LinkedList<>();
            this.handler = "vide";
            ?? aVar = new com.googlecode.mp4parser.a("vmhd");
            aVar.f45981e = 0;
            aVar.f45982f = new int[3];
            aVar.g(1);
            this.headerBox = aVar;
            this.sampleDescriptionBox = new q2.n();
            String string = mediaFormat.getString("mime");
            if (string.equals("video/avc")) {
                r2.c cVar = new r2.c("avc1");
                cVar.f47005f = 1;
                cVar.f47012x = 24;
                cVar.v = 1;
                cVar.f47009r = 72.0d;
                cVar.f47010s = 72.0d;
                cVar.h = this.width;
                cVar.f47008n = this.height;
                ?? aVar2 = new com.googlecode.mp4parser.a("avcC");
                ?? obj = new Object();
                obj.f50413f = new ArrayList();
                obj.f50414g = new ArrayList();
                obj.h = true;
                obj.f50415i = 1;
                obj.f50416j = 0;
                obj.f50417k = 0;
                obj.f50418l = new ArrayList();
                obj.f50419m = 63;
                obj.f50420n = 7;
                obj.f50421o = 31;
                obj.f50422p = 31;
                obj.f50423q = 31;
                aVar2.f50408a = obj;
                if (mediaFormat.getByteBuffer("csd-0") != null) {
                    ArrayList arrayList = new ArrayList();
                    ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-0");
                    byteBuffer.position(4);
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    arrayList.add(bArr);
                    ArrayList arrayList2 = new ArrayList();
                    ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-1");
                    byteBuffer2.position(4);
                    byte[] bArr2 = new byte[byteBuffer2.remaining()];
                    byteBuffer2.get(bArr2);
                    arrayList2.add(bArr2);
                    j2.t(zd.a.c(zb.a.h, aVar2, aVar2, arrayList));
                    aVar2.f50408a.f50413f = arrayList;
                    j2.t(zd.a.c(zb.a.f50402n, aVar2, aVar2, arrayList2));
                    aVar2.f50408a.f50414g = arrayList2;
                }
                if (mediaFormat.containsKey("level")) {
                    int integer = mediaFormat.getInteger("level");
                    if (integer == 1) {
                        aVar2.d(1);
                    } else if (integer == 32) {
                        aVar2.d(2);
                    } else if (integer == 4) {
                        aVar2.d(11);
                    } else if (integer == 8) {
                        aVar2.d(12);
                    } else if (integer == 16) {
                        aVar2.d(13);
                    } else if (integer == 64) {
                        aVar2.d(21);
                    } else if (integer == 128) {
                        aVar2.d(22);
                    } else if (integer == 256) {
                        aVar2.d(3);
                    } else if (integer == 512) {
                        aVar2.d(31);
                    } else if (integer == 1024) {
                        aVar2.d(32);
                    } else if (integer == 2048) {
                        aVar2.d(4);
                    } else if (integer == 4096) {
                        aVar2.d(41);
                    } else if (integer == 8192) {
                        aVar2.d(42);
                    } else if (integer == 16384) {
                        aVar2.d(5);
                    } else if (integer == 32768) {
                        aVar2.d(51);
                    } else if (integer == 65536) {
                        aVar2.d(52);
                    } else if (integer == 2) {
                        aVar2.d(27);
                    }
                } else {
                    aVar2.d(13);
                }
                if (mediaFormat.containsKey("profile")) {
                    int integer2 = mediaFormat.getInteger("profile");
                    if (integer2 == 1) {
                        aVar2.e(66);
                    } else if (integer2 == 2) {
                        aVar2.e(77);
                    } else if (integer2 == 4) {
                        aVar2.e(88);
                    } else if (integer2 == 8) {
                        aVar2.e(100);
                    } else if (integer2 == 16) {
                        aVar2.e(110);
                    } else if (integer2 == 32) {
                        aVar2.e(122);
                    } else if (integer2 == 64) {
                        aVar2.e(244);
                    }
                } else {
                    aVar2.e(100);
                }
                j2.t(zd.a.c(zb.a.f50404s, aVar2, aVar2, new Integer(-1)));
                aVar2.f50408a.f50416j = -1;
                j2.t(zd.a.c(zb.a.v, aVar2, aVar2, new Integer(-1)));
                aVar2.f50408a.f50417k = -1;
                j2.t(zd.a.c(zb.a.f50403r, aVar2, aVar2, new Integer(-1)));
                aVar2.f50408a.f50415i = -1;
                j2.t(zd.a.c(zb.a.f50398b, aVar2, aVar2, new Integer(1)));
                aVar2.f50408a.f50409a = 1;
                j2.t(zd.a.c(zb.a.f50401f, aVar2, aVar2, new Integer(3)));
                aVar2.f50408a.f50412e = 3;
                j2.t(zd.a.c(zb.a.d, aVar2, aVar2, new Integer(0)));
                aVar2.f50408a.f50411c = 0;
                cVar.a(aVar2);
                this.sampleDescriptionBox.a(cVar);
                return;
            } else if (string.equals("video/mp4v")) {
                r2.c cVar2 = new r2.c("mp4v");
                cVar2.f47005f = 1;
                cVar2.f47012x = 24;
                cVar2.v = 1;
                cVar2.f47009r = 72.0d;
                cVar2.f47010s = 72.0d;
                cVar2.h = this.width;
                cVar2.f47008n = this.height;
                this.sampleDescriptionBox.a(cVar2);
                return;
            } else if (string.equals("video/hevc") && mediaFormat.getByteBuffer("csd-0") != null) {
                byte[] array = mediaFormat.getByteBuffer("csd-0").array();
                int i13 = -1;
                int i14 = -1;
                int i15 = 0;
                int i16 = -1;
                for (int i17 = 0; i17 < array.length; i17++) {
                    if (i15 == 3 && array[i17] == 1) {
                        if (i16 == -1) {
                            i16 = i17 - 3;
                        } else if (i13 == -1) {
                            i13 = i17 - 3;
                        } else if (i14 == -1) {
                            i14 = i17 - 3;
                        }
                    }
                    if (array[i17] == 0) {
                        i15++;
                    } else {
                        i15 = 0;
                    }
                }
                byte[] bArr3 = new byte[i13 - 4];
                byte[] bArr4 = new byte[(i14 - i13) - 4];
                byte[] bArr5 = new byte[(array.length - i14) - 4];
                for (int i18 = 0; i18 < array.length; i18++) {
                    if (i18 < i13) {
                        int i19 = i18 - 4;
                        if (i19 >= 0) {
                            bArr3[i19] = array[i18];
                        }
                    } else if (i18 < i14) {
                        int i20 = (i18 - i13) - 4;
                        if (i20 >= 0) {
                            bArr4[i20] = array[i18];
                        }
                    } else {
                        int i21 = (i18 - i14) - 4;
                        if (i21 >= 0) {
                            bArr5[i21] = array[i18];
                        }
                    }
                }
                try {
                    r2.c parseFromCsd = HevcDecoderConfigurationRecord.parseFromCsd(Arrays.asList(ByteBuffer.wrap(bArr3), ByteBuffer.wrap(bArr5), ByteBuffer.wrap(bArr4)));
                    parseFromCsd.h = this.width;
                    parseFromCsd.f47008n = this.height;
                    this.sampleDescriptionBox.a(parseFromCsd);
                    return;
                } catch (IOException e10) {
                    e10.printStackTrace();
                    return;
                }
            } else {
                return;
            }
        }
        this.volume = 1.0f;
        this.timeScale = mediaFormat.getInteger("sample-rate");
        this.handler = "soun";
        this.headerBox = new com.googlecode.mp4parser.a("smhd");
        this.sampleDescriptionBox = new q2.n();
        ?? aVar3 = new r2.a("mp4a");
        aVar3.h = mediaFormat.getInteger("channel-count");
        aVar3.f47007r = mediaFormat.getInteger("sample-rate");
        aVar3.f47005f = 1;
        aVar3.f47006n = 16;
        ?? aVar4 = new com.googlecode.mp4parser.a("esds");
        ?? obj2 = new Object();
        obj2.f48180i = 0;
        obj2.f48186o = new ArrayList();
        obj2.d = 0;
        ?? obj3 = new Object();
        obj3.d = 2;
        obj2.f48185n = obj3;
        if (mediaFormat.containsKey("mime")) {
            str = mediaFormat.getString("mime");
        } else {
            str = "audio/mp4-latm";
        }
        ?? obj4 = new Object();
        obj4.f48174k = new ArrayList();
        if ("audio/mpeg".equals(str)) {
            obj4.d = 105;
        } else {
            obj4.d = 64;
        }
        obj4.f48169e = 5;
        obj4.f48171g = 1536;
        if (mediaFormat.containsKey("max-bitrate")) {
            i10 = 13;
            obj4.h = mediaFormat.getInteger("max-bitrate");
        } else {
            i10 = 13;
            obj4.h = 96000L;
        }
        obj4.f48172i = this.timeScale;
        ?? obj5 = new Object();
        obj5.f48142e = 2;
        obj5.f48143f = samplingFrequencyIndexMap.get(Integer.valueOf((int) aVar3.f47007r)).intValue();
        obj5.h = aVar3.h;
        obj4.f48173j = obj5;
        obj2.f48184m = obj4;
        ByteBuffer allocate = ByteBuffer.allocate(obj2.c());
        p2.b.r(3, allocate);
        allocate.put((byte) ((obj2.c() - 2) & 255));
        p2.b.p(obj2.d, allocate);
        allocate.put((byte) (((obj2.f48177e << 7) | (obj2.f48178f << 6) | (obj2.f48179g << 5) | (31 & obj2.h)) & 255));
        if (obj2.f48177e > 0) {
            p2.b.p(obj2.f48182k, allocate);
        }
        if (obj2.f48178f > 0) {
            allocate.put((byte) (obj2.f48180i & 255));
            allocate.put(p2.b.b(obj2.f48181j));
            allocate.put((byte) 0);
        }
        if (obj2.f48179g > 0) {
            p2.b.p(obj2.f48183l, allocate);
        }
        ub.d dVar = obj2.f48184m;
        ub.a aVar5 = dVar.f48173j;
        if (aVar5 == null) {
            i11 = 0;
        } else if (aVar5.f48142e == 2) {
            i11 = 4;
        } else {
            throw new UnsupportedOperationException("can't serialize that yet");
        }
        ByteBuffer allocate2 = ByteBuffer.allocate(i11 + 15);
        p2.b.r(4, allocate2);
        ub.a aVar6 = dVar.f48173j;
        if (aVar6 != null) {
            if (aVar6.f48142e == 2) {
                i12 = 4;
            } else {
                throw new UnsupportedOperationException("can't serialize that yet");
            }
        }
        allocate2.put((byte) ((i12 + i10) & 255));
        allocate2.put((byte) (dVar.d & 255));
        allocate2.put((byte) (((dVar.f48169e << 2) | (dVar.f48170f << 1) | 1) & 255));
        p2.b.q(dVar.f48171g, allocate2);
        allocate2.putInt((int) dVar.h);
        allocate2.putInt((int) dVar.f48172i);
        ub.a aVar7 = dVar.f48173j;
        if (aVar7 != null) {
            if (aVar7.f48142e == 2) {
                ByteBuffer allocate3 = ByteBuffer.allocate(4);
                p2.b.r(5, allocate3);
                if (aVar7.f48142e == 2) {
                    allocate3.put((byte) 2);
                    ub.c cVar3 = new ub.c(1, allocate3);
                    cVar3.c(aVar7.f48142e, 5);
                    cVar3.c(aVar7.f48143f, 4);
                    if (aVar7.f48143f != 15) {
                        cVar3.c(aVar7.h, 4);
                        allocate2.put(allocate3.array());
                    } else {
                        throw new UnsupportedOperationException("can't serialize that yet");
                    }
                } else {
                    throw new UnsupportedOperationException("can't serialize that yet");
                }
            } else {
                throw new UnsupportedOperationException("can't serialize that yet");
            }
        }
        ub.m mVar = obj2.f48185n;
        mVar.getClass();
        ByteBuffer allocate4 = ByteBuffer.allocate(3);
        p2.b.r(6, allocate4);
        allocate4.put((byte) 1);
        allocate4.put((byte) (mVar.d & 255));
        allocate.put(allocate2.array());
        allocate.put(allocate4.array());
        j2.t(zd.a.c(tb.a.h, aVar4, aVar4, allocate));
        aVar4.f47768e = allocate;
        aVar3.a(aVar4);
        this.sampleDescriptionBox.a(aVar3);
    }

    public static int lambda$prepare$0(SamplePresentationTime samplePresentationTime, SamplePresentationTime samplePresentationTime2) {
        if (samplePresentationTime.presentationTime > samplePresentationTime2.presentationTime) {
            return 1;
        }
        if (samplePresentationTime.presentationTime < samplePresentationTime2.presentationTime) {
            return -1;
        }
        return 0;
    }

    public void addSample(long r6, android.media.MediaCodec.BufferInfo r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.Track.addSample(long, android.media.MediaCodec$BufferInfo):void");
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
        return (((j10 - jArr[jArr.length - 1]) * 1000000) - 500000) / this.timeScale;
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
        if (linkedList != null && !linkedList.isEmpty()) {
            long[] jArr = new long[this.syncSamples.size()];
            for (int i9 = 0; i9 < this.syncSamples.size(); i9++) {
                jArr[i9] = this.syncSamples.get(i9).intValue();
            }
            return jArr;
        }
        return null;
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
        int i9;
        long j10;
        long j11 = 0;
        this.duration = 0L;
        ArrayList arrayList = new ArrayList(this.samplePresentationTimes);
        Collections.sort(this.samplePresentationTimes, new b(0));
        this.sampleDurations = new long[this.samplePresentationTimes.size()];
        long j12 = Long.MAX_VALUE;
        long j13 = 0;
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            if (i10 >= this.samplePresentationTimes.size()) {
                break;
            }
            SamplePresentationTime samplePresentationTime = this.samplePresentationTimes.get(i10);
            long j14 = samplePresentationTime.presentationTime - j13;
            j13 = samplePresentationTime.presentationTime;
            this.sampleDurations[samplePresentationTime.index] = j14;
            if (samplePresentationTime.index != 0) {
                j10 = j11;
                this.duration += j14;
            } else {
                j10 = j11;
            }
            if (j14 > j10 && j14 < 2147483647L) {
                j12 = Math.min(j12, j14);
            }
            if (samplePresentationTime.index != i10) {
                z10 = true;
            }
            i10++;
            j11 = j10;
        }
        long[] jArr = this.sampleDurations;
        if (jArr.length > 0) {
            jArr[0] = j12;
            this.duration += j12;
        }
        for (i9 = 1; i9 < arrayList.size(); i9++) {
            ((SamplePresentationTime) arrayList.get(i9)).dt = this.sampleDurations[i9] + ((SamplePresentationTime) arrayList.get(i9 - 1)).dt;
        }
        if (z10) {
            this.sampleCompositions = new int[this.samplePresentationTimes.size()];
            for (int i11 = 0; i11 < this.samplePresentationTimes.size(); i11++) {
                SamplePresentationTime samplePresentationTime2 = this.samplePresentationTimes.get(i11);
                this.sampleCompositions[samplePresentationTime2.index] = (int) (samplePresentationTime2.presentationTime - samplePresentationTime2.dt);
            }
        }
    }
}
