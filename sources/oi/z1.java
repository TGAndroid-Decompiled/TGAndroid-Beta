package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.n6;
public final class z1 extends Drawable {
    public final Context f22652a;
    public final Drawable f22653b;
    public Drawable f22654c;
    public int d;
    public int f22655e;
    public Drawable f22656f;
    public boolean f22657g;

    public z1(Context context, int i7) {
        Drawable g10 = i5.c.g(context, i7);
        this.d = n6.f29451d6;
        this.f22657g = true;
        this.f22652a = context;
        this.f22653b = g10;
    }

    public final void a(boolean z10) {
        if (this.f22657g == z10) {
            return;
        }
        this.f22657g = z10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.f22653b;
        drawable.setBounds(org.telegram.ui.Cells.c0.C(2, centerX, drawable), org.telegram.ui.Cells.c0.A(2, centerY, drawable), org.telegram.ui.Cells.c0.y(2, centerX, drawable), org.telegram.ui.Cells.c0.j(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.f22657g) {
            int L = org.telegram.messenger.g0.L(9.0f) + centerX;
            int L2 = org.telegram.messenger.g0.L(9.0f) + centerY;
            int x02 = n6.x0(null, this.d, false);
            Drawable drawable2 = this.f22654c;
            Context context = this.f22652a;
            if (drawable2 == null) {
                Drawable g10 = i5.c.g(context, 2131232755);
                this.f22654c = g10;
                this.f22655e = x02;
                g10.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (x02 != this.f22655e) {
                Drawable drawable3 = this.f22654c;
                this.f22655e = x02;
                drawable3.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (this.f22656f == null) {
                this.f22656f = i5.c.g(context, 2131232754);
            }
            this.f22654c.setBounds(L - org.telegram.messenger.g0.L(9.0f), L2 - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f) + L, org.telegram.messenger.g0.L(9.0f) + L2);
            this.f22654c.draw(canvas);
            this.f22656f.setBounds(L - org.telegram.messenger.g0.L(9.0f), L2 - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f) + L, org.telegram.messenger.g0.L(9.0f) + L2);
            this.f22656f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(org.telegram.messenger.g0.L(38.0f), this.f22653b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(org.telegram.messenger.g0.L(38.0f), this.f22653b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.f22653b.getOpacity();
    }

    @Override
    public final void setAlpha(int i7) {
        this.f22653b.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f22653b.setColorFilter(colorFilter);
    }
}
