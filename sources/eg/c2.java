package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.hw0;
import org.telegram.ui.zv0;
public final class c2 extends zv0 {
    public final int f5237r = 0;
    public final rl0 f5238s;

    public c2(d2 d2Var, Context context, f6 f6Var) {
        super(context, f6Var);
        this.f5238s = d2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        f6 f6Var;
        boolean q10;
        f6 f6Var2;
        switch (this.f5237r) {
            case 0:
                RectF rectF = AndroidUtilities.rectTmp;
                ImageView imageView = this.f40869c;
                rectF.set(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
                d2 d2Var = (d2) this.f5238s;
                d2Var.f5248c.m0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f40870f.e, d2Var.f5248c.f5259b0);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), d2Var.f5248c.m0.f5457f);
                super.dispatchDraw(canvas);
                return;
            default:
                float dp = AndroidUtilities.dp(10.0f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                ImageView imageView2 = this.f40869c;
                rectF2.set(imageView2.getLeft(), imageView2.getTop(), imageView2.getRight(), imageView2.getBottom());
                PremiumPreviewFragment premiumPreviewFragment = ((hw0) this.f5238s).f34962c;
                premiumPreviewFragment.P.reset();
                premiumPreviewFragment.P.postScale(1.0f, premiumPreviewFragment.K / 100.0f, 0.0f, 0.0f);
                premiumPreviewFragment.P.postTranslate(0.0f, -this.f40870f.e);
                premiumPreviewFragment.O.setLocalMatrix(premiumPreviewFragment.P);
                canvas.drawRoundRect(rectF2, dp, dp, premiumPreviewFragment.Q);
                f6Var = ((org.telegram.ui.ActionBar.p2) premiumPreviewFragment).resourceProvider;
                if (f6Var != null) {
                    f6Var2 = ((org.telegram.ui.ActionBar.p2) premiumPreviewFragment).resourceProvider;
                    q10 = f6Var2.a();
                } else {
                    q10 = j6.I.q();
                }
                if (q10) {
                    float dp2 = AndroidUtilities.dp(1.0f);
                    premiumPreviewFragment.N.setStrokeWidth(dp2);
                    canvas.save();
                    canvas.translate(rectF2.left, rectF2.top);
                    rectF2.offset(-rectF2.left, -rectF2.top);
                    float f10 = dp2 / 2.0f;
                    rectF2.inset(f10, f10);
                    canvas.drawRoundRect(rectF2, dp, dp, premiumPreviewFragment.N);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
        }
    }

    public c2(hw0 hw0Var, Context context) {
        super(context, null);
        this.f5238s = hw0Var;
    }
}
