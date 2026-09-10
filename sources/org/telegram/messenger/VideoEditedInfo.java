package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.video.MediaCodecPlayer;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.pf0;
public class VideoEditedInfo {
    public int account;
    public boolean alreadyScheduledConverting;
    public String backgroundPath;
    public int bitrate;
    public String blurPath;
    public boolean canceled;
    public bi.x collage;
    public ArrayList<Part> collageParts;
    public int compressQuality;
    public MediaController.CropState cropState;
    public TLRPC.InputEncryptedFile encryptedFile;
    public float end;
    public long endTime;
    public long estimatedDuration;
    public long estimatedSize;
    public TLRPC.InputFile file;
    public MediaController.SavedFilterState filterState;
    public boolean forceFragmenting;
    public boolean fromCamera;
    public Integer gradientBottomColor;
    public Integer gradientTopColor;
    public bi.q9 hdrInfo;
    public boolean isDark;
    public boolean isPhoto;
    public boolean isSticker;
    public boolean isStory;
    public byte[] iv;
    public byte[] key;
    public ArrayList<MediaEntity> mediaEntities;
    public String messagePath;
    public String messageVideoMaskPath;
    public boolean muted;
    public boolean notReadyYet;
    public int originalBitrate;
    public long originalDuration;
    public int originalHeight;
    public String originalPath;
    public int originalWidth;
    public String paintPath;
    public int resultHeight;
    public int resultWidth;
    public int rotationValue;
    public boolean roundVideo;
    public float start;
    public long startTime;
    public Bitmap thumb;
    public boolean videoConvertFirstWrite;
    public long videoOffset;
    public long avatarStartTime = -1;
    public int framerate = 24;
    public float volume = 1.0f;
    public long wallpaperPeerId = Long.MIN_VALUE;
    public boolean needUpdateProgress = false;
    public boolean shouldLimitFps = true;
    public ArrayList<MediaCodecVideoConvertor.MixedSoundInfo> mixedSoundInfos = new ArrayList<>();

    public static class EmojiEntity extends TLRPC.TL_messageEntityCustomEmoji {
        public String documentAbsolutePath;
        public MediaEntity entity;
        public byte subType;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            super.readParams(inputSerializedData, z10);
            this.subType = inputSerializedData.readByte(z10);
            if (inputSerializedData.readBool(z10)) {
                this.documentAbsolutePath = inputSerializedData.readString(z10);
            }
            if (TextUtils.isEmpty(this.documentAbsolutePath)) {
                this.documentAbsolutePath = null;
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            super.serializeToStream(outputSerializedData);
            outputSerializedData.writeByte(this.subType);
            outputSerializedData.writeBool(!TextUtils.isEmpty(this.documentAbsolutePath));
            if (!TextUtils.isEmpty(this.documentAbsolutePath)) {
                outputSerializedData.writeString(this.documentAbsolutePath);
            }
        }
    }

    public boolean canAutoPlaySourceVideo() {
        return this.roundVideo;
    }

    public String getString() {
        int i10;
        byte[] bArr;
        String bytesToHex;
        pf0 pf0Var;
        ArrayList<MediaEntity> arrayList;
        if (this.avatarStartTime == -1 && this.filterState == null && this.paintPath == null && this.blurPath == null && (((arrayList = this.mediaEntities) == null || arrayList.isEmpty()) && this.cropState == null)) {
            bytesToHex = "";
        } else {
            if (this.filterState != null) {
                i10 = 170;
            } else {
                i10 = 10;
            }
            String str = this.paintPath;
            byte[] bArr2 = null;
            if (str != null) {
                bArr = str.getBytes();
                i10 += bArr.length;
            } else {
                bArr = null;
            }
            String str2 = this.blurPath;
            if (str2 != null) {
                bArr2 = str2.getBytes();
                i10 += bArr2.length;
            }
            SerializedData serializedData = new SerializedData(i10);
            serializedData.writeInt32(11);
            serializedData.writeInt64(this.avatarStartTime);
            serializedData.writeInt32(this.originalBitrate);
            if (this.filterState != null) {
                serializedData.writeByte(1);
                serializedData.writeFloat(this.filterState.enhanceValue);
                serializedData.writeFloat(this.filterState.softenSkinValue);
                serializedData.writeFloat(this.filterState.exposureValue);
                serializedData.writeFloat(this.filterState.contrastValue);
                serializedData.writeFloat(this.filterState.warmthValue);
                serializedData.writeFloat(this.filterState.saturationValue);
                serializedData.writeFloat(this.filterState.fadeValue);
                serializedData.writeInt32(this.filterState.tintShadowsColor);
                serializedData.writeInt32(this.filterState.tintHighlightsColor);
                serializedData.writeFloat(this.filterState.highlightsValue);
                serializedData.writeFloat(this.filterState.shadowsValue);
                serializedData.writeFloat(this.filterState.vignetteValue);
                serializedData.writeFloat(this.filterState.grainValue);
                serializedData.writeInt32(this.filterState.blurType);
                serializedData.writeFloat(this.filterState.sharpenValue);
                serializedData.writeFloat(this.filterState.blurExcludeSize);
                PointF pointF = this.filterState.blurExcludePoint;
                if (pointF != null) {
                    serializedData.writeFloat(pointF.x);
                    serializedData.writeFloat(this.filterState.blurExcludePoint.y);
                } else {
                    serializedData.writeFloat(0.0f);
                    serializedData.writeFloat(0.0f);
                }
                serializedData.writeFloat(this.filterState.blurExcludeBlurSize);
                serializedData.writeFloat(this.filterState.blurAngle);
                for (int i11 = 0; i11 < 4; i11++) {
                    if (i11 == 0) {
                        pf0Var = this.filterState.curvesToolValue.f25772a;
                    } else if (i11 == 1) {
                        pf0Var = this.filterState.curvesToolValue.f25773b;
                    } else if (i11 == 2) {
                        pf0Var = this.filterState.curvesToolValue.f25774c;
                    } else {
                        pf0Var = this.filterState.curvesToolValue.d;
                    }
                    serializedData.writeFloat(pf0Var.f26113a);
                    serializedData.writeFloat(pf0Var.f26114b);
                    serializedData.writeFloat(pf0Var.f26115c);
                    serializedData.writeFloat(pf0Var.d);
                    serializedData.writeFloat(pf0Var.e);
                }
            } else {
                serializedData.writeByte(0);
            }
            if (bArr != null) {
                serializedData.writeByte(1);
                serializedData.writeByteArray(bArr);
            } else {
                serializedData.writeByte(0);
            }
            ArrayList<MediaEntity> arrayList2 = this.mediaEntities;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                serializedData.writeByte(1);
                serializedData.writeInt32(this.mediaEntities.size());
                int size = this.mediaEntities.size();
                for (int i12 = 0; i12 < size; i12++) {
                    this.mediaEntities.get(i12).serializeTo(serializedData, false);
                }
                serializedData.writeByte(this.isPhoto ? 1 : 0);
            } else {
                serializedData.writeByte(0);
            }
            if (this.cropState != null) {
                serializedData.writeByte(1);
                serializedData.writeFloat(this.cropState.cropPx);
                serializedData.writeFloat(this.cropState.cropPy);
                serializedData.writeFloat(this.cropState.cropPw);
                serializedData.writeFloat(this.cropState.cropPh);
                serializedData.writeFloat(this.cropState.cropScale);
                serializedData.writeFloat(this.cropState.cropRotate);
                serializedData.writeInt32(this.cropState.transformWidth);
                serializedData.writeInt32(this.cropState.transformHeight);
                serializedData.writeInt32(this.cropState.transformRotation);
                serializedData.writeBool(this.cropState.mirrored);
            } else {
                serializedData.writeByte(0);
            }
            serializedData.writeInt32(0);
            serializedData.writeBool(this.isStory);
            serializedData.writeBool(this.fromCamera);
            if (bArr2 != null) {
                serializedData.writeByte(1);
                serializedData.writeByteArray(bArr2);
            } else {
                serializedData.writeByte(0);
            }
            serializedData.writeFloat(this.volume);
            serializedData.writeBool(this.isSticker);
            bi.x xVar = this.collage;
            if (xVar != null && this.collageParts != null && xVar.e.size() > 1 && !this.collageParts.isEmpty()) {
                serializedData.writeInt32(-559038737);
                serializedData.writeString(this.collage.f3852a);
                for (int i13 = 0; i13 < this.collageParts.size(); i13++) {
                    this.collageParts.get(i13).serializeToStream(serializedData);
                }
            } else {
                serializedData.writeInt32(1450380236);
            }
            bytesToHex = Utilities.bytesToHex(serializedData.toByteArray());
            serializedData.cleanup();
        }
        Locale locale = Locale.US;
        long j3 = this.startTime;
        long j10 = this.endTime;
        int i14 = this.rotationValue;
        int i15 = this.originalWidth;
        int i16 = this.originalHeight;
        int i17 = this.bitrate;
        int i18 = this.resultWidth;
        int i19 = this.resultHeight;
        long j11 = this.originalDuration;
        int i20 = this.framerate;
        long j12 = this.videoOffset;
        String str3 = bytesToHex;
        String str4 = this.originalPath;
        StringBuilder t10 = a4.a.t(j3, "-1_", "_");
        t10.append(j10);
        t10.append("_");
        t10.append(i14);
        t10.append("_");
        t10.append(i15);
        t10.append("_");
        t10.append(i16);
        t10.append("_");
        t10.append(i17);
        t10.append("_");
        t10.append(i18);
        t10.append("_");
        t10.append(i19);
        t10.append("_");
        t10.append(j11);
        t10.append("_");
        t10.append(i20);
        t10.append("_");
        t10.append(j12);
        t10.append("_-");
        return a4.a.q(str3, "_", str4, t10);
    }

    public boolean needConvert() {
        MediaController.CropState cropState;
        if (this.isStory) {
            if (this.fromCamera && this.mixedSoundInfos.isEmpty() && this.mediaEntities == null && this.paintPath == null && this.blurPath == null && this.filterState == null && (((cropState = this.cropState) == null || cropState.isEmpty()) && this.startTime <= 0)) {
                long j3 = this.endTime;
                if ((j3 == -1 || j3 == this.estimatedDuration) && this.originalHeight == this.resultHeight && this.originalWidth == this.resultWidth) {
                    return false;
                }
            }
            return true;
        }
        if (this.mixedSoundInfos.isEmpty() && this.mediaEntities == null && this.paintPath == null && this.blurPath == null && this.filterState == null && this.cropState == null && this.roundVideo && this.startTime <= 0) {
            long j10 = this.endTime;
            if (j10 == -1 || j10 == this.estimatedDuration) {
                return false;
            }
        }
        return true;
    }

    public boolean parseString(String str) {
        boolean z10;
        boolean z11;
        pf0 pf0Var;
        if (str.length() < 6) {
            return false;
        }
        try {
            String[] split = str.split("_");
            int i10 = 12;
            if (split.length >= 12) {
                this.startTime = Long.parseLong(split[1]);
                this.endTime = Long.parseLong(split[2]);
                this.rotationValue = Integer.parseInt(split[3]);
                this.originalWidth = Integer.parseInt(split[4]);
                this.originalHeight = Integer.parseInt(split[5]);
                this.bitrate = Integer.parseInt(split[6]);
                this.resultWidth = Integer.parseInt(split[7]);
                this.resultHeight = Integer.parseInt(split[8]);
                this.originalDuration = Long.parseLong(split[9]);
                this.framerate = Integer.parseInt(split[10]);
                this.videoOffset = Long.parseLong(split[11]);
                if (this.bitrate == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.muted = z10;
                if (split[12].startsWith("-")) {
                    String substring = split[12].substring(1);
                    if (substring.length() > 0) {
                        SerializedData serializedData = new SerializedData(Utilities.hexToBytes(substring));
                        int readInt32 = serializedData.readInt32(false);
                        if (readInt32 >= 3) {
                            this.avatarStartTime = serializedData.readInt64(false);
                            this.originalBitrate = serializedData.readInt32(false);
                        }
                        if (serializedData.readByte(false) != 0) {
                            MediaController.SavedFilterState savedFilterState = new MediaController.SavedFilterState();
                            this.filterState = savedFilterState;
                            savedFilterState.enhanceValue = serializedData.readFloat(false);
                            if (readInt32 >= 5) {
                                this.filterState.softenSkinValue = serializedData.readFloat(false);
                            }
                            this.filterState.exposureValue = serializedData.readFloat(false);
                            this.filterState.contrastValue = serializedData.readFloat(false);
                            this.filterState.warmthValue = serializedData.readFloat(false);
                            this.filterState.saturationValue = serializedData.readFloat(false);
                            this.filterState.fadeValue = serializedData.readFloat(false);
                            this.filterState.tintShadowsColor = serializedData.readInt32(false);
                            this.filterState.tintHighlightsColor = serializedData.readInt32(false);
                            this.filterState.highlightsValue = serializedData.readFloat(false);
                            this.filterState.shadowsValue = serializedData.readFloat(false);
                            this.filterState.vignetteValue = serializedData.readFloat(false);
                            this.filterState.grainValue = serializedData.readFloat(false);
                            this.filterState.blurType = serializedData.readInt32(false);
                            this.filterState.sharpenValue = serializedData.readFloat(false);
                            this.filterState.blurExcludeSize = serializedData.readFloat(false);
                            this.filterState.blurExcludePoint = new PointF(serializedData.readFloat(false), serializedData.readFloat(false));
                            this.filterState.blurExcludeBlurSize = serializedData.readFloat(false);
                            this.filterState.blurAngle = serializedData.readFloat(false);
                            for (int i11 = 0; i11 < 4; i11++) {
                                if (i11 == 0) {
                                    pf0Var = this.filterState.curvesToolValue.f25772a;
                                } else if (i11 == 1) {
                                    pf0Var = this.filterState.curvesToolValue.f25773b;
                                } else if (i11 == 2) {
                                    pf0Var = this.filterState.curvesToolValue.f25774c;
                                } else {
                                    pf0Var = this.filterState.curvesToolValue.d;
                                }
                                pf0Var.f26113a = serializedData.readFloat(false);
                                pf0Var.f26114b = serializedData.readFloat(false);
                                pf0Var.f26115c = serializedData.readFloat(false);
                                pf0Var.d = serializedData.readFloat(false);
                                pf0Var.e = serializedData.readFloat(false);
                            }
                        }
                        if (serializedData.readByte(false) != 0) {
                            this.paintPath = new String(serializedData.readByteArray(false));
                        }
                        if (serializedData.readByte(false) != 0) {
                            int readInt322 = serializedData.readInt32(false);
                            this.mediaEntities = new ArrayList<>(readInt322);
                            for (int i12 = 0; i12 < readInt322; i12++) {
                                this.mediaEntities.add(new MediaEntity(serializedData, false));
                            }
                            if (serializedData.readByte(false) == 1) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            this.isPhoto = z11;
                        }
                        if (readInt32 >= 2 && serializedData.readByte(false) != 0) {
                            MediaController.CropState cropState = new MediaController.CropState();
                            this.cropState = cropState;
                            cropState.cropPx = serializedData.readFloat(false);
                            this.cropState.cropPy = serializedData.readFloat(false);
                            this.cropState.cropPw = serializedData.readFloat(false);
                            this.cropState.cropPh = serializedData.readFloat(false);
                            this.cropState.cropScale = serializedData.readFloat(false);
                            this.cropState.cropRotate = serializedData.readFloat(false);
                            this.cropState.transformWidth = serializedData.readInt32(false);
                            this.cropState.transformHeight = serializedData.readInt32(false);
                            this.cropState.transformRotation = serializedData.readInt32(false);
                            if (readInt32 >= 4) {
                                this.cropState.mirrored = serializedData.readBool(false);
                            }
                        }
                        if (readInt32 >= 6) {
                            serializedData.readInt32(false);
                        }
                        if (readInt32 >= 7) {
                            this.isStory = serializedData.readBool(false);
                            this.fromCamera = serializedData.readBool(false);
                        }
                        if (readInt32 >= 8 && serializedData.readByte(false) != 0) {
                            this.blurPath = new String(serializedData.readByteArray(false));
                        }
                        if (readInt32 >= 9) {
                            this.volume = serializedData.readFloat(false);
                        }
                        if (readInt32 >= 10) {
                            this.isSticker = serializedData.readBool(false);
                        }
                        if (readInt32 >= 11 && serializedData.readInt32(false) == -559038737) {
                            this.collage = new bi.x(serializedData.readString(false));
                            this.collageParts = new ArrayList<>();
                            for (int i13 = 0; i13 < this.collage.e.size(); i13++) {
                                Part part = new Part();
                                part.part = (bi.w) this.collage.e.get(i13);
                                part.readParams(serializedData, false);
                                this.collageParts.add(part);
                            }
                        }
                        serializedData.cleanup();
                    }
                    i10 = 13;
                }
                while (i10 < split.length) {
                    if (this.originalPath == null) {
                        this.originalPath = split[i10];
                    } else {
                        this.originalPath += "_" + split[i10];
                    }
                    i10++;
                }
            }
            return true;
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    public static class Part extends TLObject {
        public org.telegram.ui.Components.c6 animatedFileDrawable;
        public float currentFrame;
        public long duration;
        public int flags;
        public float framesPerDraw;
        public int height;
        public boolean isVideo;
        public float left;
        public boolean loop;
        public float msPerFrame;
        public boolean muted;
        public long offset;
        public bi.w part;
        public String path;
        public MediaCodecPlayer player;
        public FloatBuffer posBuffer;
        public float right;
        public SurfaceTexture surfaceTexture;
        public FloatBuffer uvBuffer;
        public float volume;
        public int width;

        public Part() {
            this.volume = 1.0f;
            this.offset = 0L;
            this.loop = true;
        }

        public static ArrayList<Part> toParts(bi.r9 r9Var) {
            if (r9Var != null && r9Var.T != null) {
                ArrayList<Part> arrayList = new ArrayList<>();
                for (int i10 = 0; i10 < r9Var.T.size(); i10++) {
                    Part part = new Part((bi.r9) r9Var.T.get(i10));
                    part.part = (bi.w) r9Var.S.e.get(i10);
                    arrayList.add(part);
                }
                return arrayList;
            }
            return null;
        }

        public static ArrayList<bi.r9> toStoryEntries(ArrayList<Part> arrayList) {
            if (arrayList == null) {
                return null;
            }
            ArrayList<bi.r9> arrayList2 = new ArrayList<>();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Part part = arrayList.get(i10);
                i10++;
                Part part2 = part;
                bi.r9 r9Var = new bi.r9();
                r9Var.K = part2.isVideo;
                r9Var.Y = part2.muted;
                r9Var.L = new File(part2.path);
                r9Var.P = part2.volume;
                r9Var.U = part2.loop;
                r9Var.X = part2.offset;
                r9Var.V = part2.left;
                r9Var.W = part2.right;
                r9Var.f3582k0 = part2.width;
                r9Var.f3584l0 = part2.height;
                r9Var.f3576h0 = part2.duration;
                arrayList2.add(r9Var);
            }
            return arrayList2;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            boolean z11;
            boolean z12;
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            boolean z13 = false;
            if ((readInt32 & 1) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.isVideo = z11;
            if ((readInt32 & 2) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.loop = z12;
            if ((readInt32 & 4) != 0) {
                z13 = true;
            }
            this.muted = z13;
            this.path = inputSerializedData.readString(z10);
            this.volume = inputSerializedData.readFloat(z10);
            this.offset = inputSerializedData.readInt64(z10);
            this.left = inputSerializedData.readFloat(z10);
            this.right = inputSerializedData.readFloat(z10);
            this.width = inputSerializedData.readInt32(z10);
            this.height = inputSerializedData.readInt32(z10);
            this.duration = inputSerializedData.readInt64(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            int i10;
            int i11;
            int i12;
            if (this.isVideo) {
                i10 = this.flags | 1;
            } else {
                i10 = this.flags & (-2);
            }
            this.flags = i10;
            if (this.loop) {
                i11 = i10 | 2;
            } else {
                i11 = i10 & (-3);
            }
            this.flags = i11;
            if (this.muted) {
                i12 = i11 | 4;
            } else {
                i12 = i11 & (-5);
            }
            this.flags = i12;
            outputSerializedData.writeInt32(i12);
            outputSerializedData.writeString(this.path);
            outputSerializedData.writeFloat(this.volume);
            outputSerializedData.writeInt64(this.offset);
            outputSerializedData.writeFloat(this.left);
            outputSerializedData.writeFloat(this.right);
            outputSerializedData.writeInt32(this.width);
            outputSerializedData.writeInt32(this.height);
            outputSerializedData.writeInt64(this.duration);
        }

        public Part(bi.r9 r9Var) {
            this.volume = 1.0f;
            this.offset = 0L;
            this.loop = true;
            this.isVideo = r9Var.K;
            this.muted = r9Var.Y;
            this.path = r9Var.L.getAbsolutePath();
            this.volume = r9Var.P;
            this.loop = r9Var.U;
            this.offset = r9Var.X;
            this.left = r9Var.V;
            this.right = r9Var.W;
            this.width = r9Var.f3582k0;
            this.height = r9Var.f3584l0;
            this.duration = r9Var.f3576h0;
        }
    }

    public static class MediaEntity {
        public static final byte TYPE_LINK = 7;
        public static final byte TYPE_LOCATION = 3;
        public static final byte TYPE_MESSAGE = 6;
        public static final byte TYPE_PHOTO = 2;
        public static final byte TYPE_REACTION = 4;
        public static final byte TYPE_ROUND = 5;
        public static final byte TYPE_STICKER = 0;
        public static final byte TYPE_TEXT = 1;
        public static final byte TYPE_VIDEO = 9;
        public static final byte TYPE_WEATHER = 8;
        public int H;
        public int W;
        public float additionalHeight;
        public float additionalWidth;
        public org.telegram.ui.Components.c6 animatedFileDrawable;
        public Bitmap bitmap;
        public Canvas canvas;
        public int color;
        public MediaController.CropState crop;
        public float currentFrame;
        public boolean customTextView;
        public float density;
        public TLRPC.Document document;
        public ArrayList<EmojiEntity> entities;
        public boolean firstSeek;
        public int fontSize;
        public float framesPerDraw;
        public float height;
        public pg.n0 linkSettings;
        public boolean looped;
        public RLottieNative lottieNative;
        public Matrix matrix;
        public TLRPC.MessageMedia media;
        public TL_stories.MediaArea mediaArea;
        public Object parentObject;
        public float rotation;
        public long roundDuration;
        public long roundLeft;
        public long roundOffset;
        public float roundRadius;
        public Canvas roundRadiusCanvas;
        public long roundRight;
        public float scale;
        public String segmentedPath;
        public byte subType;
        public String text;
        public int textAlign;
        public og.m0 textTypeface;
        public String textTypefaceKey;
        public float textViewHeight;
        public float textViewWidth;
        public float textViewX;
        public float textViewY;
        public byte type;
        public View view;
        public int viewHeight;
        public int viewWidth;
        public yg.p0 visibleReaction;
        public bi.df weather;
        public float width;
        public float f14669x;
        public float f14670y;

        public MediaEntity() {
            this.text = "";
            this.entities = new ArrayList<>();
            this.segmentedPath = "";
            this.scale = 1.0f;
        }

        public MediaEntity copy() {
            MediaEntity mediaEntity = new MediaEntity();
            mediaEntity.type = this.type;
            mediaEntity.subType = this.subType;
            mediaEntity.f14669x = this.f14669x;
            mediaEntity.f14670y = this.f14670y;
            mediaEntity.rotation = this.rotation;
            mediaEntity.width = this.width;
            mediaEntity.height = this.height;
            mediaEntity.additionalHeight = this.additionalHeight;
            mediaEntity.text = this.text;
            if (this.entities != null) {
                ArrayList<EmojiEntity> arrayList = new ArrayList<>();
                mediaEntity.entities = arrayList;
                arrayList.addAll(this.entities);
            }
            mediaEntity.color = this.color;
            mediaEntity.fontSize = this.fontSize;
            mediaEntity.textTypeface = this.textTypeface;
            mediaEntity.textTypefaceKey = this.textTypefaceKey;
            mediaEntity.textAlign = this.textAlign;
            mediaEntity.viewWidth = this.viewWidth;
            mediaEntity.viewHeight = this.viewHeight;
            mediaEntity.roundRadius = this.roundRadius;
            mediaEntity.scale = this.scale;
            mediaEntity.textViewWidth = this.textViewWidth;
            mediaEntity.textViewHeight = this.textViewHeight;
            mediaEntity.textViewX = this.textViewX;
            mediaEntity.textViewY = this.textViewY;
            mediaEntity.document = this.document;
            mediaEntity.parentObject = this.parentObject;
            mediaEntity.lottieNative = this.lottieNative;
            mediaEntity.currentFrame = this.currentFrame;
            mediaEntity.framesPerDraw = this.framesPerDraw;
            mediaEntity.bitmap = this.bitmap;
            mediaEntity.view = this.view;
            mediaEntity.canvas = this.canvas;
            mediaEntity.animatedFileDrawable = this.animatedFileDrawable;
            mediaEntity.roundRadiusCanvas = this.roundRadiusCanvas;
            mediaEntity.mediaArea = this.mediaArea;
            mediaEntity.media = this.media;
            mediaEntity.density = this.density;
            mediaEntity.W = this.W;
            mediaEntity.H = this.H;
            mediaEntity.visibleReaction = this.visibleReaction;
            mediaEntity.roundOffset = this.roundOffset;
            mediaEntity.roundDuration = this.roundDuration;
            mediaEntity.roundLeft = this.roundLeft;
            mediaEntity.roundRight = this.roundRight;
            mediaEntity.linkSettings = this.linkSettings;
            mediaEntity.weather = this.weather;
            return mediaEntity;
        }

        public void serializeTo(AbstractSerializedData abstractSerializedData, boolean z10) {
            String str;
            abstractSerializedData.writeByte(this.type);
            abstractSerializedData.writeByte(this.subType);
            abstractSerializedData.writeFloat(this.f14669x);
            abstractSerializedData.writeFloat(this.f14670y);
            abstractSerializedData.writeFloat(this.rotation);
            abstractSerializedData.writeFloat(this.width);
            abstractSerializedData.writeFloat(this.height);
            abstractSerializedData.writeString(this.text);
            abstractSerializedData.writeInt32(this.entities.size());
            for (int i10 = 0; i10 < this.entities.size(); i10++) {
                this.entities.get(i10).serializeToStream(abstractSerializedData);
            }
            abstractSerializedData.writeInt32(this.color);
            abstractSerializedData.writeInt32(this.fontSize);
            abstractSerializedData.writeInt32(this.viewWidth);
            abstractSerializedData.writeInt32(this.viewHeight);
            abstractSerializedData.writeInt32(this.textAlign);
            og.m0 m0Var = this.textTypeface;
            if (m0Var == null) {
                str = this.textTypefaceKey;
                if (str == null) {
                    str = "";
                }
            } else {
                str = m0Var.f14424a;
            }
            abstractSerializedData.writeString(str);
            abstractSerializedData.writeFloat(this.scale);
            abstractSerializedData.writeFloat(this.textViewWidth);
            abstractSerializedData.writeFloat(this.textViewHeight);
            abstractSerializedData.writeFloat(this.textViewX);
            abstractSerializedData.writeFloat(this.textViewY);
            if (z10) {
                TLRPC.Document document = this.document;
                if (document == null) {
                    abstractSerializedData.writeInt32(1450380236);
                } else {
                    document.serializeToStream(abstractSerializedData);
                }
            }
            byte b10 = this.type;
            if (b10 == 3) {
                abstractSerializedData.writeFloat(this.density);
                this.mediaArea.serializeToStream(abstractSerializedData);
                TLRPC.MessageMedia messageMedia = this.media;
                if (messageMedia.provider == null) {
                    messageMedia.provider = "";
                }
                if (messageMedia.venue_id == null) {
                    messageMedia.venue_id = "";
                }
                if (messageMedia.venue_type == null) {
                    messageMedia.venue_type = "";
                }
                messageMedia.serializeToStream(abstractSerializedData);
                TLRPC.MessageMedia messageMedia2 = this.media;
                if ((messageMedia2 instanceof TLRPC.TL_messageMediaVenue) && ((TLRPC.TL_messageMediaVenue) messageMedia2).emoji != null) {
                    abstractSerializedData.writeInt32(-559038737);
                    abstractSerializedData.writeString(((TLRPC.TL_messageMediaVenue) this.media).emoji);
                    return;
                }
                abstractSerializedData.writeInt32(1450380236);
            } else if (b10 == 7) {
                abstractSerializedData.writeFloat(this.density);
                this.mediaArea.serializeToStream(abstractSerializedData);
                this.linkSettings.serializeToStream(abstractSerializedData);
            } else if (b10 == 4) {
                this.mediaArea.serializeToStream(abstractSerializedData);
            } else if (b10 == 5) {
                abstractSerializedData.writeInt64(this.roundOffset);
                abstractSerializedData.writeInt64(this.roundLeft);
                abstractSerializedData.writeInt64(this.roundRight);
                abstractSerializedData.writeInt64(this.roundDuration);
            } else if (b10 == 2) {
                abstractSerializedData.writeString(this.segmentedPath);
                MediaController.CropState cropState = this.crop;
                if (cropState != null) {
                    cropState.serializeToStream(abstractSerializedData);
                } else {
                    abstractSerializedData.writeInt32(1450380236);
                }
            } else if (b10 == 8) {
                if (this.weather == null) {
                    abstractSerializedData.writeInt32(-559038737);
                    return;
                }
                abstractSerializedData.writeInt32(132805945);
                this.weather.serializeToStream(abstractSerializedData);
            }
        }

        public MediaEntity(AbstractSerializedData abstractSerializedData, boolean z10) {
            this(abstractSerializedData, z10, false);
        }

        public MediaEntity(AbstractSerializedData abstractSerializedData, boolean z10, boolean z11) {
            og.m0 m0Var;
            this.text = "";
            this.entities = new ArrayList<>();
            this.segmentedPath = "";
            this.scale = 1.0f;
            this.type = abstractSerializedData.readByte(z11);
            this.subType = abstractSerializedData.readByte(z11);
            this.f14669x = abstractSerializedData.readFloat(z11);
            this.f14670y = abstractSerializedData.readFloat(z11);
            this.rotation = abstractSerializedData.readFloat(z11);
            this.width = abstractSerializedData.readFloat(z11);
            this.height = abstractSerializedData.readFloat(z11);
            this.text = abstractSerializedData.readString(z11);
            int readInt32 = abstractSerializedData.readInt32(z11);
            for (int i10 = 0; i10 < readInt32; i10++) {
                EmojiEntity emojiEntity = new EmojiEntity();
                abstractSerializedData.readInt32(z11);
                emojiEntity.readParams(abstractSerializedData, z11);
                this.entities.add(emojiEntity);
            }
            this.color = abstractSerializedData.readInt32(z11);
            this.fontSize = abstractSerializedData.readInt32(z11);
            this.viewWidth = abstractSerializedData.readInt32(z11);
            this.viewHeight = abstractSerializedData.readInt32(z11);
            this.textAlign = abstractSerializedData.readInt32(z11);
            String readString = abstractSerializedData.readString(z11);
            this.textTypefaceKey = readString;
            og.m0 m0Var2 = og.m0.e;
            pg.n0 n0Var = null;
            if (readString != null && !TextUtils.isEmpty(readString)) {
                List c10 = og.m0.c();
                for (int i11 = 0; i11 < c10.size(); i11++) {
                    m0Var = (og.m0) c10.get(i11);
                    if (m0Var != null && TextUtils.equals(readString, m0Var.f14424a)) {
                        break;
                    }
                }
            }
            m0Var = null;
            this.textTypeface = m0Var;
            this.scale = abstractSerializedData.readFloat(z11);
            this.textViewWidth = abstractSerializedData.readFloat(z11);
            this.textViewHeight = abstractSerializedData.readFloat(z11);
            this.textViewX = abstractSerializedData.readFloat(z11);
            this.textViewY = abstractSerializedData.readFloat(z11);
            if (z10) {
                int readInt322 = abstractSerializedData.readInt32(z11);
                if (readInt322 == 1450380236) {
                    this.document = null;
                } else {
                    this.document = TLRPC.Document.TLdeserialize(abstractSerializedData, readInt322, z11);
                }
            }
            byte b10 = this.type;
            if (b10 == 3) {
                this.density = abstractSerializedData.readFloat(z11);
                this.mediaArea = TL_stories.MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z11), z11);
                this.media = TLRPC.MessageMedia.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z11), z11);
                if (abstractSerializedData.remaining() <= 0 || abstractSerializedData.readInt32(z11) != -559038737) {
                    return;
                }
                String readString2 = abstractSerializedData.readString(z11);
                TLRPC.MessageMedia messageMedia = this.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaVenue) {
                    ((TLRPC.TL_messageMediaVenue) messageMedia).emoji = readString2;
                }
            } else if (b10 == 7) {
                this.density = abstractSerializedData.readFloat(z11);
                this.mediaArea = TL_stories.MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z11), z11);
                int readInt323 = abstractSerializedData.readInt32(z11);
                if (-625858389 != readInt323) {
                    int i12 = pg.n0.f40166j;
                } else {
                    n0Var = new pg.n0();
                }
                this.linkSettings = (pg.n0) TLObject.TLdeserialize(pg.n0.class, n0Var, abstractSerializedData, readInt323, z11);
            } else if (b10 == 4) {
                this.mediaArea = TL_stories.MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z11), z11);
            } else if (b10 == 5) {
                this.roundOffset = abstractSerializedData.readInt64(z11);
                this.roundLeft = abstractSerializedData.readInt64(z11);
                this.roundRight = abstractSerializedData.readInt64(z11);
                this.roundDuration = abstractSerializedData.readInt64(z11);
            } else if (b10 == 2) {
                this.segmentedPath = abstractSerializedData.readString(z11);
                if (abstractSerializedData.readInt32(z11) == 1151577037) {
                    MediaController.CropState cropState = new MediaController.CropState();
                    this.crop = cropState;
                    cropState.readParams(abstractSerializedData, z11);
                }
            } else if (b10 == 8 && abstractSerializedData.readInt32(z11) == 132805945) {
                ?? tLObject = new TLObject();
                tLObject.f2571a = abstractSerializedData.readDouble(false);
                tLObject.f2572b = abstractSerializedData.readDouble(false);
                tLObject.f2573c = abstractSerializedData.readString(false);
                tLObject.d = abstractSerializedData.readFloat(false);
                this.weather = tLObject;
            }
        }
    }
}
