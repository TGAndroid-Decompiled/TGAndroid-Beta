package m4;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.s81;
import org.telegram.ui.Components.t81;
import org.telegram.ui.Components.u81;
import org.telegram.ui.eo;
import org.telegram.ui.sc;
import org.telegram.ui.tc;
public final class v0 implements e2.h {
    public final int f13545a;
    public final boolean f13546b;
    public final Object f13547c;

    public v0(int i10, Object obj, boolean z10) {
        this.f13545a = i10;
        this.f13547c = obj;
        this.f13546b = z10;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        t81 t81Var;
        switch (this.f13545a) {
            case 0:
                ((l1) obj).K0((b2.e) this.f13547c, this.f13546b);
                return;
            case 1:
                tc tcVar = (tc) this.f13547c;
                View view = (View) obj;
                sc scVar = (sc) view;
                tcVar.f36900b.getClass();
                if (RecyclerView.R(view) == tcVar.e) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                scVar.f36649s = z10;
                if (!this.f13546b) {
                    scVar.v.f(z10, true);
                }
                scVar.invalidate();
                return;
            case 2:
                eo eoVar = (eo) this.f13547c;
                View view2 = (View) obj;
                boolean z13 = view2 instanceof org.telegram.ui.Cells.t1;
                boolean z14 = this.f13546b;
                if (z13) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view2;
                    if (t1Var.E8 && t1Var.G8) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 != z14 && eoVar.B9()) {
                        t1Var.E8 = z14;
                        t1Var.G8 = eoVar.B9();
                        t1Var.f20245n8 = true;
                        t1Var.forceLayout();
                        return;
                    }
                    return;
                } else if (view2 instanceof org.telegram.ui.Cells.w0) {
                    ((org.telegram.ui.Cells.w0) view2).f20595e0 = z14;
                    return;
                } else {
                    return;
                }
            default:
                u81 u81Var = (u81) this.f13547c;
                View view3 = (View) obj;
                u81Var.v.getClass();
                int R = RecyclerView.R(view3);
                if (view3 instanceof s81) {
                    s81 s81Var = (s81) view3;
                    if (this.f13546b && (t81Var = u81Var.f27640y) != null && ((l2.h) t81Var).j(R)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    s81Var.setReordering(z12);
                    return;
                }
                return;
        }
    }
}
