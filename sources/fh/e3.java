package fh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.yq0;
public final class e3 extends Drawable {
    public final int f6425a;
    public final ShapeDrawable f6426b;
    public final Rect f6427c;

    public e3(vq0 vq0Var) {
        this.f6425a = 0;
        this.f6426b = org.telegram.ui.ActionBar.f6.c0(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), 0);
        this.f6427c = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f6425a) {
            case 0:
                Rect bounds = getBounds();
                Rect rect = this.f6427c;
                rect.set(bounds);
                rect.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                ShapeDrawable shapeDrawable = this.f6426b;
                shapeDrawable.setBounds(rect);
                shapeDrawable.draw(canvas);
                return;
            default:
                Rect bounds2 = getBounds();
                Rect rect2 = this.f6427c;
                rect2.set(bounds2);
                rect2.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                ShapeDrawable shapeDrawable2 = this.f6426b;
                shapeDrawable2.setBounds(rect2);
                shapeDrawable2.draw(canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f6425a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i9) {
        switch (this.f6425a) {
            case 0:
                this.f6426b.setAlpha(i9);
                return;
            default:
                this.f6426b.setAlpha(i9);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i9 = this.f6425a;
    }

    public e3(yq0 yq0Var) {
        this.f6425a = 1;
        int dp = AndroidUtilities.dp(16.0f);
        int dp2 = AndroidUtilities.dp(16.0f);
        int i9 = org.telegram.ui.ActionBar.f6.f23001d6;
        org.telegram.ui.ActionBar.b6 b6Var = yq0Var.f35053c;
        this.f6426b = org.telegram.ui.ActionBar.f6.c0(dp, dp2, org.telegram.ui.ActionBar.f6.v(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), org.telegram.ui.ActionBar.f6.l1(0.04f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var))));
        this.f6427c = new Rect();
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
