package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.video.audio_input.AudioInput;
import org.telegram.messenger.video.audio_input.GeneralAudioInput;
import org.telegram.ui.Stories.recorder.CollageLayout;
import org.telegram.ui.Stories.recorder.StoryEntry;

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

    private boolean convertVideoInternal(org.telegram.messenger.video.MediaCodecVideoConvertor.ConvertVideoParams r107, boolean r108, int r109) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.MediaCodecVideoConvertor.convertVideoInternal(org.telegram.messenger.video.MediaCodecVideoConvertor$ConvertVideoParams, boolean, int):boolean");
    }

    private static void applyAudioInputs(ArrayList<MixedSoundInfo> arrayList, ArrayList<AudioInput> arrayList2) {
        if (arrayList == null) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            MixedSoundInfo mixedSoundInfo = arrayList.get(i);
            try {
                GeneralAudioInput generalAudioInput = new GeneralAudioInput(mixedSoundInfo.audioFile);
                generalAudioInput.setVolume(mixedSoundInfo.volume);
                long j = mixedSoundInfo.startTime;
                if (j > 0) {
                    generalAudioInput.setStartOffsetUs(j);
                }
                long j2 = mixedSoundInfo.audioOffset;
                if (j2 > 0) {
                    generalAudioInput.setStartTimeUs(j2);
                } else {
                    j2 = 0;
                }
                long j3 = mixedSoundInfo.duration;
                if (j3 > 0) {
                    generalAudioInput.setEndTimeUs(j2 + j3);
                }
                arrayList2.add(generalAudioInput);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    private MediaCodec createEncoderForMimeType() throws IOException {
        MediaCodec mediaCodecCreateEncoderByType;
        if (this.outputMimeType.equals("video/hevc") && Build.VERSION.SDK_INT >= 29) {
            String strFindGoodHevcEncoder = SharedConfig.findGoodHevcEncoder();
            mediaCodecCreateEncoderByType = strFindGoodHevcEncoder != null ? MediaCodec.createByCodecName(strFindGoodHevcEncoder) : null;
        } else {
            if (this.outputMimeType.equals("video/hevc")) {
                this.outputMimeType = "video/avc";
            }
            mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(this.outputMimeType);
        }
        if (mediaCodecCreateEncoderByType != null || !this.outputMimeType.equals("video/hevc")) {
            return mediaCodecCreateEncoderByType;
        }
        this.outputMimeType = "video/avc";
        return MediaCodec.createEncoderByType("video/avc");
    }

    public static void cutOfNalData(String str, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i = str.equals("video/hevc") ? 3 : 1;
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

    private boolean isMediatekAvcEncoder(MediaCodec mediaCodec) {
        return mediaCodec.getName().equals("c2.mtk.avc.encoder");
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

        public Muxer(MediaMuxer mediaMuxer) {
            this.started = false;
            this.mp4Builder = null;
            this.mediaMuxer = mediaMuxer;
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

        public long writeSampleData(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, boolean z) {
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
            if (mP4Builder != null) {
                return mP4Builder.writeSampleData(i, byteBuffer, bufferInfo, z);
            }
            return 0L;
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

        public void finishMovie() {
            MediaMuxer mediaMuxer = this.mediaMuxer;
            if (mediaMuxer != null) {
                mediaMuxer.stop();
                this.mediaMuxer.release();
            } else {
                MP4Builder mP4Builder = this.mp4Builder;
                if (mP4Builder != null) {
                    mP4Builder.finishMovie();
                }
            }
        }
    }

    private long readAndWriteTracks(MediaExtractor mediaExtractor, Muxer muxer, MediaCodec.BufferInfo bufferInfo, long j, long j2, long j3, File file, boolean z) {
        int iMax;
        int iAddTrack;
        int iAddTrack2;
        int i;
        int i2;
        int i3;
        boolean z2;
        byte[] bArrArray;
        int iLimit;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int integer;
        int i10 = 0;
        int iFindTrack = MediaController.findTrack(mediaExtractor, false);
        int iFindTrack2 = z ? MediaController.findTrack(mediaExtractor, true) : -1;
        float f = j3 / 1000.0f;
        if (iFindTrack >= 0) {
            mediaExtractor.selectTrack(iFindTrack);
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(iFindTrack);
            iAddTrack = muxer.addTrack(trackFormat, false);
            try {
                integer = trackFormat.getInteger("max-input-size");
            } catch (Exception e) {
                FileLog.e(e);
                integer = 0;
            }
            if (j > 0) {
                mediaExtractor.seekTo(j, 0);
            } else {
                mediaExtractor.seekTo(0L, 0);
            }
            iMax = integer;
        } else {
            iMax = 0;
            iAddTrack = -1;
        }
        if (iFindTrack2 >= 0) {
            mediaExtractor.selectTrack(iFindTrack2);
            MediaFormat trackFormat2 = mediaExtractor.getTrackFormat(iFindTrack2);
            if (trackFormat2.getString("mime").equals("audio/unknown")) {
                iAddTrack2 = -1;
                iFindTrack2 = -1;
            } else {
                iAddTrack2 = muxer.addTrack(trackFormat2, true);
                try {
                    iMax = Math.max(trackFormat2.getInteger("max-input-size"), iMax);
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
                if (j > 0) {
                    mediaExtractor.seekTo(j, 0);
                } else {
                    mediaExtractor.seekTo(0L, 0);
                }
            }
        } else {
            iAddTrack2 = -1;
        }
        if (iMax <= 0) {
            iMax = 65536;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(iMax);
        long j4 = -1;
        if (iFindTrack2 < 0 && iFindTrack < 0) {
            return -1L;
        }
        checkConversionCanceled();
        long j5 = -1;
        boolean z3 = false;
        long j6 = 0;
        while (!z3) {
            checkConversionCanceled();
            j4 = j4;
            if (Build.VERSION.SDK_INT >= 28) {
                long sampleSize = mediaExtractor.getSampleSize();
                i = iFindTrack2;
                if (sampleSize > iMax) {
                    int i11 = (int) (sampleSize + 1024);
                    iMax = i11;
                    byteBufferAllocateDirect = ByteBuffer.allocateDirect(i11);
                }
            } else {
                i = iFindTrack2;
            }
            bufferInfo.size = mediaExtractor.readSampleData(byteBufferAllocateDirect, i10);
            int sampleTrackIndex = mediaExtractor.getSampleTrackIndex();
            iFindTrack2 = i;
            if (sampleTrackIndex == iFindTrack) {
                i3 = iAddTrack;
            } else {
                if (sampleTrackIndex == iFindTrack2) {
                    i3 = iAddTrack2;
                } else {
                    i2 = -1;
                    i3 = -1;
                }
                if (i3 != i2) {
                    if (sampleTrackIndex != iFindTrack2 && (bArrArray = byteBufferAllocateDirect.array()) != null) {
                        int iArrayOffset = byteBufferAllocateDirect.arrayOffset();
                        iLimit = iArrayOffset + byteBufferAllocateDirect.limit();
                        i4 = iArrayOffset;
                        i5 = -1;
                        while (true) {
                            i6 = iLimit - 4;
                            if (i4 <= i6) {
                                break;
                            }
                            if (bArrArray[i4] != 0 && bArrArray[i4 + 1] == 0 && bArrArray[i4 + 2] == 0) {
                                i7 = iAddTrack2;
                                i8 = iMax;
                                if (bArrArray[i4 + 3] == 1) {
                                    if (i5 != -1) {
                                        int i12 = i4 - i5;
                                        if (i4 != i6) {
                                            i9 = 4;
                                        } else {
                                            i9 = 0;
                                        }
                                        int i13 = i12 - i9;
                                        bArrArray[i5] = (byte) (i13 >> 24);
                                        bArrArray[i5 + 1] = (byte) (i13 >> 16);
                                        bArrArray[i5 + 2] = (byte) (i13 >> 8);
                                        bArrArray[i5 + 3] = (byte) i13;
                                    }
                                    i5 = i4;
                                }
                                i4++;
                                iAddTrack2 = i7;
                                iMax = i8;
                            } else {
                                i7 = iAddTrack2;
                                i8 = iMax;
                            }
                            if (i4 == i6) {
                                if (i5 != -1) {
                                    int i14 = i4 - i5;
                                    if (i4 != i6) {
                                        i9 = 4;
                                    } else {
                                        i9 = 0;
                                    }
                                    int i15 = i14 - i9;
                                    bArrArray[i5] = (byte) (i15 >> 24);
                                    bArrArray[i5 + 1] = (byte) (i15 >> 16);
                                    bArrArray[i5 + 2] = (byte) (i15 >> 8);
                                    bArrArray[i5 + 3] = (byte) i15;
                                }
                                i5 = i4;
                            }
                            i4++;
                            iAddTrack2 = i7;
                            iMax = i8;
                        }
                    }
                    iAddTrack2 = iAddTrack2;
                    iMax = iMax;
                    if (bufferInfo.size >= 0) {
                        bufferInfo.presentationTimeUs = mediaExtractor.getSampleTime();
                        z2 = false;
                    } else {
                        bufferInfo.size = 0;
                        z2 = true;
                    }
                    if (bufferInfo.size <= 0 && !z2) {
                        if (sampleTrackIndex == iFindTrack && j > 0 && j5 == j4) {
                            j5 = bufferInfo.presentationTimeUs;
                        }
                        if (j2 < 0 || bufferInfo.presentationTimeUs < j2) {
                            bufferInfo.offset = 0;
                            bufferInfo.flags = mediaExtractor.getSampleFlags();
                            long jWriteSampleData = muxer.writeSampleData(i3, byteBufferAllocateDirect, bufferInfo, false);
                            if (jWriteSampleData != 0) {
                                MediaController.VideoConvertorListener videoConvertorListener = this.callback;
                                if (videoConvertorListener != null) {
                                    long j7 = bufferInfo.presentationTimeUs - j5;
                                    if (j7 <= j6) {
                                        j7 = j6;
                                    }
                                    videoConvertorListener.didWriteData(jWriteSampleData, (j7 / 1000.0f) / f);
                                    j6 = j7;
                                }
                            }
                        } else {
                            z2 = true;
                        }
                    }
                    if (!z2) {
                        mediaExtractor.advance();
                    }
                } else {
                    iAddTrack2 = iAddTrack2;
                    iMax = iMax;
                    if (sampleTrackIndex == -1) {
                        z2 = true;
                    } else {
                        mediaExtractor.advance();
                        z2 = false;
                    }
                }
                if (z2) {
                    i10 = 0;
                    z3 = true;
                } else {
                    i10 = 0;
                }
            }
            i2 = -1;
            if (i3 != i2) {
                if (sampleTrackIndex != iFindTrack2) {
                    int iArrayOffset2 = byteBufferAllocateDirect.arrayOffset();
                    iLimit = iArrayOffset2 + byteBufferAllocateDirect.limit();
                    i4 = iArrayOffset2;
                    i5 = -1;
                    while (true) {
                        i6 = iLimit - 4;
                        if (i4 <= i6) {
                            break;
                            break;
                        }
                        if (bArrArray[i4] != 0) {
                            i7 = iAddTrack2;
                            i8 = iMax;
                            if (i4 == i6) {
                            }
                            i4++;
                            iAddTrack2 = i7;
                            iMax = i8;
                        } else {
                            i7 = iAddTrack2;
                            i8 = iMax;
                            if (i4 == i6) {
                            }
                            i4++;
                            iAddTrack2 = i7;
                            iMax = i8;
                        }
                        if (i5 != -1) {
                            int i16 = i4 - i5;
                            if (i4 != i6) {
                                i9 = 4;
                            } else {
                                i9 = 0;
                            }
                            int i17 = i16 - i9;
                            bArrArray[i5] = (byte) (i17 >> 24);
                            bArrArray[i5 + 1] = (byte) (i17 >> 16);
                            bArrArray[i5 + 2] = (byte) (i17 >> 8);
                            bArrArray[i5 + 3] = (byte) i17;
                        }
                        i5 = i4;
                        i4++;
                        iAddTrack2 = i7;
                        iMax = i8;
                    }
                }
                iAddTrack2 = iAddTrack2;
                iMax = iMax;
                if (bufferInfo.size >= 0) {
                    bufferInfo.presentationTimeUs = mediaExtractor.getSampleTime();
                    z2 = false;
                } else {
                    bufferInfo.size = 0;
                    z2 = true;
                }
                if (bufferInfo.size <= 0) {
                }
                if (!z2) {
                    mediaExtractor.advance();
                }
            } else {
                iAddTrack2 = iAddTrack2;
                iMax = iMax;
                if (sampleTrackIndex == -1) {
                    z2 = true;
                } else {
                    mediaExtractor.advance();
                    z2 = false;
                }
            }
            if (z2) {
                i10 = 0;
                z3 = true;
            } else {
                i10 = 0;
            }
        }
        if (iFindTrack >= 0) {
            mediaExtractor.unselectTrack(iFindTrack);
        }
        if (iFindTrack2 >= 0) {
            mediaExtractor.unselectTrack(iFindTrack2);
        }
        return j5;
    }

    private void checkConversionCanceled() {
        MediaController.VideoConvertorListener videoConvertorListener = this.callback;
        if (videoConvertorListener != null && videoConvertorListener.checkConversionCanceled()) {
            throw new ConversionCanceledException();
        }
    }

    private static String hdrFragmentShader(int i, int i2, int i3, int i4, boolean z, StoryEntry.HDRInfo hDRInfo, int i5, boolean z2) {
        String res;
        if (!z) {
            return createFragmentShader(i, i2, i3, i4, false, i5, z2);
        }
        float f = i;
        float f2 = f / (z2 ? i4 : i3);
        float f3 = i2;
        float f4 = f3 / (z2 ? i3 : i4);
        int iMax = Math.max(1, Math.round(f2));
        int iMax2 = Math.max(1, Math.round(f4));
        if (SharedConfig.deviceIsAverage()) {
            iMax = 1;
            iMax2 = 1;
        }
        int iMin = Math.min(i5, iMax);
        int iMin2 = Math.min(i5, iMax2);
        float f5 = f2 / iMin;
        float f6 = f4 / iMin2;
        float f7 = (-(iMin - 1)) / 2.0f;
        float f8 = (-(iMin2 - 1)) / 2.0f;
        if ((iMin & 1) == 0) {
            f7 += 0.01f;
        }
        if ((iMin2 & 1) == 0) {
            f8 += 0.01f;
        }
        FileLog.d("HDR source size " + i + "x" + i2 + "    dest size " + i3 + "x" + i4 + "   rotated " + z2 + "   ratio " + f2 + "x" + f4 + "   samples " + iMin + "x" + iMin2 + "   kernel scale " + f5 + "x" + f6);
        String strGlslFloat = glslFloat(f7);
        String strGlslFloat2 = glslFloat(f8);
        String strGlslFloat3 = glslFloat(f5);
        String strGlslFloat4 = glslFloat(f6);
        String strGlslFloat5 = glslFloat((float) (iMin * iMin2));
        String strGlslFloat6 = glslFloat(1.0f / f);
        String strGlslFloat7 = glslFloat(1.0f / f3);
        if (hDRInfo.getHDRType() == 1) {
            res = AndroidUtilities.readRes(R.raw.hdr2sdr_hlg);
        } else {
            res = AndroidUtilities.readRes(R.raw.hdr2sdr_pq);
        }
        return res + "\nvarying vec2 vTextureCoord;\nconst float offsetX = " + strGlslFloat + ";\nconst float offsetY = " + strGlslFloat2 + ";\nconst float kernelScaleX = " + strGlslFloat3 + ";\nconst float kernelScaleY = " + strGlslFloat4 + ";\nconst float weightsum = " + strGlslFloat5 + ";\nconst float pixelSizeX = " + strGlslFloat6 + ";\nconst float pixelSizeY = " + strGlslFloat7 + ";\nvoid main() {\n    vec3 accumulation = vec3(0.0);\n    for (int i = 0; i < " + iMin + "; ++i) {\n        for (int j = 0; j < " + iMin2 + "; ++j) {\n            float x = (offsetX + float(i)) * kernelScaleX;\n            float y = (offsetY + float(j)) * kernelScaleY;\n            vec2 uv = vTextureCoord + vec2(\n                    x * pixelSizeX,\n                    y * pixelSizeY\n            );\n            accumulation += TEX(uv).rgb;\n        }\n    }\n    gl_FragColor = vec4(accumulation / weightsum, 1.0);\n}\n";
    }

    private static String glslFloat(float f) {
        boolean z = f < 0.0f;
        if (z) {
            f = -f;
        }
        long jRound = Math.round(f * 1000000.0f);
        long j = jRound / 1000000;
        long j2 = jRound % 1000000;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        sb.append(j);
        sb.append('.');
        String strValueOf = String.valueOf(j2);
        for (int length = strValueOf.length(); length < 6; length++) {
            sb.append('0');
        }
        sb.append(strValueOf);
        return sb.toString();
    }

    private static String createFragmentShader(int i, int i2, int i3, int i4, boolean z, int i5, boolean z2) {
        String str;
        float f = i;
        float f2 = f / (z2 ? i4 : i3);
        float f3 = i2;
        float f4 = f3 / (z2 ? i3 : i4);
        int i6 = 1;
        int iMax = Math.max(1, Math.round(f2));
        int iMax2 = Math.max(1, Math.round(f4));
        if (SharedConfig.deviceIsAverage()) {
            iMax2 = 1;
        } else {
            i6 = iMax;
        }
        int iMin = Math.min(i5, i6);
        int iMin2 = Math.min(i5, iMax2);
        float f5 = f2 / iMin;
        float f6 = f4 / iMin2;
        float f7 = (-(iMin - 1)) / 2.0f;
        float f8 = (-(iMin2 - 1)) / 2.0f;
        if ((iMin & 1) == 0) {
            f7 += 0.01f;
        }
        if ((iMin2 & 1) == 0) {
            f8 += 0.01f;
        }
        FileLog.d("source size " + i + "x" + i2 + "    dest size " + i3 + "x" + i4 + "   rotated " + z2 + "   ratio " + f2 + "x" + f4 + "   samples " + iMin + "x" + iMin2 + "   kernel scale " + f5 + "x" + f6);
        String strGlslFloat = glslFloat(f7);
        String strGlslFloat2 = glslFloat(f8);
        String strGlslFloat3 = glslFloat(f5);
        String strGlslFloat4 = glslFloat(f6);
        String strGlslFloat5 = glslFloat((float) (iMin * iMin2));
        String strGlslFloat6 = glslFloat(1.0f / f);
        String strGlslFloat7 = glslFloat(1.0f / f3);
        if (z) {
            str = "#extension GL_OES_EGL_image_external : require\nuniform samplerExternalOES sTexture;\n";
        } else {
            str = "uniform sampler2D sTexture;\n";
        }
        return str + "precision highp float;\nvarying vec2 vTextureCoord;\nconst float offsetX = " + strGlslFloat + ";\nconst float offsetY = " + strGlslFloat2 + ";\nconst float kernelScaleX = " + strGlslFloat3 + ";\nconst float kernelScaleY = " + strGlslFloat4 + ";\nconst float weightsum = " + strGlslFloat5 + ";\nconst float pixelSizeX = " + strGlslFloat6 + ";\nconst float pixelSizeY = " + strGlslFloat7 + ";\nvoid main() {\n    vec3 accumulation = vec3(0.0);\n    for (int i = 0; i < " + iMin + "; ++i) {\n        for (int j = 0; j < " + iMin2 + "; ++j) {\n            float x = (offsetX + float(i)) * kernelScaleX;\n            float y = (offsetY + float(j)) * kernelScaleY;\n            vec2 uv = vTextureCoord + vec2(\n                    x * pixelSizeX,\n                    y * pixelSizeY\n            );\n            accumulation += texture2D(sTexture, uv).rgb;\n        }\n    }\n    gl_FragColor = vec4(accumulation / weightsum, 1.0);\n}\n";
    }

    public class ConversionCanceledException extends RuntimeException {
        public ConversionCanceledException() {
            super("canceled conversion");
        }
    }

    private MediaCodec getDecoderByFormat(MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            throw new RuntimeException("getDecoderByFormat: format is null");
        }
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
        throw new RuntimeException(exc);
    }

    public static class ConvertVideoParams {
        int account;
        long avatarStartTime;
        String backgroundPath;
        int bitrate;
        String blurPath;
        File cacheFile;
        MediaController.VideoConvertorListener callback;
        CollageLayout collage;
        ArrayList<VideoEditedInfo.Part> collageParts;
        MediaController.CropState cropState;
        long duration;
        long endTime;
        int framerate;
        Integer gradientBottomColor;
        Integer gradientTopColor;
        StoryEntry.HDRInfo hdrInfo;
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

        public static ConvertVideoParams of(String str, File file, long j, int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, long j3, long j4, boolean z2, long j5, MediaController.VideoConvertorListener videoConvertorListener, VideoEditedInfo videoEditedInfo) {
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
}
