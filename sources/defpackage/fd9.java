package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class fd9 extends Drawable {
    public final Context a;
    public final Drawable b;
    public Drawable c;
    public int d;
    public int e;
    public Drawable f;
    public boolean g;

    public fd9(Context context, int i) {
        Drawable d = b00.d(context, i);
        this.d = bkb.c6;
        this.g = true;
        this.a = context;
        this.b = d;
    }

    public final void a(boolean z) {
        if (this.g == z) {
            return;
        }
        this.g = z;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.b;
        drawable.setBounds(oo1.A(2, centerX, drawable), oo1.y(2, centerY, drawable), oo1.w(2, centerX, drawable), oo1.i(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.g) {
            int L = gl.L(9.0f) + centerX;
            int L2 = gl.L(9.0f) + centerY;
            int w0 = bkb.w0(null, this.d, false);
            Drawable drawable2 = this.c;
            Context context = this.a;
            if (drawable2 == null) {
                Drawable d = b00.d(context, 2131232755);
                this.c = d;
                this.e = w0;
                d.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.SRC_IN));
            }
            if (w0 != this.e) {
                Drawable drawable3 = this.c;
                this.e = w0;
                drawable3.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.SRC_IN));
            }
            if (this.f == null) {
                this.f = b00.d(context, 2131232754);
            }
            this.c.setBounds(L - gl.L(9.0f), L2 - gl.L(9.0f), gl.L(9.0f) + L, gl.L(9.0f) + L2);
            this.c.draw(canvas);
            this.f.setBounds(L - gl.L(9.0f), L2 - gl.L(9.0f), gl.L(9.0f) + L, gl.L(9.0f) + L2);
            this.f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(gl.L(38.0f), this.b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(gl.L(38.0f), this.b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.b.getOpacity();
    }

    @Override
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
}
