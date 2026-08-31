package eg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ht0;
public final class k implements View.OnClickListener {
    public final int f5313a;
    public final c1 f5314b;

    public k(c1 c1Var, int i10) {
        this.f5313a = i10;
        this.f5314b = c1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f5313a) {
            case 0:
                c1 c1Var = this.f5314b;
                if (c1Var.Q0) {
                    c1Var.r0(null, true);
                    return;
                } else {
                    c1Var.B0(0);
                    return;
                }
            case 1:
                c1 c1Var2 = this.f5314b;
                int i10 = c1Var2.f5106d1;
                c1Var2.B0(1);
                c1Var2.postDelayed(new p(c1Var2, 1), 350L);
                qh.y1 y1Var = new qh.y1(c1Var2.getContext(), c1Var2.N1, false, false);
                y1Var.f46351y = new v(c1Var2);
                y1Var.q0(new y(c1Var2, 0));
                y1Var.setOnDismissListener(new z(c1Var2, i10));
                y1Var.show();
                PhotoViewer photoViewer = ((ht0) c1Var2).f37617l2;
                if (photoViewer.C2 != null) {
                    photoViewer.E2 = false;
                    photoViewer.u0();
                    photoViewer.C2.B();
                    return;
                }
                return;
            case 2:
                c1 c1Var3 = this.f5314b;
                j jVar = c1Var3.P0;
                if ((jVar instanceof z3) && !c1Var3.Q0) {
                    z3 z3Var = (z3) jVar;
                    c1Var3.Q0 = true;
                    z3Var.q();
                    View focusedView = z3Var.getFocusedView();
                    focusedView.requestFocus();
                    AndroidUtilities.showKeyboard(focusedView);
                }
                org.telegram.ui.ActionBar.p1 p1Var = c1Var3.O1;
                if (p1Var != null && p1Var.isShowing()) {
                    c1Var3.O1.d(true);
                    return;
                }
                return;
            case 3:
                c1.b0(this.f5314b);
                return;
            default:
                c1 c1Var4 = this.f5314b;
                c1Var4.B0(2);
                if (!(c1Var4.P0 instanceof z3)) {
                    c1Var4.j0(true);
                    return;
                }
                return;
        }
    }
}
