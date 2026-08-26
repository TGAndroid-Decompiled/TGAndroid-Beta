package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import com.coremedia.iso.Hex;
import com.coremedia.iso.boxes.AbstractMediaHeaderBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SoundMediaHeaderBox;
import com.coremedia.iso.boxes.VideoMediaHeaderBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox;
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor;
import com.mp4parser.iso14496.part15.AvcConfigurationBox;
import com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.aspectj.runtime.reflect.Factory;

public class Track {
    private static Map<Integer, Integer> samplingFrequencyIndexMap;
    private String handler;
    private AbstractMediaHeaderBox headerBox;
    private int height;
    private boolean isAudio;
    private int[] sampleCompositions;
    private SampleDescriptionBox sampleDescriptionBox;
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

    public Track(int i, MediaFormat mediaFormat, boolean z) {
        int i2;
        int i3;
        this.syncSamples = null;
        this.volume = 0.0f;
        this.trackId = i;
        this.isAudio = z;
        int i4 = 0;
        if (z) {
            this.volume = 1.0f;
            this.timeScale = mediaFormat.getInteger("sample-rate");
            this.handler = "soun";
            this.headerBox = new SoundMediaHeaderBox("smhd");
            this.sampleDescriptionBox = new SampleDescriptionBox();
            AudioSampleEntry audioSampleEntry = new AudioSampleEntry("mp4a");
            audioSampleEntry.channelCount = mediaFormat.getInteger("channel-count");
            audioSampleEntry.sampleRate = mediaFormat.getInteger("sample-rate");
            audioSampleEntry.dataReferenceIndex = 1;
            audioSampleEntry.sampleSize = 16;
            ESDescriptorBox eSDescriptorBox = new ESDescriptorBox("esds");
            ESDescriptor eSDescriptor = new ESDescriptor();
            eSDescriptor.URLLength = 0;
            eSDescriptor.otherDescriptors = new ArrayList();
            eSDescriptor.esId = 0;
            SLConfigDescriptor sLConfigDescriptor = new SLConfigDescriptor();
            sLConfigDescriptor.predefined = 2;
            eSDescriptor.slConfigDescriptor = sLConfigDescriptor;
            String string = mediaFormat.containsKey("mime") ? mediaFormat.getString("mime") : "audio/mp4-latm";
            DecoderConfigDescriptor decoderConfigDescriptor = new DecoderConfigDescriptor();
            decoderConfigDescriptor.profileLevelIndicationDescriptors = new ArrayList();
            if ("audio/mpeg".equals(string)) {
                decoderConfigDescriptor.objectTypeIndication = 105;
            } else {
                decoderConfigDescriptor.objectTypeIndication = 64;
            }
            decoderConfigDescriptor.streamType = 5;
            decoderConfigDescriptor.bufferSizeDB = 1536;
            if (mediaFormat.containsKey("max-bitrate")) {
                i2 = 13;
                decoderConfigDescriptor.maxBitRate = mediaFormat.getInteger("max-bitrate");
            } else {
                i2 = 13;
                decoderConfigDescriptor.maxBitRate = 96000L;
            }
            decoderConfigDescriptor.avgBitRate = this.timeScale;
            AudioSpecificConfig audioSpecificConfig = new AudioSpecificConfig();
            audioSpecificConfig.audioObjectType = 2;
            audioSpecificConfig.samplingFrequencyIndex = samplingFrequencyIndexMap.get(Integer.valueOf((int) audioSampleEntry.sampleRate)).intValue();
            audioSpecificConfig.channelConfiguration = audioSampleEntry.channelCount;
            decoderConfigDescriptor.audioSpecificInfo = audioSpecificConfig;
            eSDescriptor.decoderConfigDescriptor = decoderConfigDescriptor;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(eSDescriptor.serializedSize());
            Hex.writeUInt8(3, byteBufferAllocate);
            byteBufferAllocate.put((byte) ((eSDescriptor.serializedSize() - 2) & 255));
            Hex.writeUInt16(eSDescriptor.esId, byteBufferAllocate);
            byteBufferAllocate.put((byte) (((eSDescriptor.streamDependenceFlag << 7) | (eSDescriptor.URLFlag << 6) | (eSDescriptor.oCRstreamFlag << 5) | (31 & eSDescriptor.streamPriority)) & 255));
            if (eSDescriptor.streamDependenceFlag > 0) {
                Hex.writeUInt16(eSDescriptor.dependsOnEsId, byteBufferAllocate);
            }
            if (eSDescriptor.URLFlag > 0) {
                byteBufferAllocate.put((byte) (eSDescriptor.URLLength & 255));
                byteBufferAllocate.put(Hex.convert(eSDescriptor.URLString));
                byteBufferAllocate.put((byte) 0);
            }
            if (eSDescriptor.oCRstreamFlag > 0) {
                Hex.writeUInt16(eSDescriptor.oCREsId, byteBufferAllocate);
            }
            DecoderConfigDescriptor decoderConfigDescriptor2 = eSDescriptor.decoderConfigDescriptor;
            AudioSpecificConfig audioSpecificConfig2 = decoderConfigDescriptor2.audioSpecificInfo;
            if (audioSpecificConfig2 == null) {
                i3 = 0;
            } else {
                if (audioSpecificConfig2.audioObjectType != 2) {
                    throw new UnsupportedOperationException("can't serialize that yet");
                }
                i3 = 4;
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i3 + 15);
            Hex.writeUInt8(4, byteBufferAllocate2);
            AudioSpecificConfig audioSpecificConfig3 = decoderConfigDescriptor2.audioSpecificInfo;
            if (audioSpecificConfig3 != null) {
                if (audioSpecificConfig3.audioObjectType != 2) {
                    throw new UnsupportedOperationException("can't serialize that yet");
                }
                i4 = 4;
            }
            byteBufferAllocate2.put((byte) ((i4 + i2) & 255));
            byteBufferAllocate2.put((byte) (decoderConfigDescriptor2.objectTypeIndication & 255));
            byteBufferAllocate2.put((byte) (((decoderConfigDescriptor2.streamType << 2) | (decoderConfigDescriptor2.upStream << 1) | 1) & 255));
            Hex.writeUInt24(decoderConfigDescriptor2.bufferSizeDB, byteBufferAllocate2);
            byteBufferAllocate2.putInt((int) decoderConfigDescriptor2.maxBitRate);
            byteBufferAllocate2.putInt((int) decoderConfigDescriptor2.avgBitRate);
            AudioSpecificConfig audioSpecificConfig4 = decoderConfigDescriptor2.audioSpecificInfo;
            if (audioSpecificConfig4 != null) {
                if (audioSpecificConfig4.audioObjectType != 2) {
                    throw new UnsupportedOperationException("can't serialize that yet");
                }
                ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(4);
                Hex.writeUInt8(5, byteBufferAllocate3);
                if (audioSpecificConfig4.audioObjectType != 2) {
                    throw new UnsupportedOperationException("can't serialize that yet");
                }
                byteBufferAllocate3.put((byte) 2);
                BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(1, byteBufferAllocate3);
                bitReaderBuffer.writeBits(audioSpecificConfig4.audioObjectType, 5);
                bitReaderBuffer.writeBits(audioSpecificConfig4.samplingFrequencyIndex, 4);
                if (audioSpecificConfig4.samplingFrequencyIndex == 15) {
                    throw new UnsupportedOperationException("can't serialize that yet");
                }
                bitReaderBuffer.writeBits(audioSpecificConfig4.channelConfiguration, 4);
                byteBufferAllocate2.put(byteBufferAllocate3.array());
            }
            SLConfigDescriptor sLConfigDescriptor2 = eSDescriptor.slConfigDescriptor;
            sLConfigDescriptor2.getClass();
            ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(3);
            Hex.writeUInt8(6, byteBufferAllocate4);
            byteBufferAllocate4.put((byte) 1);
            byteBufferAllocate4.put((byte) (sLConfigDescriptor2.predefined & 255));
            byteBufferAllocate.put(byteBufferAllocate2.array());
            byteBufferAllocate.put(byteBufferAllocate4.array());
            SurfaceContainer$$ExternalSyntheticOutline0.m(Factory.makeJP(AbstractDescriptorBox.ajc$tjp_4, eSDescriptorBox, eSDescriptorBox, byteBufferAllocate));
            eSDescriptorBox.data = byteBufferAllocate;
            audioSampleEntry.addBox(eSDescriptorBox);
            this.sampleDescriptionBox.addBox(audioSampleEntry);
            return;
        }
        this.width = mediaFormat.getInteger("width");
        this.height = mediaFormat.getInteger("height");
        this.timeScale = 90000;
        this.syncSamples = new LinkedList<>();
        this.handler = "vide";
        VideoMediaHeaderBox videoMediaHeaderBox = new VideoMediaHeaderBox("vmhd");
        videoMediaHeaderBox.graphicsmode = 0;
        videoMediaHeaderBox.opcolor = new int[3];
        videoMediaHeaderBox.setFlags(1);
        this.headerBox = videoMediaHeaderBox;
        this.sampleDescriptionBox = new SampleDescriptionBox();
        String string2 = mediaFormat.getString("mime");
        if (!string2.equals("video/avc")) {
            if (string2.equals("video/mp4v")) {
                VisualSampleEntry visualSampleEntry = new VisualSampleEntry("mp4v");
                visualSampleEntry.dataReferenceIndex = 1;
                visualSampleEntry.depth = 24;
                visualSampleEntry.frameCount = 1;
                visualSampleEntry.horizresolution = 72.0d;
                visualSampleEntry.vertresolution = 72.0d;
                visualSampleEntry.width = this.width;
                visualSampleEntry.height = this.height;
                this.sampleDescriptionBox.addBox(visualSampleEntry);
                return;
            }
            if (!string2.equals("video/hevc") || mediaFormat.getByteBuffer("csd-0") == null) {
                return;
            }
            byte[] bArrArray = mediaFormat.getByteBuffer("csd-0").array();
            int i5 = -1;
            int i6 = -1;
            int i7 = 0;
            int i8 = -1;
            for (int i9 = 0; i9 < bArrArray.length; i9++) {
                if (i7 == 3 && bArrArray[i9] == 1) {
                    if (i8 == -1) {
                        i8 = i9 - 3;
                    } else if (i6 == -1) {
                        i6 = i9 - 3;
                    } else if (i5 == -1) {
                        i5 = i9 - 3;
                    }
                }
                i7 = bArrArray[i9] == 0 ? i7 + 1 : 0;
            }
            byte[] bArr = new byte[i6 - 4];
            byte[] bArr2 = new byte[(i5 - i6) - 4];
            byte[] bArr3 = new byte[(bArrArray.length - i5) - 4];
            for (int i10 = 0; i10 < bArrArray.length; i10++) {
                if (i10 < i6) {
                    int i11 = i10 - 4;
                    if (i11 >= 0) {
                        bArr[i11] = bArrArray[i10];
                    }
                } else if (i10 < i5) {
                    int i12 = (i10 - i6) - 4;
                    if (i12 >= 0) {
                        bArr2[i12] = bArrArray[i10];
                    }
                } else {
                    int i13 = (i10 - i5) - 4;
                    if (i13 >= 0) {
                        bArr3[i13] = bArrArray[i10];
                    }
                }
            }
            try {
                VisualSampleEntry fromCsd = HevcDecoderConfigurationRecord.parseFromCsd(Arrays.asList(ByteBuffer.wrap(bArr), ByteBuffer.wrap(bArr3), ByteBuffer.wrap(bArr2)));
                fromCsd.width = this.width;
                fromCsd.height = this.height;
                this.sampleDescriptionBox.addBox(fromCsd);
                return;
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }
        VisualSampleEntry visualSampleEntry2 = new VisualSampleEntry("avc1");
        visualSampleEntry2.dataReferenceIndex = 1;
        visualSampleEntry2.depth = 24;
        visualSampleEntry2.frameCount = 1;
        visualSampleEntry2.horizresolution = 72.0d;
        visualSampleEntry2.vertresolution = 72.0d;
        visualSampleEntry2.width = this.width;
        visualSampleEntry2.height = this.height;
        AvcConfigurationBox avcConfigurationBox = new AvcConfigurationBox("avcC");
        AvcDecoderConfigurationRecord avcDecoderConfigurationRecord = new AvcDecoderConfigurationRecord();
        avcDecoderConfigurationRecord.sequenceParameterSets = new ArrayList();
        avcDecoderConfigurationRecord.pictureParameterSets = new ArrayList();
        avcDecoderConfigurationRecord.hasExts = true;
        avcDecoderConfigurationRecord.chromaFormat = 1;
        avcDecoderConfigurationRecord.bitDepthLumaMinus8 = 0;
        avcDecoderConfigurationRecord.bitDepthChromaMinus8 = 0;
        avcDecoderConfigurationRecord.sequenceParameterSetExts = new ArrayList();
        avcDecoderConfigurationRecord.lengthSizeMinusOnePaddingBits = 63;
        avcDecoderConfigurationRecord.numberOfSequenceParameterSetsPaddingBits = 7;
        avcDecoderConfigurationRecord.chromaFormatPaddingBits = 31;
        avcDecoderConfigurationRecord.bitDepthLumaMinus8PaddingBits = 31;
        avcDecoderConfigurationRecord.bitDepthChromaMinus8PaddingBits = 31;
        avcConfigurationBox.avcDecoderConfigurationRecord = avcDecoderConfigurationRecord;
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
            SurfaceContainer$$ExternalSyntheticOutline0.m(Factory.makeJP(AvcConfigurationBox.ajc$tjp_12, avcConfigurationBox, avcConfigurationBox, arrayList));
            avcConfigurationBox.avcDecoderConfigurationRecord.sequenceParameterSets = arrayList;
            SurfaceContainer$$ExternalSyntheticOutline0.m(Factory.makeJP(AvcConfigurationBox.ajc$tjp_13, avcConfigurationBox, avcConfigurationBox, arrayList2));
            avcConfigurationBox.avcDecoderConfigurationRecord.pictureParameterSets = arrayList2;
        }
        if (mediaFormat.containsKey("level")) {
            int integer = mediaFormat.getInteger("level");
            if (integer == 1) {
                avcConfigurationBox.setAvcLevelIndication(1);
            } else if (integer == 32) {
                avcConfigurationBox.setAvcLevelIndication(2);
            } else if (integer == 4) {
                avcConfigurationBox.setAvcLevelIndication(11);
            } else if (integer == 8) {
                avcConfigurationBox.setAvcLevelIndication(12);
            } else if (integer == 16) {
                avcConfigurationBox.setAvcLevelIndication(13);
            } else if (integer == 64) {
                avcConfigurationBox.setAvcLevelIndication(21);
            } else if (integer == 128) {
                avcConfigurationBox.setAvcLevelIndication(22);
            } else if (integer == 256) {
                avcConfigurationBox.setAvcLevelIndication(3);
            } else if (integer == 512) {
                avcConfigurationBox.setAvcLevelIndication(31);
            } else if (integer == 1024) {
                avcConfigurationBox.setAvcLevelIndication(32);
            } else if (integer == 2048) {
                avcConfigurationBox.setAvcLevelIndication(4);
            } else if (integer == 4096) {
                avcConfigurationBox.setAvcLevelIndication(41);
            } else if (integer == 8192) {
                avcConfigurationBox.setAvcLevelIndication(42);
            } else if (integer == 16384) {
                avcConfigurationBox.setAvcLevelIndication(5);
            } else if (integer == 32768) {
                avcConfigurationBox.setAvcLevelIndication(51);
            } else if (integer == 65536) {
                avcConfigurationBox.setAvcLevelIndication(52);
            } else if (integer == 2) {
                avcConfigurationBox.setAvcLevelIndication(27);
            }
        } else {
            avcConfigurationBox.setAvcLevelIndication(13);
        }
        if (mediaFormat.containsKey("profile")) {
            int integer2 = mediaFormat.getInteger("profile");
            if (integer2 == 1) {
                avcConfigurationBox.setAvcProfileIndication(66);
            } else if (integer2 == 2) {
                avcConfigurationBox.setAvcProfileIndication(77);
            } else if (integer2 == 4) {
                avcConfigurationBox.setAvcProfileIndication(88);
            } else if (integer2 == 8) {
                avcConfigurationBox.setAvcProfileIndication(100);
            } else if (integer2 == 16) {
                avcConfigurationBox.setAvcProfileIndication(110);
            } else if (integer2 == 32) {
                avcConfigurationBox.setAvcProfileIndication(122);
            } else if (integer2 == 64) {
                avcConfigurationBox.setAvcProfileIndication(244);
            }
        } else {
            avcConfigurationBox.setAvcProfileIndication(100);
        }
        SurfaceContainer$$ExternalSyntheticOutline0.m(Factory.makeJP(AvcConfigurationBox.ajc$tjp_17, avcConfigurationBox, avcConfigurationBox, new Integer(-1)));
        avcConfigurationBox.avcDecoderConfigurationRecord.bitDepthLumaMinus8 = -1;
        SurfaceContainer$$ExternalSyntheticOutline0.m(Factory.makeJP(AvcConfigurationBox.ajc$tjp_19, avcConfigurationBox, avcConfigurationBox, new Integer(-1)));
        avcConfigurationBox.avcDecoderConfigurationRecord.bitDepthChromaMinus8 = -1;
        SurfaceContainer$$ExternalSyntheticOutline0.m(Factory.makeJP(AvcConfigurationBox.ajc$tjp_15, avcConfigurationBox, avcConfigurationBox, new Integer(-1)));
        avcConfigurationBox.avcDecoderConfigurationRecord.chromaFormat = -1;
        SurfaceContainer$$ExternalSyntheticOutline0.m(Factory.makeJP(AvcConfigurationBox.ajc$tjp_7, avcConfigurationBox, avcConfigurationBox, new Integer(1)));
        avcConfigurationBox.avcDecoderConfigurationRecord.configurationVersion = 1;
        SurfaceContainer$$ExternalSyntheticOutline0.m(Factory.makeJP(AvcConfigurationBox.ajc$tjp_11, avcConfigurationBox, avcConfigurationBox, new Integer(3)));
        avcConfigurationBox.avcDecoderConfigurationRecord.lengthSizeMinusOne = 3;
        SurfaceContainer$$ExternalSyntheticOutline0.m(Factory.makeJP(AvcConfigurationBox.ajc$tjp_9, avcConfigurationBox, avcConfigurationBox, new Integer(0)));
        avcConfigurationBox.avcDecoderConfigurationRecord.profileCompatibility = 0;
        visualSampleEntry2.addBox(avcConfigurationBox);
        this.sampleDescriptionBox.addBox(visualSampleEntry2);
    }

    public static int lambda$prepare$0(SamplePresentationTime samplePresentationTime, SamplePresentationTime samplePresentationTime2) {
        if (samplePresentationTime.presentationTime > samplePresentationTime2.presentationTime) {
            return 1;
        }
        return samplePresentationTime.presentationTime < samplePresentationTime2.presentationTime ? -1 : 0;
    }

    public void addSample(long j, MediaCodec.BufferInfo bufferInfo) {
        boolean z;
        if (!this.isAudio) {
            z = (bufferInfo.flags & 1) != 0;
        }
        this.samples.add(new Sample(j, bufferInfo.size));
        LinkedList<Integer> linkedList = this.syncSamples;
        if (linkedList != null && z) {
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
        long j = this.duration;
        long[] jArr = this.sampleDurations;
        return (((j - jArr[jArr.length - 1]) * 1000000) - 500000) / ((long) this.timeScale);
    }

    public AbstractMediaHeaderBox getMediaHeaderBox() {
        return this.headerBox;
    }

    public int[] getSampleCompositions() {
        return this.sampleCompositions;
    }

    public SampleDescriptionBox getSampleDescriptionBox() {
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
        for (int i = 0; i < this.syncSamples.size(); i++) {
            jArr[i] = this.syncSamples.get(i).intValue();
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
        int i;
        long j = 0;
        this.duration = 0L;
        ArrayList arrayList = new ArrayList(this.samplePresentationTimes);
        Collections.sort(this.samplePresentationTimes, new Track$$ExternalSyntheticLambda0(0));
        this.sampleDurations = new long[this.samplePresentationTimes.size()];
        long jMin = Long.MAX_VALUE;
        long j2 = 0;
        int i2 = 0;
        boolean z = false;
        while (true) {
            if (i2 >= this.samplePresentationTimes.size()) {
                break;
            }
            SamplePresentationTime samplePresentationTime = this.samplePresentationTimes.get(i2);
            long j3 = samplePresentationTime.presentationTime - j2;
            j2 = samplePresentationTime.presentationTime;
            this.sampleDurations[samplePresentationTime.index] = j3;
            if (samplePresentationTime.index != 0) {
                this.duration += j3;
            }
            if (j3 > j && j3 < 2147483647L) {
                jMin = Math.min(jMin, j3);
            }
            if (samplePresentationTime.index != i2) {
                z = true;
            }
            i2++;
            j = j;
        }
        long[] jArr = this.sampleDurations;
        if (jArr.length > 0) {
            jArr[0] = jMin;
            this.duration += jMin;
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
