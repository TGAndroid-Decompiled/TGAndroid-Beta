package ci;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;
public final class c4 extends View implements x2 {
    public final org.telegram.ui.Components.o6 f4427a;

    public c4(Activity activity) {
        super(activity);
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(true, true, true, false);
        this.f4427a = o6Var;
        o6Var.k(0.35f, 300L, qr.h);
        o6Var.r(-1);
        o6Var.t(AndroidUtilities.dp(14.0f));
        o6Var.p(AndroidUtilities.dp(1.4f), AndroidUtilities.dp(0.4f), 1275068416);
        o6Var.f26868b = 1;
        o6Var.setCallback(this);
        o6Var.G = AndroidUtilities.displaySize.x;
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Components.o6 o6Var = this.f4427a;
        o6Var.setBounds(0, 0, width, height);
        o6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f4427a.G = getMeasuredWidth();
    }

    @Override
    public void setInvert(float f7) {
        this.f4427a.r(i0.a.d(f7, -1, -16777216));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f4427a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
