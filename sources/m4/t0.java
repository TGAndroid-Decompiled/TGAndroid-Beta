package m4;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.f81;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.h81;
import org.telegram.ui.bo;
import org.telegram.ui.qc;
import org.telegram.ui.rc;
public final class t0 implements e2.h {
    public final int f14698a;
    public final boolean f14699b;
    public final Object f14700c;

    public t0(int i10, Object obj, boolean z10) {
        this.f14698a = i10;
        this.f14700c = obj;
        this.f14699b = z10;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        g81 g81Var;
        switch (this.f14698a) {
            case 0:
                ((k1) obj).K0((b2.e) this.f14700c, this.f14699b);
                return;
            case 1:
                rc rcVar = (rc) this.f14700c;
                View view = (View) obj;
                qc qcVar = (qc) view;
                rcVar.f37100b.getClass();
                if (RecyclerView.R(view) == rcVar.e) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                qcVar.f36839s = z10;
                if (!this.f14699b) {
                    qcVar.v.f(z10, true);
                }
                qcVar.invalidate();
                return;
            case 2:
                bo boVar = (bo) this.f14700c;
                View view2 = (View) obj;
                boolean z13 = view2 instanceof t1;
                boolean z14 = this.f14699b;
                if (z13) {
                    t1 t1Var = (t1) view2;
                    if (t1Var.E8 && t1Var.G8) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 != z14 && boVar.B9()) {
                        t1Var.E8 = z14;
                        t1Var.G8 = boVar.B9();
                        t1Var.f21147n8 = true;
                        t1Var.forceLayout();
                        return;
                    }
                    return;
                } else if (view2 instanceof org.telegram.ui.Cells.w0) {
                    ((org.telegram.ui.Cells.w0) view2).f21497e0 = z14;
                    return;
                } else {
                    return;
                }
            default:
                h81 h81Var = (h81) this.f14700c;
                View view3 = (View) obj;
                h81Var.v.getClass();
                int R = RecyclerView.R(view3);
                if (view3 instanceof f81) {
                    f81 f81Var = (f81) view3;
                    if (this.f14699b && (g81Var = h81Var.f24617y) != null && ((ka.c) g81Var).d(R)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    f81Var.setReordering(z12);
                    return;
                }
                return;
        }
    }
}
