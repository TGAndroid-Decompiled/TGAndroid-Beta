package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$InputEncryptedFile;
import org.telegram.tgnet.TLRPC$InputFile;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$TL_messageEntityCustomEmoji;
import org.telegram.tgnet.TLRPC$TL_messageMediaVenue;
import org.telegram.tgnet.tl.TL_stories$MediaArea;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.Paint.PaintTypeface;
import org.telegram.ui.Components.Paint.Views.LinkPreview;
import org.telegram.ui.Components.PhotoFilterView;
import org.telegram.ui.Components.Point;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Stories.recorder.StoryEntry;

public class VideoEditedInfo {
    public int account;
    public boolean alreadyScheduledConverting;
    public String backgroundPath;
    public int bitrate;
    public String blurPath;
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
    public boolean forceFragmenting;
    public boolean fromCamera;
    public Integer gradientBottomColor;
    public Integer gradientTopColor;
    public StoryEntry.HDRInfo hdrInfo;
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
    public long avatarStartTime = -1;
    public int framerate = 24;
    public float volume = 1.0f;
    public long wallpaperPeerId = Long.MIN_VALUE;
    public boolean needUpdateProgress = false;
    public boolean shouldLimitFps = true;
    public boolean tryUseHevc = false;
    public ArrayList<MediaCodecVideoConvertor.MixedSoundInfo> mixedSoundInfos = new ArrayList<>();

    public static class EmojiEntity extends TLRPC$TL_messageEntityCustomEmoji {
        public String documentAbsolutePath;
        public MediaEntity entity;
        public byte subType;

        @Override
        public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
            super.readParams(abstractSerializedData, z);
            this.subType = abstractSerializedData.readByte(z);
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
            abstractSerializedData.writeByte(this.subType);
            abstractSerializedData.writeBool(!TextUtils.isEmpty(this.documentAbsolutePath));
            if (TextUtils.isEmpty(this.documentAbsolutePath)) {
                return;
            }
            abstractSerializedData.writeString(this.documentAbsolutePath);
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
        public int H;
        public int W;
        public float additionalHeight;
        public float additionalWidth;
        public AnimatedFileDrawable animatedFileDrawable;
        public Bitmap bitmap;
        public Canvas canvas;
        public int color;
        public float currentFrame;
        public boolean customTextView;
        public float density;
        public TLRPC$Document document;
        public ArrayList<EmojiEntity> entities;
        public boolean firstSeek;
        public int fontSize;
        public float framesPerDraw;
        public float height;
        public LinkPreview.WebPagePreview linkSettings;
        public boolean looped;
        public Matrix matrix;
        public TLRPC$MessageMedia media;
        public TL_stories$MediaArea mediaArea;
        public int[] metadata;
        public Object parentObject;
        public long ptr;
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
        public PaintTypeface textTypeface;
        public String textTypefaceKey;
        public float textViewHeight;
        public float textViewWidth;
        public float textViewX;
        public float textViewY;
        public byte type;
        public View view;
        public int viewHeight;
        public int viewWidth;
        public ReactionsLayoutInBubble.VisibleReaction visibleReaction;
        public float width;
        public float x;
        public float y;

        public MediaEntity() {
            this.text = "";
            this.entities = new ArrayList<>();
            this.segmentedPath = "";
            this.scale = 1.0f;
        }

        public MediaEntity(AbstractSerializedData abstractSerializedData, boolean z) {
            this(abstractSerializedData, z, false);
        }

        public MediaEntity(AbstractSerializedData abstractSerializedData, boolean z, boolean z2) {
            this.text = "";
            this.entities = new ArrayList<>();
            this.segmentedPath = "";
            this.scale = 1.0f;
            this.type = abstractSerializedData.readByte(z2);
            this.subType = abstractSerializedData.readByte(z2);
            this.x = abstractSerializedData.readFloat(z2);
            this.y = abstractSerializedData.readFloat(z2);
            this.rotation = abstractSerializedData.readFloat(z2);
            this.width = abstractSerializedData.readFloat(z2);
            this.height = abstractSerializedData.readFloat(z2);
            this.text = abstractSerializedData.readString(z2);
            int readInt32 = abstractSerializedData.readInt32(z2);
            for (int i = 0; i < readInt32; i++) {
                EmojiEntity emojiEntity = new EmojiEntity();
                abstractSerializedData.readInt32(z2);
                emojiEntity.readParams(abstractSerializedData, z2);
                this.entities.add(emojiEntity);
            }
            this.color = abstractSerializedData.readInt32(z2);
            this.fontSize = abstractSerializedData.readInt32(z2);
            this.viewWidth = abstractSerializedData.readInt32(z2);
            this.viewHeight = abstractSerializedData.readInt32(z2);
            this.textAlign = abstractSerializedData.readInt32(z2);
            String readString = abstractSerializedData.readString(z2);
            this.textTypefaceKey = readString;
            this.textTypeface = PaintTypeface.find(readString);
            this.scale = abstractSerializedData.readFloat(z2);
            this.textViewWidth = abstractSerializedData.readFloat(z2);
            this.textViewHeight = abstractSerializedData.readFloat(z2);
            this.textViewX = abstractSerializedData.readFloat(z2);
            this.textViewY = abstractSerializedData.readFloat(z2);
            if (z) {
                int readInt322 = abstractSerializedData.readInt32(z2);
                if (readInt322 == 1450380236) {
                    this.document = null;
                } else {
                    this.document = TLRPC$Document.TLdeserialize(abstractSerializedData, readInt322, z2);
                }
            }
            byte b = this.type;
            if (b == 3) {
                this.density = abstractSerializedData.readFloat(z2);
                this.mediaArea = TL_stories$MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z2), z2);
                this.media = TLRPC$MessageMedia.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z2), z2);
                if (abstractSerializedData.remaining() <= 0 || abstractSerializedData.readInt32(z2) != -559038737) {
                    return;
                }
                String readString2 = abstractSerializedData.readString(z2);
                TLRPC$MessageMedia tLRPC$MessageMedia = this.media;
                if (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaVenue) {
                    ((TLRPC$TL_messageMediaVenue) tLRPC$MessageMedia).emoji = readString2;
                    return;
                }
                return;
            }
            if (b == 7) {
                this.density = abstractSerializedData.readFloat(z2);
                this.mediaArea = TL_stories$MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z2), z2);
                this.linkSettings = LinkPreview.WebPagePreview.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z2), z2);
            } else {
                if (b == 4) {
                    this.mediaArea = TL_stories$MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z2), z2);
                    return;
                }
                if (b != 5) {
                    if (b == 2) {
                        this.segmentedPath = abstractSerializedData.readString(z2);
                    }
                } else {
                    this.roundOffset = abstractSerializedData.readInt64(z2);
                    this.roundLeft = abstractSerializedData.readInt64(z2);
                    this.roundRight = abstractSerializedData.readInt64(z2);
                    this.roundDuration = abstractSerializedData.readInt64(z2);
                }
            }
        }

        public void serializeTo(AbstractSerializedData abstractSerializedData, boolean z) {
            String key;
            abstractSerializedData.writeByte(this.type);
            abstractSerializedData.writeByte(this.subType);
            abstractSerializedData.writeFloat(this.x);
            abstractSerializedData.writeFloat(this.y);
            abstractSerializedData.writeFloat(this.rotation);
            abstractSerializedData.writeFloat(this.width);
            abstractSerializedData.writeFloat(this.height);
            abstractSerializedData.writeString(this.text);
            abstractSerializedData.writeInt32(this.entities.size());
            for (int i = 0; i < this.entities.size(); i++) {
                this.entities.get(i).serializeToStream(abstractSerializedData);
            }
            abstractSerializedData.writeInt32(this.color);
            abstractSerializedData.writeInt32(this.fontSize);
            abstractSerializedData.writeInt32(this.viewWidth);
            abstractSerializedData.writeInt32(this.viewHeight);
            abstractSerializedData.writeInt32(this.textAlign);
            PaintTypeface paintTypeface = this.textTypeface;
            if (paintTypeface == null) {
                key = this.textTypefaceKey;
                if (key == null) {
                    key = "";
                }
            } else {
                key = paintTypeface.getKey();
            }
            abstractSerializedData.writeString(key);
            abstractSerializedData.writeFloat(this.scale);
            abstractSerializedData.writeFloat(this.textViewWidth);
            abstractSerializedData.writeFloat(this.textViewHeight);
            abstractSerializedData.writeFloat(this.textViewX);
            abstractSerializedData.writeFloat(this.textViewY);
            if (z) {
                TLRPC$Document tLRPC$Document = this.document;
                if (tLRPC$Document == null) {
                    abstractSerializedData.writeInt32(1450380236);
                } else {
                    tLRPC$Document.serializeToStream(abstractSerializedData);
                }
            }
            byte b = this.type;
            if (b == 3) {
                abstractSerializedData.writeFloat(this.density);
                this.mediaArea.serializeToStream(abstractSerializedData);
                TLRPC$MessageMedia tLRPC$MessageMedia = this.media;
                if (tLRPC$MessageMedia.provider == null) {
                    tLRPC$MessageMedia.provider = "";
                }
                if (tLRPC$MessageMedia.venue_id == null) {
                    tLRPC$MessageMedia.venue_id = "";
                }
                if (tLRPC$MessageMedia.venue_type == null) {
                    tLRPC$MessageMedia.venue_type = "";
                }
                tLRPC$MessageMedia.serializeToStream(abstractSerializedData);
                TLRPC$MessageMedia tLRPC$MessageMedia2 = this.media;
                if ((tLRPC$MessageMedia2 instanceof TLRPC$TL_messageMediaVenue) && ((TLRPC$TL_messageMediaVenue) tLRPC$MessageMedia2).emoji != null) {
                    abstractSerializedData.writeInt32(-559038737);
                    abstractSerializedData.writeString(((TLRPC$TL_messageMediaVenue) this.media).emoji);
                    return;
                } else {
                    abstractSerializedData.writeInt32(1450380236);
                    return;
                }
            }
            if (b == 7) {
                abstractSerializedData.writeFloat(this.density);
                this.mediaArea.serializeToStream(abstractSerializedData);
                this.linkSettings.serializeToStream(abstractSerializedData);
            } else {
                if (b == 4) {
                    this.mediaArea.serializeToStream(abstractSerializedData);
                    return;
                }
                if (b != 5) {
                    if (b == 2) {
                        abstractSerializedData.writeString(this.segmentedPath);
                    }
                } else {
                    abstractSerializedData.writeInt64(this.roundOffset);
                    abstractSerializedData.writeInt64(this.roundLeft);
                    abstractSerializedData.writeInt64(this.roundRight);
                    abstractSerializedData.writeInt64(this.roundDuration);
                }
            }
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
            mediaEntity.metadata = this.metadata;
            mediaEntity.ptr = this.ptr;
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
            return mediaEntity;
        }
    }

    public String getString() {
        byte[] bArr;
        String bytesToHex;
        PhotoFilterView.CurvesValue curvesValue;
        ArrayList<MediaEntity> arrayList;
        if (this.avatarStartTime == -1 && this.filterState == null && this.paintPath == null && this.blurPath == null && (((arrayList = this.mediaEntities) == null || arrayList.isEmpty()) && this.cropState == null)) {
            bytesToHex = "";
        } else {
            int i = this.filterState != null ? 170 : 10;
            String str = this.paintPath;
            byte[] bArr2 = null;
            if (str != null) {
                bArr = str.getBytes();
                i += bArr.length;
            } else {
                bArr = null;
            }
            String str2 = this.blurPath;
            if (str2 != null) {
                bArr2 = str2.getBytes();
                i += bArr2.length;
            }
            SerializedData serializedData = new SerializedData(i);
            serializedData.writeInt32(10);
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
                    this.mediaEntities.get(i3).serializeTo(serializedData, false);
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
                                this.mediaEntities.add(new MediaEntity(serializedData, false));
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
        MediaController.CropState cropState;
        if (this.isStory) {
            if (this.fromCamera && this.mixedSoundInfos.isEmpty() && this.mediaEntities == null && this.paintPath == null && this.blurPath == null && this.filterState == null && (((cropState = this.cropState) == null || cropState.isEmpty()) && this.startTime <= 0)) {
                long j = this.endTime;
                if ((j == -1 || j == this.estimatedDuration) && this.originalHeight == this.resultHeight && this.originalWidth == this.resultWidth) {
                    return false;
                }
            }
            return true;
        }
        if (this.mixedSoundInfos.isEmpty() && this.mediaEntities == null && this.paintPath == null && this.blurPath == null && this.filterState == null && this.cropState == null && this.roundVideo && this.startTime <= 0) {
            long j2 = this.endTime;
            if (j2 == -1 || j2 == this.estimatedDuration) {
                return false;
            }
        }
        return true;
    }

    public boolean canAutoPlaySourceVideo() {
        return this.roundVideo;
    }
}
