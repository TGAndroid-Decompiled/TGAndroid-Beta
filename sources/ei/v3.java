package ei;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.zr;
public final class v3 extends View implements r2 {
    public final org.telegram.ui.Components.n6 f9949a;

    public v3(Activity activity) {
        super(activity);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(true, true, true);
        this.f9949a = n6Var;
        n6Var.n(0.35f, 300L, zr.h);
        n6Var.u(-1);
        n6Var.w(AndroidUtilities.dp(14.0f));
        n6Var.s(AndroidUtilities.dp(1.4f), AndroidUtilities.dp(0.4f), 1275068416);
        n6Var.f28797b = 1;
        n6Var.setCallback(this);
        n6Var.M = AndroidUtilities.displaySize.x;
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Components.n6 n6Var = this.f9949a;
        n6Var.setBounds(0, 0, width, height);
        n6Var.draw(canvas);
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
