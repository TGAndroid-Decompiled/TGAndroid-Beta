package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class yj5 extends Drawable {
    public byte[] a;
    public final Paint b = new Paint();
    public final int[] c = {-1, -2758925, -13805707, -13657655};

    @Override
    public final void draw(Canvas canvas) {
        byte[] bArr = this.a;
        if (bArr != null) {
            int length = bArr.length;
            int[] iArr = this.c;
            Paint paint = this.b;
            if (length == 16) {
                float floor = (float) Math.floor(Math.min(getBounds().width(), getBounds().height()) / 8.0f);
                float f = 8.0f * floor;
                float f2 = oo1.f(getBounds().width(), f, 2.0f, 0.0f);
                float f3 = oo1.f(getBounds().height(), f, 2.0f, 0.0f);
                int i = 0;
                for (int i2 = 0; i2 < 8; i2++) {
                    int i3 = 0;
                    while (i3 < 8) {
                        int i4 = i + 2;
                        paint.setColor(iArr[Math.abs((this.a[i / 8] >> (i % 8)) & 3) % 4]);
                        float f4 = (i3 * floor) + f2;
                        float f5 = i2 * floor;
                        canvas.drawRect(f4, f5 + f3, f4 + floor, f5 + floor + f3, paint);
                        i3++;
                        i = i4;
                    }
                }
                return;
            }
            float floor2 = (float) Math.floor(Math.min(getBounds().width(), getBounds().height()) / 12.0f);
            float f6 = 12.0f * floor2;
            float f7 = oo1.f(getBounds().width(), f6, 2.0f, 0.0f);
            float f8 = oo1.f(getBounds().height(), f6, 2.0f, 0.0f);
            int i5 = 0;
            int i6 = 0;
            while (i6 < 12) {
                int i7 = i5;
                for (int i8 = 0; i8 < 12; i8++) {
                    paint.setColor(iArr[Math.abs((this.a[i7 / 8] >> (i7 % 8)) & 3) % 4]);
                    float f9 = (i8 * floor2) + f7;
                    float f10 = i6 * floor2;
                    canvas.drawRect(f9, f10 + f8, f9 + floor2, f10 + floor2 + f8, paint);
                    i7 += 2;
                }
                i6++;
                i5 = i7;
            }
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return gl.L(32.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return gl.L(32.0f);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
