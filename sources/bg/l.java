package bg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ws0;
public final class l implements View.OnClickListener {
    public final int f2378a;
    public final g1 f2379b;

    public l(g1 g1Var, int i10) {
        this.f2378a = i10;
        this.f2379b = g1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f2378a) {
            case 0:
                g1 g1Var = this.f2379b;
                if (g1Var.P0) {
                    g1Var.r0(null, true);
                    return;
                } else {
                    g1Var.B0(0);
                    return;
                }
            case 1:
                g1 g1Var2 = this.f2379b;
                int i10 = g1Var2.f2227c1;
                g1Var2.B0(1);
                g1Var2.postDelayed(new r(g1Var2, 1), 350L);
                nh.k2 k2Var = new nh.k2(g1Var2.getContext(), g1Var2.M1, false, false);
                k2Var.f17999y = new x(g1Var2);
                k2Var.q0(new b0(g1Var2, 0));
                k2Var.setOnDismissListener(new c0(g1Var2, i10));
                k2Var.show();
                PhotoViewer photoViewer = ((ws0) g1Var2).f44369k2;
                if (photoViewer.B2 != null) {
                    photoViewer.D2 = false;
                    photoViewer.u0();
                    photoViewer.B2.C();
                    return;
                }
                return;
            case 2:
                g1 g1Var3 = this.f2379b;
                k kVar = g1Var3.O0;
                if ((kVar instanceof f4) && !g1Var3.P0) {
                    f4 f4Var = (f4) kVar;
                    g1Var3.P0 = true;
                    f4Var.q();
                    View focusedView = f4Var.getFocusedView();
                    focusedView.requestFocus();
                    AndroidUtilities.showKeyboard(focusedView);
                }
                org.telegram.ui.ActionBar.o1 o1Var = g1Var3.N1;
                if (o1Var != null && o1Var.isShowing()) {
                    g1Var3.N1.d(true);
                    return;
                }
                return;
            case 3:
                g1.b0(this.f2379b);
                return;
            default:
                g1 g1Var4 = this.f2379b;
                g1Var4.B0(2);
                if (!(g1Var4.O0 instanceof f4)) {
                    g1Var4.j0(true);
                    return;
                }
                return;
        }
    }
}
