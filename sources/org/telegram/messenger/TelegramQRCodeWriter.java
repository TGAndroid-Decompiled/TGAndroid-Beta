package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.GradientDrawable;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import com.android.billingclient.api.zzbv;
import com.google.mlkit.common.sdkinternal.TaskQueue;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Result;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.ECIEncoderSet;
import com.google.zxing.common.StringUtils;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.GenericGFPoly;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;
import com.google.zxing.qrcode.encoder.BlockPair;
import com.google.zxing.qrcode.encoder.ByteMatrix;
import com.google.zxing.qrcode.encoder.Encoder;
import com.google.zxing.qrcode.encoder.MaskUtil;
import com.google.zxing.qrcode.encoder.MinimalEncoder$ResultList$ResultNode;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public final class TelegramQRCodeWriter {
    private static final int QUIET_ZONE_SIZE = 4;
    private int imageBlockX;
    private int imageBloks;
    private int imageSize;
    private ByteMatrix input;
    private int sideQuadSize;
    private float[] radii = new float[8];
    public boolean includeSideQuads = true;

    public static void drawSideQuads(Canvas canvas, float f, float f2, Paint paint, float f3, float f4, int i, float f5, float f6, float[] fArr, boolean z) {
        float f7;
        float f8;
        float f9;
        float f10;
        Path path = new Path();
        for (int i2 = 0; i2 < 3; i2++) {
            if (i2 == 0) {
                f10 = i;
                f9 = f10;
            } else {
                if (i2 == 1) {
                    f8 = i;
                    f7 = (f5 - (f3 * f4)) - f8;
                } else {
                    f7 = i;
                    f8 = (f5 - (f3 * f4)) - f7;
                }
                float f11 = f8;
                f9 = f7;
                f10 = f11;
            }
            float f12 = f9 + f;
            float f13 = f10 + f2;
            if (z) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f14 = (f3 - 1.0f) * f4;
                rectF.set(f12 + f4, f13 + f4, f12 + f14, f14 + f13);
                float f15 = ((f3 * f4) / 4.0f) * f6;
                path.reset();
                path.addRoundRect(rectF, f15, f15, Path.Direction.CW);
                path.close();
                canvas.save();
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            }
            float f16 = f3 * f4;
            float f17 = (f16 / 3.0f) * f6;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(f12, f13, f12 + f16, f16 + f13);
            canvas.drawRoundRect(rectF2, f17, f17, paint);
            if (z) {
                canvas.restore();
            }
            float f18 = (f3 - 2.0f) * f4;
            float f19 = (f18 / 4.0f) * f6;
            float f20 = 2.0f * f4;
            rectF2.set(f12 + f20, f20 + f13, f12 + f18, f13 + f18);
            canvas.drawRoundRect(rectF2, f19, f19, paint);
        }
    }

    public static void drawSideQuadsGradient(Canvas canvas, Paint paint, GradientDrawable gradientDrawable, float f, float f2, int i, float f3, float f4, float[] fArr, int i2, int i3) {
        float f5;
        float f6;
        float f7;
        float f8;
        boolean z = Color.alpha(i2) == 0;
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(fArr);
        Path path = new Path();
        RectF rectF = new RectF();
        for (int i4 = 0; i4 < 3; i4++) {
            if (i4 == 0) {
                f5 = i;
                f7 = f5;
            } else {
                if (i4 == 1) {
                    f6 = i;
                    f5 = (f3 - (f * f2)) - f6;
                } else {
                    f5 = i;
                    f6 = (f3 - (f * f2)) - f5;
                }
                f7 = f6;
            }
            if (z) {
                float f9 = (f - 1.0f) * f2;
                f8 = 1.0f;
                rectF.set(f5 + f2, f7 + f2, f5 + f9, f9 + f7);
                float f10 = ((f * f2) / 4.0f) * f4;
                path.reset();
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                path.close();
                canvas.save();
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            } else {
                f8 = 1.0f;
            }
            float f11 = f * f2;
            Arrays.fill(fArr, (f11 / 3.0f) * f4);
            gradientDrawable.setColor(i3);
            gradientDrawable.setBounds((int) f5, (int) f7, (int) (f5 + f11), (int) (f7 + f11));
            gradientDrawable.draw(canvas);
            float f12 = f5;
            float f13 = f12 + f2;
            float f14 = f7 + f2;
            float f15 = (f - f8) * f2;
            float f16 = f12 + f15;
            float f17 = f15 + f7;
            canvas.drawRect(f13, f14, f16, f17, paint);
            if (z) {
                canvas.restore();
            }
            if (!z) {
                Arrays.fill(fArr, (f11 / 4.0f) * f4);
                gradientDrawable.setColor(i2);
                gradientDrawable.setBounds((int) f13, (int) f14, (int) f16, (int) f17);
                gradientDrawable.draw(canvas);
            }
            float f18 = (f - 2.0f) * f2;
            Arrays.fill(fArr, (f18 / 4.0f) * f4);
            gradientDrawable.setColor(i3);
            float f19 = 2.0f * f2;
            gradientDrawable.setBounds((int) (f12 + f19), (int) (f19 + f7), (int) (f12 + f18), (int) (f7 + f18));
            gradientDrawable.draw(canvas);
        }
    }

    private boolean has(int i, int i2) {
        int i3;
        int i4 = this.imageBlockX;
        if (i >= i4 && i < (i3 = this.imageBloks + i4) && i2 >= i4 && i2 < i3) {
            return false;
        }
        int i5 = this.sideQuadSize;
        if ((i < i5 || i >= this.input.width - i5) && i2 < i5) {
            return false;
        }
        if ((i >= i5 || i2 < this.input.height - i5) && i >= 0 && i2 >= 0) {
            ByteMatrix byteMatrix = this.input;
            if (i < byteMatrix.width && i2 < byteMatrix.height && byteMatrix.get(i, i2) == 1) {
                return true;
            }
        }
        return false;
    }

    public Bitmap encode(String str, int i, int i2, Map<EncodeHintType, ?> map, Bitmap bitmap) {
        return encode(str, i, i2, map, bitmap, 1.0f, -1, -16777216);
    }

    public int getImageSize() {
        return this.imageSize;
    }

    public int getSideSize() {
        return this.sideQuadSize;
    }

    public Bitmap encode(String str, int i, int i2, Map<EncodeHintType, ?> map, Bitmap bitmap, float f, int i3, int i4) {
        ErrorCorrectionLevel errorCorrectionLevel;
        int i5;
        boolean z;
        boolean z2;
        Charset charsetForName;
        char c;
        Mode mode;
        int i6;
        int characterCountBits;
        int i7;
        Version versionForNumber;
        int characterCountBits2;
        int i8;
        Version versionForNumber2;
        Version versionForNumber3;
        Version version;
        BitArray bitArray;
        CharacterSetECI characterSetECI;
        int i9;
        Paint paint;
        float f2;
        boolean z3;
        boolean z4;
        byte[][] bArr;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        char c2;
        int i14;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        }
        ErrorCorrectionLevel errorCorrectionLevelValueOf = ErrorCorrectionLevel.L;
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.ERROR_CORRECTION;
            if (map.containsKey(encodeHintType)) {
                errorCorrectionLevelValueOf = ErrorCorrectionLevel.valueOf(map.get(encodeHintType).toString());
            }
            EncodeHintType encodeHintType2 = EncodeHintType.MARGIN;
            if (map.containsKey(encodeHintType2)) {
                i5 = Integer.parseInt(map.get(encodeHintType2).toString());
                errorCorrectionLevel = errorCorrectionLevelValueOf;
            } else {
                errorCorrectionLevel = errorCorrectionLevelValueOf;
                i5 = 4;
            }
        } else {
            errorCorrectionLevel = errorCorrectionLevelValueOf;
            i5 = 4;
        }
        int[] iArr = Encoder.ALPHANUMERIC_TABLE;
        if (map != null) {
            EncodeHintType encodeHintType3 = EncodeHintType.GS1_FORMAT;
            if (map.containsKey(encodeHintType3) && Boolean.parseBoolean(map.get(encodeHintType3).toString())) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (map != null) {
            EncodeHintType encodeHintType4 = EncodeHintType.QR_COMPACT;
            if (map.containsKey(encodeHintType4) && Boolean.parseBoolean(map.get(encodeHintType4).toString())) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        EncodeHintType encodeHintType5 = EncodeHintType.CHARACTER_SET;
        boolean z9 = map != null && map.containsKey(encodeHintType5);
        Charset charset = Encoder.DEFAULT_BYTE_MODE_ENCODING;
        if (z9) {
            try {
                charsetForName = Charset.forName(map.get(encodeHintType5).toString());
            } catch (UnsupportedCharsetException unused) {
                charsetForName = charset;
            }
        } else {
            charsetForName = charset;
        }
        Mode mode2 = Mode.BYTE;
        if (z2) {
            if (charsetForName.equals(charset)) {
                charsetForName = null;
            }
            TaskQueue taskQueue = new TaskQueue(str, charsetForName, z, errorCorrectionLevel);
            Version[] versionArr = {TaskQueue.getVersion(1), TaskQueue.getVersion(2), TaskQueue.getVersion(3)};
            Result[] resultArr = {taskQueue.encodeSpecificVersion(versionArr[0]), taskQueue.encodeSpecificVersion(versionArr[1]), taskQueue.encodeSpecificVersion(versionArr[2])};
            int i15 = 0;
            int i16 = -1;
            int i17 = Integer.MAX_VALUE;
            for (int i18 = 3; i15 < i18; i18 = 3) {
                Result result = resultArr[i15];
                int size = result.getSize((Version) result.resultPoints);
                int i19 = i15;
                if (Encoder.willFit(size, versionArr[i15], (ErrorCorrectionLevel) taskQueue.zzd) && size < i17) {
                    i17 = size;
                    i16 = i19;
                }
                i15 = i19 + 1;
            }
            c = 3;
            if (i16 < 0) {
                throw new WriterException("Data too big for any version");
            }
            Result result2 = resultArr[i16];
            bitArray = new BitArray();
            ArrayList arrayList = (ArrayList) result2.text;
            int i20 = 0;
            for (int size2 = arrayList.size(); i20 < size2; size2 = size2) {
                Object obj = arrayList.get(i20);
                i20++;
                MinimalEncoder$ResultList$ResultNode minimalEncoder$ResultList$ResultNode = (MinimalEncoder$ResultList$ResultNode) obj;
                Mode mode3 = minimalEncoder$ResultList$ResultNode.mode;
                ArrayList arrayList2 = arrayList;
                bitArray.appendBits(mode3.bits, 4);
                int i21 = minimalEncoder$ResultList$ResultNode.characterLength;
                Result result3 = minimalEncoder$ResultList$ResultNode.this$1;
                if (i21 > 0) {
                    bitArray.appendBits(minimalEncoder$ResultList$ResultNode.getCharacterCountIndicator(), mode3.getCharacterCountBits((Version) result3.resultPoints));
                }
                Mode mode4 = Mode.ECI;
                int i22 = minimalEncoder$ResultList$ResultNode.charsetEncoderIndex;
                if (mode3 == mode4) {
                    bitArray.appendBits(((CharacterSetECI) CharacterSetECI.NAME_TO_ECI.get(((ECIEncoderSet) ((TaskQueue) result3.resultMetadata).zzc).encoders[i22].charset().name())).values[0], 8);
                } else if (i21 > 0) {
                    String str2 = (String) ((TaskQueue) result3.resultMetadata).zza;
                    int i23 = minimalEncoder$ResultList$ResultNode.fromPosition;
                    Encoder.appendBytes(str2.substring(i23, i23 + i21), mode3, bitArray, ((ECIEncoderSet) ((TaskQueue) result3.resultMetadata).zzc).encoders[i22].charset());
                }
                arrayList = arrayList2;
            }
            version = (Version) result2.resultPoints;
            i5 = i5;
        } else {
            c = 3;
            Charset charset2 = StringUtils.SHIFT_JIS_CHARSET;
            if (charset2 == null || !charset2.equals(charsetForName) || !Encoder.isOnlyDoubleByteKanji(str)) {
                boolean z10 = false;
                boolean z11 = false;
                int i24 = 0;
                while (true) {
                    if (i24 < str.length()) {
                        char cCharAt = str.charAt(i24);
                        boolean z12 = z10;
                        if (cCharAt >= '0' && cCharAt <= '9') {
                            z10 = z12;
                            z11 = true;
                        } else if ((cCharAt < '`' ? Encoder.ALPHANUMERIC_TABLE[cCharAt] : -1) != -1) {
                            z10 = true;
                        }
                        i24++;
                    } else {
                        if (z10) {
                            mode = Mode.ALPHANUMERIC;
                            break;
                        }
                        if (z11) {
                            mode = Mode.NUMERIC;
                            break;
                        }
                    }
                    mode = mode2;
                    break;
                }
            }
            mode = Mode.KANJI;
            BitArray bitArray2 = new BitArray();
            if (mode == mode2 && z9 && (characterSetECI = (CharacterSetECI) CharacterSetECI.NAME_TO_ECI.get(charsetForName.name())) != null) {
                bitArray2.appendBits(7, 4);
                bitArray2.appendBits(characterSetECI.values[0], 8);
            }
            if (z) {
                i6 = 4;
                bitArray2.appendBits(5, 4);
            } else {
                i6 = 4;
            }
            bitArray2.appendBits(mode.bits, i6);
            BitArray bitArray3 = new BitArray();
            Encoder.appendBytes(str, mode, bitArray3, charsetForName);
            if (map != null) {
                EncodeHintType encodeHintType6 = EncodeHintType.QR_VERSION;
                if (map.containsKey(encodeHintType6)) {
                    versionForNumber3 = Version.getVersionForNumber(Integer.parseInt(map.get(encodeHintType6).toString()));
                    if (!Encoder.willFit(mode.getCharacterCountBits(versionForNumber3) + bitArray2.size + bitArray3.size, versionForNumber3, errorCorrectionLevel)) {
                        throw new WriterException("Data too big for requested version");
                    }
                } else {
                    characterCountBits = mode.getCharacterCountBits(Version.getVersionForNumber(1)) + bitArray2.size + bitArray3.size;
                    i7 = 1;
                    while (true) {
                        if (i7 <= 40) {
                            throw new WriterException("Data too big");
                        }
                        versionForNumber = Version.getVersionForNumber(i7);
                        if (Encoder.willFit(characterCountBits, versionForNumber, errorCorrectionLevel)) {
                            characterCountBits2 = mode.getCharacterCountBits(versionForNumber) + bitArray2.size + bitArray3.size;
                            i8 = 1;
                            while (true) {
                                if (i8 <= 40) {
                                    throw new WriterException("Data too big");
                                }
                                versionForNumber2 = Version.getVersionForNumber(i8);
                                if (Encoder.willFit(characterCountBits2, versionForNumber2, errorCorrectionLevel)) {
                                    versionForNumber3 = versionForNumber2;
                                    break;
                                }
                                i8++;
                                errorCorrectionLevel = errorCorrectionLevel;
                            }
                        } else {
                            i7++;
                            errorCorrectionLevel = errorCorrectionLevel;
                        }
                    }
                }
            } else {
                characterCountBits = mode.getCharacterCountBits(Version.getVersionForNumber(1)) + bitArray2.size + bitArray3.size;
                i7 = 1;
                while (true) {
                    if (i7 <= 40) {
                        throw new WriterException("Data too big");
                    }
                    versionForNumber = Version.getVersionForNumber(i7);
                    if (Encoder.willFit(characterCountBits, versionForNumber, errorCorrectionLevel)) {
                        characterCountBits2 = mode.getCharacterCountBits(versionForNumber) + bitArray2.size + bitArray3.size;
                        i8 = 1;
                        while (true) {
                            if (i8 <= 40) {
                                throw new WriterException("Data too big");
                            }
                            versionForNumber2 = Version.getVersionForNumber(i8);
                            if (Encoder.willFit(characterCountBits2, versionForNumber2, errorCorrectionLevel)) {
                                versionForNumber3 = versionForNumber2;
                                break;
                            }
                            i8++;
                            errorCorrectionLevel = errorCorrectionLevel;
                        }
                    } else {
                        i7++;
                        errorCorrectionLevel = errorCorrectionLevel;
                    }
                }
            }
            BitArray bitArray4 = new BitArray();
            int i25 = bitArray2.size;
            bitArray4.ensureCapacity(i25);
            for (int i26 = 0; i26 < i25; i26++) {
                bitArray4.appendBit(bitArray2.get(i26));
            }
            int sizeInBytes = mode == mode2 ? bitArray3.getSizeInBytes() : str.length();
            int characterCountBits3 = mode.getCharacterCountBits(versionForNumber3);
            int i27 = 1 << characterCountBits3;
            if (sizeInBytes >= i27) {
                StringBuilder sb = new StringBuilder();
                sb.append(sizeInBytes);
                sb.append(" is bigger than ");
                sb.append(i27 - 1);
                throw new WriterException(sb.toString());
            }
            bitArray4.appendBits(sizeInBytes, characterCountBits3);
            int i28 = bitArray3.size;
            bitArray4.ensureCapacity(bitArray4.size + i28);
            for (int i29 = 0; i29 < i28; i29++) {
                bitArray4.appendBit(bitArray3.get(i29));
            }
            version = versionForNumber3;
            bitArray = bitArray4;
        }
        zzbv zzbvVar = version.ecBlocks[errorCorrectionLevel.ordinal()];
        int i30 = 0;
        for (Version.ECB ecb : (Version.ECB[]) zzbvVar.zza) {
            i30 += ecb.count;
        }
        int i31 = i30 * zzbvVar.zzb;
        int i32 = version.totalCodewords;
        int i33 = i32 - i31;
        int i34 = i33 * 8;
        if (bitArray.size > i34) {
            throw new WriterException("data bits cannot fit in the QR Code" + bitArray.size + " > " + i34);
        }
        for (int i35 = 0; i35 < 4 && bitArray.size < i34; i35++) {
            bitArray.appendBit(false);
        }
        boolean z13 = false;
        int i36 = bitArray.size & 7;
        if (i36 > 0) {
            while (i36 < 8) {
                bitArray.appendBit(z13);
                i36++;
                z13 = false;
            }
        }
        int sizeInBytes2 = i33 - bitArray.getSizeInBytes();
        int i37 = 0;
        while (i37 < sizeInBytes2) {
            int i38 = sizeInBytes2;
            bitArray.appendBits((i37 & 1) == 0 ? 236 : 17, 8);
            i37++;
            sizeInBytes2 = i38;
        }
        if (bitArray.size != i34) {
            throw new WriterException("Bits size does not equal capacity");
        }
        int i39 = 0;
        for (Version.ECB ecb2 : (Version.ECB[]) zzbvVar.zza) {
            i39 += ecb2.count;
        }
        if (bitArray.getSizeInBytes() != i33) {
            throw new WriterException("Number of bits and data bytes does not match");
        }
        ArrayList arrayList3 = new ArrayList(i39);
        int i40 = 0;
        int iMax = 0;
        int i41 = 0;
        int iMax2 = 0;
        while (i40 < i39) {
            int[] iArr2 = new int[1];
            int[] iArr3 = new int[1];
            if (i40 >= i39) {
                throw new WriterException("Block ID too large");
            }
            int i42 = i32 % i39;
            int i43 = i39 - i42;
            int i44 = i32 / i39;
            int i45 = i33 / i39;
            int i46 = i45 + 1;
            int i47 = i44 - i45;
            int i48 = (i44 + 1) - i46;
            if (i47 != i48) {
                throw new WriterException("EC bytes mismatch");
            }
            if (i39 != i43 + i42) {
                throw new WriterException("RS blocks mismatch");
            }
            if (i32 != ((i46 + i48) * i42) + ((i45 + i47) * i43)) {
                throw new WriterException("Total bytes mismatch");
            }
            if (i40 < i43) {
                c2 = 0;
                iArr2[0] = i45;
                iArr3[0] = i47;
            } else {
                c2 = 0;
                iArr2[0] = i46;
                iArr3[0] = i48;
            }
            int i49 = iArr2[c2];
            byte[] bArr2 = new byte[i49];
            int i50 = i41 * 8;
            int i51 = 0;
            while (i51 < i49) {
                int i52 = i40;
                int i53 = i51;
                int i54 = i39;
                int i55 = i50;
                int i56 = 0;
                for (int i57 = 0; i57 < 8; i57++) {
                    if (bitArray.get(i55)) {
                        i56 = (1 << (7 - i57)) | i56;
                    }
                    i55++;
                }
                bArr2[i53] = (byte) i56;
                i51 = i53 + 1;
                i50 = i55;
                i40 = i52;
                i39 = i54;
            }
            int i58 = i40;
            int i59 = i39;
            int i60 = iArr3[0];
            int i61 = i49 + i60;
            int[] iArr4 = new int[i61];
            int i62 = 0;
            while (i62 < i49) {
                iArr4[i62] = bArr2[i62] & 255;
                i62++;
                i61 = i61;
            }
            int i63 = i61;
            GenericGF genericGF = GenericGF.QR_CODE_FIELD_256;
            ArrayList arrayList4 = new ArrayList();
            BitArray bitArray5 = bitArray;
            ErrorCorrectionLevel errorCorrectionLevel2 = errorCorrectionLevel;
            arrayList4.add(new GenericGFPoly(genericGF, new int[]{1}));
            if (i60 == 0) {
                throw new IllegalArgumentException("No error correction bytes");
            }
            int i64 = i63 - i60;
            if (i64 <= 0) {
                throw new IllegalArgumentException("No data bytes provided");
            }
            if (i60 >= arrayList4.size()) {
                GenericGFPoly genericGFPoly = (GenericGFPoly) Fragment$$ExternalSyntheticOutline0.m(1, arrayList4);
                int size3 = arrayList4.size();
                while (size3 <= i60) {
                    int i65 = size3;
                    GenericGFPoly genericGFPolyMultiply = genericGFPoly.multiply(new GenericGFPoly(genericGF, new int[]{1, genericGF.expTable[(i65 - 1) + genericGF.generatorBase]}));
                    arrayList4.add(genericGFPolyMultiply);
                    size3 = i65 + 1;
                    genericGFPoly = genericGFPolyMultiply;
                    version = version;
                }
            }
            Version version2 = version;
            int i66 = 1;
            GenericGFPoly genericGFPoly2 = (GenericGFPoly) arrayList4.get(i60);
            int[] iArr5 = new int[i64];
            System.arraycopy(iArr4, 0, iArr5, 0, i64);
            if (i64 == 0) {
                throw new IllegalArgumentException();
            }
            if (i64 <= 1 || iArr5[0] != 0) {
                i14 = i64;
            } else {
                while (i66 < i64 && iArr5[i66] == 0) {
                    i66++;
                }
                if (i66 == i64) {
                    iArr5 = new int[]{0};
                    i14 = i64;
                } else {
                    i14 = i64;
                    int i67 = i14 - i66;
                    int[] iArr6 = new int[i67];
                    System.arraycopy(iArr5, i66, iArr6, 0, i67);
                    iArr5 = iArr6;
                }
            }
            if (i60 < 0) {
                throw new IllegalArgumentException();
            }
            int length = iArr5.length;
            int[] iArr7 = new int[length + i60];
            int i68 = 0;
            while (i68 < length) {
                iArr7[i68] = genericGF.multiply(iArr5[i68], 1);
                i68++;
                length = length;
            }
            GenericGFPoly genericGFPoly3 = new GenericGFPoly(genericGF, iArr7);
            if (!genericGF.equals(genericGFPoly2.field)) {
                throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
            }
            if (genericGFPoly2.isZero()) {
                throw new IllegalArgumentException("Divide by 0");
            }
            int iInverse = genericGF.inverse(genericGFPoly2.getCoefficient(genericGFPoly2.getDegree()));
            GenericGFPoly genericGFPolyAddOrSubtract = genericGF.zero;
            while (genericGFPoly3.getDegree() >= genericGFPoly2.getDegree() && !genericGFPoly3.isZero()) {
                int degree = genericGFPoly3.getDegree() - genericGFPoly2.getDegree();
                int iMultiply = genericGF.multiply(genericGFPoly3.getCoefficient(genericGFPoly3.getDegree()), iInverse);
                int i69 = iInverse;
                GenericGFPoly genericGFPolyMultiplyByMonomial = genericGFPoly2.multiplyByMonomial(degree, iMultiply);
                genericGFPolyAddOrSubtract = genericGFPolyAddOrSubtract.addOrSubtract(genericGF.buildMonomial(degree, iMultiply));
                genericGFPoly3 = genericGFPoly3.addOrSubtract(genericGFPolyMultiplyByMonomial);
                iInverse = i69;
            }
            int[] iArr8 = new GenericGFPoly[]{genericGFPolyAddOrSubtract, genericGFPoly3}[1].coefficients;
            int length2 = i60 - iArr8.length;
            for (int i70 = 0; i70 < length2; i70++) {
                iArr4[i14 + i70] = 0;
            }
            System.arraycopy(iArr8, 0, iArr4, i14 + length2, iArr8.length);
            byte[] bArr3 = new byte[i60];
            for (int i71 = 0; i71 < i60; i71++) {
                bArr3[i71] = (byte) iArr4[i49 + i71];
            }
            arrayList3.add(new BlockPair(bArr2, bArr3));
            iMax2 = Math.max(iMax2, i49);
            iMax = Math.max(iMax, i60);
            i41 += iArr2[0];
            i40 = i58 + 1;
            i39 = i59;
            bitArray = bitArray5;
            errorCorrectionLevel = errorCorrectionLevel2;
            version = version2;
            i32 = i32;
        }
        Version version3 = version;
        int i72 = i32;
        ErrorCorrectionLevel errorCorrectionLevel3 = errorCorrectionLevel;
        if (i33 != i41) {
            throw new WriterException("Data bytes does not match offset");
        }
        BitArray bitArray6 = new BitArray();
        for (int i73 = 0; i73 < iMax2; i73++) {
            int size4 = arrayList3.size();
            int i74 = 0;
            while (i74 < size4) {
                Object obj2 = arrayList3.get(i74);
                i74++;
                byte[] bArr4 = ((BlockPair) obj2).dataBytes;
                if (i73 < bArr4.length) {
                    bitArray6.appendBits(bArr4[i73], 8);
                }
            }
        }
        for (int i75 = 0; i75 < iMax; i75++) {
            int size5 = arrayList3.size();
            int i76 = 0;
            while (i76 < size5) {
                Object obj3 = arrayList3.get(i76);
                i76++;
                byte[] bArr5 = ((BlockPair) obj3).errorCorrectionBytes;
                if (i75 < bArr5.length) {
                    bitArray6.appendBits(bArr5[i75], 8);
                }
            }
        }
        if (i72 != bitArray6.getSizeInBytes()) {
            throw new WriterException("Interleaving error: " + i72 + " and " + bitArray6.getSizeInBytes() + " differ.");
        }
        int i77 = (version3.versionNumber * 4) + 17;
        ByteMatrix byteMatrix = new ByteMatrix(i77, i77);
        if (map != null) {
            EncodeHintType encodeHintType7 = EncodeHintType.QR_MASK_PATTERN;
            if (map.containsKey(encodeHintType7)) {
                i9 = Integer.parseInt(map.get(encodeHintType7).toString());
                if (!(i9 >= 0 && i9 < 8)) {
                    i9 = -1;
                }
            } else {
                i9 = -1;
            }
        } else {
            i9 = -1;
        }
        int i78 = byteMatrix.width;
        int i79 = byteMatrix.height;
        if (i9 == -1) {
            int i80 = 0;
            int i81 = Integer.MAX_VALUE;
            int i82 = -1;
            while (i80 < 8) {
                ErrorCorrectionLevel errorCorrectionLevel4 = errorCorrectionLevel3;
                MaskUtil.buildMatrix(bitArray6, errorCorrectionLevel4, version3, i80, byteMatrix);
                int iApplyMaskPenaltyRule1Internal = MaskUtil.applyMaskPenaltyRule1Internal(byteMatrix, false) + MaskUtil.applyMaskPenaltyRule1Internal(byteMatrix, true);
                int i83 = 0;
                int i84 = 0;
                while (true) {
                    int i85 = i79 - 1;
                    bArr = byteMatrix.bytes;
                    if (i83 >= i85) {
                        break;
                    }
                    byte[] bArr6 = bArr[i83];
                    int i86 = 0;
                    while (i86 < i78 - 1) {
                        byte b = bArr6[i86];
                        int i87 = i86 + 1;
                        int i88 = i80;
                        if (b == bArr6[i87]) {
                            byte[] bArr7 = bArr[i83 + 1];
                            if (b == bArr7[i86] && b == bArr7[i87]) {
                                i84++;
                            }
                        }
                        i86 = i87;
                        i80 = i88;
                    }
                    i83++;
                }
                int i89 = i80;
                int i90 = (i84 * 3) + iApplyMaskPenaltyRule1Internal;
                int i91 = 0;
                int i92 = 0;
                while (i91 < i79) {
                    int i93 = 0;
                    while (i93 < i78) {
                        byte[] bArr8 = bArr[i91];
                        int i94 = i93 + 6;
                        if (i94 < i78) {
                            i10 = i92;
                            if (bArr8[i93] == 1 && bArr8[i93 + 1] == 0 && bArr8[i93 + 2] == 1 && bArr8[i93 + 3] == 1 && bArr8[i93 + 4] == 1 && bArr8[i93 + 5] == 0 && bArr8[i94] == 1) {
                                int i95 = i93 - 4;
                                if (i95 < 0 || bArr8.length < i93) {
                                    z7 = false;
                                    break;
                                }
                                while (true) {
                                    if (i95 >= i93) {
                                        z7 = true;
                                        break;
                                    }
                                    if (bArr8[i95] == 1) {
                                        z7 = false;
                                        break;
                                    }
                                    i95++;
                                }
                                if (!z7) {
                                    int i96 = i93 + 7;
                                    int i97 = i93 + 11;
                                    if (i96 >= 0 && bArr8.length >= i97) {
                                        while (true) {
                                            if (i96 >= i97) {
                                                z8 = true;
                                                break;
                                            }
                                            int i98 = i97;
                                            if (bArr8[i96] != 1) {
                                                i96++;
                                                i97 = i98;
                                            }
                                        }
                                        if (z8) {
                                        }
                                    }
                                    z8 = false;
                                    if (z8) {
                                    }
                                }
                                i92 = i10 + 1;
                            }
                            i11 = i91 + 6;
                            if (i11 < i79 || bArr[i91][i93] != 1 || bArr[i91 + 1][i93] != 0 || bArr[i91 + 2][i93] != 1 || bArr[i91 + 3][i93] != 1) {
                                i12 = i91;
                                i13 = 1;
                            } else if (bArr[i91 + 4][i93] == 1 && bArr[i91 + 5][i93] == 0 && bArr[i11][i93] == 1) {
                                int i99 = i91 - 4;
                                if (i99 < 0 || bArr.length < i91) {
                                    z5 = false;
                                    break;
                                }
                                while (true) {
                                    if (i99 >= i91) {
                                        z5 = true;
                                        break;
                                    }
                                    if (bArr[i99][i93] == 1) {
                                        z5 = false;
                                        break;
                                    }
                                    i99++;
                                }
                                if (z5) {
                                    i12 = i91;
                                    i13 = 1;
                                } else {
                                    int i100 = i91 + 7;
                                    int i101 = i91 + 11;
                                    if (i100 < 0 || bArr.length < i101) {
                                        i12 = i91;
                                        i13 = 1;
                                    } else {
                                        while (true) {
                                            if (i100 >= i101) {
                                                i12 = i91;
                                                i13 = 1;
                                                z6 = true;
                                                break;
                                            }
                                            i12 = i91;
                                            i13 = 1;
                                            if (bArr[i100][i93] != 1) {
                                                i100++;
                                                i91 = i12;
                                            }
                                        }
                                        if (z6) {
                                        }
                                    }
                                    z6 = false;
                                    if (z6) {
                                    }
                                }
                                i92 += i13;
                            } else {
                                i12 = i91;
                                i13 = 1;
                            }
                            i93 += i13;
                            i91 = i12;
                        } else {
                            i10 = i92;
                        }
                        i92 = i10;
                        i11 = i91 + 6;
                        if (i11 < i79) {
                            i12 = i91;
                            i13 = 1;
                        } else {
                            i12 = i91;
                            i13 = 1;
                        }
                        i93 += i13;
                        i91 = i12;
                    }
                    i91++;
                    i92 = i92;
                }
                int i102 = (i92 * 40) + i90;
                int i103 = 0;
                for (int i104 = 0; i104 < i79; i104++) {
                    byte[] bArr9 = bArr[i104];
                    for (int i105 = 0; i105 < i78; i105++) {
                        if (bArr9[i105] == 1) {
                            i103++;
                        }
                    }
                }
                int i106 = i79 * i78;
                int iAbs = (((Math.abs((i103 * 2) - i106) * 10) / i106) * 10) + i102;
                if (iAbs < i81) {
                    i81 = iAbs;
                    i82 = i89;
                }
                i80 = i89 + 1;
                errorCorrectionLevel3 = errorCorrectionLevel4;
            }
            i9 = i82;
        }
        MaskUtil.buildMatrix(bitArray6, errorCorrectionLevel3, version3, i9, byteMatrix);
        this.input = byteMatrix;
        for (int i107 = 0; i107 < i78 && has(i107, 0); i107++) {
            this.sideQuadSize++;
        }
        int i108 = i5 * 2;
        int i109 = i78 + i108;
        int i110 = i108 + i79;
        int iMin = Math.min(Math.max(i, i109) / i109, Math.max(i2, i110) / i110);
        int i111 = iMin * i78;
        int i112 = i111 + 32;
        Bitmap bitmapCreateBitmap = (bitmap == null || bitmap.getWidth() != i112) ? Bitmap.createBitmap(i112, i112, Bitmap.Config.ARGB_8888) : bitmap;
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(i3);
        Paint paint2 = new Paint(1);
        paint2.setColor(i4);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(this.radii);
        float f3 = iMin;
        int iRound = Math.round((i111 / 4.65f) / f3);
        this.imageBloks = iRound;
        if (iRound % 2 != i78 % 2) {
            this.imageBloks = iRound + 1;
        }
        int i113 = this.imageBloks;
        this.imageBlockX = (i78 - i113) / 2;
        int i114 = (i113 * iMin) - 24;
        this.imageSize = i114;
        int i115 = (i112 - i114) / 2;
        if (this.includeSideQuads) {
            paint2.setColor(i4);
            paint = paint2;
            drawSideQuadsGradient(canvas, paint, gradientDrawable, this.sideQuadSize, f3, 16, i112, f, this.radii, i3, i4);
        } else {
            paint = paint2;
        }
        int i116 = i4;
        boolean z14 = Color.alpha(i3) == 0;
        float f4 = (f3 / 2.0f) * f;
        int i117 = 16;
        int i118 = 0;
        while (i118 < i79) {
            int i119 = 0;
            int i120 = 16;
            while (i119 < i78) {
                Paint paint3 = paint;
                if (has(i119, i118)) {
                    Arrays.fill(this.radii, f4);
                    if (has(i119, i118 - 1)) {
                        float[] fArr = this.radii;
                        fArr[1] = 0.0f;
                        fArr[0] = 0.0f;
                        fArr[c] = 0.0f;
                        fArr[2] = 0.0f;
                    }
                    if (has(i119, i118 + 1)) {
                        float[] fArr2 = this.radii;
                        fArr2[7] = 0.0f;
                        fArr2[6] = 0.0f;
                        fArr2[5] = 0.0f;
                        fArr2[4] = 0.0f;
                    }
                    if (has(i119 - 1, i118)) {
                        float[] fArr3 = this.radii;
                        fArr3[1] = 0.0f;
                        fArr3[0] = 0.0f;
                        fArr3[7] = 0.0f;
                        fArr3[6] = 0.0f;
                    }
                    if (has(i119 + 1, i118)) {
                        float[] fArr4 = this.radii;
                        fArr4[c] = 0.0f;
                        fArr4[2] = 0.0f;
                        fArr4[5] = 0.0f;
                        fArr4[4] = 0.0f;
                    }
                    gradientDrawable.setColor(i116);
                    gradientDrawable.setBounds(i120, i117, i120 + iMin, i117 + iMin);
                    gradientDrawable.draw(canvas);
                    paint = paint3;
                    f2 = f4;
                } else {
                    Arrays.fill(this.radii, 0.0f);
                    int i121 = i119 - 1;
                    int i122 = i118 - 1;
                    if (has(i121, i122) && has(i121, i118) && has(i119, i122)) {
                        f2 = f4;
                        float[] fArr5 = this.radii;
                        fArr5[1] = f2;
                        fArr5[0] = f2;
                        z3 = true;
                    } else {
                        f2 = f4;
                        z3 = false;
                    }
                    int i123 = i119 + 1;
                    if (has(i123, i122) && has(i123, i118) && has(i119, i122)) {
                        float[] fArr6 = this.radii;
                        fArr6[c] = f2;
                        fArr6[2] = f2;
                        z3 = true;
                    }
                    int i124 = i118 + 1;
                    if (has(i121, i124) && has(i121, i118) && has(i119, i124)) {
                        float[] fArr7 = this.radii;
                        fArr7[7] = f2;
                        fArr7[6] = f2;
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (has(i123, i124) && has(i123, i118) && has(i119, i124)) {
                        float[] fArr8 = this.radii;
                        fArr8[5] = f2;
                        fArr8[4] = f2;
                        z4 = true;
                    }
                    if (!z4 || z14) {
                        paint = paint3;
                    } else {
                        int i125 = i120 + iMin;
                        int i126 = i117 + iMin;
                        canvas.drawRect(i120, i117, i125, i126, paint3);
                        paint = paint3;
                        gradientDrawable.setColor(i3);
                        gradientDrawable.setBounds(i120, i117, i125, i126);
                        gradientDrawable.draw(canvas);
                    }
                }
                i119++;
                i120 += iMin;
                i116 = i4;
                f4 = f2;
            }
            i118++;
            i117 += iMin;
            i116 = i4;
        }
        String res = AndroidUtilities.readRes(R.raw.qr_logo);
        int i127 = this.imageSize;
        Bitmap bitmap2 = SvgHelper.getBitmap(res, i127, i127, false);
        float f5 = i115;
        canvas.drawBitmap(bitmap2, f5, f5, (Paint) null);
        bitmap2.recycle();
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }
}
