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
public class Track {
    private static Map<Integer, Integer> samplingFrequencyIndexMap;
    private String handler;
    private n3 headerBox;
    private int height;
    private boolean isAudio;
    private int[] sampleCompositions;
    private er9 sampleDescriptionBox;
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

        public SamplePresentationTime(int i, long j) {
            this.index = i;
            this.presentationTime = j;
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

    public Track(int i, MediaFormat mediaFormat, boolean z) {
        String str;
        int i2;
        int i3;
        this.syncSamples = null;
        this.volume = 0.0f;
        this.trackId = i;
        this.isAudio = z;
        int i4 = 0;
        if (!z) {
            this.width = mediaFormat.getInteger("width");
            this.height = mediaFormat.getInteger("height");
            this.timeScale = 90000;
            this.syncSamples = new LinkedList<>();
            this.handler = "vide";
            ?? y1Var = new y1("vmhd");
            y1Var.e = 0;
            y1Var.f = new int[3];
            y1Var.g(1);
            this.headerBox = y1Var;
            this.sampleDescriptionBox = new er9();
            String string = mediaFormat.getString("mime");
            if (string.equals("video/avc")) {
                jhc jhcVar = new jhc("avc1");
                jhcVar.f = this.width;
                jhcVar.h = this.height;
                ?? y1Var2 = new y1("avcC");
                ?? obj = new Object();
                obj.f = new ArrayList();
                obj.g = new ArrayList();
                obj.h = true;
                obj.i = 1;
                obj.j = 0;
                obj.k = 0;
                obj.l = new ArrayList();
                obj.m = 63;
                obj.n = 7;
                obj.o = 31;
                obj.p = 31;
                obj.q = 31;
                y1Var2.a = obj;
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
                    aq1.r(i94.c(ld0.h, y1Var2, y1Var2, arrayList));
                    y1Var2.a.f = arrayList;
                    aq1.r(i94.c(ld0.n, y1Var2, y1Var2, arrayList2));
                    y1Var2.a.g = arrayList2;
                }
                if (mediaFormat.containsKey("level")) {
                    int integer = mediaFormat.getInteger("level");
                    if (integer == 1) {
                        y1Var2.d(1);
                    } else if (integer == 32) {
                        y1Var2.d(2);
                    } else if (integer == 4) {
                        y1Var2.d(11);
                    } else if (integer == 8) {
                        y1Var2.d(12);
                    } else if (integer == 16) {
                        y1Var2.d(13);
                    } else if (integer == 64) {
                        y1Var2.d(21);
                    } else if (integer == 128) {
                        y1Var2.d(22);
                    } else if (integer == 256) {
                        y1Var2.d(3);
                    } else if (integer == 512) {
                        y1Var2.d(31);
                    } else if (integer == 1024) {
                        y1Var2.d(32);
                    } else if (integer == 2048) {
                        y1Var2.d(4);
                    } else if (integer == 4096) {
                        y1Var2.d(41);
                    } else if (integer == 8192) {
                        y1Var2.d(42);
                    } else if (integer == 16384) {
                        y1Var2.d(5);
                    } else if (integer == 32768) {
                        y1Var2.d(51);
                    } else if (integer == 65536) {
                        y1Var2.d(52);
                    } else if (integer == 2) {
                        y1Var2.d(27);
                    }
                } else {
                    y1Var2.d(13);
                }
                if (mediaFormat.containsKey("profile")) {
                    int integer2 = mediaFormat.getInteger("profile");
                    if (integer2 == 1) {
                        y1Var2.e(66);
                    } else if (integer2 == 2) {
                        y1Var2.e(77);
                    } else if (integer2 == 4) {
                        y1Var2.e(88);
                    } else if (integer2 == 8) {
                        y1Var2.e(100);
                    } else if (integer2 == 16) {
                        y1Var2.e(110);
                    } else if (integer2 == 32) {
                        y1Var2.e(122);
                    } else if (integer2 == 64) {
                        y1Var2.e(244);
                    }
                } else {
                    y1Var2.e(100);
                }
                aq1.r(i94.c(ld0.s, y1Var2, y1Var2, new Integer(-1)));
                y1Var2.a.j = -1;
                aq1.r(i94.c(ld0.w, y1Var2, y1Var2, new Integer(-1)));
                y1Var2.a.k = -1;
                aq1.r(i94.c(ld0.r, y1Var2, y1Var2, new Integer(-1)));
                y1Var2.a.i = -1;
                aq1.r(i94.c(ld0.b, y1Var2, y1Var2, new Integer(1)));
                y1Var2.a.a = 1;
                aq1.r(i94.c(ld0.f, y1Var2, y1Var2, new Integer(3)));
                y1Var2.a.e = 3;
                aq1.r(i94.c(ld0.d, y1Var2, y1Var2, new Integer(0)));
                y1Var2.a.c = 0;
                jhcVar.a(y1Var2);
                this.sampleDescriptionBox.a(jhcVar);
                return;
            } else if (string.equals("video/mp4v")) {
                jhc jhcVar2 = new jhc("mp4v");
                jhcVar2.f = this.width;
                jhcVar2.h = this.height;
                this.sampleDescriptionBox.a(jhcVar2);
                return;
            } else if (string.equals("video/hevc") && mediaFormat.getByteBuffer("csd-0") != null) {
                byte[] array = mediaFormat.getByteBuffer("csd-0").array();
                int i5 = 0;
                int i6 = -1;
                int i7 = -1;
                int i8 = -1;
                for (int i9 = 0; i9 < array.length; i9++) {
                    if (i5 == 3 && array[i9] == 1) {
                        if (i7 == -1) {
                            i7 = i9 - 3;
                        } else if (i8 == -1) {
                            i8 = i9 - 3;
                        } else if (i6 == -1) {
                            i6 = i9 - 3;
                        }
                    }
                    if (array[i9] == 0) {
                        i5++;
                    } else {
                        i5 = 0;
                    }
                }
                byte[] bArr3 = new byte[i8 - 4];
                byte[] bArr4 = new byte[(i6 - i8) - 4];
                byte[] bArr5 = new byte[(array.length - i6) - 4];
                for (int i10 = 0; i10 < array.length; i10++) {
                    if (i10 < i8) {
                        int i11 = i10 - 4;
                        if (i11 >= 0) {
                            bArr3[i11] = array[i10];
                        }
                    } else if (i10 < i6) {
                        int i12 = (i10 - i8) - 4;
                        if (i12 >= 0) {
                            bArr4[i12] = array[i10];
                        }
                    } else {
                        int i13 = (i10 - i6) - 4;
                        if (i13 >= 0) {
                            bArr5[i13] = array[i10];
                        }
                    }
                }
                try {
                    jhc parseFromCsd = HevcDecoderConfigurationRecord.parseFromCsd(Arrays.asList(ByteBuffer.wrap(bArr3), ByteBuffer.wrap(bArr5), ByteBuffer.wrap(bArr4)));
                    parseFromCsd.f = this.width;
                    parseFromCsd.h = this.height;
                    this.sampleDescriptionBox.a(parseFromCsd);
                    return;
                } catch (IOException e) {
                    e.printStackTrace();
                    return;
                }
            } else {
                return;
            }
        }
        this.volume = 1.0f;
        this.timeScale = mediaFormat.getInteger("sample-rate");
        this.handler = "soun";
        this.headerBox = new y1("smhd");
        this.sampleDescriptionBox = new er9();
        ?? a2Var = new a2("mp4a");
        a2Var.f = mediaFormat.getInteger("channel-count");
        a2Var.n = mediaFormat.getInteger("sample-rate");
        a2Var.h = (byte) 16;
        ?? y1Var3 = new y1("esds");
        ?? obj2 = new Object();
        obj2.i = 0;
        obj2.o = new ArrayList();
        obj2.d = 0;
        ?? obj3 = new Object();
        obj3.d = 2;
        obj2.n = obj3;
        if (mediaFormat.containsKey("mime")) {
            str = mediaFormat.getString("mime");
        } else {
            str = "audio/mp4-latm";
        }
        ?? obj4 = new Object();
        obj4.k = new ArrayList();
        if ("audio/mpeg".equals(str)) {
            obj4.d = 105;
        } else {
            obj4.d = 64;
        }
        obj4.e = 5;
        obj4.g = 1536;
        if (mediaFormat.containsKey("max-bitrate")) {
            i2 = 31;
            obj4.h = mediaFormat.getInteger("max-bitrate");
        } else {
            i2 = 31;
            obj4.h = 96000L;
        }
        obj4.i = this.timeScale;
        ?? obj5 = new Object();
        obj5.e = 2;
        obj5.f = samplingFrequencyIndexMap.get(Integer.valueOf((int) a2Var.n)).intValue();
        obj5.h = a2Var.f;
        obj4.j = obj5;
        obj2.m = obj4;
        ByteBuffer allocate = ByteBuffer.allocate(obj2.c());
        kne.f(3, allocate);
        allocate.put((byte) ((obj2.c() - 2) & 255));
        kne.d(obj2.d, allocate);
        allocate.put((byte) (((obj2.e << 7) | (obj2.f << 6) | (obj2.g << 5) | (obj2.h & i2)) & 255));
        if (obj2.e > 0) {
            kne.d(obj2.k, allocate);
        }
        if (obj2.f > 0) {
            allocate.put((byte) (obj2.i & 255));
            allocate.put(rze.a(obj2.j));
            allocate.put((byte) 0);
        }
        if (obj2.g > 0) {
            kne.d(obj2.l, allocate);
        }
        ha3 ha3Var = obj2.m;
        y40 y40Var = ha3Var.j;
        if (y40Var == null) {
            i3 = 0;
        } else if (y40Var.e == 2) {
            i3 = 4;
        } else {
            rjb.j("can't serialize that yet");
            throw null;
        }
        ByteBuffer allocate2 = ByteBuffer.allocate(i3 + 15);
        kne.f(4, allocate2);
        y40 y40Var2 = ha3Var.j;
        if (y40Var2 != null) {
            if (y40Var2.e == 2) {
                i4 = 4;
            } else {
                rjb.j("can't serialize that yet");
                throw null;
            }
        }
        allocate2.put((byte) ((i4 + 13) & 255));
        allocate2.put((byte) (ha3Var.d & 255));
        allocate2.put((byte) (((ha3Var.e << 2) | (ha3Var.f << 1) | 1) & 255));
        kne.e(ha3Var.g, allocate2);
        allocate2.putInt((int) ha3Var.h);
        allocate2.putInt((int) ha3Var.i);
        y40 y40Var3 = ha3Var.j;
        if (y40Var3 != null) {
            if (y40Var3.e == 2) {
                ByteBuffer allocate3 = ByteBuffer.allocate(4);
                kne.f(5, allocate3);
                if (y40Var3.e == 2) {
                    allocate3.put((byte) 2);
                    lq7 lq7Var = new lq7(allocate3, (byte) 2);
                    lq7Var.c(y40Var3.e, 5);
                    lq7Var.c(y40Var3.f, 4);
                    if (y40Var3.f != 15) {
                        lq7Var.c(y40Var3.h, 4);
                        allocate2.put(allocate3.array());
                    } else {
                        rjb.j("can't serialize that yet");
                        throw null;
                    }
                } else {
                    rjb.j("can't serialize that yet");
                    throw null;
                }
            } else {
                rjb.j("can't serialize that yet");
                throw null;
            }
        }
        hq9 hq9Var = obj2.n;
        hq9Var.getClass();
        ByteBuffer allocate4 = ByteBuffer.allocate(3);
        kne.f(6, allocate4);
        allocate4.put((byte) 1);
        allocate4.put((byte) (hq9Var.d & 255));
        allocate.put(allocate2.array());
        allocate.put(allocate4.array());
        aq1.r(i94.c(e2.h, y1Var3, y1Var3, allocate));
        y1Var3.e = allocate;
        a2Var.a(y1Var3);
        this.sampleDescriptionBox.a(a2Var);
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
        long j = this.duration;
        long[] jArr = this.sampleDurations;
        return (((j - jArr[jArr.length - 1]) * 1000000) - 500000) / this.timeScale;
    }

    public n3 getMediaHeaderBox() {
        return this.headerBox;
    }

    public int[] getSampleCompositions() {
        return this.sampleCompositions;
    }

    public er9 getSampleDescriptionBox() {
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
            for (int i = 0; i < this.syncSamples.size(); i++) {
                jArr[i] = this.syncSamples.get(i).intValue();
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
        int i;
        long j;
        long j2 = 0;
        this.duration = 0L;
        ArrayList arrayList = new ArrayList(this.samplePresentationTimes);
        Collections.sort(this.samplePresentationTimes, new a((byte) 0));
        this.sampleDurations = new long[this.samplePresentationTimes.size()];
        long j3 = Long.MAX_VALUE;
        long j4 = 0;
        int i2 = 0;
        boolean z = false;
        while (true) {
            if (i2 >= this.samplePresentationTimes.size()) {
                break;
            }
            SamplePresentationTime samplePresentationTime = this.samplePresentationTimes.get(i2);
            long j5 = samplePresentationTime.presentationTime - j4;
            j4 = samplePresentationTime.presentationTime;
            this.sampleDurations[samplePresentationTime.index] = j5;
            if (samplePresentationTime.index != 0) {
                j = j2;
                this.duration += j5;
            } else {
                j = j2;
            }
            if (j5 > j && j5 < 2147483647L) {
                j3 = Math.min(j3, j5);
            }
            if (samplePresentationTime.index != i2) {
                z = true;
            }
            i2++;
            j2 = j;
        }
        long[] jArr = this.sampleDurations;
        if (jArr.length > 0) {
            jArr[0] = j3;
            this.duration += j3;
        }
        for (i = 1; i < arrayList.size(); i++) {
            ((SamplePresentationTime) arrayList.get(i)).dt = this.sampleDurations[i] + ((SamplePresentationTime) arrayList.get(i - 1)).dt;
        }
        if (z) {
            this.sampleCompositions = new int[this.samplePresentationTimes.size()];
            for (int i3 = 0; i3 < this.samplePresentationTimes.size(); i3++) {
                SamplePresentationTime samplePresentationTime2 = this.samplePresentationTimes.get(i3);
                this.sampleCompositions[samplePresentationTime2.index] = (int) (samplePresentationTime2.presentationTime - samplePresentationTime2.dt);
            }
        }
    }
}
