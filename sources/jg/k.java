package jg;

import android.view.View;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.er0;
public final class k implements View.OnClickListener {
    public final int f10071a;
    public final r0 f10072b;

    public k(r0 r0Var, int i10) {
        this.f10071a = i10;
        this.f10072b = r0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f10071a) {
            case 0:
                r0 r0Var = this.f10072b;
                if (r0Var.C0) {
                    r0Var.q0(null, true);
                    return;
                } else {
                    r0Var.A0(0);
                    return;
                }
            case 1:
                r0 r0Var2 = this.f10072b;
                int i10 = r0Var2.P0;
                r0Var2.A0(1);
                r0Var2.postDelayed(new n(r0Var2, 1), 350L);
                vh.u1 u1Var = new vh.u1(r0Var2.getContext(), r0Var2.f10203z1, false, false);
                u1Var.f52006v1 = new s(r0Var2);
                u1Var.N0(new v(r0Var2, 0));
                u1Var.setOnDismissListener(new w(r0Var2, i10));
                u1Var.show();
                PhotoViewer photoViewer = ((er0) r0Var2).X1;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.v0();
                    photoViewer.F2.g0();
                    return;
                }
                return;
            case 2:
                r0 r0Var3 = this.f10072b;
                j jVar = r0Var3.B0;
                if ((jVar instanceof g3) && !r0Var3.C0) {
                    g3 g3Var = (g3) jVar;
                    r0Var3.C0 = true;
                    g3Var.q();
                    View focusedView = g3Var.getFocusedView();
                    focusedView.requestFocus();
                    org.telegram.messenger.i0.J3(focusedView);
                }
                org.telegram.ui.ActionBar.k1 k1Var = r0Var3.A1;
                if (k1Var != null && k1Var.isShowing()) {
                    r0Var3.A1.d(true);
                    return;
                }
                return;
            case 3:
                r0.Z(this.f10072b);
                return;
            default:
                r0 r0Var4 = this.f10072b;
                r0Var4.A0(2);
                if (!(r0Var4.B0 instanceof g3)) {
                    r0Var4.h0(true);
                    return;
                }
                return;
        }
    }
}
