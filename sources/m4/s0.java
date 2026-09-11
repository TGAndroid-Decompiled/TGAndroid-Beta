package m4;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.f81;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.h81;
import org.telegram.ui.co;
import org.telegram.ui.rc;
import org.telegram.ui.sc;
public final class s0 implements e2.h {
    public final int f16084a;
    public final boolean f16085b;
    public final Object f16086c;

    public s0(int i10, Object obj, boolean z10) {
        this.f16084a = i10;
        this.f16086c = obj;
        this.f16085b = z10;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        g81 g81Var;
        switch (this.f16084a) {
            case 0:
                ((j1) obj).K0((b2.e) this.f16086c, this.f16085b);
                return;
            case 1:
                sc scVar = (sc) this.f16086c;
                View view = (View) obj;
                rc rcVar = (rc) view;
                scVar.f40408b.getClass();
                if (RecyclerView.R(view) == scVar.f40410e) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rcVar.f40140s = z10;
                if (!this.f16085b) {
                    rcVar.v.f(z10, true);
                }
                rcVar.invalidate();
                return;
            case 2:
                co coVar = (co) this.f16086c;
                View view2 = (View) obj;
                boolean z13 = view2 instanceof t1;
                boolean z14 = this.f16085b;
                if (z13) {
                    t1 t1Var = (t1) view2;
                    if (t1Var.E8 && t1Var.G8) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 != z14 && coVar.B9()) {
                        t1Var.E8 = z14;
                        t1Var.G8 = coVar.B9();
                        t1Var.f23047n8 = true;
                        t1Var.forceLayout();
                        return;
                    }
                    return;
                } else if (view2 instanceof org.telegram.ui.Cells.w0) {
                    ((org.telegram.ui.Cells.w0) view2).f23410e0 = z14;
                    return;
                } else {
                    return;
                }
            default:
                h81 h81Var = (h81) this.f16086c;
                View view3 = (View) obj;
                h81Var.v.getClass();
                int R = RecyclerView.R(view3);
                if (view3 instanceof f81) {
                    f81 f81Var = (f81) view3;
                    if (this.f16085b && (g81Var = h81Var.f26659y) != null && ((k2.g0) g81Var).i(R)) {
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
