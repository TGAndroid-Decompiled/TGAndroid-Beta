package org.telegram.messenger;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class g2 extends Drawable {
    public final long f22584a;
    public final Drawable f22585b;
    public final Paint f22586c;
    public final Path d;
    public boolean f22587e;
    public final org.telegram.ui.Components.v5 f22588f;

    public g2(Context context) {
        Paint paint = new Paint(1);
        this.f22586c = paint;
        Path path = new Path();
        this.d = path;
        this.f22587e = false;
        this.f22588f = new org.telegram.ui.Components.v5(new a(this, 3), 420L, org.telegram.ui.Components.wq.h, 0);
        this.f22584a = System.currentTimeMillis();
        this.f22585b = jg.g.h(context, 2131231244);
        paint.setPathEffect(new CornerPathEffect(g0.L(1.0f)));
        path.rewind();
        path.moveTo(-g0.N(1.33f), g0.N(0.16f));
        path.lineTo(-g0.N(1.33f), -g0.N(3.5f));
        path.lineTo(g0.N(1.33f), -g0.N(3.5f));
        path.lineTo(g0.N(1.33f), g0.N(0.16f));
        path.lineTo(g0.N(3.5f), g0.N(0.16f));
        path.lineTo(0.0f, g0.N(3.5f));
        path.lineTo(-g0.N(3.5f), g0.N(0.16f));
        path.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Drawable drawable = this.f22585b;
        drawable.setBounds(bounds);
        drawable.draw(canvas);
        float d = this.f22588f.d(this.f22587e);
        if (d > 0.0f) {
            canvas.save();
            canvas.translate(getBounds().centerX(), getBounds().centerY());
            canvas.translate(-g0.N(8.166f), g0.N(5.0f));
            float f10 = (d * 0.5f) + 0.5f;
            canvas.scale(f10, f10);
            int r12 = org.telegram.ui.ActionBar.m6.r1(0.4f, -1);
            Paint paint = this.f22586c;
            paint.setColor(r12);
            Path path = this.d;
            canvas.drawPath(path, paint);
            float currentTimeMillis = ((float) ((System.currentTimeMillis() - this.f22584a) % 450)) / 450.0f;
            float f11 = 0.5f + currentTimeMillis;
            canvas.save();
            canvas.clipRect(-g0.L(5.0f), g0.T1(-g0.N(3.5f), g0.N(3.5f), currentTimeMillis), g0.L(5.0f), g0.T1(-g0.N(3.5f), g0.N(3.5f), f11));
            paint.setColor(org.telegram.ui.ActionBar.m6.r1(1.0f, -1));
            canvas.drawPath(path, paint);
            canvas.restore();
            if (f11 > 1.0f) {
                canvas.save();
                canvas.clipRect(-g0.L(5.0f), g0.T1(-g0.N(3.5f), g0.N(3.5f), 0.0f), g0.L(5.0f), g0.T1(-g0.N(3.5f), g0.N(3.5f), f11 - 1.0f));
                paint.setColor(org.telegram.ui.ActionBar.m6.r1(1.0f, -1));
                canvas.drawPath(path, paint);
                canvas.restore();
            }
            canvas.restore();
            invalidateSelf();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f22585b.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f22585b.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f22585b.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f22586c.setColorFilter(colorFilter);
        this.f22585b.setColorFilter(colorFilter);
    }
}
