package li;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.l6;
public final class z1 extends Drawable {
    public final Context f19040a;
    public final Drawable f19041b;
    public Drawable f19042c;
    public int d;
    public int f19043e;
    public Drawable f19044f;
    public boolean f19045g;

    public z1(Context context, int i7) {
        Drawable h = jg.g.h(context, i7);
        this.d = l6.f27865d6;
        this.f19045g = true;
        this.f19040a = context;
        this.f19041b = h;
    }

    public final void a(boolean z9) {
        if (this.f19045g == z9) {
            return;
        }
        this.f19045g = z9;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.f19041b;
        drawable.setBounds(org.telegram.ui.Cells.f1.z(2, centerX, drawable), org.telegram.ui.Cells.f1.y(2, centerY, drawable), org.telegram.ui.Cells.f1.w(2, centerX, drawable), org.telegram.ui.Cells.f1.f(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.f19045g) {
            int L = org.telegram.messenger.g0.L(9.0f) + centerX;
            int L2 = org.telegram.messenger.g0.L(9.0f) + centerY;
            int x02 = l6.x0(null, this.d, false);
            Drawable drawable2 = this.f19042c;
            Context context = this.f19040a;
            if (drawable2 == null) {
                Drawable h = jg.g.h(context, 2131232750);
                this.f19042c = h;
                this.f19043e = x02;
                h.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (x02 != this.f19043e) {
                Drawable drawable3 = this.f19042c;
                this.f19043e = x02;
                drawable3.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (this.f19044f == null) {
                this.f19044f = jg.g.h(context, 2131232749);
            }
            this.f19042c.setBounds(L - org.telegram.messenger.g0.L(9.0f), L2 - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f) + L, org.telegram.messenger.g0.L(9.0f) + L2);
            this.f19042c.draw(canvas);
            this.f19044f.setBounds(L - org.telegram.messenger.g0.L(9.0f), L2 - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f) + L, org.telegram.messenger.g0.L(9.0f) + L2);
            this.f19044f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(org.telegram.messenger.g0.L(38.0f), this.f19041b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(org.telegram.messenger.g0.L(38.0f), this.f19041b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.f19041b.getOpacity();
    }

    @Override
    public final void setAlpha(int i7) {
        this.f19041b.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f19041b.setColorFilter(colorFilter);
    }
}
