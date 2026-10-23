package ei;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
public final class v3 extends View implements r2 {
    public final org.telegram.ui.Components.p6 f9949a;

    public v3(Activity activity) {
        super(activity);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(true, true, true);
        this.f9949a = p6Var;
        p6Var.n(0.35f, 300L, bs.h);
        p6Var.u(-1);
        p6Var.w(AndroidUtilities.dp(14.0f));
        p6Var.s(AndroidUtilities.dp(1.4f), AndroidUtilities.dp(0.4f), 1275068416);
        p6Var.f29437b = 1;
        p6Var.setCallback(this);
        p6Var.M = AndroidUtilities.displaySize.x;
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Components.p6 p6Var = this.f9949a;
        p6Var.setBounds(0, 0, width, height);
        p6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f9949a.M = getMeasuredWidth();
    }

    @Override
    public void setInvert(float f7) {
        this.f9949a.u(i0.a.f(f7, -1, -16777216));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f9949a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
