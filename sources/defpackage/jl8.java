package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.b0;
public final class jl8 extends yk8 {
    public final byte r = 1;
    public final c79 s;

    public jl8(b0 b0Var, Context context) {
        super(context, null);
        this.s = b0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        vnb vnbVar;
        boolean o;
        vnb vnbVar2;
        byte b = this.r;
        c79 c79Var = this.s;
        ImageView imageView = this.c;
        switch (b) {
            case 0:
                RectF rectF = hl.P;
                rectF.set(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
                kl8 kl8Var = (kl8) ((ox0) c79Var).d;
                kl8Var.k2.d(0, 0.0f, 0, getMeasuredWidth(), -this.f.e, kl8Var.Z1);
                canvas.drawRoundRect(rectF, hl.L(8.0f), hl.L(8.0f), kl8Var.k2.f);
                super.dispatchDraw(canvas);
                return;
            default:
                float L = hl.L(10.0f);
                RectF rectF2 = hl.P;
                rectF2.set(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
                PremiumPreviewFragment premiumPreviewFragment = ((b0) c79Var).c;
                premiumPreviewFragment.T.reset();
                premiumPreviewFragment.T.postScale(1.0f, premiumPreviewFragment.O / 100.0f, 0.0f, 0.0f);
                premiumPreviewFragment.T.postTranslate(0.0f, -this.f.e);
                premiumPreviewFragment.S.setLocalMatrix(premiumPreviewFragment.T);
                canvas.drawRoundRect(rectF2, L, L, premiumPreviewFragment.U);
                vnbVar = ((e) premiumPreviewFragment).resourceProvider;
                if (vnbVar != null) {
                    vnbVar2 = ((e) premiumPreviewFragment).resourceProvider;
                    o = vnbVar2.a();
                } else {
                    o = aob.I.o();
                }
                if (o) {
                    float L2 = hl.L(1.0f);
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

    public jl8(ox0 ox0Var, Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.s = ox0Var;
    }
}
