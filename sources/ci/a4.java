package ci;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hs;
public final class a4 extends View implements v2 {
    public final org.telegram.ui.Components.q6 f4719a;

    public a4(Activity activity) {
        super(activity);
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(true, true, true);
        this.f4719a = q6Var;
        q6Var.n(0.35f, 300L, hs.h);
        q6Var.u(-1);
        q6Var.w(AndroidUtilities.dp(14.0f));
        q6Var.s(AndroidUtilities.dp(1.4f), AndroidUtilities.dp(0.4f), 1275068416);
        q6Var.f30065b = 1;
        q6Var.setCallback(this);
        q6Var.M = AndroidUtilities.displaySize.x;
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Components.q6 q6Var = this.f4719a;
        q6Var.setBounds(0, 0, width, height);
        q6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f4719a.M = getMeasuredWidth();
    }

    @Override
    public void setInvert(float f7) {
        this.f4719a.u(i0.a.d(f7, -1, -16777216));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f4719a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
