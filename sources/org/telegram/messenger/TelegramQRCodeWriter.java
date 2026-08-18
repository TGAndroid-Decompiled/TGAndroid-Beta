package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.GradientDrawable;
import com.google.zxing.EncodeHintType;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.encoder.ByteMatrix;
import com.google.zxing.qrcode.encoder.Encoder;
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

    public Bitmap encode(String str, int i, int i2, Map<EncodeHintType, ?> map, Bitmap bitmap) {
        return encode(str, i, i2, map, bitmap, 1.0f, -1, -16777216);
    }

    public Bitmap encode(String str, int i, int i2, Map<EncodeHintType, ?> map, Bitmap bitmap, float f, int i3, int i4) {
        int i5;
        float f2;
        Canvas canvas;
        char c;
        GradientDrawable gradientDrawable;
        boolean z;
        boolean z2;
        Canvas canvas2;
        char c2;
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
            } else {
                i5 = 4;
            }
        } else {
            i5 = 4;
        }
        ByteMatrix matrix = Encoder.encode(str, errorCorrectionLevelValueOf, map).getMatrix();
        this.input = matrix;
        if (matrix == null) {
            throw new IllegalStateException();
        }
        int width = matrix.getWidth();
        int height = this.input.getHeight();
        for (int i6 = 0; i6 < width && has(i6, 0); i6++) {
            this.sideQuadSize++;
        }
        int i7 = i5 * 2;
        int i8 = width + i7;
        int i9 = i7 + height;
        int iMin = Math.min(Math.max(i, i8) / i8, Math.max(i2, i9) / i9);
        int i10 = iMin * width;
        int i11 = i10 + 32;
        Bitmap bitmapCreateBitmap = (bitmap == null || bitmap.getWidth() != i11) ? Bitmap.createBitmap(i11, i11, Bitmap.Config.ARGB_8888) : bitmap;
        Canvas canvas3 = new Canvas(bitmapCreateBitmap);
        canvas3.drawColor(i3);
        Paint paint = new Paint(1);
        paint.setColor(i4);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadii(this.radii);
        float f3 = iMin;
        int iRound = Math.round((i10 / 4.65f) / f3);
        this.imageBloks = iRound;
        if (iRound % 2 != width % 2) {
            this.imageBloks = iRound + 1;
        }
        int i12 = this.imageBloks;
        this.imageBlockX = (width - i12) / 2;
        int i13 = (i12 * iMin) - 24;
        this.imageSize = i13;
        int i14 = (i11 - i13) / 2;
        if (this.includeSideQuads) {
            paint.setColor(i4);
            f2 = f3;
            c = 1;
            canvas = canvas3;
            drawSideQuadsGradient(canvas3, paint, gradientDrawable2, this.sideQuadSize, f2, 16, i11, f, this.radii, i3, i4);
        } else {
            f2 = f3;
            canvas = canvas3;
            c = 1;
        }
        boolean z3 = Color.alpha(i3) == 0;
        float f4 = (f2 / 2.0f) * f;
        int i15 = 0;
        int i16 = 16;
        while (i15 < height) {
            int i17 = 0;
            int i18 = 16;
            while (i17 < width) {
                if (has(i17, i15)) {
                    Arrays.fill(this.radii, f4);
                    if (has(i17, i15 - 1)) {
                        float[] fArr = this.radii;
                        fArr[c] = 0.0f;
                        c2 = 0;
                        fArr[0] = 0.0f;
                        fArr[3] = 0.0f;
                        fArr[2] = 0.0f;
                    } else {
                        c2 = 0;
                    }
                    if (has(i17, i15 + 1)) {
                        float[] fArr2 = this.radii;
                        fArr2[7] = 0.0f;
                        fArr2[6] = 0.0f;
                        fArr2[5] = 0.0f;
                        fArr2[4] = 0.0f;
                    }
                    if (has(i17 - 1, i15)) {
                        float[] fArr3 = this.radii;
                        fArr3[c] = 0.0f;
                        fArr3[c2] = 0.0f;
                        fArr3[7] = 0.0f;
                        fArr3[6] = 0.0f;
                    }
                    if (has(i17 + 1, i15)) {
                        float[] fArr4 = this.radii;
                        fArr4[3] = 0.0f;
                        fArr4[2] = 0.0f;
                        fArr4[5] = 0.0f;
                        fArr4[4] = 0.0f;
                    }
                    gradientDrawable = gradientDrawable2;
                    gradientDrawable.setColor(i4);
                    gradientDrawable.setBounds(i18, i16, i18 + iMin, i16 + iMin);
                    Canvas canvas4 = canvas;
                    gradientDrawable.draw(canvas4);
                    canvas2 = canvas4;
                } else {
                    gradientDrawable = gradientDrawable2;
                    Arrays.fill(this.radii, 0.0f);
                    int i19 = i17 - 1;
                    int i20 = i15 - 1;
                    if (has(i19, i20) && has(i19, i15) && has(i17, i20)) {
                        float[] fArr5 = this.radii;
                        fArr5[c] = f4;
                        fArr5[0] = f4;
                        z = true;
                    } else {
                        z = false;
                    }
                    int i21 = i17 + 1;
                    if (has(i21, i20) && has(i21, i15) && has(i17, i20)) {
                        float[] fArr6 = this.radii;
                        fArr6[3] = f4;
                        fArr6[2] = f4;
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    int i22 = i15 + 1;
                    if (has(i19, i22) && has(i19, i15) && has(i17, i22)) {
                        float[] fArr7 = this.radii;
                        fArr7[7] = f4;
                        fArr7[6] = f4;
                        z2 = true;
                    }
                    if (has(i21, i22) && has(i21, i15) && has(i17, i22)) {
                        float[] fArr8 = this.radii;
                        fArr8[5] = f4;
                        fArr8[4] = f4;
                        z2 = true;
                    }
                    if (!z2 || z3) {
                        canvas2 = canvas;
                    } else {
                        int i23 = i18 + iMin;
                        int i24 = i16 + iMin;
                        canvas.drawRect(i18, i16, i23, i24, paint);
                        gradientDrawable.setColor(i3);
                        gradientDrawable.setBounds(i18, i16, i23, i24);
                        canvas2 = canvas;
                        gradientDrawable.draw(canvas2);
                    }
                }
                i17++;
                i18 += iMin;
                canvas = canvas2;
                f4 = f4;
                z3 = z3;
                gradientDrawable2 = gradientDrawable;
            }
            i15++;
            i16 += iMin;
            f4 = f4;
            gradientDrawable2 = gradientDrawable2;
        }
        Canvas canvas5 = canvas;
        String res = AndroidUtilities.readRes(R.raw.qr_logo);
        int i25 = this.imageSize;
        Bitmap bitmap2 = SvgHelper.getBitmap(res, i25, i25, false);
        float f5 = i14;
        canvas5.drawBitmap(bitmap2, f5, f5, (Paint) null);
        bitmap2.recycle();
        canvas5.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static void drawSideQuadsGradient(Canvas canvas, Paint paint, GradientDrawable gradientDrawable, float f, float f2, int i, float f3, float f4, float[] fArr, int i2, int i3) {
        float f5;
        float f6;
        float f7;
        float f8;
        int i4 = 1;
        boolean z = Color.alpha(i2) == 0;
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(fArr);
        Path path = new Path();
        RectF rectF = new RectF();
        int i5 = 0;
        while (i5 < 3) {
            if (i5 == 0) {
                f7 = i;
                f8 = f7;
            } else {
                if (i5 == i4) {
                    f6 = i;
                    f5 = (f3 - (f * f2)) - f6;
                } else {
                    f5 = i;
                    f6 = (f3 - (f * f2)) - f5;
                }
                f7 = f5;
                f8 = f6;
            }
            if (z) {
                float f9 = (f - 1.0f) * f2;
                rectF.set(f7 + f2, f8 + f2, f7 + f9, f9 + f8);
                float f10 = ((f * f2) / 4.0f) * f4;
                path.reset();
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                path.close();
                canvas.save();
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            }
            float f11 = f * f2;
            Arrays.fill(fArr, (f11 / 3.0f) * f4);
            gradientDrawable.setColor(i3);
            gradientDrawable.setBounds((int) f7, (int) f8, (int) (f7 + f11), (int) (f8 + f11));
            gradientDrawable.draw(canvas);
            float f12 = f7 + f2;
            float f13 = f8 + f2;
            float f14 = (f - 1.0f) * f2;
            float f15 = f7 + f14;
            float f16 = f14 + f8;
            float f17 = f7;
            float f18 = f8;
            canvas.drawRect(f12, f13, f15, f16, paint);
            if (z) {
                canvas.restore();
            }
            if (!z) {
                Arrays.fill(fArr, (f11 / 4.0f) * f4);
                gradientDrawable.setColor(i2);
                gradientDrawable.setBounds((int) f12, (int) f13, (int) f15, (int) f16);
                gradientDrawable.draw(canvas);
            }
            float f19 = (f - 2.0f) * f2;
            Arrays.fill(fArr, (f19 / 4.0f) * f4);
            gradientDrawable.setColor(i3);
            float f20 = 2.0f * f2;
            gradientDrawable.setBounds((int) (f17 + f20), (int) (f18 + f20), (int) (f17 + f19), (int) (f18 + f19));
            gradientDrawable.draw(canvas);
            i5++;
            i4 = 1;
        }
    }

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

    private boolean has(int i, int i2) {
        int i3;
        int i4 = this.imageBlockX;
        if (i >= i4 && i < (i3 = this.imageBloks + i4) && i2 >= i4 && i2 < i3) {
            return false;
        }
        if ((i < this.sideQuadSize || i >= this.input.getWidth() - this.sideQuadSize) && i2 < this.sideQuadSize) {
            return false;
        }
        return (i >= this.sideQuadSize || i2 < this.input.getHeight() - this.sideQuadSize) && i >= 0 && i2 >= 0 && i < this.input.getWidth() && i2 < this.input.getHeight() && this.input.get(i, i2) == 1;
    }

    public int getImageSize() {
        return this.imageSize;
    }

    public int getSideSize() {
        return this.sideQuadSize;
    }
}
