package fg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.bw0;
import org.telegram.ui.jw0;
public final class b2 extends bw0 {
    public final int f6255r = 0;
    public final sl0 f6256s;

    public b2(c2 c2Var, Context context, g6 g6Var) {
        super(context, g6Var);
        this.f6256s = c2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        g6 g6Var;
        boolean q10;
        g6 g6Var2;
        switch (this.f6255r) {
            case 0:
                RectF rectF = AndroidUtilities.rectTmp;
                ImageView imageView = this.f35606c;
                rectF.set(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
                c2 c2Var = (c2) this.f6256s;
                c2Var.f6261c.m0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f35608f.f41059e, c2Var.f6261c.f6275b0);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), c2Var.f6261c.m0.f6490f);
                super.dispatchDraw(canvas);
                return;
            default:
                float dp = AndroidUtilities.dp(10.0f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                ImageView imageView2 = this.f35606c;
                rectF2.set(imageView2.getLeft(), imageView2.getTop(), imageView2.getRight(), imageView2.getBottom());
                PremiumPreviewFragment premiumPreviewFragment = ((jw0) this.f6256s).f38234c;
                premiumPreviewFragment.P.reset();
                premiumPreviewFragment.P.postScale(1.0f, premiumPreviewFragment.K / 100.0f, 0.0f, 0.0f);
                premiumPreviewFragment.P.postTranslate(0.0f, -this.f35608f.f41059e);
                premiumPreviewFragment.O.setLocalMatrix(premiumPreviewFragment.P);
                canvas.drawRoundRect(rectF2, dp, dp, premiumPreviewFragment.Q);
                g6Var = ((org.telegram.ui.ActionBar.p2) premiumPreviewFragment).resourceProvider;
                if (g6Var != null) {
                    g6Var2 = ((org.telegram.ui.ActionBar.p2) premiumPreviewFragment).resourceProvider;
                    q10 = g6Var2.a();
                } else {
                    q10 = k6.I.q();
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

    public b2(jw0 jw0Var, Context context) {
        super(context, null);
        this.f6256s = jw0Var;
    }
}
