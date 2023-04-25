package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$InputEncryptedFile;
import org.telegram.tgnet.TLRPC$InputFile;
import org.telegram.tgnet.TLRPC$TL_messageEntityCustomEmoji;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.Paint.PaintTypeface;
import org.telegram.ui.Components.PhotoFilterView;
import org.telegram.ui.Components.Point;
public class VideoEditedInfo {
    public int bitrate;
    public boolean canceled;
    public int compressQuality;
    public MediaController.CropState cropState;
    public TLRPC$InputEncryptedFile encryptedFile;
    public float end;
    public long endTime;
    public long estimatedDuration;
    public long estimatedSize;
    public TLRPC$InputFile file;
    public MediaController.SavedFilterState filterState;
    public boolean isPhoto;
    public byte[] iv;
    public byte[] key;
    public ArrayList<MediaEntity> mediaEntities;
    public boolean muted;
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
    public boolean videoConvertFirstWrite;
    public long avatarStartTime = -1;
    public int framerate = 24;
    public boolean needUpdateProgress = false;
    public boolean shouldLimitFps = true;

    public static class EmojiEntity extends TLRPC$TL_messageEntityCustomEmoji {
        public String documentAbsolutePath;

        @Override
        public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
            super.readParams(abstractSerializedData, z);
            if (abstractSerializedData.readBool(z)) {
                this.documentAbsolutePath = abstractSerializedData.readString(z);
            }
            if (TextUtils.isEmpty(this.documentAbsolutePath)) {
                this.documentAbsolutePath = null;
            }
        }

        @Override
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            super.serializeToStream(abstractSerializedData);
            abstractSerializedData.writeBool(!TextUtils.isEmpty(this.documentAbsolutePath));
            if (TextUtils.isEmpty(this.documentAbsolutePath)) {
                return;
            }
            abstractSerializedData.writeString(this.documentAbsolutePath);
        }
    }

    public static class MediaEntity {
        public AnimatedFileDrawable animatedFileDrawable;
        public Bitmap bitmap;
        public Canvas canvas;
        public int color;
        public float currentFrame;
        public TLRPC$Document document;
        public ArrayList<EmojiEntity> entities;
        public int fontSize;
        public float framesPerDraw;
        public float height;
        public int[] metadata;
        public Object parentObject;
        public long ptr;
        public float rotation;
        public float roundRadius;
        public Canvas roundRadiusCanvas;
        public float scale;
        public byte subType;
        public String text;
        public int textAlign;
        public PaintTypeface textTypeface;
        public float textViewHeight;
        public float textViewWidth;
        public float textViewX;
        public float textViewY;
        public byte type;
        public View view;
        public int viewHeight;
        public int viewWidth;
        public float width;
        public float x;
        public float y;

        public MediaEntity() {
            this.entities = new ArrayList<>();
        }

        private MediaEntity(SerializedData serializedData) {
            this.entities = new ArrayList<>();
            this.type = serializedData.readByte(false);
            this.subType = serializedData.readByte(false);
            this.x = serializedData.readFloat(false);
            this.y = serializedData.readFloat(false);
            this.rotation = serializedData.readFloat(false);
            this.width = serializedData.readFloat(false);
            this.height = serializedData.readFloat(false);
            this.text = serializedData.readString(false);
            int readInt32 = serializedData.readInt32(false);
            for (int i = 0; i < readInt32; i++) {
                EmojiEntity emojiEntity = new EmojiEntity();
                serializedData.readInt32(false);
                emojiEntity.readParams(serializedData, false);
                this.entities.add(emojiEntity);
            }
            this.color = serializedData.readInt32(false);
            this.fontSize = serializedData.readInt32(false);
            this.viewWidth = serializedData.readInt32(false);
            this.viewHeight = serializedData.readInt32(false);
            this.textAlign = serializedData.readInt32(false);
            this.textTypeface = PaintTypeface.find(serializedData.readString(false));
        }

        public void serializeTo(SerializedData serializedData) {
            serializedData.writeByte(this.type);
            serializedData.writeByte(this.subType);
            serializedData.writeFloat(this.x);
            serializedData.writeFloat(this.y);
            serializedData.writeFloat(this.rotation);
            serializedData.writeFloat(this.width);
            serializedData.writeFloat(this.height);
            serializedData.writeString(this.text);
            serializedData.writeInt32(this.entities.size());
            for (int i = 0; i < this.entities.size(); i++) {
                this.entities.get(i).serializeToStream(serializedData);
            }
            serializedData.writeInt32(this.color);
            serializedData.writeInt32(this.fontSize);
            serializedData.writeInt32(this.viewWidth);
            serializedData.writeInt32(this.viewHeight);
            serializedData.writeInt32(this.textAlign);
            PaintTypeface paintTypeface = this.textTypeface;
            serializedData.writeString(paintTypeface == null ? "" : paintTypeface.getKey());
        }

        public MediaEntity copy() {
            MediaEntity mediaEntity = new MediaEntity();
            mediaEntity.type = this.type;
            mediaEntity.subType = this.subType;
            mediaEntity.x = this.x;
            mediaEntity.y = this.y;
            mediaEntity.rotation = this.rotation;
            mediaEntity.width = this.width;
            mediaEntity.height = this.height;
            mediaEntity.text = this.text;
            mediaEntity.entities.addAll(this.entities);
            mediaEntity.color = this.color;
            mediaEntity.fontSize = this.fontSize;
            mediaEntity.viewWidth = this.viewWidth;
            mediaEntity.viewHeight = this.viewHeight;
            mediaEntity.scale = this.scale;
            mediaEntity.textViewWidth = this.textViewWidth;
            mediaEntity.textViewHeight = this.textViewHeight;
            mediaEntity.textViewX = this.textViewX;
            mediaEntity.textViewY = this.textViewY;
            mediaEntity.textAlign = this.textAlign;
            mediaEntity.textTypeface = this.textTypeface;
            return mediaEntity;
        }
    }

    public String getString() {
        byte[] bArr;
        String bytesToHex;
        PhotoFilterView.CurvesValue curvesValue;
        ArrayList<MediaEntity> arrayList;
        if (this.avatarStartTime == -1 && this.filterState == null && this.paintPath == null && (((arrayList = this.mediaEntities) == null || arrayList.isEmpty()) && this.cropState == null)) {
            bytesToHex = "";
        } else {
            int i = this.filterState != null ? 170 : 10;
            String str = this.paintPath;
            if (str != null) {
                bArr = str.getBytes();
                i += bArr.length;
            } else {
                bArr = null;
            }
            SerializedData serializedData = new SerializedData(i);
            serializedData.writeInt32(5);
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
                Point point = this.filterState.blurExcludePoint;
                if (point != null) {
                    serializedData.writeFloat(point.x);
                    serializedData.writeFloat(this.filterState.blurExcludePoint.y);
                } else {
                    serializedData.writeFloat(0.0f);
                    serializedData.writeFloat(0.0f);
                }
                serializedData.writeFloat(this.filterState.blurExcludeBlurSize);
                serializedData.writeFloat(this.filterState.blurAngle);
                for (int i2 = 0; i2 < 4; i2++) {
                    if (i2 == 0) {
                        curvesValue = this.filterState.curvesToolValue.luminanceCurve;
                    } else if (i2 == 1) {
                        curvesValue = this.filterState.curvesToolValue.redCurve;
                    } else if (i2 == 2) {
                        curvesValue = this.filterState.curvesToolValue.greenCurve;
                    } else {
                        curvesValue = this.filterState.curvesToolValue.blueCurve;
                    }
                    serializedData.writeFloat(curvesValue.blacksLevel);
                    serializedData.writeFloat(curvesValue.shadowsLevel);
                    serializedData.writeFloat(curvesValue.midtonesLevel);
                    serializedData.writeFloat(curvesValue.highlightsLevel);
                    serializedData.writeFloat(curvesValue.whitesLevel);
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
                for (int i3 = 0; i3 < size; i3++) {
                    this.mediaEntities.get(i3).serializeTo(serializedData);
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
            bytesToHex = Utilities.bytesToHex(serializedData.toByteArray());
            serializedData.cleanup();
        }
        return String.format(Locale.US, "-1_%d_%d_%d_%d_%d_%d_%d_%d_%d_%d_-%s_%s", Long.valueOf(this.startTime), Long.valueOf(this.endTime), Integer.valueOf(this.rotationValue), Integer.valueOf(this.originalWidth), Integer.valueOf(this.originalHeight), Integer.valueOf(this.bitrate), Integer.valueOf(this.resultWidth), Integer.valueOf(this.resultHeight), Long.valueOf(this.originalDuration), Integer.valueOf(this.framerate), bytesToHex, this.originalPath);
    }

    public boolean parseString(String str) {
        PhotoFilterView.CurvesValue curvesValue;
        if (str.length() < 6) {
            return false;
        }
        try {
            String[] split = str.split("_");
            int i = 11;
            if (split.length >= 11) {
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
                this.muted = this.bitrate == -1;
                if (split[11].startsWith("-")) {
                    String substring = split[11].substring(1);
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
                            this.filterState.blurExcludePoint = new Point(serializedData.readFloat(false), serializedData.readFloat(false));
                            this.filterState.blurExcludeBlurSize = serializedData.readFloat(false);
                            this.filterState.blurAngle = serializedData.readFloat(false);
                            for (int i2 = 0; i2 < 4; i2++) {
                                if (i2 == 0) {
                                    curvesValue = this.filterState.curvesToolValue.luminanceCurve;
                                } else if (i2 == 1) {
                                    curvesValue = this.filterState.curvesToolValue.redCurve;
                                } else if (i2 == 2) {
                                    curvesValue = this.filterState.curvesToolValue.greenCurve;
                                } else {
                                    curvesValue = this.filterState.curvesToolValue.blueCurve;
                                }
                                curvesValue.blacksLevel = serializedData.readFloat(false);
                                curvesValue.shadowsLevel = serializedData.readFloat(false);
                                curvesValue.midtonesLevel = serializedData.readFloat(false);
                                curvesValue.highlightsLevel = serializedData.readFloat(false);
                                curvesValue.whitesLevel = serializedData.readFloat(false);
                            }
                        }
                        if (serializedData.readByte(false) != 0) {
                            this.paintPath = new String(serializedData.readByteArray(false));
                        }
                        if (serializedData.readByte(false) != 0) {
                            int readInt322 = serializedData.readInt32(false);
                            this.mediaEntities = new ArrayList<>(readInt322);
                            for (int i3 = 0; i3 < readInt322; i3++) {
                                this.mediaEntities.add(new MediaEntity(serializedData));
                            }
                            this.isPhoto = serializedData.readByte(false) == 1;
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
                        serializedData.cleanup();
                    }
                    i = 12;
                }
                while (i < split.length) {
                    if (this.originalPath == null) {
                        this.originalPath = split[i];
                    } else {
                        this.originalPath += "_" + split[i];
                    }
                    i++;
                }
            }
            return true;
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    public boolean needConvert() {
        if (this.mediaEntities == null && this.paintPath == null && this.filterState == null && this.cropState == null && this.roundVideo && this.startTime <= 0) {
            long j = this.endTime;
            if (j == -1 || j == this.estimatedDuration) {
                return false;
            }
        }
        return true;
    }

    public boolean canAutoPlaySourceVideo() {
        return this.roundVideo;
    }
}
