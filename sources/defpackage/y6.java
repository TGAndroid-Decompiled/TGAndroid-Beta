package defpackage;

import android.view.View;
import android.widget.PopupWindow;
import org.telegram.ui.o;
public final class y6 implements PopupWindow.OnDismissListener {
    public final byte a;
    public final Object b;

    public y6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onDismiss() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                p7 p7Var = ((s7) obj).R;
                if (p7Var != null) {
                    p7Var.A();
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
                zu1 zu1Var = (zu1) obj;
                zu1Var.g9 = null;
                zu1Var.l9 = null;
                zu1Var.k9 = null;
                zu1Var.C0.R = true;
                zu1Var.y6(false, true, 0.0f);
                nr1 nr1Var = zu1Var.a0;
                if (nr1Var != null && nr1Var.getEditField() != null) {
                    zu1Var.a0.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            case 3:
                pq1 pq1Var = (pq1) obj;
                pq1Var.b = null;
                zu1 zu1Var2 = pq1Var.x;
                zu1Var2.g9 = null;
                zu1Var2.l9 = null;
                zu1Var2.k9 = null;
                zu1Var2.C0.R = true;
                if (zu1Var2.h9) {
                    zu1Var2.y6(false, true, 0.0f);
                } else {
                    zu1Var2.h9 = true;
                }
                nr1 nr1Var2 = zu1Var2.a0;
                if (nr1Var2 != null && nr1Var2.getEditField() != null) {
                    zu1Var2.a0.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            case 4:
                g9 g9Var = (g9) obj;
                g9Var.k();
                g9Var.a = false;
                return;
            case 5:
                ((wy5) obj).C1.d();
                return;
            case 6:
                ((dx7) obj).s1.d();
                return;
            default:
                zuc zucVar = (zuc) obj;
                zucVar.getViewTreeObserver().removeOnGlobalLayoutListener(zucVar.I);
                zucVar.getViewTreeObserver().removeOnScrollChangedListener(zucVar.J);
                return;
        }
    }
}
