package mi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.k6;
public final class a2 extends Drawable {
    public final Context f19452a;
    public final Drawable f19453b;
    public Drawable f19454c;
    public int d;
    public int f19455e;
    public Drawable f19456f;
    public boolean f19457g;

    public a2(Context context, int i3) {
        Drawable g7 = k2.p1.g(context, i3);
        this.d = k6.f27878d6;
        this.f19457g = true;
        this.f19452a = context;
        this.f19453b = g7;
    }

    public final void a(boolean z10) {
        if (this.f19457g == z10) {
            return;
        }
        this.f19457g = z10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.f19453b;
        drawable.setBounds(org.telegram.ui.Cells.f1.C(2, centerX, drawable), org.telegram.ui.Cells.f1.B(2, centerY, drawable), org.telegram.ui.Cells.f1.z(2, centerX, drawable), org.telegram.ui.Cells.f1.i(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.f19457g) {
            int L = org.telegram.messenger.g0.L(9.0f) + centerX;
            int L2 = org.telegram.messenger.g0.L(9.0f) + centerY;
            int x02 = k6.x0(null, this.d, false);
            Drawable drawable2 = this.f19454c;
            Context context = this.f19452a;
            if (drawable2 == null) {
                Drawable g7 = k2.p1.g(context, 2131232748);
                this.f19454c = g7;
                this.f19455e = x02;
                g7.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (x02 != this.f19455e) {
                Drawable drawable3 = this.f19454c;
                this.f19455e = x02;
                drawable3.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (this.f19456f == null) {
                this.f19456f = k2.p1.g(context, 2131232747);
            }
            this.f19454c.setBounds(L - org.telegram.messenger.g0.L(9.0f), L2 - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f) + L, org.telegram.messenger.g0.L(9.0f) + L2);
            this.f19454c.draw(canvas);
            this.f19456f.setBounds(L - org.telegram.messenger.g0.L(9.0f), L2 - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f) + L, org.telegram.messenger.g0.L(9.0f) + L2);
            this.f19456f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(org.telegram.messenger.g0.L(38.0f), this.f19453b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(org.telegram.messenger.g0.L(38.0f), this.f19453b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.f19453b.getOpacity();
    }

    @Override
    public final void setAlpha(int i3) {
        this.f19453b.setAlpha(i3);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f19453b.setColorFilter(colorFilter);
    }
}
