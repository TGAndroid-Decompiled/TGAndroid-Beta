package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.gw0;
import org.telegram.ui.ow0;
public final class c2 extends gw0 {
    public final int f5226r = 0;
    public final ql0 f5227s;

    public c2(d2 d2Var, Context context, f6 f6Var) {
        super(context, f6Var);
        this.f5227s = d2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        f6 f6Var;
        boolean q10;
        f6 f6Var2;
        switch (this.f5226r) {
            case 0:
                RectF rectF = AndroidUtilities.rectTmp;
                ImageView imageView = this.f34522c;
                rectF.set(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
                d2 d2Var = (d2) this.f5227s;
                d2Var.f5237c.m0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f34523f.e, d2Var.f5237c.f5248b0);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), d2Var.f5237c.m0.f5446f);
                super.dispatchDraw(canvas);
                return;
            default:
                float dp = AndroidUtilities.dp(10.0f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                ImageView imageView2 = this.f34522c;
                rectF2.set(imageView2.getLeft(), imageView2.getTop(), imageView2.getRight(), imageView2.getBottom());
                PremiumPreviewFragment premiumPreviewFragment = ((ow0) this.f5227s).f36894c;
                premiumPreviewFragment.P.reset();
                premiumPreviewFragment.P.postScale(1.0f, premiumPreviewFragment.K / 100.0f, 0.0f, 0.0f);
                premiumPreviewFragment.P.postTranslate(0.0f, -this.f34523f.e);
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

    public c2(ow0 ow0Var, Context context) {
        super(context, null);
        this.f5227s = ow0Var;
    }
}
