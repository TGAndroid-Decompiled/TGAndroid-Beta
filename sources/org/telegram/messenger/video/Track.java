package org.telegram.messenger.video;

import android.media.MediaFormat;
import com.google.android.gms.internal.vision.e2;
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
    private f5.a headerBox;
    private int height;
    private boolean isAudio;
    private int[] sampleCompositions;
    private f5.n sampleDescriptionBox;
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

        public SamplePresentationTime(int i10, long j3) {
            this.index = i10;
            this.presentationTime = j3;
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

    public Track(int i10, MediaFormat mediaFormat, boolean z10) {
        String str;
        int i11;
        int i12;
        this.syncSamples = null;
        this.volume = 0.0f;
        this.trackId = i10;
        this.isAudio = z10;
        int i13 = 0;
        if (!z10) {
            this.width = mediaFormat.getInteger("width");
            this.height = mediaFormat.getInteger("height");
            this.timeScale = 90000;
            this.syncSamples = new LinkedList<>();
            this.handler = "vide";
            ?? aVar = new com.googlecode.mp4parser.a("vmhd");
            aVar.e = 0;
            aVar.f7846f = new int[3];
            aVar.g(1);
            this.headerBox = aVar;
            this.sampleDescriptionBox = new f5.n();
            String string = mediaFormat.getString("mime");
            if (string.equals("video/avc")) {
                g5.c cVar = new g5.c("avc1");
                cVar.f8547f = 1;
                cVar.f8554x = 24;
                cVar.v = 1;
                cVar.f8551r = 72.0d;
                cVar.f8552s = 72.0d;
                cVar.h = this.width;
                cVar.f8550n = this.height;
                ?? aVar2 = new com.googlecode.mp4parser.a("avcC");
                ?? obj = new Object();
                obj.f41416f = new ArrayList();
                obj.f41417g = new ArrayList();
                obj.h = true;
                obj.f41418i = 1;
                obj.f41419j = 0;
                obj.f41420k = 0;
                obj.f41421l = new ArrayList();
                obj.f41422m = 63;
                obj.f41423n = 7;
                obj.f41424o = 31;
                obj.f41425p = 31;
                obj.f41426q = 31;
                aVar2.f41412a = obj;
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
                    e2.q(re.a.c(rc.a.h, aVar2, aVar2, arrayList));
                    aVar2.f41412a.f41416f = arrayList;
                    e2.q(re.a.c(rc.a.f41406n, aVar2, aVar2, arrayList2));
                    aVar2.f41412a.f41417g = arrayList2;
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
                e2.q(re.a.c(rc.a.f41408s, aVar2, aVar2, new Integer(-1)));
                aVar2.f41412a.f41419j = -1;
                e2.q(re.a.c(rc.a.v, aVar2, aVar2, new Integer(-1)));
                aVar2.f41412a.f41420k = -1;
                e2.q(re.a.c(rc.a.f41407r, aVar2, aVar2, new Integer(-1)));
                aVar2.f41412a.f41418i = -1;
                e2.q(re.a.c(rc.a.f41403b, aVar2, aVar2, new Integer(1)));
                aVar2.f41412a.f41413a = 1;
                e2.q(re.a.c(rc.a.f41405f, aVar2, aVar2, new Integer(3)));
                aVar2.f41412a.e = 3;
                e2.q(re.a.c(rc.a.d, aVar2, aVar2, new Integer(0)));
                aVar2.f41412a.f41415c = 0;
                cVar.a(aVar2);
                this.sampleDescriptionBox.a(cVar);
                return;
            } else if (string.equals("video/mp4v")) {
                g5.c cVar2 = new g5.c("mp4v");
                cVar2.f8547f = 1;
                cVar2.f8554x = 24;
                cVar2.v = 1;
                cVar2.f8551r = 72.0d;
                cVar2.f8552s = 72.0d;
                cVar2.h = this.width;
                cVar2.f8550n = this.height;
                this.sampleDescriptionBox.a(cVar2);
                return;
            } else if (string.equals("video/hevc") && mediaFormat.getByteBuffer("csd-0") != null) {
                byte[] array = mediaFormat.getByteBuffer("csd-0").array();
                int i14 = -1;
                int i15 = -1;
                int i16 = 0;
                int i17 = -1;
                for (int i18 = 0; i18 < array.length; i18++) {
                    if (i16 == 3 && array[i18] == 1) {
                        if (i17 == -1) {
                            i17 = i18 - 3;
                        } else if (i14 == -1) {
                            i14 = i18 - 3;
                        } else if (i15 == -1) {
                            i15 = i18 - 3;
                        }
                    }
                    if (array[i18] == 0) {
                        i16++;
                    } else {
                        i16 = 0;
                    }
                }
                byte[] bArr3 = new byte[i14 - 4];
                byte[] bArr4 = new byte[(i15 - i14) - 4];
                byte[] bArr5 = new byte[(array.length - i15) - 4];
                for (int i19 = 0; i19 < array.length; i19++) {
                    if (i19 < i14) {
                        int i20 = i19 - 4;
                        if (i20 >= 0) {
                            bArr3[i20] = array[i19];
                        }
                    } else if (i19 < i15) {
                        int i21 = (i19 - i14) - 4;
                        if (i21 >= 0) {
                            bArr4[i21] = array[i19];
                        }
                    } else {
                        int i22 = (i19 - i15) - 4;
                        if (i22 >= 0) {
                            bArr5[i22] = array[i19];
                        }
                    }
                }
                try {
                    g5.c parseFromCsd = HevcDecoderConfigurationRecord.parseFromCsd(Arrays.asList(ByteBuffer.wrap(bArr3), ByteBuffer.wrap(bArr5), ByteBuffer.wrap(bArr4)));
                    parseFromCsd.h = this.width;
                    parseFromCsd.f8550n = this.height;
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
        this.headerBox = new com.googlecode.mp4parser.a("smhd");
        this.sampleDescriptionBox = new f5.n();
        ?? aVar3 = new g5.a("mp4a");
        aVar3.h = mediaFormat.getInteger("channel-count");
        aVar3.f8549r = mediaFormat.getInteger("sample-rate");
        aVar3.f8547f = 1;
        aVar3.f8548n = 16;
        ?? aVar4 = new com.googlecode.mp4parser.a("esds");
        ?? obj2 = new Object();
        obj2.f13630i = 0;
        obj2.f13636o = new ArrayList();
        obj2.d = 0;
        ?? obj3 = new Object();
        obj3.d = 2;
        obj2.f13635n = obj3;
        if (mediaFormat.containsKey("mime")) {
            str = mediaFormat.getString("mime");
        } else {
            str = "audio/mp4-latm";
        }
        ?? obj4 = new Object();
        obj4.f13625k = new ArrayList();
        if ("audio/mpeg".equals(str)) {
            obj4.d = 105;
        } else {
            obj4.d = 64;
        }
        obj4.e = 5;
        obj4.f13622g = 1536;
        if (mediaFormat.containsKey("max-bitrate")) {
            i11 = 13;
            obj4.h = mediaFormat.getInteger("max-bitrate");
        } else {
            i11 = 13;
            obj4.h = 96000L;
        }
        obj4.f13623i = this.timeScale;
        ?? obj5 = new Object();
        obj5.e = 2;
        obj5.f13595f = samplingFrequencyIndexMap.get(Integer.valueOf((int) aVar3.f8549r)).intValue();
        obj5.h = aVar3.h;
        obj4.f13624j = obj5;
        obj2.f13634m = obj4;
        ByteBuffer allocate = ByteBuffer.allocate(obj2.c());
        e5.b.r(3, allocate);
        allocate.put((byte) ((obj2.c() - 2) & 255));
        e5.b.p(obj2.d, allocate);
        allocate.put((byte) (((obj2.e << 7) | (obj2.f13628f << 6) | (obj2.f13629g << 5) | (31 & obj2.h)) & 255));
        if (obj2.e > 0) {
            e5.b.p(obj2.f13632k, allocate);
        }
        if (obj2.f13628f > 0) {
            allocate.put((byte) (obj2.f13630i & 255));
            allocate.put(e5.b.b(obj2.f13631j));
            allocate.put((byte) 0);
        }
        if (obj2.f13629g > 0) {
            e5.b.p(obj2.f13633l, allocate);
        }
        mc.d dVar = obj2.f13634m;
        mc.a aVar5 = dVar.f13624j;
        if (aVar5 == null) {
            i12 = 0;
        } else if (aVar5.e == 2) {
            i12 = 4;
        } else {
            throw new UnsupportedOperationException("can't serialize that yet");
        }
        ByteBuffer allocate2 = ByteBuffer.allocate(i12 + 15);
        e5.b.r(4, allocate2);
        mc.a aVar6 = dVar.f13624j;
        if (aVar6 != null) {
            if (aVar6.e == 2) {
                i13 = 4;
            } else {
                throw new UnsupportedOperationException("can't serialize that yet");
            }
        }
        allocate2.put((byte) ((i13 + i11) & 255));
        allocate2.put((byte) (dVar.d & 255));
        allocate2.put((byte) (((dVar.e << 2) | (dVar.f13621f << 1) | 1) & 255));
        e5.b.q(dVar.f13622g, allocate2);
        allocate2.putInt((int) dVar.h);
        allocate2.putInt((int) dVar.f13623i);
        mc.a aVar7 = dVar.f13624j;
        if (aVar7 != null) {
            if (aVar7.e == 2) {
                ByteBuffer allocate3 = ByteBuffer.allocate(4);
                e5.b.r(5, allocate3);
                if (aVar7.e == 2) {
                    allocate3.put((byte) 2);
                    mc.c cVar3 = new mc.c(1, allocate3);
                    cVar3.c(aVar7.e, 5);
                    cVar3.c(aVar7.f13595f, 4);
                    if (aVar7.f13595f != 15) {
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
        mc.m mVar = obj2.f13635n;
        mVar.getClass();
        ByteBuffer allocate4 = ByteBuffer.allocate(3);
        e5.b.r(6, allocate4);
        allocate4.put((byte) 1);
        allocate4.put((byte) (mVar.d & 255));
        allocate.put(allocate2.array());
        allocate.put(allocate4.array());
        e2.q(re.a.c(lc.a.h, aVar4, aVar4, allocate));
        aVar4.e = allocate;
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
        long j3 = this.duration;
        long[] jArr = this.sampleDurations;
        return (((j3 - jArr[jArr.length - 1]) * 1000000) - 500000) / this.timeScale;
    }

    public f5.a getMediaHeaderBox() {
        return this.headerBox;
    }

    public int[] getSampleCompositions() {
        return this.sampleCompositions;
    }

    public f5.n getSampleDescriptionBox() {
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
            for (int i10 = 0; i10 < this.syncSamples.size(); i10++) {
                jArr[i10] = this.syncSamples.get(i10).intValue();
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
        int i10;
        long j3;
        long j10 = 0;
        this.duration = 0L;
        ArrayList arrayList = new ArrayList(this.samplePresentationTimes);
        Collections.sort(this.samplePresentationTimes, new b(0));
        this.sampleDurations = new long[this.samplePresentationTimes.size()];
        long j11 = Long.MAX_VALUE;
        long j12 = 0;
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            if (i11 >= this.samplePresentationTimes.size()) {
                break;
            }
            SamplePresentationTime samplePresentationTime = this.samplePresentationTimes.get(i11);
            long j13 = samplePresentationTime.presentationTime - j12;
            j12 = samplePresentationTime.presentationTime;
            this.sampleDurations[samplePresentationTime.index] = j13;
            if (samplePresentationTime.index != 0) {
                j3 = j10;
                this.duration += j13;
            } else {
                j3 = j10;
            }
            if (j13 > j3 && j13 < 2147483647L) {
                j11 = Math.min(j11, j13);
            }
            if (samplePresentationTime.index != i11) {
                z10 = true;
            }
            i11++;
            j10 = j3;
        }
        long[] jArr = this.sampleDurations;
        if (jArr.length > 0) {
            jArr[0] = j11;
            this.duration += j11;
        }
        for (i10 = 1; i10 < arrayList.size(); i10++) {
            ((SamplePresentationTime) arrayList.get(i10)).dt = this.sampleDurations[i10] + ((SamplePresentationTime) arrayList.get(i10 - 1)).dt;
        }
        if (z10) {
            this.sampleCompositions = new int[this.samplePresentationTimes.size()];
            for (int i12 = 0; i12 < this.samplePresentationTimes.size(); i12++) {
                SamplePresentationTime samplePresentationTime2 = this.samplePresentationTimes.get(i12);
                this.sampleCompositions[samplePresentationTime2.index] = (int) (samplePresentationTime2.presentationTime - samplePresentationTime2.dt);
            }
        }
    }
}
