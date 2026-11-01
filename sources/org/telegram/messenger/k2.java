package org.telegram.messenger;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class k2 extends Drawable {
    public final long f16550a;
    public final Drawable f16551b;
    public final Paint f16552c;
    public final Path d;
    public boolean e;
    public final org.telegram.ui.Components.t5 f16553f;

    public k2(Context context) {
        Paint paint = new Paint(1);
        this.f16552c = paint;
        Path path = new Path();
        this.d = path;
        this.e = false;
        this.f16553f = new org.telegram.ui.Components.t5(new a(this, 3), 420L, org.telegram.ui.Components.gr.h, 0);
        this.f16550a = System.currentTimeMillis();
        this.f16551b = i0.a.f(context, 2131231245);
        paint.setPathEffect(new CornerPathEffect(i0.L(1.0f)));
        path.rewind();
        path.moveTo(-i0.N(1.33f), i0.N(0.16f));
        path.lineTo(-i0.N(1.33f), -i0.N(3.5f));
        path.lineTo(i0.N(1.33f), -i0.N(3.5f));
        path.lineTo(i0.N(1.33f), i0.N(0.16f));
        path.lineTo(i0.N(3.5f), i0.N(0.16f));
        path.lineTo(0.0f, i0.N(3.5f));
        path.lineTo(-i0.N(3.5f), i0.N(0.16f));
        path.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Drawable drawable = this.f16551b;
        drawable.setBounds(bounds);
        drawable.draw(canvas);
        float d = this.f16553f.d(this.e);
        if (d > 0.0f) {
            canvas.save();
            canvas.translate(getBounds().centerX(), getBounds().centerY());
            canvas.translate(-i0.N(8.166f), i0.N(5.0f));
            float f7 = (d * 0.5f) + 0.5f;
            canvas.scale(f7, f7);
            int r12 = org.telegram.ui.ActionBar.t6.r1(0.4f, -1);
            Paint paint = this.f16552c;
            paint.setColor(r12);
            Path path = this.d;
            canvas.drawPath(path, paint);
            float currentTimeMillis = ((float) ((System.currentTimeMillis() - this.f16550a) % 450)) / 450.0f;
            float f10 = 0.5f + currentTimeMillis;
            canvas.save();
            canvas.clipRect(-i0.L(5.0f), i0.T1(-i0.N(3.5f), i0.N(3.5f), currentTimeMillis), i0.L(5.0f), i0.T1(-i0.N(3.5f), i0.N(3.5f), f10));
            paint.setColor(org.telegram.ui.ActionBar.t6.r1(1.0f, -1));
            canvas.drawPath(path, paint);
            canvas.restore();
            if (f10 > 1.0f) {
                canvas.save();
                canvas.clipRect(-i0.L(5.0f), i0.T1(-i0.N(3.5f), i0.N(3.5f), 0.0f), i0.L(5.0f), i0.T1(-i0.N(3.5f), i0.N(3.5f), f10 - 1.0f));
                paint.setColor(org.telegram.ui.ActionBar.t6.r1(1.0f, -1));
                canvas.drawPath(path, paint);
                canvas.restore();
            }
            canvas.restore();
            invalidateSelf();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f16551b.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f16551b.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f16551b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f16552c.setColorFilter(colorFilter);
        this.f16551b.setColorFilter(colorFilter);
    }
}
