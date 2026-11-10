package li;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.m6;
public final class z1 extends Drawable {
    public final Context f19045a;
    public final Drawable f19046b;
    public Drawable f19047c;
    public int d;
    public int f19048e;
    public Drawable f19049f;
    public boolean f19050g;

    public z1(Context context, int i7) {
        Drawable h = jg.g.h(context, i7);
        this.d = m6.f27890d6;
        this.f19050g = true;
        this.f19045a = context;
        this.f19046b = h;
    }

    public final void a(boolean z9) {
        if (this.f19050g == z9) {
            return;
        }
        this.f19050g = z9;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.f19046b;
        drawable.setBounds(org.telegram.ui.Cells.f1.z(2, centerX, drawable), org.telegram.ui.Cells.f1.y(2, centerY, drawable), org.telegram.ui.Cells.f1.w(2, centerX, drawable), org.telegram.ui.Cells.f1.f(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.f19050g) {
            int L = org.telegram.messenger.g0.L(9.0f) + centerX;
            int L2 = org.telegram.messenger.g0.L(9.0f) + centerY;
            int x02 = m6.x0(null, this.d, false);
            Drawable drawable2 = this.f19047c;
            Context context = this.f19045a;
            if (drawable2 == null) {
                Drawable h = jg.g.h(context, 2131232750);
                this.f19047c = h;
                this.f19048e = x02;
                h.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (x02 != this.f19048e) {
                Drawable drawable3 = this.f19047c;
                this.f19048e = x02;
                drawable3.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (this.f19049f == null) {
                this.f19049f = jg.g.h(context, 2131232749);
            }
            this.f19047c.setBounds(L - org.telegram.messenger.g0.L(9.0f), L2 - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f) + L, org.telegram.messenger.g0.L(9.0f) + L2);
            this.f19047c.draw(canvas);
            this.f19049f.setBounds(L - org.telegram.messenger.g0.L(9.0f), L2 - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f) + L, org.telegram.messenger.g0.L(9.0f) + L2);
            this.f19049f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(org.telegram.messenger.g0.L(38.0f), this.f19046b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(org.telegram.messenger.g0.L(38.0f), this.f19046b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.f19046b.getOpacity();
    }

    @Override
    public final void setAlpha(int i7) {
        this.f19046b.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f19046b.setColorFilter(colorFilter);
    }
}
