package lh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.pr0;
import org.telegram.ui.Components.sr0;
public final class s2 extends Drawable {
    public final int f12959a;
    public final ShapeDrawable f12960b;
    public final Rect f12961c;

    public s2(pr0 pr0Var) {
        this.f12959a = 0;
        this.f12960b = k6.c0(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), 0);
        this.f12961c = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f12959a) {
            case 0:
                Rect bounds = getBounds();
                Rect rect = this.f12961c;
                rect.set(bounds);
                rect.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                ShapeDrawable shapeDrawable = this.f12960b;
                shapeDrawable.setBounds(rect);
                shapeDrawable.draw(canvas);
                return;
            default:
                Rect bounds2 = getBounds();
                Rect rect2 = this.f12961c;
                rect2.set(bounds2);
                rect2.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                ShapeDrawable shapeDrawable2 = this.f12960b;
                shapeDrawable2.setBounds(rect2);
                shapeDrawable2.draw(canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f12959a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f12959a) {
            case 0:
                this.f12960b.setAlpha(i10);
                return;
            default:
                this.f12960b.setAlpha(i10);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f12959a;
    }

    public s2(sr0 sr0Var) {
        this.f12959a = 1;
        int dp = AndroidUtilities.dp(16.0f);
        int dp2 = AndroidUtilities.dp(16.0f);
        int i10 = k6.f21659d6;
        g6 g6Var = sr0Var.f31162c;
        this.f12960b = k6.c0(dp, dp2, k6.v(k6.v0(i10, g6Var), k6.l1(0.04f, k6.v0(k6.G6, g6Var))));
        this.f12961c = new Rect();
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
