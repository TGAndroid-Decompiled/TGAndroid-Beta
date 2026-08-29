package ih;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.jr0;
public final class t2 extends Drawable {
    public final int f9399a;
    public final ShapeDrawable f9400b;
    public final Rect f9401c;

    public t2(gr0 gr0Var) {
        this.f9399a = 0;
        this.f9400b = g6.c0(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), 0);
        this.f9401c = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f9399a) {
            case 0:
                Rect bounds = getBounds();
                Rect rect = this.f9401c;
                rect.set(bounds);
                rect.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                ShapeDrawable shapeDrawable = this.f9400b;
                shapeDrawable.setBounds(rect);
                shapeDrawable.draw(canvas);
                return;
            default:
                Rect bounds2 = getBounds();
                Rect rect2 = this.f9401c;
                rect2.set(bounds2);
                rect2.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                ShapeDrawable shapeDrawable2 = this.f9400b;
                shapeDrawable2.setBounds(rect2);
                shapeDrawable2.draw(canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f9399a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f9399a) {
            case 0:
                this.f9400b.setAlpha(i10);
                return;
            default:
                this.f9400b.setAlpha(i10);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f9399a;
    }

    public t2(jr0 jr0Var) {
        this.f9399a = 1;
        int dp = AndroidUtilities.dp(16.0f);
        int dp2 = AndroidUtilities.dp(16.0f);
        int i10 = g6.f23062d6;
        org.telegram.ui.ActionBar.c6 c6Var = jr0Var.f29812c;
        this.f9400b = g6.c0(dp, dp2, g6.v(g6.v0(i10, c6Var), g6.l1(0.04f, g6.v0(g6.G6, c6Var))));
        this.f9401c = new Rect();
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
