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
    public final Context f22446a;
    public final Drawable f22447b;
    public Drawable f22448c;
    public int d;
    public int f22449e;
    public Drawable f22450f;
    public boolean f22451g;

    public x1(Context context, int i7) {
        Drawable g10 = i5.c.g(context, i7);
        this.d = n6.f29394d6;
        this.f22451g = true;
        this.f22446a = context;
        this.f22447b = g10;
    }

    public final void a(boolean z10) {
        if (this.f22451g == z10) {
            return;
        }
        this.f22451g = z10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.f22447b;
        drawable.setBounds(org.telegram.ui.Cells.c0.C(2, centerX, drawable), org.telegram.ui.Cells.c0.A(2, centerY, drawable), org.telegram.ui.Cells.c0.y(2, centerX, drawable), org.telegram.ui.Cells.c0.j(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.f22451g) {
            int L = org.telegram.messenger.g0.L(9.0f) + centerX;
            int L2 = org.telegram.messenger.g0.L(9.0f) + centerY;
            int x02 = n6.x0(null, this.d, false);
            Drawable drawable2 = this.f22448c;
            Context context = this.f22446a;
            if (drawable2 == null) {
                Drawable g10 = i5.c.g(context, 2131232752);
                this.f22448c = g10;
                this.f22449e = x02;
                g10.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (x02 != this.f22449e) {
                Drawable drawable3 = this.f22448c;
                this.f22449e = x02;
                drawable3.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (this.f22450f == null) {
                this.f22450f = i5.c.g(context, 2131232751);
            }
            this.f22448c.setBounds(L - org.telegram.messenger.g0.L(9.0f), L2 - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f) + L, org.telegram.messenger.g0.L(9.0f) + L2);
            this.f22448c.draw(canvas);
            this.f22450f.setBounds(L - org.telegram.messenger.g0.L(9.0f), L2 - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f) + L, org.telegram.messenger.g0.L(9.0f) + L2);
            this.f22450f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(org.telegram.messenger.g0.L(38.0f), this.f22447b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(org.telegram.messenger.g0.L(38.0f), this.f22447b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.f22447b.getOpacity();
    }

    @Override
    public final void setAlpha(int i7) {
        this.f22447b.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f22447b.setColorFilter(colorFilter);
    }
}
