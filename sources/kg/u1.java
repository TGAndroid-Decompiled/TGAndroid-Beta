package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.st0;
import org.telegram.ui.yt0;
public final class u1 extends st0 {
    public final int f11277r = 0;
    public final sk0 f11278s;

    public u1(f fVar, Context context, p6 p6Var) {
        super(context, p6Var);
        this.f11278s = fVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        p6 p6Var;
        boolean q6;
        p6 p6Var2;
        switch (this.f11277r) {
            case 0:
                RectF rectF = org.telegram.messenger.i0.P;
                ImageView imageView = this.f41646c;
                rectF.set(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
                f fVar = (f) this.f11278s;
                ((v1) fVar.d).f11299h2.d(0, 0.0f, 0, getMeasuredWidth(), -this.f41647f.e, ((v1) fVar.d).W1);
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), ((v1) fVar.d).f11299h2.f11142f);
                super.dispatchDraw(canvas);
                return;
            default:
                float L = org.telegram.messenger.i0.L(10.0f);
                RectF rectF2 = org.telegram.messenger.i0.P;
                ImageView imageView2 = this.f41646c;
                rectF2.set(imageView2.getLeft(), imageView2.getTop(), imageView2.getRight(), imageView2.getBottom());
                PremiumPreviewFragment premiumPreviewFragment = ((yt0) this.f11278s).f43891c;
                premiumPreviewFragment.S.reset();
                premiumPreviewFragment.S.postScale(1.0f, premiumPreviewFragment.N / 100.0f, 0.0f, 0.0f);
                premiumPreviewFragment.S.postTranslate(0.0f, -this.f41647f.e);
                premiumPreviewFragment.R.setLocalMatrix(premiumPreviewFragment.S);
                canvas.drawRoundRect(rectF2, L, L, premiumPreviewFragment.T);
                p6Var = ((org.telegram.ui.ActionBar.k2) premiumPreviewFragment).resourceProvider;
                if (p6Var != null) {
                    p6Var2 = ((org.telegram.ui.ActionBar.k2) premiumPreviewFragment).resourceProvider;
                    q6 = p6Var2.a();
                } else {
                    q6 = t6.I.q();
                }
                if (q6) {
                    float L2 = org.telegram.messenger.i0.L(1.0f);
                    premiumPreviewFragment.Q.setStrokeWidth(L2);
                    canvas.save();
                    canvas.translate(rectF2.left, rectF2.top);
                    rectF2.offset(-rectF2.left, -rectF2.top);
                    float f7 = L2 / 2.0f;
                    rectF2.inset(f7, f7);
                    canvas.drawRoundRect(rectF2, L, L, premiumPreviewFragment.Q);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
        }
    }

    public u1(yt0 yt0Var, Context context) {
        super(context, null);
        this.f11278s = yt0Var;
    }
}
