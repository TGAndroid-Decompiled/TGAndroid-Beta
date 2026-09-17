package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.GradientDrawable;
import java.util.Arrays;
import java.util.Map;
public final class TelegramQRCodeWriter {
    private static final int QUIET_ZONE_SIZE = 4;
    private int imageBlockX;
    private int imageBloks;
    private int imageSize;
    private jc.b input;
    private int sideQuadSize;
    private float[] radii = new float[8];
    public boolean includeSideQuads = true;

    public static void drawSideQuads(Canvas canvas, float f7, float f10, Paint paint, float f11, float f12, int i10, float f13, float f14, float[] fArr, boolean z10) {
        float f15;
        float f16;
        Path path = new Path();
        for (int i11 = 0; i11 < 3; i11++) {
            if (i11 == 0) {
                f15 = i10;
                f16 = f15;
            } else if (i11 == 1) {
                f16 = i10;
                f15 = (f13 - (f11 * f12)) - f16;
            } else {
                f15 = i10;
                f16 = (f13 - (f11 * f12)) - f15;
            }
            float f17 = f15 + f7;
            float f18 = f16 + f10;
            if (z10) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f19 = (f11 - 1.0f) * f12;
                rectF.set(f17 + f12, f18 + f12, f17 + f19, f19 + f18);
                float f20 = ((f11 * f12) / 4.0f) * f14;
                path.reset();
                path.addRoundRect(rectF, f20, f20, Path.Direction.CW);
                path.close();
                canvas.save();
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            }
            float f21 = f11 * f12;
            float f22 = (f21 / 3.0f) * f14;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(f17, f18, f17 + f21, f21 + f18);
            canvas.drawRoundRect(rectF2, f22, f22, paint);
            if (z10) {
                canvas.restore();
            }
            float f23 = (f11 - 2.0f) * f12;
            float f24 = (f23 / 4.0f) * f14;
            float f25 = 2.0f * f12;
            rectF2.set(f17 + f25, f25 + f18, f17 + f23, f18 + f23);
            canvas.drawRoundRect(rectF2, f24, f24, paint);
        }
    }

    public static void drawSideQuadsGradient(Canvas canvas, Paint paint, GradientDrawable gradientDrawable, float f7, float f10, int i10, float f11, float f12, float[] fArr, int i11, int i12) {
        boolean z10;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        if (Color.alpha(i11) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(fArr);
        Path path = new Path();
        RectF rectF = new RectF();
        for (int i13 = 0; i13 < 3; i13++) {
            if (i13 == 0) {
                f16 = i10;
                f15 = f16;
            } else {
                if (i13 == 1) {
                    f14 = i10;
                    f13 = (f11 - (f7 * f10)) - f14;
                } else {
                    f13 = i10;
                    f14 = (f11 - (f7 * f10)) - f13;
                }
                f15 = f13;
                f16 = f14;
            }
            if (z10) {
                float f18 = (f7 - 1.0f) * f10;
                f17 = 1.0f;
                rectF.set(f15 + f10, f16 + f10, f15 + f18, f18 + f16);
                float f19 = ((f7 * f10) / 4.0f) * f12;
                path.reset();
                path.addRoundRect(rectF, f19, f19, Path.Direction.CW);
                path.close();
                canvas.save();
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            } else {
                f17 = 1.0f;
            }
            float f20 = f7 * f10;
            Arrays.fill(fArr, (f20 / 3.0f) * f12);
            gradientDrawable.setColor(i12);
            gradientDrawable.setBounds((int) f15, (int) f16, (int) (f15 + f20), (int) (f16 + f20));
            gradientDrawable.draw(canvas);
            float f21 = f16;
            float f22 = f15 + f10;
            float f23 = f21 + f10;
            float f24 = (f7 - f17) * f10;
            float f25 = f15 + f24;
            float f26 = f24 + f21;
            canvas.drawRect(f22, f23, f25, f26, paint);
            if (z10) {
                canvas.restore();
            }
            if (!z10) {
                Arrays.fill(fArr, (f20 / 4.0f) * f12);
                gradientDrawable.setColor(i11);
                gradientDrawable.setBounds((int) f22, (int) f23, (int) f25, (int) f26);
                gradientDrawable.draw(canvas);
            }
            float f27 = (f7 - 2.0f) * f10;
            Arrays.fill(fArr, (f27 / 4.0f) * f12);
            gradientDrawable.setColor(i12);
            float f28 = 2.0f * f10;
            gradientDrawable.setBounds((int) (f15 + f28), (int) (f21 + f28), (int) (f15 + f27), (int) (f21 + f27));
            gradientDrawable.draw(canvas);
        }
    }

    private boolean has(int i10, int i11) {
        int i12 = this.imageBlockX;
        if (i10 >= i12) {
            int i13 = this.imageBloks;
            if (i10 < i12 + i13 && i11 >= i12 && i11 < i12 + i13) {
                return false;
            }
        }
        int i14 = this.sideQuadSize;
        if ((i10 < i14 || i10 >= this.input.f13598b - i14) && i11 < i14) {
            return false;
        }
        if ((i10 >= i14 || i11 < this.input.f13599c - i14) && i10 >= 0 && i11 >= 0) {
            jc.b bVar = this.input;
            if (i10 < bVar.f13598b && i11 < bVar.f13599c && bVar.a(i10, i11) == 1) {
                return true;
            }
        }
        return false;
    }

    public Bitmap encode(String str, int i10, int i11, Map<cc.b, ?> map, Bitmap bitmap) {
        return encode(str, i10, i11, map, bitmap, 1.0f, -1, -16777216);
    }

    public int getImageSize() {
        return this.imageSize;
    }

    public int getSideSize() {
        return this.sideQuadSize;
    }

    public android.graphics.Bitmap encode(java.lang.String r37, int r38, int r39, java.util.Map<cc.b, ?> r40, android.graphics.Bitmap r41, float r42, int r43, int r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.TelegramQRCodeWriter.encode(java.lang.String, int, int, java.util.Map, android.graphics.Bitmap, float, int, int):android.graphics.Bitmap");
    }
}
