package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Build;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
public class MediaCodecVideoConvertor {
    private static final int MAX_DECODER_INPUTS_PER_LOOP = 8;
    private static final int MEDIACODEC_TIMEOUT_DEFAULT = 2500;
    private static final int MEDIACODEC_TIMEOUT_INCREASED = 22000;
    private static final int PROCESSOR_TYPE_INTEL = 2;
    private static final int PROCESSOR_TYPE_MTK = 3;
    private static final int PROCESSOR_TYPE_OTHER = 0;
    private static final int PROCESSOR_TYPE_QCOM = 1;
    private static final int PROCESSOR_TYPE_SEC = 4;
    private static final int PROCESSOR_TYPE_TI = 5;
    private pm6 callback;
    private long endPresentationTime;
    private MediaExtractor extractor;
    private boolean legacyCodecSetup;
    private Muxer muxer;
    private String outputMimeType;

    public class ConversionCanceledException extends RuntimeException {
        public ConversionCanceledException() {
            super("canceled conversion");
        }
    }

    public static class ConvertVideoParams {
        int account;
        long avatarStartTime;
        String backgroundPath;
        int bitrate;
        String blurPath;
        File cacheFile;
        pm6 callback;
        fk2 collage;
        ArrayList<nac> collageParts;
        zl6 cropState;
        long duration;
        long endTime;
        int framerate;
        Integer gradientBottomColor;
        Integer gradientTopColor;
        e4b hdrInfo;
        boolean isDark;
        boolean isPhoto;
        boolean isRound;
        boolean isSecret;
        boolean isSticker;
        boolean isStory;
        ArrayList<mac> mediaEntities;
        String messagePath;
        String messageVideoMaskPath;
        boolean muted;
        boolean needCompress;
        int originalBitrate;
        int originalHeight;
        int originalWidth;
        String paintPath;
        int resultHeight;
        int resultWidth;
        int rotationValue;
        lm6 savedFilterState;
        public ArrayList<MixedSoundInfo> soundInfos = new ArrayList<>();
        long startTime;
        long videoOffset;
        String videoPath;
        float volume;
        long wallpaperPeerId;

        private ConvertVideoParams() {
        }

        public static ConvertVideoParams of(String str, File file, long j, int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, long j3, long j4, boolean z2, long j5, pm6 pm6Var, oac oacVar) {
            ConvertVideoParams convertVideoParams = new ConvertVideoParams();
            convertVideoParams.videoPath = str;
            convertVideoParams.videoOffset = j;
            convertVideoParams.cacheFile = file;
            convertVideoParams.rotationValue = i;
            convertVideoParams.isSecret = z;
            convertVideoParams.originalWidth = i2;
            convertVideoParams.originalHeight = i3;
            convertVideoParams.resultWidth = i4;
            convertVideoParams.resultHeight = i5;
            convertVideoParams.framerate = i6;
            convertVideoParams.bitrate = i7;
            convertVideoParams.originalBitrate = i8;
            convertVideoParams.startTime = j2;
            convertVideoParams.endTime = j3;
            convertVideoParams.avatarStartTime = j4;
            convertVideoParams.needCompress = z2;
            convertVideoParams.duration = j5;
            convertVideoParams.savedFilterState = oacVar.A;
            convertVideoParams.paintPath = oacVar.B;
            convertVideoParams.blurPath = oacVar.C;
            convertVideoParams.mediaEntities = oacVar.G;
            convertVideoParams.isPhoto = oacVar.I;
            convertVideoParams.cropState = oacVar.H;
            convertVideoParams.isRound = oacVar.s;
            convertVideoParams.callback = pm6Var;
            convertVideoParams.gradientTopColor = oacVar.P;
            convertVideoParams.gradientBottomColor = oacVar.Q;
            convertVideoParams.muted = oacVar.t;
            convertVideoParams.volume = oacVar.u;
            convertVideoParams.isStory = oacVar.J;
            convertVideoParams.hdrInfo = oacVar.K;
            convertVideoParams.isDark = oacVar.S;
            convertVideoParams.wallpaperPeerId = oacVar.T;
            convertVideoParams.account = oacVar.R;
            convertVideoParams.messagePath = oacVar.D;
            convertVideoParams.messageVideoMaskPath = oacVar.E;
            convertVideoParams.backgroundPath = oacVar.F;
            convertVideoParams.isSticker = oacVar.N;
            convertVideoParams.collage = oacVar.L;
            convertVideoParams.collageParts = oacVar.M;
            return convertVideoParams;
        }
    }

    public class DecoderFeeder extends Thread {
        private ByteBuffer audioBuffer;
        private final int audioIndex;
        private final int audioTrackIndex;
        private final MediaCodec decoder;
        private final float durationS;
        private final long endTime;
        volatile Throwable error;
        private final MediaExtractor extractor;
        private int maxBufferSize;
        private final Muxer muxer;
        private final long startTime;
        volatile boolean stopFeeding;
        private final int videoIndex;

        public DecoderFeeder(MediaExtractor mediaExtractor, MediaCodec mediaCodec, int i, int i2, Muxer muxer, int i3, long j, long j2, float f, ByteBuffer byteBuffer, int i4) {
            super("DecoderFeeder");
            this.extractor = mediaExtractor;
            this.decoder = mediaCodec;
            this.videoIndex = i;
            this.audioIndex = i2;
            this.muxer = muxer;
            this.audioTrackIndex = i3;
            this.startTime = j;
            this.endTime = j2;
            this.durationS = f;
            this.audioBuffer = byteBuffer;
            this.maxBufferSize = i4;
        }

        public void finish() {
            this.stopFeeding = true;
            try {
                join();
            } catch (InterruptedException e) {
                fa4.g(e, true);
            }
        }

        @Override
        public void run() {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            long j = 0;
            while (!this.stopFeeding) {
                try {
                    if (MediaCodecVideoConvertor.this.callback == null || !((oac) ((spc) MediaCodecVideoConvertor.this.callback).b).V) {
                        int sampleTrackIndex = this.extractor.getSampleTrackIndex();
                        if (sampleTrackIndex == this.videoIndex) {
                            int dequeueInputBuffer = this.decoder.dequeueInputBuffer(2500L);
                            if (dequeueInputBuffer >= 0) {
                                int readSampleData = this.extractor.readSampleData(this.decoder.getInputBuffer(dequeueInputBuffer), 0);
                                MediaCodec mediaCodec = this.decoder;
                                if (readSampleData < 0) {
                                    mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                                    return;
                                } else {
                                    mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, this.extractor.getSampleTime(), 0);
                                    this.extractor.advance();
                                }
                            } else {
                                continue;
                            }
                        } else {
                            int i = this.audioIndex;
                            if (i != -1 && sampleTrackIndex == i) {
                                if (Build.VERSION.SDK_INT >= 28) {
                                    long sampleSize = this.extractor.getSampleSize();
                                    if (sampleSize > this.maxBufferSize) {
                                        int i2 = (int) (sampleSize + 1024);
                                        this.maxBufferSize = i2;
                                        this.audioBuffer = ByteBuffer.allocateDirect(i2);
                                    }
                                }
                                int readSampleData2 = this.extractor.readSampleData(this.audioBuffer, 0);
                                bufferInfo.size = readSampleData2;
                                if (readSampleData2 >= 0) {
                                    bufferInfo.presentationTimeUs = this.extractor.getSampleTime();
                                    this.extractor.advance();
                                    if (bufferInfo.size > 0) {
                                        long j2 = this.endTime;
                                        if (j2 < 0 || bufferInfo.presentationTimeUs < j2) {
                                            bufferInfo.offset = 0;
                                            bufferInfo.flags = this.extractor.getSampleFlags();
                                            synchronized (this.muxer) {
                                                long writeSampleData = this.muxer.writeSampleData(this.audioTrackIndex, this.audioBuffer, bufferInfo, false);
                                                if (writeSampleData != 0 && MediaCodecVideoConvertor.this.callback != null) {
                                                    long j3 = bufferInfo.presentationTimeUs - this.startTime;
                                                    if (j3 > j) {
                                                        j = j3;
                                                    }
                                                    ((spc) MediaCodecVideoConvertor.this.callback).n(writeSampleData, (((float) j) / 1000.0f) / this.durationS);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    return;
                                }
                            } else if (sampleTrackIndex == -1) {
                                while (!this.stopFeeding) {
                                    int dequeueInputBuffer2 = this.decoder.dequeueInputBuffer(2500L);
                                    if (dequeueInputBuffer2 >= 0) {
                                        this.decoder.queueInputBuffer(dequeueInputBuffer2, 0, 0, 0L, 4);
                                        return;
                                    }
                                }
                                return;
                            } else {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    this.error = th;
                    return;
                }
            }
        }
    }

    public static class MixedSoundInfo {
        final String audioFile;
        public long audioOffset;
        public long duration;
        public long startTime;
        public float volume = 1.0f;

        public MixedSoundInfo(String str) {
            this.audioFile = str;
        }
    }

    private static void applyAudioInputs(ArrayList<MixedSoundInfo> arrayList, ArrayList<h00> arrayList2) {
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                MixedSoundInfo mixedSoundInfo = arrayList.get(i);
                try {
                    as4 as4Var = new as4(mixedSoundInfo.audioFile);
                    AudioDecoder audioDecoder = as4Var.b;
                    as4Var.a = Math.max(0.0f, Math.min(mixedSoundInfo.volume, 1.0f));
                    long j = mixedSoundInfo.startTime;
                    int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                    if (i2 > 0) {
                        if (i2 < 0) {
                            j = 0;
                        }
                        as4Var.d = j;
                    }
                    long j2 = mixedSoundInfo.audioOffset;
                    if (j2 > 0) {
                        audioDecoder.setStartTimeUs(j2);
                    } else {
                        j2 = 0;
                    }
                    long j3 = mixedSoundInfo.duration;
                    if (j3 > 0) {
                        audioDecoder.setEndTimeUs(j2 + j3);
                    }
                    arrayList2.add(as4Var);
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
        }
    }

    private void checkConversionCanceled() {
        pm6 pm6Var = this.callback;
        if (pm6Var != null && ((oac) ((spc) pm6Var).b).V) {
            throw new ConversionCanceledException();
        }
    }

    private boolean convertVideoInternal(org.telegram.messenger.video.MediaCodecVideoConvertor.ConvertVideoParams r112, boolean r113, int r114) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.MediaCodecVideoConvertor.convertVideoInternal(org.telegram.messenger.video.MediaCodecVideoConvertor$ConvertVideoParams, boolean, int):boolean");
    }

    private MediaCodec createEncoderForMimeType() {
        MediaCodec createEncoderByType;
        if (this.outputMimeType.equals("video/hevc") && Build.VERSION.SDK_INT >= 29) {
            String l = gba.l();
            if (l != null) {
                createEncoderByType = MediaCodec.createByCodecName(l);
            } else {
                createEncoderByType = null;
            }
        } else {
            if (this.outputMimeType.equals("video/hevc")) {
                this.outputMimeType = "video/avc";
            }
            createEncoderByType = MediaCodec.createEncoderByType(this.outputMimeType);
        }
        if (createEncoderByType == null && this.outputMimeType.equals("video/hevc")) {
            this.outputMimeType = "video/avc";
            return MediaCodec.createEncoderByType("video/avc");
        }
        return createEncoderByType;
    }

    private static String createFragmentShader(int i, int i2, int i3, int i4, boolean z, int i5, boolean z2) {
        int i6;
        int i7;
        String str;
        if (z2) {
            i7 = i3;
            i6 = i4;
        } else {
            i6 = i3;
            i7 = i4;
        }
        float f = i;
        float f2 = f / i6;
        float f3 = i2;
        float f4 = f3 / i7;
        int i8 = 1;
        int max = Math.max(1, Math.round(f2));
        int max2 = Math.max(1, Math.round(f4));
        if (gba.o() <= 1) {
            max2 = 1;
        } else {
            i8 = max;
        }
        int min = Math.min(i5, i8);
        int min2 = Math.min(i5, max2);
        float f5 = f2 / min;
        float f6 = f4 / min2;
        float f7 = (-(min - 1)) / 2.0f;
        float f8 = (-(min2 - 1)) / 2.0f;
        if ((min & 1) == 0) {
            f7 += 0.01f;
        }
        if ((min2 & 1) == 0) {
            f8 += 0.01f;
        }
        StringBuilder p = ir2.p("source size ", i, "x", i2, "    dest size ");
        ir2.w(p, i3, "x", i4, "   rotated ");
        p.append(z2);
        p.append("   ratio ");
        p.append(f2);
        p.append("x");
        p.append(f4);
        p.append("   samples ");
        p.append(min);
        p.append("x");
        p.append(min2);
        p.append("   kernel scale ");
        p.append(f5);
        p.append("x");
        p.append(f6);
        fa4.b(p.toString());
        String glslFloat = glslFloat(f7);
        String glslFloat2 = glslFloat(f8);
        String glslFloat3 = glslFloat(f5);
        String glslFloat4 = glslFloat(f6);
        String glslFloat5 = glslFloat(min * min2);
        String glslFloat6 = glslFloat(1.0f / f);
        String glslFloat7 = glslFloat(1.0f / f3);
        if (z) {
            str = "#extension GL_OES_EGL_image_external : require\nuniform samplerExternalOES sTexture;\n";
        } else {
            str = "uniform sampler2D sTexture;\n";
        }
        StringBuilder l = yjb.l(str, "precision highp float;\nvarying vec2 vTextureCoord;\nconst float offsetX = ", glslFloat, ";\nconst float offsetY = ", glslFloat2);
        ls6.u(l, ";\nconst float kernelScaleX = ", glslFloat3, ";\nconst float kernelScaleY = ", glslFloat4);
        ls6.u(l, ";\nconst float weightsum = ", glslFloat5, ";\nconst float pixelSizeX = ", glslFloat6);
        l.append(";\nconst float pixelSizeY = ");
        l.append(glslFloat7);
        l.append(";\nvoid main() {\n    vec3 accumulation = vec3(0.0);\n    for (int i = 0; i < ");
        l.append(min);
        l.append("; ++i) {\n        for (int j = 0; j < ");
        l.append(min2);
        l.append("; ++j) {\n            float x = (offsetX + float(i)) * kernelScaleX;\n            float y = (offsetY + float(j)) * kernelScaleY;\n            vec2 uv = vTextureCoord + vec2(\n                    x * pixelSizeX,\n                    y * pixelSizeY\n            );\n            accumulation += texture2D(sTexture, uv).rgb;\n        }\n    }\n    gl_FragColor = vec4(accumulation / weightsum, 1.0);\n}\n");
        return l.toString();
    }

    public static void cutOfNalData(String str, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i;
        if (str.equals("video/hevc")) {
            i = 3;
        } else {
            i = 1;
        }
        if (bufferInfo.size > 100) {
            byteBuffer.position(bufferInfo.offset);
            byte[] bArr = new byte[100];
            byteBuffer.get(bArr);
            int i2 = 0;
            for (int i3 = 0; i3 < 96; i3++) {
                if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 0 && bArr[i3 + 3] == 1 && (i2 = i2 + 1) > i) {
                    bufferInfo.offset += i3;
                    bufferInfo.size -= i3;
                    return;
                }
            }
        }
    }

    private MediaCodec getDecoderByFormat(MediaFormat mediaFormat) {
        MediaCodec mediaCodec = null;
        if (mediaFormat != null) {
            ArrayList arrayList = new ArrayList();
            String string = mediaFormat.getString("mime");
            arrayList.add(string);
            if ("video/dolby-vision".equals(string)) {
                arrayList.add("video/hevc");
                arrayList.add("video/avc");
            }
            Exception exc = null;
            while (!arrayList.isEmpty()) {
                try {
                    String str = (String) arrayList.remove(0);
                    mediaFormat.setString("mime", str);
                    return MediaCodec.createDecoderByType(str);
                } catch (Exception e) {
                    if (exc == null) {
                        exc = e;
                    }
                }
            }
            sdb.b(exc);
            return mediaCodec;
        }
        wn4.j("getDecoderByFormat: format is null");
        return null;
    }

    private static String glslFloat(float f) {
        boolean z;
        if (f < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = -f;
        }
        long round = Math.round(f * 1000000.0f);
        long j = round / 1000000;
        long j2 = round % 1000000;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        sb.append(j);
        sb.append('.');
        String valueOf = String.valueOf(j2);
        for (int length = valueOf.length(); length < 6; length++) {
            sb.append('0');
        }
        sb.append(valueOf);
        return sb.toString();
    }

    private static String hdrFragmentShader(int i, int i2, int i3, int i4, boolean z, e4b e4bVar, int i5, boolean z2) {
        int i6;
        int i7;
        String v2;
        if (!z) {
            return createFragmentShader(i, i2, i3, i4, false, i5, z2);
        }
        if (z2) {
            i7 = i3;
            i6 = i4;
        } else {
            i6 = i3;
            i7 = i4;
        }
        float f = i;
        float f2 = f / i6;
        float f3 = i2;
        float f4 = f3 / i7;
        int max = Math.max(1, Math.round(f2));
        int max2 = Math.max(1, Math.round(f4));
        if (gba.o() <= 1) {
            max = 1;
            max2 = 1;
        }
        int min = Math.min(i5, max);
        int min2 = Math.min(i5, max2);
        float f5 = f2 / min;
        float f6 = f4 / min2;
        float f7 = (-(min - 1)) / 2.0f;
        float f8 = (-(min2 - 1)) / 2.0f;
        if ((min & 1) == 0) {
            f7 += 0.01f;
        }
        if ((min2 & 1) == 0) {
            f8 += 0.01f;
        }
        StringBuilder p = ir2.p("HDR source size ", i, "x", i2, "    dest size ");
        ir2.w(p, i3, "x", i4, "   rotated ");
        p.append(z2);
        p.append("   ratio ");
        p.append(f2);
        p.append("x");
        p.append(f4);
        p.append("   samples ");
        p.append(min);
        p.append("x");
        p.append(min2);
        p.append("   kernel scale ");
        p.append(f5);
        p.append("x");
        p.append(f6);
        fa4.b(p.toString());
        String glslFloat = glslFloat(f7);
        String glslFloat2 = glslFloat(f8);
        String glslFloat3 = glslFloat(f5);
        String glslFloat4 = glslFloat(f6);
        String glslFloat5 = glslFloat(min * min2);
        String glslFloat6 = glslFloat(1.0f / f);
        String glslFloat7 = glslFloat(1.0f / f3);
        if (e4bVar.a() == 1) {
            v2 = gl.v2(null, 2131624046);
        } else {
            v2 = gl.v2(null, 2131624047);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(v2);
        sb.append("\nvarying vec2 vTextureCoord;\nconst float offsetX = ");
        sb.append(glslFloat);
        sb.append(";\nconst float offsetY = ");
        sb.append(glslFloat2);
        ls6.u(sb, ";\nconst float kernelScaleX = ", glslFloat3, ";\nconst float kernelScaleY = ", glslFloat4);
        ls6.u(sb, ";\nconst float weightsum = ", glslFloat5, ";\nconst float pixelSizeX = ", glslFloat6);
        sb.append(";\nconst float pixelSizeY = ");
        sb.append(glslFloat7);
        sb.append(";\nvoid main() {\n    vec3 accumulation = vec3(0.0);\n    for (int i = 0; i < ");
        sb.append(min);
        sb.append("; ++i) {\n        for (int j = 0; j < ");
        sb.append(min2);
        sb.append("; ++j) {\n            float x = (offsetX + float(i)) * kernelScaleX;\n            float y = (offsetY + float(j)) * kernelScaleY;\n            vec2 uv = vTextureCoord + vec2(\n                    x * pixelSizeX,\n                    y * pixelSizeY\n            );\n            accumulation += TEX(uv).rgb;\n        }\n    }\n    gl_FragColor = vec4(accumulation / weightsum, 1.0);\n}\n");
        return sb.toString();
    }

    private boolean isMediatekAvcEncoder(MediaCodec mediaCodec) {
        return mediaCodec.getName().equals("c2.mtk.avc.encoder");
    }

    private static boolean isSocModel(String... strArr) {
        String str;
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        for (String str2 : strArr) {
            str = Build.SOC_MODEL;
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private long readAndWriteTracks(android.media.MediaExtractor r28, org.telegram.messenger.video.MediaCodecVideoConvertor.Muxer r29, android.media.MediaCodec.BufferInfo r30, long r31, long r33, long r35, java.io.File r37, boolean r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.MediaCodecVideoConvertor.readAndWriteTracks(android.media.MediaExtractor, org.telegram.messenger.video.MediaCodecVideoConvertor$Muxer, android.media.MediaCodec$BufferInfo, long, long, long, java.io.File, boolean):long");
    }

    private static void setDecoderOperatingRate(MediaFormat mediaFormat) {
        int i = Build.VERSION.SDK_INT;
        if (i < 25) {
            return;
        }
        if (i >= 31 && isSocModel("s5e8835", "SA8155P")) {
            mediaFormat.setInteger("priority", 1);
        }
        mediaFormat.setInteger("operating-rate", 10000);
    }

    private static void setEncoderOperatingRate(MediaFormat mediaFormat) {
        int i = Build.VERSION.SDK_INT;
        if (i < 25) {
            return;
        }
        mediaFormat.setInteger("priority", 1);
        if (i == 26) {
            mediaFormat.setInteger("operating-rate", 30);
        } else if (i >= 31 && i <= 34 && isSocModel("SM8550", "SM7450", "SM6450", "SC9863A", "T612", "T606", "T603")) {
            mediaFormat.setInteger("operating-rate", 1000);
        } else {
            mediaFormat.setInteger("operating-rate", Integer.MAX_VALUE);
        }
    }

    public boolean convertVideo(ConvertVideoParams convertVideoParams) {
        if (convertVideoParams.isSticker) {
            return WebmEncoder.convert(convertVideoParams, 0);
        }
        this.callback = convertVideoParams.callback;
        return convertVideoInternal(convertVideoParams, false, 0);
    }

    public long getLastFrameTimestamp() {
        return this.endPresentationTime;
    }

    public static class Muxer {
        public final MediaMuxer mediaMuxer;
        public final MP4Builder mp4Builder;
        private boolean started;

        public Muxer(MP4Builder mP4Builder) {
            this.started = false;
            this.mp4Builder = mP4Builder;
            this.mediaMuxer = null;
        }

        public int addTrack(MediaFormat mediaFormat, boolean z) {
            MediaMuxer mediaMuxer = this.mediaMuxer;
            if (mediaMuxer != null) {
                return mediaMuxer.addTrack(mediaFormat);
            }
            MP4Builder mP4Builder = this.mp4Builder;
            if (mP4Builder != null) {
                return mP4Builder.addTrack(mediaFormat, z);
            }
            return 0;
        }

        public void finishMovie() {
            MediaMuxer mediaMuxer = this.mediaMuxer;
            if (mediaMuxer != null) {
                mediaMuxer.stop();
                this.mediaMuxer.release();
                return;
            }
            MP4Builder mP4Builder = this.mp4Builder;
            if (mP4Builder != null) {
                mP4Builder.finishMovie();
            }
        }

        public long getLastFrameTimestamp(int i, MediaCodec.BufferInfo bufferInfo) {
            if (this.mediaMuxer != null) {
                return bufferInfo.presentationTimeUs;
            }
            MP4Builder mP4Builder = this.mp4Builder;
            if (mP4Builder != null) {
                return mP4Builder.getLastFrameTimestamp(i);
            }
            return 0L;
        }

        public void start() {
            MediaMuxer mediaMuxer = this.mediaMuxer;
            if (mediaMuxer != null) {
                mediaMuxer.start();
            }
        }

        public synchronized long writeSampleData(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, boolean z) {
            MediaMuxer mediaMuxer = this.mediaMuxer;
            if (mediaMuxer != null) {
                if (!this.started) {
                    mediaMuxer.start();
                    this.started = true;
                }
                this.mediaMuxer.writeSampleData(i, byteBuffer, bufferInfo);
                return 0L;
            }
            MP4Builder mP4Builder = this.mp4Builder;
            if (mP4Builder == null) {
                return 0L;
            }
            return mP4Builder.writeSampleData(i, byteBuffer, bufferInfo, z);
        }

        public Muxer(MediaMuxer mediaMuxer) {
            this.started = false;
            this.mp4Builder = null;
            this.mediaMuxer = mediaMuxer;
        }
    }
}
