package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.m6;
public final class y1 extends Drawable {
    public final Context f22522a;
    public final Drawable f22523b;
    public Drawable f22524c;
    public int d;
    public int f22525e;
    public Drawable f22526f;
    public boolean f22527g;

    public y1(Context context, int i7) {
        Drawable g10 = i5.c.g(context, i7);
        this.d = m6.f29347d6;
        this.f22527g = true;
        this.f22522a = context;
        this.f22523b = g10;
    }

    public final void a(boolean z10) {
        if (this.f22527g == z10) {
            return;
        }
        this.f22527g = z10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.f22523b;
        drawable.setBounds(org.telegram.ui.Cells.c0.C(2, centerX, drawable), org.telegram.ui.Cells.c0.A(2, centerY, drawable), org.telegram.ui.Cells.c0.y(2, centerX, drawable), org.telegram.ui.Cells.c0.j(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.f22527g) {
            int L = org.telegram.messenger.g0.L(9.0f) + centerX;
            int L2 = org.telegram.messenger.g0.L(9.0f) + centerY;
            int x02 = m6.x0(null, this.d, false);
            Drawable drawable2 = this.f22524c;
            Context context = this.f22522a;
            if (drawable2 == null) {
                Drawable g10 = i5.c.g(context, 2131232752);
                this.f22524c = g10;
                this.f22525e = x02;
                g10.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (x02 != this.f22525e) {
                Drawable drawable3 = this.f22524c;
                this.f22525e = x02;
                drawable3.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (this.f22526f == null) {
                this.f22526f = i5.c.g(context, 2131232751);
            }
            this.f22524c.setBounds(L - org.telegram.messenger.g0.L(9.0f), L2 - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f) + L, org.telegram.messenger.g0.L(9.0f) + L2);
            this.f22524c.draw(canvas);
            this.f22526f.setBounds(L - org.telegram.messenger.g0.L(9.0f), L2 - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f) + L, org.telegram.messenger.g0.L(9.0f) + L2);
            this.f22526f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(org.telegram.messenger.g0.L(38.0f), this.f22523b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(org.telegram.messenger.g0.L(38.0f), this.f22523b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.f22523b.getOpacity();
    }

    @Override
    public final void setAlpha(int i7) {
        this.f22523b.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f22523b.setColorFilter(colorFilter);
    }
}
