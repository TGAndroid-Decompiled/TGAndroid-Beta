package defpackage;

import android.view.View;
import android.widget.PopupWindow;
import org.telegram.ui.o;
public final class x6 implements PopupWindow.OnDismissListener {
    public final byte a;
    public final Object b;

    public x6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onDismiss() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                o7 o7Var = ((r7) obj).R;
                if (o7Var != null) {
                    o7Var.A();
                    return;
                }
                return;
            case 1:
                o oVar = (o) obj;
                View view = oVar.f;
                if (view != null) {
                    oVar.d = null;
                    view.invalidate();
                    oVar.f = null;
                    return;
                }
                return;
            case 2:
                mu1 mu1Var = (mu1) obj;
                mu1Var.g9 = null;
                mu1Var.l9 = null;
                mu1Var.k9 = null;
                mu1Var.C0.R = true;
                mu1Var.r6(false, true, 0.0f);
                ar1 ar1Var = mu1Var.a0;
                if (ar1Var != null && ar1Var.getEditField() != null) {
                    mu1Var.a0.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            case 3:
                bq1 bq1Var = (bq1) obj;
                bq1Var.b = null;
                mu1 mu1Var2 = bq1Var.x;
                mu1Var2.g9 = null;
                mu1Var2.l9 = null;
                mu1Var2.k9 = null;
                mu1Var2.C0.R = true;
                if (mu1Var2.h9) {
                    mu1Var2.r6(false, true, 0.0f);
                } else {
                    mu1Var2.h9 = true;
                }
                ar1 ar1Var2 = mu1Var2.a0;
                if (ar1Var2 != null && ar1Var2.getEditField() != null) {
                    mu1Var2.a0.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            case 4:
                f9 f9Var = (f9) obj;
                f9Var.k();
                f9Var.a = false;
                return;
            case 5:
                ((rw5) obj).I1.d();
                return;
            case 6:
                ((wt7) obj).y1.d();
                return;
            default:
                lqc lqcVar = (lqc) obj;
                lqcVar.getViewTreeObserver().removeOnGlobalLayoutListener(lqcVar.I);
                lqcVar.getViewTreeObserver().removeOnScrollChangedListener(lqcVar.J);
                return;
        }
    }
}
