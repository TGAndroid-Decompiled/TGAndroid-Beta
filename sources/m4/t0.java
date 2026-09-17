package m4;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.i81;
import org.telegram.ui.bo;
import org.telegram.ui.sc;
import org.telegram.ui.tc;
public final class t0 implements e2.h {
    public final int f14710a;
    public final boolean f14711b;
    public final Object f14712c;

    public t0(int i10, Object obj, boolean z10) {
        this.f14710a = i10;
        this.f14712c = obj;
        this.f14711b = z10;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        h81 h81Var;
        switch (this.f14710a) {
            case 0:
                ((k1) obj).K0((b2.e) this.f14712c, this.f14711b);
                return;
            case 1:
                tc tcVar = (tc) this.f14712c;
                View view = (View) obj;
                sc scVar = (sc) view;
                tcVar.f37711b.getClass();
                if (RecyclerView.S(view) == tcVar.e) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                scVar.f37461s = z10;
                if (!this.f14711b) {
                    scVar.v.f(z10, true);
                }
                scVar.invalidate();
                return;
            case 2:
                bo boVar = (bo) this.f14712c;
                View view2 = (View) obj;
                boolean z13 = view2 instanceof t1;
                boolean z14 = this.f14711b;
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
                        t1Var.f21174n8 = true;
                        t1Var.forceLayout();
                        return;
                    }
                    return;
                } else if (view2 instanceof org.telegram.ui.Cells.w0) {
                    ((org.telegram.ui.Cells.w0) view2).f21520e0 = z14;
                    return;
                } else {
                    return;
                }
            default:
                i81 i81Var = (i81) this.f14712c;
                View view3 = (View) obj;
                i81Var.v.getClass();
                int S = RecyclerView.S(view3);
                if (view3 instanceof g81) {
                    g81 g81Var = (g81) view3;
                    if (this.f14711b && (h81Var = i81Var.f24896y) != null && ((ka.c) h81Var).d(S)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    g81Var.setReordering(z12);
                    return;
                }
                return;
        }
    }
}
