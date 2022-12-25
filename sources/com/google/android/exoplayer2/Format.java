package com.google.android.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.ColorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Format implements Parcelable {
    public static final Parcelable.Creator<Format> CREATOR = new Parcelable.Creator<Format>() {
        @Override
        public Format createFromParcel(Parcel parcel) {
            return new Format(parcel);
        }

        @Override
        public Format[] newArray(int i) {
            return new Format[i];
        }
    };
    public final int accessibilityChannel;
    public final int bitrate;
    public final int channelCount;
    public final String codecs;
    public final ColorInfo colorInfo;
    public final String containerMimeType;
    public final DrmInitData drmInitData;
    public final int encoderDelay;
    public final int encoderPadding;
    public final Class<? extends ExoMediaCrypto> exoMediaCryptoType;
    public final float frameRate;
    private int hashCode;
    public final int height;
    public final String f13id;
    public final List<byte[]> initializationData;
    public final String label;
    public final String language;
    public final int maxInputSize;
    public final Metadata metadata;
    public final int pcmEncoding;
    public final float pixelWidthHeightRatio;
    public final byte[] projectionData;
    public final int roleFlags;
    public final int rotationDegrees;
    public final String sampleMimeType;
    public final int sampleRate;
    public final int selectionFlags;
    public final int stereoMode;
    public final long subsampleOffsetUs;
    public final int width;

    @Override
    public int describeContents() {
        return 0;
    }

    public static Format createVideoContainerFormat(String str, String str2, String str3, String str4, String str5, Metadata metadata, int i, int i2, int i3, float f, List<byte[]> list, int i4, int i5) {
        return new Format(str, str2, i4, i5, i, str5, metadata, str3, str4, -1, list, null, Long.MAX_VALUE, i2, i3, f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, null, -1, null);
    }

    public static Format createVideoSampleFormat(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, DrmInitData drmInitData) {
        return createVideoSampleFormat(str, str2, str3, i, i2, i3, i4, f, list, i5, f2, null, -1, null, drmInitData);
    }

    public static Format createVideoSampleFormat(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, byte[] bArr, int i6, ColorInfo colorInfo, DrmInitData drmInitData) {
        return new Format(str, null, 0, 0, i, str3, null, null, str2, i2, list, drmInitData, Long.MAX_VALUE, i3, i4, f, i5, f2, bArr, i6, colorInfo, -1, -1, -1, -1, -1, null, -1, null);
    }

    public static Format createAudioContainerFormat(String str, String str2, String str3, String str4, String str5, Metadata metadata, int i, int i2, int i3, List<byte[]> list, int i4, int i5, String str6) {
        return new Format(str, str2, i4, i5, i, str5, metadata, str3, str4, -1, list, null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i2, i3, -1, -1, -1, str6, -1, null);
    }

    public static Format createAudioSampleFormat(String str, String str2, String str3, int i, int i2, int i3, int i4, List<byte[]> list, DrmInitData drmInitData, int i5, String str4) {
        return createAudioSampleFormat(str, str2, str3, i, i2, i3, i4, -1, list, drmInitData, i5, str4);
    }

    public static Format createAudioSampleFormat(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, List<byte[]> list, DrmInitData drmInitData, int i6, String str4) {
        return createAudioSampleFormat(str, str2, str3, i, i2, i3, i4, i5, -1, -1, list, drmInitData, i6, str4, null);
    }

    public static Format createAudioSampleFormat(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, List<byte[]> list, DrmInitData drmInitData, int i8, String str4, Metadata metadata) {
        return new Format(str, null, i8, 0, i, str3, metadata, null, str2, i2, list, drmInitData, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, i5, i6, i7, str4, -1, null);
    }

    public static Format createTextContainerFormat(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, String str6) {
        return createTextContainerFormat(str, str2, str3, str4, str5, i, i2, i3, str6, -1);
    }

    public static Format createTextContainerFormat(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, String str6, int i4) {
        return new Format(str, str2, i2, i3, i, str5, null, str3, str4, -1, null, null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str6, i4, null);
    }

    public static Format createTextSampleFormat(String str, String str2, int i, String str3) {
        return createTextSampleFormat(str, str2, i, str3, null);
    }

    public static Format createTextSampleFormat(String str, String str2, int i, String str3, DrmInitData drmInitData) {
        return createTextSampleFormat(str, str2, null, -1, i, str3, -1, drmInitData, Long.MAX_VALUE, Collections.emptyList());
    }

    public static Format createTextSampleFormat(String str, String str2, String str3, int i, int i2, String str4, DrmInitData drmInitData, long j) {
        return createTextSampleFormat(str, str2, str3, i, i2, str4, -1, drmInitData, j, Collections.emptyList());
    }

    public static Format createTextSampleFormat(String str, String str2, String str3, int i, int i2, String str4, int i3, DrmInitData drmInitData, long j, List<byte[]> list) {
        return new Format(str, null, i2, 0, i, str3, null, null, str2, -1, list, drmInitData, j, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str4, i3, null);
    }

    public static Format createImageSampleFormat(String str, String str2, String str3, int i, int i2, List<byte[]> list, String str4, DrmInitData drmInitData) {
        return new Format(str, null, i2, 0, i, str3, null, null, str2, -1, list, drmInitData, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str4, -1, null);
    }

    public static Format createContainerFormat(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, String str6) {
        return new Format(str, str2, i2, i3, i, str5, null, str3, str4, -1, null, null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str6, -1, null);
    }

    public static Format createSampleFormat(String str, String str2, long j) {
        return new Format(str, null, 0, 0, -1, null, null, null, str2, -1, null, null, j, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, null, -1, null);
    }

    public static Format createSampleFormat(String str, String str2, String str3, int i, DrmInitData drmInitData) {
        return new Format(str, null, 0, 0, i, str3, null, null, str2, -1, null, drmInitData, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, null, -1, null);
    }

    Format(String str, String str2, int i, int i2, int i3, String str3, Metadata metadata, String str4, String str5, int i4, List<byte[]> list, DrmInitData drmInitData, long j, int i5, int i6, float f, int i7, float f2, byte[] bArr, int i8, ColorInfo colorInfo, int i9, int i10, int i11, int i12, int i13, String str6, int i14, Class<? extends ExoMediaCrypto> cls) {
        this.f13id = str;
        this.label = str2;
        this.selectionFlags = i;
        this.roleFlags = i2;
        this.bitrate = i3;
        this.codecs = str3;
        this.metadata = metadata;
        this.containerMimeType = str4;
        this.sampleMimeType = str5;
        this.maxInputSize = i4;
        this.initializationData = list == null ? Collections.emptyList() : list;
        this.drmInitData = drmInitData;
        this.subsampleOffsetUs = j;
        this.width = i5;
        this.height = i6;
        this.frameRate = f;
        int i15 = i7;
        this.rotationDegrees = i15 == -1 ? 0 : i15;
        this.pixelWidthHeightRatio = f2 == -1.0f ? 1.0f : f2;
        this.projectionData = bArr;
        this.stereoMode = i8;
        this.colorInfo = colorInfo;
        this.channelCount = i9;
        this.sampleRate = i10;
        this.pcmEncoding = i11;
        int i16 = i12;
        this.encoderDelay = i16 == -1 ? 0 : i16;
        this.encoderPadding = i13 != -1 ? i13 : 0;
        this.language = Util.normalizeLanguageCode(str6);
        this.accessibilityChannel = i14;
        this.exoMediaCryptoType = cls;
    }

    Format(Parcel parcel) {
        this.f13id = parcel.readString();
        this.label = parcel.readString();
        this.selectionFlags = parcel.readInt();
        this.roleFlags = parcel.readInt();
        this.bitrate = parcel.readInt();
        this.codecs = parcel.readString();
        this.metadata = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
        this.containerMimeType = parcel.readString();
        this.sampleMimeType = parcel.readString();
        this.maxInputSize = parcel.readInt();
        int readInt = parcel.readInt();
        this.initializationData = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.initializationData.add(parcel.createByteArray());
        }
        this.drmInitData = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.subsampleOffsetUs = parcel.readLong();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.frameRate = parcel.readFloat();
        this.rotationDegrees = parcel.readInt();
        this.pixelWidthHeightRatio = parcel.readFloat();
        this.projectionData = Util.readBoolean(parcel) ? parcel.createByteArray() : null;
        this.stereoMode = parcel.readInt();
        this.colorInfo = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.channelCount = parcel.readInt();
        this.sampleRate = parcel.readInt();
        this.pcmEncoding = parcel.readInt();
        this.encoderDelay = parcel.readInt();
        this.encoderPadding = parcel.readInt();
        this.language = parcel.readString();
        this.accessibilityChannel = parcel.readInt();
        this.exoMediaCryptoType = null;
    }

    public Format copyWithMaxInputSize(int i) {
        return new Format(this.f13id, this.label, this.selectionFlags, this.roleFlags, this.bitrate, this.codecs, this.metadata, this.containerMimeType, this.sampleMimeType, i, this.initializationData, this.drmInitData, this.subsampleOffsetUs, this.width, this.height, this.frameRate, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, this.language, this.accessibilityChannel, this.exoMediaCryptoType);
    }

    public Format copyWithSubsampleOffsetUs(long j) {
        return new Format(this.f13id, this.label, this.selectionFlags, this.roleFlags, this.bitrate, this.codecs, this.metadata, this.containerMimeType, this.sampleMimeType, this.maxInputSize, this.initializationData, this.drmInitData, j, this.width, this.height, this.frameRate, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, this.language, this.accessibilityChannel, this.exoMediaCryptoType);
    }

    public Format copyWithLabel(String str) {
        return new Format(this.f13id, str, this.selectionFlags, this.roleFlags, this.bitrate, this.codecs, this.metadata, this.containerMimeType, this.sampleMimeType, this.maxInputSize, this.initializationData, this.drmInitData, this.subsampleOffsetUs, this.width, this.height, this.frameRate, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, this.language, this.accessibilityChannel, this.exoMediaCryptoType);
    }

    public Format copyWithContainerInfo(String str, String str2, String str3, String str4, Metadata metadata, int i, int i2, int i3, int i4, int i5, String str5) {
        Metadata metadata2 = this.metadata;
        return new Format(str, str2, i5, this.roleFlags, i, str4, metadata2 != null ? metadata2.copyWithAppendedEntriesFrom(metadata) : metadata, this.containerMimeType, str3, this.maxInputSize, this.initializationData, this.drmInitData, this.subsampleOffsetUs, i2, i3, this.frameRate, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, i4, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, str5, this.accessibilityChannel, this.exoMediaCryptoType);
    }

    public com.google.android.exoplayer2.Format copyWithManifestFormatInfo(com.google.android.exoplayer2.Format r35) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.Format.copyWithManifestFormatInfo(com.google.android.exoplayer2.Format):com.google.android.exoplayer2.Format");
    }

    public Format copyWithGaplessInfo(int i, int i2) {
        return new Format(this.f13id, this.label, this.selectionFlags, this.roleFlags, this.bitrate, this.codecs, this.metadata, this.containerMimeType, this.sampleMimeType, this.maxInputSize, this.initializationData, this.drmInitData, this.subsampleOffsetUs, this.width, this.height, this.frameRate, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, i, i2, this.language, this.accessibilityChannel, this.exoMediaCryptoType);
    }

    public Format copyWithFrameRate(float f) {
        return new Format(this.f13id, this.label, this.selectionFlags, this.roleFlags, this.bitrate, this.codecs, this.metadata, this.containerMimeType, this.sampleMimeType, this.maxInputSize, this.initializationData, this.drmInitData, this.subsampleOffsetUs, this.width, this.height, f, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, this.language, this.accessibilityChannel, this.exoMediaCryptoType);
    }

    public Format copyWithDrmInitData(DrmInitData drmInitData) {
        return copyWithAdjustments(drmInitData, this.metadata);
    }

    public Format copyWithMetadata(Metadata metadata) {
        return copyWithAdjustments(this.drmInitData, metadata);
    }

    public Format copyWithAdjustments(DrmInitData drmInitData, Metadata metadata) {
        if (drmInitData == this.drmInitData && metadata == this.metadata) {
            return this;
        }
        return new Format(this.f13id, this.label, this.selectionFlags, this.roleFlags, this.bitrate, this.codecs, metadata, this.containerMimeType, this.sampleMimeType, this.maxInputSize, this.initializationData, drmInitData, this.subsampleOffsetUs, this.width, this.height, this.frameRate, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, this.language, this.accessibilityChannel, this.exoMediaCryptoType);
    }

    public Format copyWithBitrate(int i) {
        return new Format(this.f13id, this.label, this.selectionFlags, this.roleFlags, i, this.codecs, this.metadata, this.containerMimeType, this.sampleMimeType, this.maxInputSize, this.initializationData, this.drmInitData, this.subsampleOffsetUs, this.width, this.height, this.frameRate, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, this.language, this.accessibilityChannel, this.exoMediaCryptoType);
    }

    public Format copyWithExoMediaCryptoType(Class<? extends ExoMediaCrypto> cls) {
        return new Format(this.f13id, this.label, this.selectionFlags, this.roleFlags, this.bitrate, this.codecs, this.metadata, this.containerMimeType, this.sampleMimeType, this.maxInputSize, this.initializationData, this.drmInitData, this.subsampleOffsetUs, this.width, this.height, this.frameRate, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, this.language, this.accessibilityChannel, cls);
    }

    public int getPixelCount() {
        int i;
        int i2 = this.width;
        if (i2 == -1 || (i = this.height) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public String toString() {
        return "Format(" + this.f13id + ", " + this.label + ", " + this.containerMimeType + ", " + this.sampleMimeType + ", " + this.codecs + ", " + this.bitrate + ", " + this.language + ", [" + this.width + ", " + this.height + ", " + this.frameRate + "], [" + this.channelCount + ", " + this.sampleRate + "])";
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            String str = this.f13id;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.label;
            int hashCode2 = (((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.selectionFlags) * 31) + this.roleFlags) * 31) + this.bitrate) * 31;
            String str3 = this.codecs;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Metadata metadata = this.metadata;
            int hashCode4 = (hashCode3 + (metadata == null ? 0 : metadata.hashCode())) * 31;
            String str4 = this.containerMimeType;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.sampleMimeType;
            int hashCode6 = (((((((((((((((((((((((((((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.maxInputSize) * 31) + ((int) this.subsampleOffsetUs)) * 31) + this.width) * 31) + this.height) * 31) + Float.floatToIntBits(this.frameRate)) * 31) + this.rotationDegrees) * 31) + Float.floatToIntBits(this.pixelWidthHeightRatio)) * 31) + this.stereoMode) * 31) + this.channelCount) * 31) + this.sampleRate) * 31) + this.pcmEncoding) * 31) + this.encoderDelay) * 31) + this.encoderPadding) * 31;
            String str6 = this.language;
            int hashCode7 = (((hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.accessibilityChannel) * 31;
            Class<? extends ExoMediaCrypto> cls = this.exoMediaCryptoType;
            this.hashCode = hashCode7 + (cls != null ? cls.hashCode() : 0);
        }
        return this.hashCode;
    }

    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || Format.class != obj.getClass()) {
            return false;
        }
        Format format = (Format) obj;
        int i2 = this.hashCode;
        return (i2 == 0 || (i = format.hashCode) == 0 || i2 == i) && this.selectionFlags == format.selectionFlags && this.roleFlags == format.roleFlags && this.bitrate == format.bitrate && this.maxInputSize == format.maxInputSize && this.subsampleOffsetUs == format.subsampleOffsetUs && this.width == format.width && this.height == format.height && this.rotationDegrees == format.rotationDegrees && this.stereoMode == format.stereoMode && this.channelCount == format.channelCount && this.sampleRate == format.sampleRate && this.pcmEncoding == format.pcmEncoding && this.encoderDelay == format.encoderDelay && this.encoderPadding == format.encoderPadding && this.accessibilityChannel == format.accessibilityChannel && Float.compare(this.frameRate, format.frameRate) == 0 && Float.compare(this.pixelWidthHeightRatio, format.pixelWidthHeightRatio) == 0 && Util.areEqual(this.exoMediaCryptoType, format.exoMediaCryptoType) && Util.areEqual(this.f13id, format.f13id) && Util.areEqual(this.label, format.label) && Util.areEqual(this.codecs, format.codecs) && Util.areEqual(this.containerMimeType, format.containerMimeType) && Util.areEqual(this.sampleMimeType, format.sampleMimeType) && Util.areEqual(this.language, format.language) && Arrays.equals(this.projectionData, format.projectionData) && Util.areEqual(this.metadata, format.metadata) && Util.areEqual(this.colorInfo, format.colorInfo) && Util.areEqual(this.drmInitData, format.drmInitData) && initializationDataEquals(format);
    }

    public boolean initializationDataEquals(Format format) {
        if (this.initializationData.size() != format.initializationData.size()) {
            return false;
        }
        for (int i = 0; i < this.initializationData.size(); i++) {
            if (!Arrays.equals(this.initializationData.get(i), format.initializationData.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13id);
        parcel.writeString(this.label);
        parcel.writeInt(this.selectionFlags);
        parcel.writeInt(this.roleFlags);
        parcel.writeInt(this.bitrate);
        parcel.writeString(this.codecs);
        parcel.writeParcelable(this.metadata, 0);
        parcel.writeString(this.containerMimeType);
        parcel.writeString(this.sampleMimeType);
        parcel.writeInt(this.maxInputSize);
        int size = this.initializationData.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(this.initializationData.get(i2));
        }
        parcel.writeParcelable(this.drmInitData, 0);
        parcel.writeLong(this.subsampleOffsetUs);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeFloat(this.frameRate);
        parcel.writeInt(this.rotationDegrees);
        parcel.writeFloat(this.pixelWidthHeightRatio);
        Util.writeBoolean(parcel, this.projectionData != null);
        byte[] bArr = this.projectionData;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.stereoMode);
        parcel.writeParcelable(this.colorInfo, i);
        parcel.writeInt(this.channelCount);
        parcel.writeInt(this.sampleRate);
        parcel.writeInt(this.pcmEncoding);
        parcel.writeInt(this.encoderDelay);
        parcel.writeInt(this.encoderPadding);
        parcel.writeString(this.language);
        parcel.writeInt(this.accessibilityChannel);
    }
}
