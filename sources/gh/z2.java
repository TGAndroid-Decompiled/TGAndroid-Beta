package gh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.Components.zq0;

public final class z2 extends Drawable {

    public final int f7697a;

    public final ShapeDrawable f7698b;

    public final Rect f7699c;

    public z2(wq0 wq0Var) {
        this.f7697a = 0;
        this.f7698b = org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), 0);
        this.f7699c = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f7697a) {
            case 0:
                Rect bounds = getBounds();
                Rect rect = this.f7699c;
                rect.set(bounds);
                rect.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                ShapeDrawable shapeDrawable = this.f7698b;
                shapeDrawable.setBounds(rect);
                shapeDrawable.draw(canvas);
                break;
            default:
                Rect bounds2 = getBounds();
                Rect rect2 = this.f7699c;
                rect2.set(bounds2);
                rect2.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                ShapeDrawable shapeDrawable2 = this.f7698b;
                shapeDrawable2.setBounds(rect2);
                shapeDrawable2.draw(canvas);
                break;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f7697a) {
        }
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f7697a) {
            case 0:
                this.f7698b.setAlpha(i10);
                break;
            default:
                this.f7698b.setAlpha(i10);
                break;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f7697a;
    }

    public z2(zq0 zq0Var) {
        this.f7697a = 1;
        int iDp = AndroidUtilities.dp(16.0f);
        int iDp2 = AndroidUtilities.dp(16.0f);
        int i10 = org.telegram.ui.ActionBar.g6.f23053d6;
        org.telegram.ui.ActionBar.c6 c6Var = zq0Var.f35325c;
        this.f7698b = org.telegram.ui.ActionBar.g6.c0(iDp, iDp2, org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), org.telegram.ui.ActionBar.g6.l1(0.04f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var))));
        this.f7699c = new Rect();
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
