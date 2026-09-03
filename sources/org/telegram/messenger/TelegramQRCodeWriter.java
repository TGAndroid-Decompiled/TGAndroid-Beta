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
    private vb.b input;
    private int sideQuadSize;
    private float[] radii = new float[8];
    public boolean includeSideQuads = true;

    public static void drawSideQuads(Canvas canvas, float f10, float f11, Paint paint, float f12, float f13, int i10, float f14, float f15, float[] fArr, boolean z4) {
        float f16;
        float f17;
        Path path = new Path();
        for (int i11 = 0; i11 < 3; i11++) {
            if (i11 == 0) {
                f16 = i10;
                f17 = f16;
            } else if (i11 == 1) {
                f17 = i10;
                f16 = (f14 - (f12 * f13)) - f17;
            } else {
                f16 = i10;
                f17 = (f14 - (f12 * f13)) - f16;
            }
            float f18 = f16 + f10;
            float f19 = f17 + f11;
            if (z4) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f20 = (f12 - 1.0f) * f13;
                rectF.set(f18 + f13, f19 + f13, f18 + f20, f20 + f19);
                float f21 = ((f12 * f13) / 4.0f) * f15;
                path.reset();
                path.addRoundRect(rectF, f21, f21, Path.Direction.CW);
                path.close();
                canvas.save();
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            }
            float f22 = f12 * f13;
            float f23 = (f22 / 3.0f) * f15;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(f18, f19, f18 + f22, f22 + f19);
            canvas.drawRoundRect(rectF2, f23, f23, paint);
            if (z4) {
                canvas.restore();
            }
            float f24 = (f12 - 2.0f) * f13;
            float f25 = (f24 / 4.0f) * f15;
            float f26 = 2.0f * f13;
            rectF2.set(f18 + f26, f26 + f19, f18 + f24, f19 + f24);
            canvas.drawRoundRect(rectF2, f25, f25, paint);
        }
    }

    public static void drawSideQuadsGradient(Canvas canvas, Paint paint, GradientDrawable gradientDrawable, float f10, float f11, int i10, float f12, float f13, float[] fArr, int i11, int i12) {
        boolean z4;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        if (Color.alpha(i11) == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(fArr);
        Path path = new Path();
        RectF rectF = new RectF();
        for (int i13 = 0; i13 < 3; i13++) {
            if (i13 == 0) {
                f17 = i10;
                f16 = f17;
            } else {
                if (i13 == 1) {
                    f15 = i10;
                    f14 = (f12 - (f10 * f11)) - f15;
                } else {
                    f14 = i10;
                    f15 = (f12 - (f10 * f11)) - f14;
                }
                f16 = f14;
                f17 = f15;
            }
            if (z4) {
                float f19 = (f10 - 1.0f) * f11;
                f18 = 1.0f;
                rectF.set(f16 + f11, f17 + f11, f16 + f19, f19 + f17);
                float f20 = ((f10 * f11) / 4.0f) * f13;
                path.reset();
                path.addRoundRect(rectF, f20, f20, Path.Direction.CW);
                path.close();
                canvas.save();
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            } else {
                f18 = 1.0f;
            }
            float f21 = f10 * f11;
            Arrays.fill(fArr, (f21 / 3.0f) * f13);
            gradientDrawable.setColor(i12);
            gradientDrawable.setBounds((int) f16, (int) f17, (int) (f16 + f21), (int) (f17 + f21));
            gradientDrawable.draw(canvas);
            float f22 = f17;
            float f23 = f16 + f11;
            float f24 = f22 + f11;
            float f25 = (f10 - f18) * f11;
            float f26 = f16 + f25;
            float f27 = f25 + f22;
            canvas.drawRect(f23, f24, f26, f27, paint);
            if (z4) {
                canvas.restore();
            }
            if (!z4) {
                Arrays.fill(fArr, (f21 / 4.0f) * f13);
                gradientDrawable.setColor(i11);
                gradientDrawable.setBounds((int) f23, (int) f24, (int) f26, (int) f27);
                gradientDrawable.draw(canvas);
            }
            float f28 = (f10 - 2.0f) * f11;
            Arrays.fill(fArr, (f28 / 4.0f) * f13);
            gradientDrawable.setColor(i12);
            float f29 = 2.0f * f11;
            gradientDrawable.setBounds((int) (f16 + f29), (int) (f22 + f29), (int) (f16 + f28), (int) (f22 + f28));
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
        if ((i10 < i14 || i10 >= this.input.f48982b - i14) && i11 < i14) {
            return false;
        }
        if ((i10 >= i14 || i11 < this.input.f48983c - i14) && i10 >= 0 && i11 >= 0) {
            vb.b bVar = this.input;
            if (i10 < bVar.f48982b && i11 < bVar.f48983c && bVar.a(i10, i11) == 1) {
                return true;
            }
        }
        return false;
    }

    public Bitmap encode(String str, int i10, int i11, Map<ob.b, ?> map, Bitmap bitmap) {
        return encode(str, i10, i11, map, bitmap, 1.0f, -1, -16777216);
    }

    public int getImageSize() {
        return this.imageSize;
    }

    public int getSideSize() {
        return this.sideQuadSize;
    }

    public android.graphics.Bitmap encode(java.lang.String r37, int r38, int r39, java.util.Map<ob.b, ?> r40, android.graphics.Bitmap r41, float r42, int r43, int r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.TelegramQRCodeWriter.encode(java.lang.String, int, int, java.util.Map, android.graphics.Bitmap, float, int, int):android.graphics.Bitmap");
    }
}
