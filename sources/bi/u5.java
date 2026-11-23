package bi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.hq0;
public final class u5 extends Drawable {
    public final int f4123a;
    public final ShapeDrawable f4124b;
    public final Rect f4125c;

    public u5(fq0 fq0Var) {
        this.f4123a = 0;
        this.f4124b = org.telegram.ui.ActionBar.n6.e0(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), 0);
        this.f4125c = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f4123a) {
            case 0:
                Rect bounds = getBounds();
                Rect rect = this.f4125c;
                rect.set(bounds);
                rect.inset(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(8.0f));
                ShapeDrawable shapeDrawable = this.f4124b;
                shapeDrawable.setBounds(rect);
                shapeDrawable.draw(canvas);
                return;
            default:
                Rect bounds2 = getBounds();
                Rect rect2 = this.f4125c;
                rect2.set(bounds2);
                rect2.inset(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(8.0f));
                ShapeDrawable shapeDrawable2 = this.f4124b;
                shapeDrawable2.setBounds(rect2);
                shapeDrawable2.draw(canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f4123a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i7) {
        switch (this.f4123a) {
            case 0:
                this.f4124b.setAlpha(i7);
                return;
            default:
                this.f4124b.setAlpha(i7);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i7 = this.f4123a;
    }

    public u5(hq0 hq0Var) {
        this.f4123a = 1;
        int L = org.telegram.messenger.g0.L(16.0f);
        int L2 = org.telegram.messenger.g0.L(16.0f);
        int i7 = org.telegram.ui.ActionBar.n6.f29451d6;
        org.telegram.ui.ActionBar.i6 i6Var = hq0Var.f35790c;
        this.f4124b = org.telegram.ui.ActionBar.n6.e0(L, L2, org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.w0(i7, i6Var), org.telegram.ui.ActionBar.n6.r1(0.04f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, i6Var))));
        this.f4125c = new Rect();
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
