package cg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.il0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.qv0;
import org.telegram.ui.xv0;
public final class d2 extends qv0 {
    public final int f3100r = 0;
    public final il0 f3101s;

    public d2(e2 e2Var, Context context, c6 c6Var) {
        super(context, c6Var);
        this.f3101s = e2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        c6 c6Var;
        boolean q6;
        c6 c6Var2;
        switch (this.f3100r) {
            case 0:
                RectF rectF = AndroidUtilities.rectTmp;
                ImageView imageView = this.f41786c;
                rectF.set(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
                e2 e2Var = (e2) this.f3101s;
                e2Var.f3111c.f3133l0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f41788f.f38246e, e2Var.f3111c.f3122a0);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), e2Var.f3111c.f3133l0.f3319f);
                super.dispatchDraw(canvas);
                return;
            default:
                float dp = AndroidUtilities.dp(10.0f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                ImageView imageView2 = this.f41786c;
                rectF2.set(imageView2.getLeft(), imageView2.getTop(), imageView2.getRight(), imageView2.getBottom());
                PremiumPreviewFragment premiumPreviewFragment = ((xv0) this.f3101s).f44660c;
                premiumPreviewFragment.O.reset();
                premiumPreviewFragment.O.postScale(1.0f, premiumPreviewFragment.J / 100.0f, 0.0f, 0.0f);
                premiumPreviewFragment.O.postTranslate(0.0f, -this.f41788f.f38246e);
                premiumPreviewFragment.N.setLocalMatrix(premiumPreviewFragment.O);
                canvas.drawRoundRect(rectF2, dp, dp, premiumPreviewFragment.P);
                c6Var = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).resourceProvider;
                if (c6Var != null) {
                    c6Var2 = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).resourceProvider;
                    q6 = c6Var2.a();
                } else {
                    q6 = g6.I.q();
                }
                if (q6) {
                    float dp2 = AndroidUtilities.dp(1.0f);
                    premiumPreviewFragment.M.setStrokeWidth(dp2);
                    canvas.save();
                    canvas.translate(rectF2.left, rectF2.top);
                    rectF2.offset(-rectF2.left, -rectF2.top);
                    float f9 = dp2 / 2.0f;
                    rectF2.inset(f9, f9);
                    canvas.drawRoundRect(rectF2, dp, dp, premiumPreviewFragment.M);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
        }
    }

    public d2(xv0 xv0Var, Context context) {
        super(context, null);
        this.f3101s = xv0Var;
    }
}
