package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.b0;
public final class xj8 extends lj8 {
    public final byte r = 0;
    public final q59 s;

    public xj8(b0 b0Var, Context context) {
        super(context, null);
        this.s = b0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ylb ylbVar;
        boolean o;
        ylb ylbVar2;
        byte b = this.r;
        q59 q59Var = this.s;
        ImageView imageView = this.c;
        switch (b) {
            case 0:
                RectF rectF = gm.P;
                rectF.set(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
                yj8 yj8Var = (yj8) ((ny0) q59Var).d;
                yj8Var.k2.d(0, 0.0f, 0, getMeasuredWidth(), -this.f.e, yj8Var.Z1);
                canvas.drawRoundRect(rectF, gm.L(8.0f), gm.L(8.0f), yj8Var.k2.f);
                super.dispatchDraw(canvas);
                return;
            default:
                float L = gm.L(10.0f);
                RectF rectF2 = gm.P;
                rectF2.set(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
                PremiumPreviewFragment premiumPreviewFragment = ((b0) q59Var).c;
                premiumPreviewFragment.T.reset();
                premiumPreviewFragment.T.postScale(1.0f, premiumPreviewFragment.O / 100.0f, 0.0f, 0.0f);
                premiumPreviewFragment.T.postTranslate(0.0f, -this.f.e);
                premiumPreviewFragment.S.setLocalMatrix(premiumPreviewFragment.T);
                canvas.drawRoundRect(rectF2, L, L, premiumPreviewFragment.U);
                ylbVar = ((d) premiumPreviewFragment).resourceProvider;
                if (ylbVar != null) {
                    ylbVar2 = ((d) premiumPreviewFragment).resourceProvider;
                    o = ylbVar2.a();
                } else {
                    o = cmb.I.o();
                }
                if (o) {
                    float L2 = gm.L(1.0f);
                    premiumPreviewFragment.R.setStrokeWidth(L2);
                    canvas.save();
                    canvas.translate(rectF2.left, rectF2.top);
                    rectF2.offset(-rectF2.left, -rectF2.top);
                    float f = L2 / 2.0f;
                    rectF2.inset(f, f);
                    canvas.drawRoundRect(rectF2, L, L, premiumPreviewFragment.R);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
        }
    }

    public xj8(ny0 ny0Var, Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.s = ny0Var;
    }
}
