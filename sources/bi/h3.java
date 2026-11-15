package bi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.Components.yp0;
public final class h3 extends Drawable {
    public final int f3565a;
    public final ShapeDrawable f3566b;
    public final Rect f3567c;

    public h3(wp0 wp0Var) {
        this.f3565a = 0;
        this.f3566b = org.telegram.ui.ActionBar.j6.e0(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), 0);
        this.f3567c = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f3565a) {
            case 0:
                Rect bounds = getBounds();
                Rect rect = this.f3567c;
                rect.set(bounds);
                rect.inset(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(8.0f));
                ShapeDrawable shapeDrawable = this.f3566b;
                shapeDrawable.setBounds(rect);
                shapeDrawable.draw(canvas);
                return;
            default:
                Rect bounds2 = getBounds();
                Rect rect2 = this.f3567c;
                rect2.set(bounds2);
                rect2.inset(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(8.0f));
                ShapeDrawable shapeDrawable2 = this.f3566b;
                shapeDrawable2.setBounds(rect2);
                shapeDrawable2.draw(canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f3565a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i7) {
        switch (this.f3565a) {
            case 0:
                this.f3566b.setAlpha(i7);
                return;
            default:
                this.f3566b.setAlpha(i7);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i7 = this.f3565a;
    }

    public h3(yp0 yp0Var) {
        this.f3565a = 1;
        int L = org.telegram.messenger.g0.L(16.0f);
        int L2 = org.telegram.messenger.g0.L(16.0f);
        int i7 = org.telegram.ui.ActionBar.j6.f28849d6;
        org.telegram.ui.ActionBar.e6 e6Var = yp0Var.f42059c;
        this.f3566b = org.telegram.ui.ActionBar.j6.e0(L, L2, org.telegram.ui.ActionBar.j6.w(org.telegram.ui.ActionBar.j6.w0(i7, e6Var), org.telegram.ui.ActionBar.j6.r1(0.04f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, e6Var))));
        this.f3567c = new Rect();
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
