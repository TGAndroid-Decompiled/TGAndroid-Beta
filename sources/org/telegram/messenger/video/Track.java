package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.coremedia.iso.boxes.AbstractMediaHeaderBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SoundMediaHeaderBox;
import com.coremedia.iso.boxes.VideoMediaHeaderBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor;
import com.mp4parser.iso14496.part15.AvcConfigurationBox;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.telegram.messenger.MediaController;

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
        this.syncSamples = null;
        this.volume = 0.0f;
        this.trackId = i;
        this.isAudio = z;
        if (!z) {
            this.width = mediaFormat.getInteger("width");
            this.height = mediaFormat.getInteger("height");
            this.timeScale = 90000;
            this.syncSamples = new LinkedList<>();
            this.handler = "vide";
            this.headerBox = new VideoMediaHeaderBox();
            this.sampleDescriptionBox = new SampleDescriptionBox();
            String string = mediaFormat.getString("mime");
            if (string.equals(MediaController.VIDEO_MIME_TYPE)) {
                VisualSampleEntry visualSampleEntry = new VisualSampleEntry("avc1");
                visualSampleEntry.setDataReferenceIndex(1);
                visualSampleEntry.setDepth(24);
                visualSampleEntry.setFrameCount(1);
                visualSampleEntry.setHorizresolution(72.0d);
                visualSampleEntry.setVertresolution(72.0d);
                visualSampleEntry.setWidth(this.width);
                visualSampleEntry.setHeight(this.height);
                AvcConfigurationBox avcConfigurationBox = new AvcConfigurationBox();
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
                    avcConfigurationBox.setSequenceParameterSets(arrayList);
                    avcConfigurationBox.setPictureParameterSets(arrayList2);
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
                avcConfigurationBox.setBitDepthLumaMinus8(-1);
                avcConfigurationBox.setBitDepthChromaMinus8(-1);
                avcConfigurationBox.setChromaFormat(-1);
                avcConfigurationBox.setConfigurationVersion(1);
                avcConfigurationBox.setLengthSizeMinusOne(3);
                avcConfigurationBox.setProfileCompatibility(0);
                visualSampleEntry.addBox(avcConfigurationBox);
                this.sampleDescriptionBox.addBox(visualSampleEntry);
            } else if (string.equals("video/mp4v")) {
                VisualSampleEntry visualSampleEntry2 = new VisualSampleEntry("mp4v");
                visualSampleEntry2.setDataReferenceIndex(1);
                visualSampleEntry2.setDepth(24);
                visualSampleEntry2.setFrameCount(1);
                visualSampleEntry2.setHorizresolution(72.0d);
                visualSampleEntry2.setVertresolution(72.0d);
                visualSampleEntry2.setWidth(this.width);
                visualSampleEntry2.setHeight(this.height);
                this.sampleDescriptionBox.addBox(visualSampleEntry2);
            }
        } else {
            this.volume = 1.0f;
            this.timeScale = mediaFormat.getInteger("sample-rate");
            this.handler = "soun";
            this.headerBox = new SoundMediaHeaderBox();
            this.sampleDescriptionBox = new SampleDescriptionBox();
            AudioSampleEntry audioSampleEntry = new AudioSampleEntry("mp4a");
            audioSampleEntry.setChannelCount(mediaFormat.getInteger("channel-count"));
            audioSampleEntry.setSampleRate(mediaFormat.getInteger("sample-rate"));
            audioSampleEntry.setDataReferenceIndex(1);
            audioSampleEntry.setSampleSize(16);
            ESDescriptorBox eSDescriptorBox = new ESDescriptorBox();
            ESDescriptor eSDescriptor = new ESDescriptor();
            eSDescriptor.setEsId(0);
            SLConfigDescriptor sLConfigDescriptor = new SLConfigDescriptor();
            sLConfigDescriptor.setPredefined(2);
            eSDescriptor.setSlConfigDescriptor(sLConfigDescriptor);
            String string2 = mediaFormat.containsKey("mime") ? mediaFormat.getString("mime") : "audio/mp4-latm";
            DecoderConfigDescriptor decoderConfigDescriptor = new DecoderConfigDescriptor();
            if ("audio/mpeg".equals(string2)) {
                decoderConfigDescriptor.setObjectTypeIndication(105);
            } else {
                decoderConfigDescriptor.setObjectTypeIndication(64);
            }
            decoderConfigDescriptor.setStreamType(5);
            decoderConfigDescriptor.setBufferSizeDB(1536);
            if (mediaFormat.containsKey("max-bitrate")) {
                decoderConfigDescriptor.setMaxBitRate(mediaFormat.getInteger("max-bitrate"));
            } else {
                decoderConfigDescriptor.setMaxBitRate(96000L);
            }
            decoderConfigDescriptor.setAvgBitRate(this.timeScale);
            AudioSpecificConfig audioSpecificConfig = new AudioSpecificConfig();
            audioSpecificConfig.setAudioObjectType(2);
            audioSpecificConfig.setSamplingFrequencyIndex(samplingFrequencyIndexMap.get(Integer.valueOf((int) audioSampleEntry.getSampleRate())).intValue());
            audioSpecificConfig.setChannelConfiguration(audioSampleEntry.getChannelCount());
            decoderConfigDescriptor.setAudioSpecificInfo(audioSpecificConfig);
            eSDescriptor.setDecoderConfigDescriptor(decoderConfigDescriptor);
            ByteBuffer serialize = eSDescriptor.serialize();
            eSDescriptorBox.setEsDescriptor(eSDescriptor);
            eSDescriptorBox.setData(serialize);
            audioSampleEntry.addBox(eSDescriptorBox);
            this.sampleDescriptionBox.addBox(audioSampleEntry);
        }
    }

    public long getTrackId() {
        return this.trackId;
    }

    public void addSample(long j, MediaCodec.BufferInfo bufferInfo) {
        boolean z = true;
        if (this.isAudio || (bufferInfo.flags & 1) == 0) {
            z = false;
        }
        this.samples.add(new Sample(j, bufferInfo.size));
        LinkedList<Integer> linkedList = this.syncSamples;
        if (linkedList != null && z) {
            linkedList.add(Integer.valueOf(this.samples.size()));
        }
        ArrayList<SamplePresentationTime> arrayList = this.samplePresentationTimes;
        arrayList.add(new SamplePresentationTime(arrayList.size(), ((bufferInfo.presentationTimeUs * this.timeScale) + 500000) / 1000000));
    }

    public void prepare() {
        int i;
        ArrayList arrayList = new ArrayList(this.samplePresentationTimes);
        Collections.sort(this.samplePresentationTimes, Track$$ExternalSyntheticLambda0.INSTANCE);
        this.sampleDurations = new long[this.samplePresentationTimes.size()];
        long j = Long.MAX_VALUE;
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
            long j4 = j;
            if (samplePresentationTime.index != 0) {
                this.duration += j3;
            }
            j = (j3 <= 0 || j3 >= 2147483647L) ? j4 : Math.min(j4, j3);
            if (samplePresentationTime.index != i2) {
                z = true;
            }
            i2++;
        }
        long[] jArr = this.sampleDurations;
        if (jArr.length > 0) {
            jArr[0] = j;
            this.duration += j;
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

    public static int lambda$prepare$0(SamplePresentationTime samplePresentationTime, SamplePresentationTime samplePresentationTime2) {
        if (samplePresentationTime.presentationTime > samplePresentationTime2.presentationTime) {
            return 1;
        }
        return samplePresentationTime.presentationTime < samplePresentationTime2.presentationTime ? -1 : 0;
    }

    public ArrayList<Sample> getSamples() {
        return this.samples;
    }

    public long getLastFrameTimestamp() {
        long j = this.duration;
        long[] jArr = this.sampleDurations;
        return (((j - jArr[jArr.length - 1]) * 1000000) - 500000) / this.timeScale;
    }

    public long getDuration() {
        return this.duration;
    }

    public String getHandler() {
        return this.handler;
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

    public Date getCreationTime() {
        return this.creationTime;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public float getVolume() {
        return this.volume;
    }

    public long[] getSampleDurations() {
        return this.sampleDurations;
    }

    public boolean isAudio() {
        return this.isAudio;
    }
}
