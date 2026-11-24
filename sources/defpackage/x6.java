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
                    o7Var.z0();
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
                yv1 yv1Var = (yv1) obj;
                yv1Var.g9 = null;
                yv1Var.l9 = null;
                yv1Var.k9 = null;
                yv1Var.C0.R = true;
                yv1Var.y6(false, true, 0.0f);
                ms1 ms1Var = yv1Var.a0;
                if (ms1Var != null && ms1Var.getEditField() != null) {
                    yv1Var.a0.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            case 3:
                or1 or1Var = (or1) obj;
                or1Var.b = null;
                yv1 yv1Var2 = or1Var.x;
                yv1Var2.g9 = null;
                yv1Var2.l9 = null;
                yv1Var2.k9 = null;
                yv1Var2.C0.R = true;
                if (yv1Var2.h9) {
                    yv1Var2.y6(false, true, 0.0f);
                } else {
                    yv1Var2.h9 = true;
                }
                ms1 ms1Var2 = yv1Var2.a0;
                if (ms1Var2 != null && ms1Var2.getEditField() != null) {
                    yv1Var2.a0.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            case 4:
                f9 f9Var = (f9) obj;
                f9Var.k();
                f9Var.a = false;
                return;
            case 5:
                ((ry5) obj).I1.d();
                return;
            case 6:
                ((xv7) obj).y1.d();
                return;
            default:
                nsc nscVar = (nsc) obj;
                nscVar.getViewTreeObserver().removeOnGlobalLayoutListener(nscVar.I);
                nscVar.getViewTreeObserver().removeOnScrollChangedListener(nscVar.J);
                return;
        }
    }
}
