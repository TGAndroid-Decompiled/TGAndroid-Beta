package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.b0;
public final class wh8 extends kh8 {
    public final byte r = 0;
    public final n39 s;

    public wh8(b0 b0Var, Context context) {
        super(context, null);
        this.s = b0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        wjb wjbVar;
        boolean o;
        wjb wjbVar2;
        byte b = this.r;
        n39 n39Var = this.s;
        ImageView imageView = this.c;
        switch (b) {
            case 0:
                RectF rectF = gl.P;
                rectF.set(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
                xh8 xh8Var = (xh8) ((gx0) n39Var).d;
                xh8Var.k2.d(0, 0.0f, 0, getMeasuredWidth(), -this.f.e, xh8Var.Z1);
                canvas.drawRoundRect(rectF, gl.L(8.0f), gl.L(8.0f), xh8Var.k2.f);
                super.dispatchDraw(canvas);
                return;
            default:
                float L = gl.L(10.0f);
                RectF rectF2 = gl.P;
                rectF2.set(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
                PremiumPreviewFragment premiumPreviewFragment = ((b0) n39Var).c;
                premiumPreviewFragment.T.reset();
                premiumPreviewFragment.T.postScale(1.0f, premiumPreviewFragment.O / 100.0f, 0.0f, 0.0f);
                premiumPreviewFragment.T.postTranslate(0.0f, -this.f.e);
                premiumPreviewFragment.S.setLocalMatrix(premiumPreviewFragment.T);
                canvas.drawRoundRect(rectF2, L, L, premiumPreviewFragment.U);
                wjbVar = ((d) premiumPreviewFragment).resourceProvider;
                if (wjbVar != null) {
                    wjbVar2 = ((d) premiumPreviewFragment).resourceProvider;
                    o = wjbVar2.a();
                } else {
                    o = bkb.I.o();
                }
                if (o) {
                    float L2 = gl.L(1.0f);
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

    public wh8(gx0 gx0Var, Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.s = gx0Var;
    }
}
