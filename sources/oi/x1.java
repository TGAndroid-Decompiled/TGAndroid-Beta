package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.j6;
public final class x1 extends Drawable {
    public final Context f22113a;
    public final Drawable f22114b;
    public Drawable f22115c;
    public int d;
    public int f22116e;
    public Drawable f22117f;
    public boolean f22118g;

    public x1(Context context, int i7) {
        Drawable g10 = i5.c.g(context, i7);
        this.d = j6.f28849d6;
        this.f22118g = true;
        this.f22113a = context;
        this.f22114b = g10;
    }

    public final void a(boolean z10) {
        if (this.f22118g == z10) {
            return;
        }
        this.f22118g = z10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.f22114b;
        drawable.setBounds(org.telegram.ui.Cells.y0.A(2, centerX, drawable), org.telegram.ui.Cells.y0.y(2, centerY, drawable), org.telegram.ui.Cells.y0.w(2, centerX, drawable), org.telegram.ui.Cells.y0.h(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.f22118g) {
            int L = org.telegram.messenger.g0.L(9.0f) + centerX;
            int L2 = org.telegram.messenger.g0.L(9.0f) + centerY;
            int x02 = j6.x0(null, this.d, false);
            Drawable drawable2 = this.f22115c;
            Context context = this.f22113a;
            if (drawable2 == null) {
                Drawable g10 = i5.c.g(context, 2131232751);
                this.f22115c = g10;
                this.f22116e = x02;
                g10.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (x02 != this.f22116e) {
                Drawable drawable3 = this.f22115c;
                this.f22116e = x02;
                drawable3.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (this.f22117f == null) {
                this.f22117f = i5.c.g(context, 2131232750);
            }
            this.f22115c.setBounds(L - org.telegram.messenger.g0.L(9.0f), L2 - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f) + L, org.telegram.messenger.g0.L(9.0f) + L2);
            this.f22115c.draw(canvas);
            this.f22117f.setBounds(L - org.telegram.messenger.g0.L(9.0f), L2 - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f) + L, org.telegram.messenger.g0.L(9.0f) + L2);
            this.f22117f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(org.telegram.messenger.g0.L(38.0f), this.f22114b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(org.telegram.messenger.g0.L(38.0f), this.f22114b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.f22114b.getOpacity();
    }

    @Override
    public final void setAlpha(int i7) {
        this.f22114b.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f22114b.setColorFilter(colorFilter);
    }
}
