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
        Paint paint;
        GradientDrawable gradientDrawable;
        Bitmap bitmap2;
        char c;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Canvas canvas;
        Paint paint2;
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
        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
        canvas2.drawColor(i3);
        Paint paint3 = new Paint(1);
        paint3.setColor(i4);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadii(this.radii);
        Bitmap bitmap3 = bitmapCreateBitmap;
        float f2 = iMin;
        int iRound = Math.round((i10 / 4.65f) / f2);
        this.imageBloks = iRound;
        if (iRound % 2 != width % 2) {
            this.imageBloks = iRound + 1;
        }
        int i12 = this.imageBloks;
        this.imageBlockX = (width - i12) / 2;
        int i13 = (i12 * iMin) - 24;
        this.imageSize = i13;
        int i14 = (i11 - i13) / 2;
        Canvas canvas3 = canvas2;
        if (this.includeSideQuads) {
            paint3.setColor(i4);
            bitmap2 = bitmap3;
            c = 1;
            paint = paint3;
            gradientDrawable = gradientDrawable2;
            drawSideQuadsGradient(canvas3, paint, gradientDrawable, this.sideQuadSize, f2, 16, i11, f, this.radii, i3, i4);
        } else {
            paint = paint3;
            gradientDrawable = gradientDrawable2;
            bitmap2 = bitmap3;
            c = 1;
        }
        boolean z5 = Color.alpha(i3) == 0;
        float f3 = (f2 / 2.0f) * f;
        int i15 = 16;
        int i16 = 0;
        while (i16 < height) {
            int i17 = 0;
            int i18 = 16;
            while (i17 < width) {
                if (has(i17, i16)) {
                    Arrays.fill(this.radii, f3);
                    if (has(i17, i16 - 1)) {
                        float[] fArr = this.radii;
                        fArr[c] = 0.0f;
                        fArr[0] = 0.0f;
                        fArr[3] = 0.0f;
                        fArr[2] = 0.0f;
                    }
                    if (has(i17, i16 + 1)) {
                        float[] fArr2 = this.radii;
                        fArr2[7] = 0.0f;
                        fArr2[6] = 0.0f;
                        fArr2[5] = 0.0f;
                        fArr2[4] = 0.0f;
                    }
                    if (has(i17 - 1, i16)) {
                        float[] fArr3 = this.radii;
                        fArr3[c] = 0.0f;
                        fArr3[0] = 0.0f;
                        fArr3[7] = 0.0f;
                        fArr3[6] = 0.0f;
                    }
                    if (has(i17 + 1, i16)) {
                        float[] fArr4 = this.radii;
                        fArr4[3] = 0.0f;
                        fArr4[2] = 0.0f;
                        fArr4[5] = 0.0f;
                        fArr4[4] = 0.0f;
                    }
                    gradientDrawable.setColor(i4);
                    gradientDrawable.setBounds(i18, i15, i18 + r4, i15 + iMin);
                    gradientDrawable.draw(canvas3);
                    paint2 = paint;
                    canvas = canvas3;
                    z3 = z5;
                } else {
                    Paint paint4 = paint;
                    Arrays.fill(this.radii, 0.0f);
                    int i19 = i17 - 1;
                    int i20 = i16 - 1;
                    if (has(i19, i20) && has(i19, i16) && has(i17, i20)) {
                        float[] fArr5 = this.radii;
                        fArr5[c] = f3;
                        fArr5[0] = f3;
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z6 = z;
                    int i21 = i17 + 1;
                    if (has(i21, i20) && has(i21, i16) && has(i17, i20)) {
                        float[] fArr6 = this.radii;
                        fArr6[3] = f3;
                        fArr6[2] = f3;
                        z2 = true;
                    } else {
                        z2 = z6;
                    }
                    z3 = z5;
                    int i22 = i16 + 1;
                    if (has(i19, i22) && has(i19, i16) && has(i17, i22)) {
                        float[] fArr7 = this.radii;
                        fArr7[7] = f3;
                        fArr7[6] = f3;
                        z2 = true;
                    }
                    if (has(i21, i22) && has(i21, i16) && has(i17, i22)) {
                        float[] fArr8 = this.radii;
                        fArr8[5] = f3;
                        fArr8[4] = f3;
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (!z4 || z3) {
                        canvas = canvas3;
                        paint2 = paint4;
                    } else {
                        int i23 = i18 + r4;
                        int i24 = i15 + r4;
                        canvas3.drawRect(i18, i15, i23, i24, paint4);
                        canvas = canvas3;
                        paint2 = paint4;
                        gradientDrawable.setColor(i3);
                        gradientDrawable.setBounds(i18, i15, i23, i24);
                        gradientDrawable.draw(canvas);
                    }
                }
                i17++;
                i18 += r4;
                canvas3 = canvas;
                paint = paint2;
                z5 = z3;
            }
            i16++;
            i15 += r4;
            paint = paint;
        }
        Canvas canvas4 = canvas3;
        String res = AndroidUtilities.readRes(R.raw.qr_logo);
        int i25 = this.imageSize;
        Bitmap bitmap4 = SvgHelper.getBitmap(res, i25, i25, false);
        float f4 = i14;
        canvas4.drawBitmap(bitmap4, f4, f4, (Paint) null);
        bitmap4.recycle();
        canvas4.setBitmap(null);
        return bitmap2;
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
