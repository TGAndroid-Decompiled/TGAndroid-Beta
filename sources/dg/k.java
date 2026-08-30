package dg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ft0;
public final class k implements View.OnClickListener {
    public final int f4611a;
    public final e1 f4612b;

    public k(e1 e1Var, int i10) {
        this.f4611a = i10;
        this.f4612b = e1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f4611a) {
            case 0:
                e1 e1Var = this.f4612b;
                if (e1Var.Q0) {
                    e1Var.r0(null, true);
                    return;
                } else {
                    e1Var.B0(0);
                    return;
                }
            case 1:
                e1 e1Var2 = this.f4612b;
                int i10 = e1Var2.f4463d1;
                e1Var2.B0(1);
                e1Var2.postDelayed(new q(e1Var2, 1), 350L);
                ph.y1 y1Var = new ph.y1(e1Var2.getContext(), e1Var2.N1, false, false);
                y1Var.f42611y = new w(e1Var2);
                y1Var.q0(new a0(e1Var2, 0));
                y1Var.setOnDismissListener(new b0(e1Var2, i10));
                y1Var.show();
                PhotoViewer photoViewer = ((ft0) e1Var2).f34353l2;
                if (photoViewer.C2 != null) {
                    photoViewer.E2 = false;
                    photoViewer.u0();
                    photoViewer.C2.B();
                    return;
                }
                return;
            case 2:
                e1 e1Var3 = this.f4612b;
                j jVar = e1Var3.P0;
                if ((jVar instanceof b4) && !e1Var3.Q0) {
                    b4 b4Var = (b4) jVar;
                    e1Var3.Q0 = true;
                    b4Var.q();
                    View focusedView = b4Var.getFocusedView();
                    focusedView.requestFocus();
                    AndroidUtilities.showKeyboard(focusedView);
                }
                org.telegram.ui.ActionBar.p1 p1Var = e1Var3.O1;
                if (p1Var != null && p1Var.isShowing()) {
                    e1Var3.O1.d(true);
                    return;
                }
                return;
            case 3:
                e1.b0(this.f4612b);
                return;
            default:
                e1 e1Var4 = this.f4612b;
                e1Var4.B0(2);
                if (!(e1Var4.P0 instanceof b4)) {
                    e1Var4.j0(true);
                    return;
                }
                return;
        }
    }
}
