package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class wg9 extends Drawable {
    public final Context a;
    public final Drawable b;
    public Drawable c;
    public int d;
    public int e;
    public Drawable f;
    public boolean g;

    public wg9(Context context, int i) {
        Drawable e = c00.e(context, i);
        this.d = aob.d6;
        this.g = true;
        this.a = context;
        this.b = e;
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
        drawable.setBounds(bp1.A(2, centerX, drawable), bp1.y(2, centerY, drawable), bp1.w(2, centerX, drawable), bp1.i(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.g) {
            int L = hl.L(9.0f) + centerX;
            int L2 = hl.L(9.0f) + centerY;
            int w0 = aob.w0(null, this.d, false);
            Drawable drawable2 = this.c;
            Context context = this.a;
            if (drawable2 == null) {
                Drawable e = c00.e(context, 2131232773);
                this.c = e;
                this.e = w0;
                e.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.SRC_IN));
            }
            if (w0 != this.e) {
                Drawable drawable3 = this.c;
                this.e = w0;
                drawable3.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.SRC_IN));
            }
            if (this.f == null) {
                this.f = c00.e(context, 2131232772);
            }
            this.c.setBounds(L - hl.L(9.0f), L2 - hl.L(9.0f), hl.L(9.0f) + L, hl.L(9.0f) + L2);
            this.c.draw(canvas);
            this.f.setBounds(L - hl.L(9.0f), L2 - hl.L(9.0f), hl.L(9.0f) + L, hl.L(9.0f) + L2);
            this.f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(hl.L(38.0f), this.b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(hl.L(38.0f), this.b.getIntrinsicWidth());
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
