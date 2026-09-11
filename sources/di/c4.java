package di;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
public final class c4 extends View implements x2 {
    public final org.telegram.ui.Components.p6 f6986a;

    public c4(Activity activity) {
        super(activity);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(true, true, true, false);
        this.f6986a = p6Var;
        p6Var.k(0.35f, 300L, pr.h);
        p6Var.r(-1);
        p6Var.t(AndroidUtilities.dp(14.0f));
        p6Var.p(AndroidUtilities.dp(1.4f), AndroidUtilities.dp(0.4f), 1275068416);
        p6Var.f29285b = 1;
        p6Var.setCallback(this);
        p6Var.G = AndroidUtilities.displaySize.x;
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Components.p6 p6Var = this.f6986a;
        p6Var.setBounds(0, 0, width, height);
        p6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f6986a.G = getMeasuredWidth();
    }

    @Override
    public void setInvert(float f7) {
        this.f6986a.r(i0.a.d(f7, -1, -16777216));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f6986a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
