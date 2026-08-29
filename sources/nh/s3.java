package nh;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;
public final class s3 extends View implements o2 {
    public final org.telegram.ui.Components.n6 f18545a;

    public s3(Activity activity) {
        super(activity);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(true, true, true, false);
        this.f18545a = n6Var;
        n6Var.k(0.35f, 300L, jr.h);
        n6Var.r(-1);
        n6Var.t(AndroidUtilities.dp(14.0f));
        n6Var.p(AndroidUtilities.dp(1.4f), AndroidUtilities.dp(0.4f), 1275068416);
        n6Var.f30862b = 1;
        n6Var.setCallback(this);
        n6Var.G = AndroidUtilities.displaySize.x;
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Components.n6 n6Var = this.f18545a;
        n6Var.setBounds(0, 0, width, height);
        n6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f18545a.G = getMeasuredWidth();
    }

    @Override
    public void setInvert(float f9) {
        this.f18545a.r(i0.a.d(f9, -1, -16777216));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f18545a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
