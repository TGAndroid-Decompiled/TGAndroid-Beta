package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class ndb extends Drawable {
    public boolean a;
    public final ln b;
    public final Drawable c;
    public final Drawable d;
    public int e = 255;

    public ndb(rc2 rc2Var) {
        this.b = new ln(420L, rc2Var, d53.h);
        this.c = rc2Var.getContext().getResources().getDrawable(2131232786);
        this.d = rc2Var.getContext().getResources().getDrawable(2131232787);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Drawable drawable = this.d;
        drawable.setBounds(bounds);
        drawable.setAlpha(this.e);
        drawable.draw(canvas);
        float d = this.b.d(this.a);
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float width = getBounds().width();
        canvas.save();
        if (d < 0.5f) {
            float abs = Math.abs(d - 0.5f) + 0.5f;
            canvas.scale(abs, abs, centerX, centerY);
        }
        canvas.save();
        int i = (d > 0.5f ? 1 : (d == 0.5f ? 0 : -1));
        if (i > 0) {
            float abs2 = Math.abs(d - 0.5f) + 0.5f;
            float f = -abs2;
            float f2 = width * 0.32f;
            canvas.scale(f, f, getBounds().left + f2, getBounds().bottom - f2);
            float f3 = 1.0f - abs2;
            canvas.translate((-width) * f3 * 0.4f, f3 * width * 0.4f);
        }
        Rect bounds2 = getBounds();
        Drawable drawable2 = this.c;
        drawable2.setBounds(bounds2);
        drawable2.setAlpha(this.e);
        drawable2.draw(canvas);
        canvas.restore();
        canvas.save();
        if (i > 0) {
            float f4 = -(Math.abs(d - 0.5f) + 0.5f);
            float f5 = 0.32f * width;
            canvas.scale(f4, f4, getBounds().right - f5, getBounds().top + f5);
        }
        canvas.rotate(180.0f, centerX, centerY);
        if (i > 0) {
            float abs3 = 1.0f - (Math.abs(d - 0.5f) + 0.5f);
            canvas.translate((-width) * abs3 * 0.4f, width * abs3 * 0.4f);
        }
        drawable2.setBounds(getBounds());
        drawable2.setAlpha(this.e);
        drawable2.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.c.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.c.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.e = i;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
    }
}
