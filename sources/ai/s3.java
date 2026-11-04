package ai;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.xp0;
public final class s3 extends Drawable {
    public final int f968a;
    public final ShapeDrawable f969b;
    public final Rect f970c;

    public s3(vp0 vp0Var) {
        this.f968a = 0;
        this.f969b = org.telegram.ui.ActionBar.k6.e0(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), 0);
        this.f970c = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f968a) {
            case 0:
                Rect bounds = getBounds();
                Rect rect = this.f970c;
                rect.set(bounds);
                rect.inset(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(8.0f));
                ShapeDrawable shapeDrawable = this.f969b;
                shapeDrawable.setBounds(rect);
                shapeDrawable.draw(canvas);
                return;
            default:
                Rect bounds2 = getBounds();
                Rect rect2 = this.f970c;
                rect2.set(bounds2);
                rect2.inset(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(8.0f));
                ShapeDrawable shapeDrawable2 = this.f969b;
                shapeDrawable2.setBounds(rect2);
                shapeDrawable2.draw(canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f968a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i3) {
        switch (this.f968a) {
            case 0:
                this.f969b.setAlpha(i3);
                return;
            default:
                this.f969b.setAlpha(i3);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i3 = this.f968a;
    }

    public s3(xp0 xp0Var) {
        this.f968a = 1;
        int L = org.telegram.messenger.g0.L(16.0f);
        int L2 = org.telegram.messenger.g0.L(16.0f);
        int i3 = org.telegram.ui.ActionBar.k6.f27878d6;
        org.telegram.ui.ActionBar.e6 e6Var = xp0Var.f40451c;
        this.f969b = org.telegram.ui.ActionBar.k6.e0(L, L2, org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(i3, e6Var), org.telegram.ui.ActionBar.k6.r1(0.04f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, e6Var))));
        this.f970c = new Rect();
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
