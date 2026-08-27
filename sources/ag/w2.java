package ag;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.rv0;
import org.telegram.ui.yv0;

public final class w2 extends rv0 {

    public final int f690r = 0;

    public final yk0 f691s;

    public w2(x2 x2Var, Context context, c6 c6Var) {
        super(context, c6Var);
        this.f691s = x2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f690r) {
            case 0:
                RectF rectF = AndroidUtilities.rectTmp;
                ImageView imageView = this.f42348c;
                rectF.set(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
                x2 x2Var = (x2) this.f691s;
                x2Var.f700c.f719l0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f42350f.f38489e, x2Var.f700c.f708a0);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), x2Var.f700c.f719l0.f458f);
                super.dispatchDraw(canvas);
                break;
            default:
                float fDp = AndroidUtilities.dp(10.0f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                ImageView imageView2 = this.f42348c;
                rectF2.set(imageView2.getLeft(), imageView2.getTop(), imageView2.getRight(), imageView2.getBottom());
                PremiumPreviewFragment premiumPreviewFragment = ((yv0) this.f691s).f44953c;
                premiumPreviewFragment.O.reset();
                premiumPreviewFragment.O.postScale(1.0f, premiumPreviewFragment.J / 100.0f, 0.0f, 0.0f);
                premiumPreviewFragment.O.postTranslate(0.0f, -this.f42350f.f38489e);
                premiumPreviewFragment.N.setLocalMatrix(premiumPreviewFragment.O);
                canvas.drawRoundRect(rectF2, fDp, fDp, premiumPreviewFragment.P);
                if (((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).resourceProvider != null ? ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).resourceProvider.a() : g6.I.q()) {
                    float fDp2 = AndroidUtilities.dp(1.0f);
                    premiumPreviewFragment.M.setStrokeWidth(fDp2);
                    canvas.save();
                    canvas.translate(rectF2.left, rectF2.top);
                    rectF2.offset(-rectF2.left, -rectF2.top);
                    float f10 = fDp2 / 2.0f;
                    rectF2.inset(f10, f10);
                    canvas.drawRoundRect(rectF2, fDp, fDp, premiumPreviewFragment.M);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                break;
        }
    }

    public w2(yv0 yv0Var, Context context) {
        super(context, null);
        this.f691s = yv0Var;
    }
}
