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
import org.telegram.ui.Components.se0;

public class VideoEditedInfo {
    public int account;
    public boolean alreadyScheduledConverting;
    public String backgroundPath;
    public int bitrate;
    public String blurPath;
    public boolean canceled;
    public lh.u collage;
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
    public lh.y7 hdrInfo;
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
            if (TextUtils.isEmpty(this.documentAbsolutePath)) {
                return;
            }
            outputSerializedData.writeString(this.documentAbsolutePath);
        }
    }

    public boolean canAutoPlaySourceVideo() {
        return this.roundVideo;
    }

    public String getString() {
        byte[] bytes;
        String strBytesToHex;
        se0 se0Var;
        ArrayList<MediaEntity> arrayList;
        if (this.avatarStartTime == -1 && this.filterState == null && this.paintPath == null && this.blurPath == null && (((arrayList = this.mediaEntities) == null || arrayList.isEmpty()) && this.cropState == null)) {
            strBytesToHex = "";
        } else {
            int length = this.filterState != null ? 170 : 10;
            String str = this.paintPath;
            byte[] bytes2 = null;
            if (str != null) {
                bytes = str.getBytes();
                length += bytes.length;
            } else {
                bytes = null;
            }
            String str2 = this.blurPath;
            if (str2 != null) {
                bytes2 = str2.getBytes();
                length += bytes2.length;
            }
            SerializedData serializedData = new SerializedData(length);
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
                int i10 = 0;
                while (i10 < 4) {
                    if (i10 == 0) {
                        se0Var = this.filterState.curvesToolValue.f32143a;
                    } else if (i10 == 1) {
                        se0Var = this.filterState.curvesToolValue.f32144b;
                    } else {
                        se0Var = i10 == 2 ? this.filterState.curvesToolValue.f32145c : this.filterState.curvesToolValue.d;
                    }
                    serializedData.writeFloat(se0Var.f32408a);
                    serializedData.writeFloat(se0Var.f32409b);
                    serializedData.writeFloat(se0Var.f32410c);
                    serializedData.writeFloat(se0Var.d);
                    serializedData.writeFloat(se0Var.f32411e);
                    i10++;
                }
            } else {
                serializedData.writeByte(0);
            }
            if (bytes != null) {
                serializedData.writeByte(1);
                serializedData.writeByteArray(bytes);
            } else {
                serializedData.writeByte(0);
            }
            ArrayList<MediaEntity> arrayList2 = this.mediaEntities;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                serializedData.writeByte(0);
            } else {
                serializedData.writeByte(1);
                serializedData.writeInt32(this.mediaEntities.size());
                int size = this.mediaEntities.size();
                for (int i11 = 0; i11 < size; i11++) {
                    this.mediaEntities.get(i11).serializeTo(serializedData, false);
                }
                serializedData.writeByte(this.isPhoto ? 1 : 0);
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
            if (bytes2 != null) {
                serializedData.writeByte(1);
                serializedData.writeByteArray(bytes2);
            } else {
                serializedData.writeByte(0);
            }
            serializedData.writeFloat(this.volume);
            serializedData.writeBool(this.isSticker);
            lh.u uVar = this.collage;
            if (uVar == null || this.collageParts == null || uVar.f16885e.size() <= 1 || this.collageParts.isEmpty()) {
                serializedData.writeInt32(1450380236);
            } else {
                serializedData.writeInt32(-559038737);
                serializedData.writeString(this.collage.f16882a);
                for (int i12 = 0; i12 < this.collageParts.size(); i12++) {
                    this.collageParts.get(i12).serializeToStream(serializedData);
                }
            }
            strBytesToHex = Utilities.bytesToHex(serializedData.toByteArray());
            serializedData.cleanup();
        }
        Locale locale = Locale.US;
        long j10 = this.startTime;
        long j11 = this.endTime;
        int i13 = this.rotationValue;
        int i14 = this.originalWidth;
        int i15 = this.originalHeight;
        int i16 = this.bitrate;
        int i17 = this.resultWidth;
        int i18 = this.resultHeight;
        long j12 = this.originalDuration;
        int i19 = this.framerate;
        long j13 = this.videoOffset;
        String str3 = strBytesToHex;
        String str4 = this.originalPath;
        StringBuilder sbQ = a9.p.q(j10, "-1_", "_");
        sbQ.append(j11);
        sbQ.append("_");
        sbQ.append(i13);
        sbQ.append("_");
        sbQ.append(i14);
        sbQ.append("_");
        sbQ.append(i15);
        sbQ.append("_");
        sbQ.append(i16);
        sbQ.append("_");
        sbQ.append(i17);
        sbQ.append("_");
        sbQ.append(i18);
        sbQ.append("_");
        sbQ.append(j12);
        sbQ.append("_");
        sbQ.append(i19);
        sbQ.append("_");
        sbQ.append(j13);
        sbQ.append("_-");
        return a9.p.n(str3, "_", str4, sbQ);
    }

    public boolean needConvert() {
        MediaController.CropState cropState;
        if (!this.isStory) {
            if (this.mixedSoundInfos.isEmpty() && this.mediaEntities == null && this.paintPath == null && this.blurPath == null && this.filterState == null && this.cropState == null && this.roundVideo && this.startTime <= 0) {
                long j10 = this.endTime;
                if (j10 == -1 || j10 == this.estimatedDuration) {
                    return false;
                }
            }
            return true;
        }
        if (this.fromCamera && this.mixedSoundInfos.isEmpty() && this.mediaEntities == null && this.paintPath == null && this.blurPath == null && this.filterState == null && (((cropState = this.cropState) == null || cropState.isEmpty()) && this.startTime <= 0)) {
            long j11 = this.endTime;
            if ((j11 == -1 || j11 == this.estimatedDuration) && this.originalHeight == this.resultHeight && this.originalWidth == this.resultWidth) {
                return false;
            }
        }
        return true;
    }

    public boolean parseString(String str) {
        se0 se0Var;
        if (str.length() < 6) {
            return false;
        }
        try {
            String[] strArrSplit = str.split("_");
            int i10 = 12;
            if (strArrSplit.length >= 12) {
                this.startTime = Long.parseLong(strArrSplit[1]);
                this.endTime = Long.parseLong(strArrSplit[2]);
                this.rotationValue = Integer.parseInt(strArrSplit[3]);
                this.originalWidth = Integer.parseInt(strArrSplit[4]);
                this.originalHeight = Integer.parseInt(strArrSplit[5]);
                this.bitrate = Integer.parseInt(strArrSplit[6]);
                this.resultWidth = Integer.parseInt(strArrSplit[7]);
                this.resultHeight = Integer.parseInt(strArrSplit[8]);
                this.originalDuration = Long.parseLong(strArrSplit[9]);
                this.framerate = Integer.parseInt(strArrSplit[10]);
                this.videoOffset = Long.parseLong(strArrSplit[11]);
                this.muted = this.bitrate == -1;
                if (strArrSplit[12].startsWith("-")) {
                    String strSubstring = strArrSplit[12].substring(1);
                    if (strSubstring.length() > 0) {
                        SerializedData serializedData = new SerializedData(Utilities.hexToBytes(strSubstring));
                        int int32 = serializedData.readInt32(false);
                        if (int32 >= 3) {
                            this.avatarStartTime = serializedData.readInt64(false);
                            this.originalBitrate = serializedData.readInt32(false);
                        }
                        if (serializedData.readByte(false) != 0) {
                            MediaController.SavedFilterState savedFilterState = new MediaController.SavedFilterState();
                            this.filterState = savedFilterState;
                            savedFilterState.enhanceValue = serializedData.readFloat(false);
                            if (int32 >= 5) {
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
                            int i11 = 0;
                            while (i11 < 4) {
                                if (i11 == 0) {
                                    se0Var = this.filterState.curvesToolValue.f32143a;
                                } else if (i11 == 1) {
                                    se0Var = this.filterState.curvesToolValue.f32144b;
                                } else {
                                    se0Var = i11 == 2 ? this.filterState.curvesToolValue.f32145c : this.filterState.curvesToolValue.d;
                                }
                                se0Var.f32408a = serializedData.readFloat(false);
                                se0Var.f32409b = serializedData.readFloat(false);
                                se0Var.f32410c = serializedData.readFloat(false);
                                se0Var.d = serializedData.readFloat(false);
                                se0Var.f32411e = serializedData.readFloat(false);
                                i11++;
                            }
                        }
                        if (serializedData.readByte(false) != 0) {
                            this.paintPath = new String(serializedData.readByteArray(false));
                        }
                        if (serializedData.readByte(false) != 0) {
                            int int33 = serializedData.readInt32(false);
                            this.mediaEntities = new ArrayList<>(int33);
                            for (int i12 = 0; i12 < int33; i12++) {
                                this.mediaEntities.add(new MediaEntity(serializedData, false));
                            }
                            this.isPhoto = serializedData.readByte(false) == 1;
                        }
                        if (int32 >= 2 && serializedData.readByte(false) != 0) {
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
                            if (int32 >= 4) {
                                this.cropState.mirrored = serializedData.readBool(false);
                            }
                        }
                        if (int32 >= 6) {
                            serializedData.readInt32(false);
                        }
                        if (int32 >= 7) {
                            this.isStory = serializedData.readBool(false);
                            this.fromCamera = serializedData.readBool(false);
                        }
                        if (int32 >= 8 && serializedData.readByte(false) != 0) {
                            this.blurPath = new String(serializedData.readByteArray(false));
                        }
                        if (int32 >= 9) {
                            this.volume = serializedData.readFloat(false);
                        }
                        if (int32 >= 10) {
                            this.isSticker = serializedData.readBool(false);
                        }
                        if (int32 >= 11 && serializedData.readInt32(false) == -559038737) {
                            this.collage = new lh.u(serializedData.readString(false));
                            this.collageParts = new ArrayList<>();
                            for (int i13 = 0; i13 < this.collage.f16885e.size(); i13++) {
                                Part part = new Part();
                                part.part = (lh.t) this.collage.f16885e.get(i13);
                                part.readParams(serializedData, false);
                                this.collageParts.add(part);
                            }
                        }
                        serializedData.cleanup();
                    }
                    i10 = 13;
                }
                while (i10 < strArrSplit.length) {
                    if (this.originalPath == null) {
                        this.originalPath = strArrSplit[i10];
                    } else {
                        this.originalPath += "_" + strArrSplit[i10];
                    }
                    i10++;
                }
            }
            return true;
        } catch (Exception e9) {
            FileLog.e(e9);
            return false;
        }
    }

    public static class Part extends TLObject {
        public org.telegram.ui.Components.x5 animatedFileDrawable;
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
        public lh.t part;
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

        public static ArrayList<Part> toParts(lh.z7 z7Var) {
            if (z7Var == null || z7Var.T == null) {
                return null;
            }
            ArrayList<Part> arrayList = new ArrayList<>();
            for (int i10 = 0; i10 < z7Var.T.size(); i10++) {
                Part part = new Part((lh.z7) z7Var.T.get(i10));
                part.part = (lh.t) z7Var.S.f16885e.get(i10);
                arrayList.add(part);
            }
            return arrayList;
        }

        public static ArrayList<lh.z7> toStoryEntries(ArrayList<Part> arrayList) {
            if (arrayList == null) {
                return null;
            }
            ArrayList<lh.z7> arrayList2 = new ArrayList<>();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Part part = arrayList.get(i10);
                i10++;
                Part part2 = part;
                lh.z7 z7Var = new lh.z7();
                z7Var.K = part2.isVideo;
                z7Var.Y = part2.muted;
                z7Var.L = new File(part2.path);
                z7Var.P = part2.volume;
                z7Var.U = part2.loop;
                z7Var.X = part2.offset;
                z7Var.V = part2.left;
                z7Var.W = part2.right;
                z7Var.f17217k0 = part2.width;
                z7Var.f17219l0 = part2.height;
                z7Var.f17211h0 = part2.duration;
                arrayList2.add(z7Var);
            }
            return arrayList2;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int int32 = inputSerializedData.readInt32(z10);
            this.flags = int32;
            this.isVideo = (int32 & 1) != 0;
            this.loop = (int32 & 2) != 0;
            this.muted = (int32 & 4) != 0;
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
            int i10 = this.isVideo ? this.flags | 1 : this.flags & (-2);
            this.flags = i10;
            int i11 = this.loop ? i10 | 2 : i10 & (-3);
            this.flags = i11;
            int i12 = this.muted ? i11 | 4 : i11 & (-5);
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

        public Part(lh.z7 z7Var) {
            this.volume = 1.0f;
            this.offset = 0L;
            this.loop = true;
            this.isVideo = z7Var.K;
            this.muted = z7Var.Y;
            this.path = z7Var.L.getAbsolutePath();
            this.volume = z7Var.P;
            this.loop = z7Var.U;
            this.offset = z7Var.X;
            this.left = z7Var.V;
            this.right = z7Var.W;
            this.width = z7Var.f17217k0;
            this.height = z7Var.f17219l0;
            this.duration = z7Var.f17211h0;
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
        public org.telegram.ui.Components.x5 animatedFileDrawable;
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
        public zf.m0 linkSettings;
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
        public yf.i0 textTypeface;
        public String textTypefaceKey;
        public float textViewHeight;
        public float textViewWidth;
        public float textViewX;
        public float textViewY;
        public byte type;
        public View view;
        public int viewHeight;
        public int viewWidth;
        public ig.q0 visibleReaction;
        public lh.pc weather;
        public float width;

        public float f19646x;

        public float f19647y;

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
            mediaEntity.f19646x = this.f19646x;
            mediaEntity.f19647y = this.f19647y;
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
            abstractSerializedData.writeFloat(this.f19646x);
            abstractSerializedData.writeFloat(this.f19647y);
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
            yf.i0 i0Var = this.textTypeface;
            if (i0Var == null) {
                str = this.textTypefaceKey;
                if (str == null) {
                    str = "";
                }
            } else {
                str = i0Var.f49948a;
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
                if (!(messageMedia2 instanceof TLRPC.TL_messageMediaVenue) || ((TLRPC.TL_messageMediaVenue) messageMedia2).emoji == null) {
                    abstractSerializedData.writeInt32(1450380236);
                    return;
                } else {
                    abstractSerializedData.writeInt32(-559038737);
                    abstractSerializedData.writeString(((TLRPC.TL_messageMediaVenue) this.media).emoji);
                    return;
                }
            }
            if (b10 == 7) {
                abstractSerializedData.writeFloat(this.density);
                this.mediaArea.serializeToStream(abstractSerializedData);
                this.linkSettings.serializeToStream(abstractSerializedData);
                return;
            }
            if (b10 == 4) {
                this.mediaArea.serializeToStream(abstractSerializedData);
                return;
            }
            if (b10 == 5) {
                abstractSerializedData.writeInt64(this.roundOffset);
                abstractSerializedData.writeInt64(this.roundLeft);
                abstractSerializedData.writeInt64(this.roundRight);
                abstractSerializedData.writeInt64(this.roundDuration);
                return;
            }
            if (b10 == 2) {
                abstractSerializedData.writeString(this.segmentedPath);
                MediaController.CropState cropState = this.crop;
                if (cropState != null) {
                    cropState.serializeToStream(abstractSerializedData);
                    return;
                } else {
                    abstractSerializedData.writeInt32(1450380236);
                    return;
                }
            }
            if (b10 == 8) {
                if (this.weather == null) {
                    abstractSerializedData.writeInt32(-559038737);
                } else {
                    abstractSerializedData.writeInt32(132805945);
                    this.weather.serializeToStream(abstractSerializedData);
                }
            }
        }

        public MediaEntity(AbstractSerializedData abstractSerializedData, boolean z10) {
            this(abstractSerializedData, z10, false);
        }

        public MediaEntity(AbstractSerializedData abstractSerializedData, boolean z10, boolean z11) {
            yf.i0 i0Var;
            this.text = "";
            this.entities = new ArrayList<>();
            this.segmentedPath = "";
            this.scale = 1.0f;
            this.type = abstractSerializedData.readByte(z11);
            this.subType = abstractSerializedData.readByte(z11);
            this.f19646x = abstractSerializedData.readFloat(z11);
            this.f19647y = abstractSerializedData.readFloat(z11);
            this.rotation = abstractSerializedData.readFloat(z11);
            this.width = abstractSerializedData.readFloat(z11);
            this.height = abstractSerializedData.readFloat(z11);
            this.text = abstractSerializedData.readString(z11);
            int int32 = abstractSerializedData.readInt32(z11);
            for (int i10 = 0; i10 < int32; i10++) {
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
            String string = abstractSerializedData.readString(z11);
            this.textTypefaceKey = string;
            yf.i0 i0Var2 = yf.i0.f49944e;
            zf.m0 m0Var = null;
            if (string == null || TextUtils.isEmpty(string)) {
                i0Var = null;
                break;
            }
            List listC = yf.i0.c();
            int i11 = 0;
            while (true) {
                if (i11 >= listC.size()) {
                    i0Var = null;
                    break;
                }
                i0Var = (yf.i0) listC.get(i11);
                if (i0Var != null && TextUtils.equals(string, i0Var.f49948a)) {
                    break;
                } else {
                    i11++;
                }
            }
            this.textTypeface = i0Var;
            this.scale = abstractSerializedData.readFloat(z11);
            this.textViewWidth = abstractSerializedData.readFloat(z11);
            this.textViewHeight = abstractSerializedData.readFloat(z11);
            this.textViewX = abstractSerializedData.readFloat(z11);
            this.textViewY = abstractSerializedData.readFloat(z11);
            if (z10) {
                int int33 = abstractSerializedData.readInt32(z11);
                if (int33 == 1450380236) {
                    this.document = null;
                } else {
                    this.document = TLRPC.Document.TLdeserialize(abstractSerializedData, int33, z11);
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
                String string2 = abstractSerializedData.readString(z11);
                TLRPC.MessageMedia messageMedia = this.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaVenue) {
                    ((TLRPC.TL_messageMediaVenue) messageMedia).emoji = string2;
                    return;
                }
                return;
            }
            if (b10 == 7) {
                this.density = abstractSerializedData.readFloat(z11);
                this.mediaArea = TL_stories.MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z11), z11);
                int int34 = abstractSerializedData.readInt32(z11);
                if (-625858389 != int34) {
                    int i12 = zf.m0.f50567j;
                } else {
                    m0Var = new zf.m0();
                }
                this.linkSettings = (zf.m0) TLObject.TLdeserialize(zf.m0.class, m0Var, abstractSerializedData, int34, z11);
                return;
            }
            if (b10 == 4) {
                this.mediaArea = TL_stories.MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z11), z11);
                return;
            }
            if (b10 == 5) {
                this.roundOffset = abstractSerializedData.readInt64(z11);
                this.roundLeft = abstractSerializedData.readInt64(z11);
                this.roundRight = abstractSerializedData.readInt64(z11);
                this.roundDuration = abstractSerializedData.readInt64(z11);
                return;
            }
            if (b10 == 2) {
                this.segmentedPath = abstractSerializedData.readString(z11);
                if (abstractSerializedData.readInt32(z11) == 1151577037) {
                    MediaController.CropState cropState = new MediaController.CropState();
                    this.crop = cropState;
                    cropState.readParams(abstractSerializedData, z11);
                    return;
                }
                return;
            }
            if (b10 == 8 && abstractSerializedData.readInt32(z11) == 132805945) {
                lh.pc pcVar = new lh.pc();
                pcVar.f16548a = abstractSerializedData.readDouble(false);
                pcVar.f16549b = abstractSerializedData.readDouble(false);
                pcVar.f16550c = abstractSerializedData.readString(false);
                pcVar.d = abstractSerializedData.readFloat(false);
                this.weather = pcVar;
            }
        }
    }
}
