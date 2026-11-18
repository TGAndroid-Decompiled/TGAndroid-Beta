package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.n6;
public final class x1 extends Drawable {
    public final Context f22449a;
    public final Drawable f22450b;
    public Drawable f22451c;
    public int d;
    public int f22452e;
    public Drawable f22453f;
    public boolean f22454g;

    public x1(Context context, int i7) {
        Drawable g10 = i5.c.g(context, i7);
        this.d = n6.f29396d6;
        this.f22454g = true;
        this.f22449a = context;
        this.f22450b = g10;
    }

    public final void a(boolean z10) {
        if (this.f22454g == z10) {
            return;
        }
        this.f22454g = z10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.f22450b;
        drawable.setBounds(org.telegram.ui.Cells.c0.C(2, centerX, drawable), org.telegram.ui.Cells.c0.A(2, centerY, drawable), org.telegram.ui.Cells.c0.y(2, centerX, drawable), org.telegram.ui.Cells.c0.j(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.f22454g) {
            int L = org.telegram.messenger.g0.L(9.0f) + centerX;
            int L2 = org.telegram.messenger.g0.L(9.0f) + centerY;
            int x02 = n6.x0(null, this.d, false);
            Drawable drawable2 = this.f22451c;
            Context context = this.f22449a;
            if (drawable2 == null) {
                Drawable g10 = i5.c.g(context, 2131232752);
                this.f22451c = g10;
                this.f22452e = x02;
                g10.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (x02 != this.f22452e) {
                Drawable drawable3 = this.f22451c;
                this.f22452e = x02;
                drawable3.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (this.f22453f == null) {
                this.f22453f = i5.c.g(context, 2131232751);
            }
            this.f22451c.setBounds(L - org.telegram.messenger.g0.L(9.0f), L2 - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f) + L, org.telegram.messenger.g0.L(9.0f) + L2);
            this.f22451c.draw(canvas);
            this.f22453f.setBounds(L - org.telegram.messenger.g0.L(9.0f), L2 - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f) + L, org.telegram.messenger.g0.L(9.0f) + L2);
            this.f22453f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(org.telegram.messenger.g0.L(38.0f), this.f22450b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(org.telegram.messenger.g0.L(38.0f), this.f22450b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.f22450b.getOpacity();
    }

    @Override
    public final void setAlpha(int i7) {
        this.f22450b.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f22450b.setColorFilter(colorFilter);
    }
}
