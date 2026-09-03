package kh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.rr0;
public final class s2 extends Drawable {
    public final int f10921a;
    public final ShapeDrawable f10922b;
    public final Rect f10923c;

    public s2(or0 or0Var) {
        this.f10921a = 0;
        this.f10922b = j6.c0(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), 0);
        this.f10923c = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f10921a) {
            case 0:
                Rect bounds = getBounds();
                Rect rect = this.f10923c;
                rect.set(bounds);
                rect.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                ShapeDrawable shapeDrawable = this.f10922b;
                shapeDrawable.setBounds(rect);
                shapeDrawable.draw(canvas);
                return;
            default:
                Rect bounds2 = getBounds();
                Rect rect2 = this.f10923c;
                rect2.set(bounds2);
                rect2.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                ShapeDrawable shapeDrawable2 = this.f10922b;
                shapeDrawable2.setBounds(rect2);
                shapeDrawable2.draw(canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f10921a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f10921a) {
            case 0:
                this.f10922b.setAlpha(i10);
                return;
            default:
                this.f10922b.setAlpha(i10);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f10921a;
    }

    public s2(rr0 rr0Var) {
        this.f10921a = 1;
        int dp = AndroidUtilities.dp(16.0f);
        int dp2 = AndroidUtilities.dp(16.0f);
        int i10 = j6.f19881d6;
        f6 f6Var = rr0Var.f28576c;
        this.f10922b = j6.c0(dp, dp2, j6.v(j6.v0(i10, f6Var), j6.l1(0.04f, j6.v0(j6.G6, f6Var))));
        this.f10923c = new Rect();
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
