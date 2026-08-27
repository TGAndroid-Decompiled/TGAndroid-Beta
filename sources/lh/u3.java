package lh;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;

public final class u3 extends View implements q2 {

    public final org.telegram.ui.Components.i6 f16902a;

    public u3(Activity activity) {
        super(activity);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(true, true, true, false);
        this.f16902a = i6Var;
        i6Var.k(0.35f, 300L, er.h);
        i6Var.r(-1);
        i6Var.t(AndroidUtilities.dp(14.0f));
        i6Var.p(AndroidUtilities.dp(1.4f), AndroidUtilities.dp(0.4f), 1275068416);
        i6Var.f29239b = 1;
        i6Var.setCallback(this);
        i6Var.G = AndroidUtilities.displaySize.x;
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Components.i6 i6Var = this.f16902a;
        i6Var.setBounds(0, 0, width, height);
        i6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f16902a.G = getMeasuredWidth();
    }

    @Override
    public void setInvert(float f10) {
        this.f16902a.r(i0.b.d(f10, -1, -16777216));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f16902a || super.verifyDrawable(drawable);
    }
}
