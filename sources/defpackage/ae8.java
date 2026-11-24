package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
public final class ae8 extends Drawable {
    public final Paint a;
    public final int b;
    public boolean c;
    public float d;
    public long e;
    public View f;
    public int g = 255;
    public float h = 300.0f;

    public ae8(int i) {
        this.b = gm.L(i);
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(-1);
    }

    public final void a(boolean z, boolean z2) {
        float f;
        if (this.c != z) {
            this.c = z;
            if (!z2) {
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                this.d = f;
            }
            this.e = AnimationUtils.currentAnimationTimeMillis();
            invalidateSelf();
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ae8.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.b;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.g = i;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
