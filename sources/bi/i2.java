package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class i2 extends Drawable {
    public final Context f3069a;
    public final Drawable f3070b;
    public Drawable f3071c;
    public int d;
    public int e;
    public Drawable f3072f;
    public boolean f3073g;

    public i2(Context context, int i10) {
        Drawable f7 = i0.a.f(context, i10);
        this.d = org.telegram.ui.ActionBar.t6.f20930d6;
        this.f3073g = true;
        this.f3069a = context;
        this.f3070b = f7;
    }

    public final void a(boolean z10) {
        if (this.f3073g == z10) {
            return;
        }
        this.f3073g = z10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.f3070b;
        drawable.setBounds(org.telegram.ui.Cells.f1.z(2, centerX, drawable), org.telegram.ui.Cells.f1.y(2, centerY, drawable), org.telegram.ui.Cells.f1.w(2, centerX, drawable), org.telegram.ui.Cells.f1.f(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.f3073g) {
            int L = org.telegram.messenger.i0.L(9.0f) + centerX;
            int L2 = org.telegram.messenger.i0.L(9.0f) + centerY;
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, this.d, false);
            Drawable drawable2 = this.f3071c;
            Context context = this.f3069a;
            if (drawable2 == null) {
                Drawable f7 = i0.a.f(context, 2131232747);
                this.f3071c = f7;
                this.e = x02;
                f7.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (x02 != this.e) {
                Drawable drawable3 = this.f3071c;
                this.e = x02;
                drawable3.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (this.f3072f == null) {
                this.f3072f = i0.a.f(context, 2131232746);
            }
            this.f3071c.setBounds(L - org.telegram.messenger.i0.L(9.0f), L2 - org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(9.0f) + L, org.telegram.messenger.i0.L(9.0f) + L2);
            this.f3071c.draw(canvas);
            this.f3072f.setBounds(L - org.telegram.messenger.i0.L(9.0f), L2 - org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(9.0f) + L, org.telegram.messenger.i0.L(9.0f) + L2);
            this.f3072f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(org.telegram.messenger.i0.L(38.0f), this.f3070b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(org.telegram.messenger.i0.L(38.0f), this.f3070b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.f3070b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f3070b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f3070b.setColorFilter(colorFilter);
    }
}
