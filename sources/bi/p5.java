package bi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.gq0;
public final class p5 extends Drawable {
    public final int f3973a;
    public final ShapeDrawable f3974b;
    public final Rect f3975c;

    public p5(eq0 eq0Var) {
        this.f3973a = 0;
        this.f3974b = org.telegram.ui.ActionBar.n6.e0(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), 0);
        this.f3975c = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f3973a) {
            case 0:
                Rect bounds = getBounds();
                Rect rect = this.f3975c;
                rect.set(bounds);
                rect.inset(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(8.0f));
                ShapeDrawable shapeDrawable = this.f3974b;
                shapeDrawable.setBounds(rect);
                shapeDrawable.draw(canvas);
                return;
            default:
                Rect bounds2 = getBounds();
                Rect rect2 = this.f3975c;
                rect2.set(bounds2);
                rect2.inset(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(8.0f));
                ShapeDrawable shapeDrawable2 = this.f3974b;
                shapeDrawable2.setBounds(rect2);
                shapeDrawable2.draw(canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f3973a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i7) {
        switch (this.f3973a) {
            case 0:
                this.f3974b.setAlpha(i7);
                return;
            default:
                this.f3974b.setAlpha(i7);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i7 = this.f3973a;
    }

    public p5(gq0 gq0Var) {
        this.f3973a = 1;
        int L = org.telegram.messenger.g0.L(16.0f);
        int L2 = org.telegram.messenger.g0.L(16.0f);
        int i7 = org.telegram.ui.ActionBar.n6.f29396d6;
        org.telegram.ui.ActionBar.i6 i6Var = gq0Var.f35551c;
        this.f3974b = org.telegram.ui.ActionBar.n6.e0(L, L2, org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.w0(i7, i6Var), org.telegram.ui.ActionBar.n6.r1(0.04f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, i6Var))));
        this.f3975c = new Rect();
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
