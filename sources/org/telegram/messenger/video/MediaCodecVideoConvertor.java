package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Build;
import j7.l1;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import nh.n7;
import nh.t;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.th;
public class MediaCodecVideoConvertor {
    private static final int MEDIACODEC_TIMEOUT_DEFAULT = 2500;
    private static final int MEDIACODEC_TIMEOUT_INCREASED = 22000;
    private static final int PROCESSOR_TYPE_INTEL = 2;
    private static final int PROCESSOR_TYPE_MTK = 3;
    private static final int PROCESSOR_TYPE_OTHER = 0;
    private static final int PROCESSOR_TYPE_QCOM = 1;
    private static final int PROCESSOR_TYPE_SEC = 4;
    private static final int PROCESSOR_TYPE_TI = 5;
    private MediaController.VideoConvertorListener callback;
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
        MediaController.VideoConvertorListener callback;
        t collage;
        ArrayList<VideoEditedInfo.Part> collageParts;
        MediaController.CropState cropState;
        long duration;
        long endTime;
        int framerate;
        Integer gradientBottomColor;
        Integer gradientTopColor;
        n7 hdrInfo;
        boolean isDark;
        boolean isPhoto;
        boolean isRound;
        boolean isSecret;
        boolean isSticker;
        boolean isStory;
        ArrayList<VideoEditedInfo.MediaEntity> mediaEntities;
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
        MediaController.SavedFilterState savedFilterState;
        public ArrayList<MixedSoundInfo> soundInfos = new ArrayList<>();
        long startTime;
        long videoOffset;
        String videoPath;
        float volume;
        long wallpaperPeerId;

        private ConvertVideoParams() {
        }

        public static ConvertVideoParams of(String str, File file, long j10, int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, long j11, long j12, long j13, boolean z11, long j14, MediaController.VideoConvertorListener videoConvertorListener, VideoEditedInfo videoEditedInfo) {
            ConvertVideoParams convertVideoParams = new ConvertVideoParams();
            convertVideoParams.videoPath = str;
            convertVideoParams.videoOffset = j10;
            convertVideoParams.cacheFile = file;
            convertVideoParams.rotationValue = i10;
            convertVideoParams.isSecret = z10;
            convertVideoParams.originalWidth = i11;
            convertVideoParams.originalHeight = i12;
            convertVideoParams.resultWidth = i13;
            convertVideoParams.resultHeight = i14;
            convertVideoParams.framerate = i15;
            convertVideoParams.bitrate = i16;
            convertVideoParams.originalBitrate = i17;
            convertVideoParams.startTime = j11;
            convertVideoParams.endTime = j12;
            convertVideoParams.avatarStartTime = j13;
            convertVideoParams.needCompress = z11;
            convertVideoParams.duration = j14;
            convertVideoParams.savedFilterState = videoEditedInfo.filterState;
            convertVideoParams.paintPath = videoEditedInfo.paintPath;
            convertVideoParams.blurPath = videoEditedInfo.blurPath;
            convertVideoParams.mediaEntities = videoEditedInfo.mediaEntities;
            convertVideoParams.isPhoto = videoEditedInfo.isPhoto;
            convertVideoParams.cropState = videoEditedInfo.cropState;
            convertVideoParams.isRound = videoEditedInfo.roundVideo;
            convertVideoParams.callback = videoConvertorListener;
            convertVideoParams.gradientTopColor = videoEditedInfo.gradientTopColor;
            convertVideoParams.gradientBottomColor = videoEditedInfo.gradientBottomColor;
            convertVideoParams.muted = videoEditedInfo.muted;
            convertVideoParams.volume = videoEditedInfo.volume;
            convertVideoParams.isStory = videoEditedInfo.isStory;
            convertVideoParams.hdrInfo = videoEditedInfo.hdrInfo;
            convertVideoParams.isDark = videoEditedInfo.isDark;
            convertVideoParams.wallpaperPeerId = videoEditedInfo.wallpaperPeerId;
            convertVideoParams.account = videoEditedInfo.account;
            convertVideoParams.messagePath = videoEditedInfo.messagePath;
            convertVideoParams.messageVideoMaskPath = videoEditedInfo.messageVideoMaskPath;
            convertVideoParams.backgroundPath = videoEditedInfo.backgroundPath;
            convertVideoParams.isSticker = videoEditedInfo.isSticker;
            convertVideoParams.collage = videoEditedInfo.collage;
            convertVideoParams.collageParts = videoEditedInfo.collageParts;
            return convertVideoParams;
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

    private static void applyAudioInputs(ArrayList<MixedSoundInfo> arrayList, ArrayList<lf.a> arrayList2) {
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                MixedSoundInfo mixedSoundInfo = arrayList.get(i10);
                try {
                    lf.c cVar = new lf.c(mixedSoundInfo.audioFile);
                    AudioDecoder audioDecoder = cVar.f15214b;
                    cVar.f15211a = Math.max(0.0f, Math.min(mixedSoundInfo.volume, 1.0f));
                    long j10 = mixedSoundInfo.startTime;
                    int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                    if (i11 > 0) {
                        if (i11 < 0) {
                            j10 = 0;
                        }
                        cVar.d = j10;
                    }
                    long j11 = mixedSoundInfo.audioOffset;
                    if (j11 > 0) {
                        audioDecoder.setStartTimeUs(j11);
                    } else {
                        j11 = 0;
                    }
                    long j12 = mixedSoundInfo.duration;
                    if (j12 > 0) {
                        audioDecoder.setEndTimeUs(j11 + j12);
                    }
                    arrayList2.add(cVar);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
    }

    private void checkConversionCanceled() {
        MediaController.VideoConvertorListener videoConvertorListener = this.callback;
        if (videoConvertorListener != null && videoConvertorListener.checkConversionCanceled()) {
            throw new ConversionCanceledException();
        }
    }

    private boolean convertVideoInternal(org.telegram.messenger.video.MediaCodecVideoConvertor.ConvertVideoParams r129, boolean r130, int r131) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.MediaCodecVideoConvertor.convertVideoInternal(org.telegram.messenger.video.MediaCodecVideoConvertor$ConvertVideoParams, boolean, int):boolean");
    }

    private MediaCodec createEncoderForMimeType() {
        MediaCodec createEncoderByType;
        if (this.outputMimeType.equals("video/hevc") && Build.VERSION.SDK_INT >= 29) {
            String findGoodHevcEncoder = SharedConfig.findGoodHevcEncoder();
            if (findGoodHevcEncoder != null) {
                createEncoderByType = MediaCodec.createByCodecName(findGoodHevcEncoder);
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

    private static String createFragmentShader(int i10, int i11, int i12, int i13, boolean z10, int i14, boolean z11) {
        int i15;
        int i16;
        String str;
        if (z11) {
            i15 = i13;
        } else {
            i15 = i12;
        }
        if (z11) {
            i16 = i12;
        } else {
            i16 = i13;
        }
        float f9 = i10;
        float f10 = f9 / i15;
        float f11 = i11;
        float f12 = f11 / i16;
        int i17 = 1;
        int max = Math.max(1, Math.round(f10));
        int max2 = Math.max(1, Math.round(f12));
        if (SharedConfig.deviceIsAverage()) {
            max2 = 1;
        } else {
            i17 = max;
        }
        int min = Math.min(i14, i17);
        int min2 = Math.min(i14, max2);
        float f13 = f10 / min;
        float f14 = f12 / min2;
        float f15 = (-(min - 1)) / 2.0f;
        float f16 = (-(min2 - 1)) / 2.0f;
        if ((min & 1) == 0) {
            f15 += 0.01f;
        }
        if ((min2 & 1) == 0) {
            f16 += 0.01f;
        }
        StringBuilder o10 = com.google.android.recaptcha.internal.a.o("source size ", i10, "x", i11, "    dest size ");
        l1.w(o10, i12, "x", i13, "   rotated ");
        o10.append(z11);
        o10.append("   ratio ");
        o10.append(f10);
        o10.append("x");
        o10.append(f12);
        o10.append("   samples ");
        o10.append(min);
        o10.append("x");
        o10.append(min2);
        o10.append("   kernel scale ");
        o10.append(f13);
        o10.append("x");
        o10.append(f14);
        FileLog.d(o10.toString());
        String glslFloat = glslFloat(f15);
        String glslFloat2 = glslFloat(f16);
        String glslFloat3 = glslFloat(f13);
        String glslFloat4 = glslFloat(f14);
        String glslFloat5 = glslFloat(min * min2);
        String glslFloat6 = glslFloat(1.0f / f9);
        String glslFloat7 = glslFloat(1.0f / f11);
        if (z10) {
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
        th.w(sb2, ";\nconst float kernelScaleX = ", glslFloat3, ";\nconst float kernelScaleY = ", glslFloat4);
        th.w(sb2, ";\nconst float weightsum = ", glslFloat5, ";\nconst float pixelSizeX = ", glslFloat6);
        sb2.append(";\nconst float pixelSizeY = ");
        sb2.append(glslFloat7);
        sb2.append(";\nvoid main() {\n    vec3 accumulation = vec3(0.0);\n    for (int i = 0; i < ");
        sb2.append(min);
        sb2.append("; ++i) {\n        for (int j = 0; j < ");
        sb2.append(min2);
        sb2.append("; ++j) {\n            float x = (offsetX + float(i)) * kernelScaleX;\n            float y = (offsetY + float(j)) * kernelScaleY;\n            vec2 uv = vTextureCoord + vec2(\n                    x * pixelSizeX,\n                    y * pixelSizeY\n            );\n            accumulation += ");
        sb2.append("texture2D(sTexture, uv).rgb");
        sb2.append(";\n        }\n    }\n    gl_FragColor = vec4(accumulation / weightsum, 1.0);\n}\n");
        return sb2.toString();
    }

    public static void cutOfNalData(String str, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i10;
        if (str.equals("video/hevc")) {
            i10 = 3;
        } else {
            i10 = 1;
        }
        if (bufferInfo.size > 100) {
            byteBuffer.position(bufferInfo.offset);
            byte[] bArr = new byte[100];
            byteBuffer.get(bArr);
            int i11 = 0;
            for (int i12 = 0; i12 < 96; i12++) {
                if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 0 && bArr[i12 + 3] == 1 && (i11 = i11 + 1) > i10) {
                    bufferInfo.offset += i12;
                    bufferInfo.size -= i12;
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

    private static String glslFloat(float f9) {
        boolean z10;
        if (f9 < 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f9 = -f9;
        }
        long round = Math.round(f9 * 1000000.0f);
        long j10 = round / 1000000;
        long j11 = round % 1000000;
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append('-');
        }
        sb2.append(j10);
        sb2.append('.');
        String valueOf = String.valueOf(j11);
        for (int length = valueOf.length(); length < 6; length++) {
            sb2.append('0');
        }
        sb2.append(valueOf);
        return sb2.toString();
    }

    private static String hdrFragmentShader(int i10, int i11, int i12, int i13, boolean z10, n7 n7Var, int i14, boolean z11) {
        int i15;
        int i16;
        String readRes;
        if (!z10) {
            return createFragmentShader(i10, i11, i12, i13, false, i14, z11);
        }
        if (z11) {
            i15 = i13;
        } else {
            i15 = i12;
        }
        if (z11) {
            i16 = i12;
        } else {
            i16 = i13;
        }
        float f9 = i10;
        float f10 = f9 / i15;
        float f11 = i11;
        float f12 = f11 / i16;
        int max = Math.max(1, Math.round(f10));
        int max2 = Math.max(1, Math.round(f12));
        if (SharedConfig.deviceIsAverage()) {
            max = 1;
            max2 = 1;
        }
        int min = Math.min(i14, max);
        int min2 = Math.min(i14, max2);
        float f13 = f10 / min;
        float f14 = f12 / min2;
        float f15 = (-(min - 1)) / 2.0f;
        float f16 = (-(min2 - 1)) / 2.0f;
        if ((min & 1) == 0) {
            f15 += 0.01f;
        }
        if ((min2 & 1) == 0) {
            f16 += 0.01f;
        }
        StringBuilder o10 = com.google.android.recaptcha.internal.a.o("HDR source size ", i10, "x", i11, "    dest size ");
        l1.w(o10, i12, "x", i13, "   rotated ");
        o10.append(z11);
        o10.append("   ratio ");
        o10.append(f10);
        o10.append("x");
        o10.append(f12);
        o10.append("   samples ");
        o10.append(min);
        o10.append("x");
        o10.append(min2);
        o10.append("   kernel scale ");
        o10.append(f13);
        o10.append("x");
        o10.append(f14);
        FileLog.d(o10.toString());
        String glslFloat = glslFloat(f15);
        String glslFloat2 = glslFloat(f16);
        String glslFloat3 = glslFloat(f13);
        String glslFloat4 = glslFloat(f14);
        String glslFloat5 = glslFloat(min * min2);
        String glslFloat6 = glslFloat(1.0f / f9);
        String glslFloat7 = glslFloat(1.0f / f11);
        if (n7Var.a() == 1) {
            readRes = AndroidUtilities.readRes(R.raw.hdr2sdr_hlg);
        } else {
            readRes = AndroidUtilities.readRes(R.raw.hdr2sdr_pq);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(readRes);
        sb2.append("\nvarying vec2 vTextureCoord;\nconst float offsetX = ");
        sb2.append(glslFloat);
        sb2.append(";\nconst float offsetY = ");
        sb2.append(glslFloat2);
        th.w(sb2, ";\nconst float kernelScaleX = ", glslFloat3, ";\nconst float kernelScaleY = ", glslFloat4);
        th.w(sb2, ";\nconst float weightsum = ", glslFloat5, ";\nconst float pixelSizeX = ", glslFloat6);
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

    private long readAndWriteTracks(android.media.MediaExtractor r30, org.telegram.messenger.video.MediaCodecVideoConvertor.Muxer r31, android.media.MediaCodec.BufferInfo r32, long r33, long r35, long r37, java.io.File r39, boolean r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.MediaCodecVideoConvertor.readAndWriteTracks(android.media.MediaExtractor, org.telegram.messenger.video.MediaCodecVideoConvertor$Muxer, android.media.MediaCodec$BufferInfo, long, long, long, java.io.File, boolean):long");
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

        public int addTrack(MediaFormat mediaFormat, boolean z10) {
            MediaMuxer mediaMuxer = this.mediaMuxer;
            if (mediaMuxer != null) {
                return mediaMuxer.addTrack(mediaFormat);
            }
            MP4Builder mP4Builder = this.mp4Builder;
            if (mP4Builder != null) {
                return mP4Builder.addTrack(mediaFormat, z10);
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

        public long getLastFrameTimestamp(int i10, MediaCodec.BufferInfo bufferInfo) {
            if (this.mediaMuxer != null) {
                return bufferInfo.presentationTimeUs;
            }
            MP4Builder mP4Builder = this.mp4Builder;
            if (mP4Builder != null) {
                return mP4Builder.getLastFrameTimestamp(i10);
            }
            return 0L;
        }

        public void start() {
            MediaMuxer mediaMuxer = this.mediaMuxer;
            if (mediaMuxer != null) {
                mediaMuxer.start();
            }
        }

        public long writeSampleData(int i10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, boolean z10) {
            MediaMuxer mediaMuxer = this.mediaMuxer;
            if (mediaMuxer != null) {
                if (!this.started) {
                    mediaMuxer.start();
                    this.started = true;
                }
                this.mediaMuxer.writeSampleData(i10, byteBuffer, bufferInfo);
                return 0L;
            }
            MP4Builder mP4Builder = this.mp4Builder;
            if (mP4Builder == null) {
                return 0L;
            }
            return mP4Builder.writeSampleData(i10, byteBuffer, bufferInfo, z10);
        }

        public Muxer(MediaMuxer mediaMuxer) {
            this.started = false;
            this.mp4Builder = null;
            this.mediaMuxer = mediaMuxer;
        }
    }
}
