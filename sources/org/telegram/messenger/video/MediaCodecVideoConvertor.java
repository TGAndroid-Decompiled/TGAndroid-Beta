package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Build;
import fi.d7;
import fi.t;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.h20;
import org.telegram.messenger.hf;
import org.telegram.messenger.i20;
import org.telegram.messenger.iz;
import org.telegram.messenger.j20;
import org.telegram.messenger.mf;
import org.telegram.messenger.re;
import org.telegram.messenger.ye;
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
    private mf callback;
    private long endPresentationTime;
    private MediaExtractor extractor;
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
        mf callback;
        t collage;
        ArrayList<i20> collageParts;
        ye cropState;
        long duration;
        long endTime;
        int framerate;
        Integer gradientBottomColor;
        Integer gradientTopColor;
        d7 hdrInfo;
        boolean isDark;
        boolean isPhoto;
        boolean isRound;
        boolean isSecret;
        boolean isSticker;
        boolean isStory;
        ArrayList<h20> mediaEntities;
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
        hf savedFilterState;
        public ArrayList<MixedSoundInfo> soundInfos = new ArrayList<>();
        long startTime;
        long videoOffset;
        String videoPath;
        float volume;
        long wallpaperPeerId;

        private ConvertVideoParams() {
        }

        public static ConvertVideoParams of(String str, File file, long j3, int i7, boolean z9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, long j11, long j12, boolean z10, long j13, mf mfVar, j20 j20Var) {
            ConvertVideoParams convertVideoParams = new ConvertVideoParams();
            convertVideoParams.videoPath = str;
            convertVideoParams.videoOffset = j3;
            convertVideoParams.cacheFile = file;
            convertVideoParams.rotationValue = i7;
            convertVideoParams.isSecret = z9;
            convertVideoParams.originalWidth = i10;
            convertVideoParams.originalHeight = i11;
            convertVideoParams.resultWidth = i12;
            convertVideoParams.resultHeight = i13;
            convertVideoParams.framerate = i14;
            convertVideoParams.bitrate = i15;
            convertVideoParams.originalBitrate = i16;
            convertVideoParams.startTime = j10;
            convertVideoParams.endTime = j11;
            convertVideoParams.avatarStartTime = j12;
            convertVideoParams.needCompress = z10;
            convertVideoParams.duration = j13;
            convertVideoParams.savedFilterState = j20Var.A;
            convertVideoParams.paintPath = j20Var.B;
            convertVideoParams.blurPath = j20Var.C;
            convertVideoParams.mediaEntities = j20Var.G;
            convertVideoParams.isPhoto = j20Var.I;
            convertVideoParams.cropState = j20Var.H;
            convertVideoParams.isRound = j20Var.f23461s;
            convertVideoParams.callback = mfVar;
            convertVideoParams.gradientTopColor = j20Var.Q;
            convertVideoParams.gradientBottomColor = j20Var.R;
            convertVideoParams.muted = j20Var.f23462t;
            convertVideoParams.volume = j20Var.f23463u;
            convertVideoParams.isStory = j20Var.J;
            convertVideoParams.hdrInfo = j20Var.K;
            convertVideoParams.isDark = j20Var.T;
            convertVideoParams.wallpaperPeerId = j20Var.U;
            convertVideoParams.account = j20Var.S;
            convertVideoParams.messagePath = j20Var.D;
            convertVideoParams.messageVideoMaskPath = j20Var.E;
            convertVideoParams.backgroundPath = j20Var.F;
            convertVideoParams.isSticker = j20Var.N;
            convertVideoParams.collage = j20Var.L;
            convertVideoParams.collageParts = j20Var.M;
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

        public DecoderFeeder(MediaExtractor mediaExtractor, MediaCodec mediaCodec, int i7, int i10, Muxer muxer, int i11, long j3, long j10, float f10, ByteBuffer byteBuffer, int i12) {
            super("DecoderFeeder");
            this.extractor = mediaExtractor;
            this.decoder = mediaCodec;
            this.videoIndex = i7;
            this.audioIndex = i10;
            this.muxer = muxer;
            this.audioTrackIndex = i11;
            this.startTime = j3;
            this.endTime = j10;
            this.durationS = f10;
            this.audioBuffer = byteBuffer;
            this.maxBufferSize = i12;
        }

        public void finish() {
            this.stopFeeding = true;
            try {
                join();
            } catch (InterruptedException e10) {
                a8.g(e10, true);
            }
        }

        @Override
        public void run() {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            long j3 = 0;
            while (!this.stopFeeding) {
                try {
                    if (MediaCodecVideoConvertor.this.callback != null && ((j20) ((re) MediaCodecVideoConvertor.this.callback).f25272b).W) {
                        return;
                    }
                    int sampleTrackIndex = this.extractor.getSampleTrackIndex();
                    if (sampleTrackIndex == this.videoIndex) {
                        int dequeueInputBuffer = this.decoder.dequeueInputBuffer(2500L);
                        if (dequeueInputBuffer >= 0) {
                            int readSampleData = this.extractor.readSampleData(this.decoder.getInputBuffer(dequeueInputBuffer), 0);
                            if (readSampleData < 0) {
                                this.decoder.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                                return;
                            } else {
                                this.decoder.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, this.extractor.getSampleTime(), 0);
                                this.extractor.advance();
                            }
                        }
                    } else {
                        int i7 = this.audioIndex;
                        if (i7 != -1 && sampleTrackIndex == i7) {
                            if (Build.VERSION.SDK_INT >= 28) {
                                long sampleSize = this.extractor.getSampleSize();
                                if (sampleSize > this.maxBufferSize) {
                                    int i10 = (int) (sampleSize + 1024);
                                    this.maxBufferSize = i10;
                                    this.audioBuffer = ByteBuffer.allocateDirect(i10);
                                }
                            }
                            int readSampleData2 = this.extractor.readSampleData(this.audioBuffer, 0);
                            bufferInfo.size = readSampleData2;
                            if (readSampleData2 >= 0) {
                                bufferInfo.presentationTimeUs = this.extractor.getSampleTime();
                                this.extractor.advance();
                                if (bufferInfo.size > 0) {
                                    long j10 = this.endTime;
                                    if (j10 < 0 || bufferInfo.presentationTimeUs < j10) {
                                        bufferInfo.offset = 0;
                                        bufferInfo.flags = this.extractor.getSampleFlags();
                                        synchronized (this.muxer) {
                                            long writeSampleData = this.muxer.writeSampleData(this.audioTrackIndex, this.audioBuffer, bufferInfo, false);
                                            if (writeSampleData != 0 && MediaCodecVideoConvertor.this.callback != null) {
                                                long j11 = bufferInfo.presentationTimeUs - this.startTime;
                                                if (j11 > j3) {
                                                    j3 = j11;
                                                }
                                                ((re) MediaCodecVideoConvertor.this.callback).k(writeSampleData, (((float) j3) / 1000.0f) / this.durationS);
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
                } catch (Throwable th2) {
                    this.error = th2;
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

    private static void applyAudioInputs(ArrayList<MixedSoundInfo> arrayList, ArrayList<dg.a> arrayList2) {
        if (arrayList != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                MixedSoundInfo mixedSoundInfo = arrayList.get(i7);
                try {
                    dg.c cVar = new dg.c(mixedSoundInfo.audioFile);
                    AudioDecoder audioDecoder = cVar.f8693b;
                    cVar.f8690a = Math.max(0.0f, Math.min(mixedSoundInfo.volume, 1.0f));
                    long j3 = mixedSoundInfo.startTime;
                    int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                    if (i10 > 0) {
                        if (i10 < 0) {
                            j3 = 0;
                        }
                        cVar.d = j3;
                    }
                    long j10 = mixedSoundInfo.audioOffset;
                    if (j10 > 0) {
                        audioDecoder.setStartTimeUs(j10);
                    } else {
                        j10 = 0;
                    }
                    long j11 = mixedSoundInfo.duration;
                    if (j11 > 0) {
                        audioDecoder.setEndTimeUs(j10 + j11);
                    }
                    arrayList2.add(cVar);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    private void checkConversionCanceled() {
        mf mfVar = this.callback;
        if (mfVar != null && ((j20) ((re) mfVar).f25272b).W) {
            throw new ConversionCanceledException();
        }
    }

    private boolean convertVideoInternal(org.telegram.messenger.video.MediaCodecVideoConvertor.ConvertVideoParams r116, boolean r117, int r118) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.MediaCodecVideoConvertor.convertVideoInternal(org.telegram.messenger.video.MediaCodecVideoConvertor$ConvertVideoParams, boolean, int):boolean");
    }

    private MediaCodec createEncoderForMimeType() {
        MediaCodec createEncoderByType;
        if (this.outputMimeType.equals("video/hevc") && Build.VERSION.SDK_INT >= 29) {
            String l10 = iz.l();
            if (l10 != null) {
                createEncoderByType = MediaCodec.createByCodecName(l10);
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

    private static String createFragmentShader(int i7, int i10, int i11, int i12, boolean z9, int i13, boolean z10) {
        int i14;
        int i15;
        String str;
        if (z10) {
            i14 = i12;
        } else {
            i14 = i11;
        }
        if (z10) {
            i15 = i11;
        } else {
            i15 = i12;
        }
        float f10 = i7;
        float f11 = f10 / i14;
        float f12 = i10;
        float f13 = f12 / i15;
        int i16 = 1;
        int max = Math.max(1, Math.round(f11));
        int max2 = Math.max(1, Math.round(f13));
        if (iz.o() <= 1) {
            max2 = 1;
        } else {
            i16 = max;
        }
        int min = Math.min(i13, i16);
        int min2 = Math.min(i13, max2);
        float f14 = f11 / min;
        float f15 = f13 / min2;
        float f16 = (-(min - 1)) / 2.0f;
        float f17 = (-(min2 - 1)) / 2.0f;
        if ((min & 1) == 0) {
            f16 += 0.01f;
        }
        if ((min2 & 1) == 0) {
            f17 += 0.01f;
        }
        StringBuilder o4 = jg.g.o("source size ", i7, "x", i10, "    dest size ");
        jg.g.x(o4, i11, "x", i12, "   rotated ");
        o4.append(z10);
        o4.append("   ratio ");
        o4.append(f11);
        o4.append("x");
        o4.append(f13);
        o4.append("   samples ");
        o4.append(min);
        o4.append("x");
        o4.append(min2);
        o4.append("   kernel scale ");
        o4.append(f14);
        o4.append("x");
        o4.append(f15);
        a8.b(o4.toString());
        String glslFloat = glslFloat(f16);
        String glslFloat2 = glslFloat(f17);
        String glslFloat3 = glslFloat(f14);
        String glslFloat4 = glslFloat(f15);
        String glslFloat5 = glslFloat(min * min2);
        String glslFloat6 = glslFloat(1.0f / f10);
        String glslFloat7 = glslFloat(1.0f / f12);
        if (z9) {
            str = "#extension GL_OES_EGL_image_external : require\nuniform samplerExternalOES sTexture;\n";
        } else {
            str = "uniform sampler2D sTexture;\n";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("precision highp float;\nvarying vec2 vTextureCoord;\nconst float offsetX = ");
        sb2.append(glslFloat);
        sb2.append(";\nconst float offsetY = ");
        sb2.append(glslFloat2);
        com.google.android.recaptcha.internal.a.s(sb2, ";\nconst float kernelScaleX = ", glslFloat3, ";\nconst float kernelScaleY = ", glslFloat4);
        com.google.android.recaptcha.internal.a.s(sb2, ";\nconst float weightsum = ", glslFloat5, ";\nconst float pixelSizeX = ", glslFloat6);
        sb2.append(";\nconst float pixelSizeY = ");
        sb2.append(glslFloat7);
        sb2.append(";\nvoid main() {\n    vec3 accumulation = vec3(0.0);\n    for (int i = 0; i < ");
        sb2.append(min);
        sb2.append("; ++i) {\n        for (int j = 0; j < ");
        sb2.append(min2);
        sb2.append("; ++j) {\n            float x = (offsetX + float(i)) * kernelScaleX;\n            float y = (offsetY + float(j)) * kernelScaleY;\n            vec2 uv = vTextureCoord + vec2(\n                    x * pixelSizeX,\n                    y * pixelSizeY\n            );\n            accumulation += texture2D(sTexture, uv).rgb;\n        }\n    }\n    gl_FragColor = vec4(accumulation / weightsum, 1.0);\n}\n");
        return sb2.toString();
    }

    public static void cutOfNalData(String str, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i7;
        if (str.equals("video/hevc")) {
            i7 = 3;
        } else {
            i7 = 1;
        }
        if (bufferInfo.size > 100) {
            byteBuffer.position(bufferInfo.offset);
            byte[] bArr = new byte[100];
            byteBuffer.get(bArr);
            int i10 = 0;
            for (int i11 = 0; i11 < 96; i11++) {
                if (bArr[i11] == 0 && bArr[i11 + 1] == 0 && bArr[i11 + 2] == 0 && bArr[i11 + 3] == 1 && (i10 = i10 + 1) > i7) {
                    bufferInfo.offset += i11;
                    bufferInfo.size -= i11;
                    return;
                }
            }
        }
    }

    private MediaCodec getDecoderByFormat(MediaFormat mediaFormat) {
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
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            }
            throw new RuntimeException(exc);
        }
        throw new RuntimeException("getDecoderByFormat: format is null");
    }

    private static String glslFloat(float f10) {
        boolean z9;
        if (f10 < 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            f10 = -f10;
        }
        long round = Math.round(f10 * 1000000.0f);
        long j3 = round / 1000000;
        long j10 = round % 1000000;
        StringBuilder sb2 = new StringBuilder();
        if (z9) {
            sb2.append('-');
        }
        sb2.append(j3);
        sb2.append('.');
        String valueOf = String.valueOf(j10);
        for (int length = valueOf.length(); length < 6; length++) {
            sb2.append('0');
        }
        sb2.append(valueOf);
        return sb2.toString();
    }

    private static String hdrFragmentShader(int i7, int i10, int i11, int i12, boolean z9, d7 d7Var, int i13, boolean z10) {
        int i14;
        int i15;
        String y22;
        if (!z9) {
            return createFragmentShader(i7, i10, i11, i12, false, i13, z10);
        }
        if (z10) {
            i14 = i12;
        } else {
            i14 = i11;
        }
        if (z10) {
            i15 = i11;
        } else {
            i15 = i12;
        }
        float f10 = i7;
        float f11 = f10 / i14;
        float f12 = i10;
        float f13 = f12 / i15;
        int max = Math.max(1, Math.round(f11));
        int max2 = Math.max(1, Math.round(f13));
        if (iz.o() <= 1) {
            max = 1;
            max2 = 1;
        }
        int min = Math.min(i13, max);
        int min2 = Math.min(i13, max2);
        float f14 = f11 / min;
        float f15 = f13 / min2;
        float f16 = (-(min - 1)) / 2.0f;
        float f17 = (-(min2 - 1)) / 2.0f;
        if ((min & 1) == 0) {
            f16 += 0.01f;
        }
        if ((min2 & 1) == 0) {
            f17 += 0.01f;
        }
        StringBuilder o4 = jg.g.o("HDR source size ", i7, "x", i10, "    dest size ");
        jg.g.x(o4, i11, "x", i12, "   rotated ");
        o4.append(z10);
        o4.append("   ratio ");
        o4.append(f11);
        o4.append("x");
        o4.append(f13);
        o4.append("   samples ");
        o4.append(min);
        o4.append("x");
        o4.append(min2);
        o4.append("   kernel scale ");
        o4.append(f14);
        o4.append("x");
        o4.append(f15);
        a8.b(o4.toString());
        String glslFloat = glslFloat(f16);
        String glslFloat2 = glslFloat(f17);
        String glslFloat3 = glslFloat(f14);
        String glslFloat4 = glslFloat(f15);
        String glslFloat5 = glslFloat(min * min2);
        String glslFloat6 = glslFloat(1.0f / f10);
        String glslFloat7 = glslFloat(1.0f / f12);
        if (d7Var.a() == 1) {
            y22 = g0.y2(null, 2131624045);
        } else {
            y22 = g0.y2(null, 2131624046);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(y22);
        sb2.append("\nvarying vec2 vTextureCoord;\nconst float offsetX = ");
        sb2.append(glslFloat);
        sb2.append(";\nconst float offsetY = ");
        sb2.append(glslFloat2);
        com.google.android.recaptcha.internal.a.s(sb2, ";\nconst float kernelScaleX = ", glslFloat3, ";\nconst float kernelScaleY = ", glslFloat4);
        com.google.android.recaptcha.internal.a.s(sb2, ";\nconst float weightsum = ", glslFloat5, ";\nconst float pixelSizeX = ", glslFloat6);
        sb2.append(";\nconst float pixelSizeY = ");
        sb2.append(glslFloat7);
        sb2.append(";\nvoid main() {\n    vec3 accumulation = vec3(0.0);\n    for (int i = 0; i < ");
        sb2.append(min);
        sb2.append("; ++i) {\n        for (int j = 0; j < ");
        sb2.append(min2);
        sb2.append("; ++j) {\n            float x = (offsetX + float(i)) * kernelScaleX;\n            float y = (offsetY + float(j)) * kernelScaleY;\n            vec2 uv = vTextureCoord + vec2(\n                    x * pixelSizeX,\n                    y * pixelSizeY\n            );\n            accumulation += TEX(uv).rgb;\n        }\n    }\n    gl_FragColor = vec4(accumulation / weightsum, 1.0);\n}\n");
        return sb2.toString();
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
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 25) {
            return;
        }
        if (i7 >= 31 && isSocModel("s5e8835", "SA8155P")) {
            mediaFormat.setInteger("priority", 1);
        }
        mediaFormat.setInteger("operating-rate", 10000);
    }

    private static void setEncoderOperatingRate(MediaFormat mediaFormat) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 25) {
            return;
        }
        mediaFormat.setInteger("priority", 1);
        if (i7 == 26) {
            mediaFormat.setInteger("operating-rate", 30);
        } else if (i7 >= 31 && i7 <= 34 && isSocModel("SM8550", "SM7450", "SM6450", "SC9863A", "T612", "T606", "T603")) {
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

        public int addTrack(MediaFormat mediaFormat, boolean z9) {
            MediaMuxer mediaMuxer = this.mediaMuxer;
            if (mediaMuxer != null) {
                return mediaMuxer.addTrack(mediaFormat);
            }
            MP4Builder mP4Builder = this.mp4Builder;
            if (mP4Builder != null) {
                return mP4Builder.addTrack(mediaFormat, z9);
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

        public long getLastFrameTimestamp(int i7, MediaCodec.BufferInfo bufferInfo) {
            if (this.mediaMuxer != null) {
                return bufferInfo.presentationTimeUs;
            }
            MP4Builder mP4Builder = this.mp4Builder;
            if (mP4Builder != null) {
                return mP4Builder.getLastFrameTimestamp(i7);
            }
            return 0L;
        }

        public void start() {
            MediaMuxer mediaMuxer = this.mediaMuxer;
            if (mediaMuxer != null) {
                mediaMuxer.start();
            }
        }

        public synchronized long writeSampleData(int i7, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, boolean z9) {
            try {
                MediaMuxer mediaMuxer = this.mediaMuxer;
                if (mediaMuxer != null) {
                    if (!this.started) {
                        mediaMuxer.start();
                        this.started = true;
                    }
                    this.mediaMuxer.writeSampleData(i7, byteBuffer, bufferInfo);
                    return 0L;
                }
                MP4Builder mP4Builder = this.mp4Builder;
                if (mP4Builder == null) {
                    return 0L;
                }
                return mP4Builder.writeSampleData(i7, byteBuffer, bufferInfo, z9);
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public Muxer(MediaMuxer mediaMuxer) {
            this.started = false;
            this.mp4Builder = null;
            this.mediaMuxer = mediaMuxer;
        }
    }
}
