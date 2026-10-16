package di;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.es;
public final class a4 extends View implements v2 {
    public final org.telegram.ui.Components.r6 f6593a;

    public a4(Activity activity) {
        super(activity);
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(true, true, true);
        this.f6593a = r6Var;
        r6Var.n(0.35f, 300L, es.h);
        r6Var.u(-1);
        r6Var.w(AndroidUtilities.dp(14.0f));
        r6Var.s(AndroidUtilities.dp(1.4f), AndroidUtilities.dp(0.4f), 1275068416);
        r6Var.f28435b = 1;
        r6Var.setCallback(this);
        r6Var.M = AndroidUtilities.displaySize.x;
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Components.r6 r6Var = this.f6593a;
        r6Var.setBounds(0, 0, width, height);
        r6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f6593a.M = getMeasuredWidth();
    }

    @Override
    public void setInvert(float f7) {
        this.f6593a.u(i0.a.d(f7, -1, -16777216));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f6593a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
