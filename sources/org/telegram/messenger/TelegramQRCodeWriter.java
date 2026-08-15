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
import com.google.zxing.qrcode.encoder.ByteMatrix;
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

    public android.graphics.Bitmap encode(java.lang.String r28, int r29, int r30, java.util.Map<com.google.zxing.EncodeHintType, ?> r31, android.graphics.Bitmap r32, float r33, int r34, int r35) throws org.xml.sax.SAXException, java.lang.NumberFormatException, java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.TelegramQRCodeWriter.encode(java.lang.String, int, int, java.util.Map, android.graphics.Bitmap, float, int, int):android.graphics.Bitmap");
    }

    public static void drawSideQuadsGradient(Canvas canvas, Paint paint, GradientDrawable gradientDrawable, float f, float f2, int i, float f3, float f4, float[] fArr, int i2, int i3) {
        float f5;
        float f6;
        float f7;
        float f8;
        int i4 = i;
        int i5 = 1;
        boolean z = Color.alpha(i2) == 0;
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(fArr);
        Path path = new Path();
        RectF rectF = new RectF();
        int i6 = 0;
        while (i6 < 3) {
            if (i6 == 0) {
                f7 = i4;
                f8 = f7;
            } else {
                if (i6 == i5) {
                    f6 = i4;
                    f5 = (f3 - (f * f2)) - f6;
                } else {
                    f5 = i4;
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
            i6++;
            i4 = i;
            i5 = 1;
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
