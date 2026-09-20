package m4;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.u81;
import org.telegram.ui.Components.v81;
import org.telegram.ui.Components.w81;
import org.telegram.ui.rc;
import org.telegram.ui.sc;
import org.telegram.ui.zn;
public final class t0 implements e2.h {
    public final int f14916a;
    public final boolean f14917b;
    public final Object f14918c;

    public t0(int i10, Object obj, boolean z10) {
        this.f14916a = i10;
        this.f14918c = obj;
        this.f14917b = z10;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        v81 v81Var;
        switch (this.f14916a) {
            case 0:
                ((j1) obj).K0((b2.e) this.f14918c, this.f14917b);
                return;
            case 1:
                sc scVar = (sc) this.f14918c;
                View view = (View) obj;
                rc rcVar = (rc) view;
                scVar.f37369b.getClass();
                if (RecyclerView.S(view) == scVar.e) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rcVar.f37113s = z10;
                if (!this.f14917b) {
                    rcVar.v.f(z10, true);
                }
                rcVar.invalidate();
                return;
            case 2:
                zn znVar = (zn) this.f14918c;
                View view2 = (View) obj;
                boolean z13 = view2 instanceof u1;
                boolean z14 = this.f14917b;
                if (z13) {
                    u1 u1Var = (u1) view2;
                    if (u1Var.E8 && u1Var.G8) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 != z14 && znVar.B9()) {
                        u1Var.E8 = z14;
                        u1Var.G8 = znVar.B9();
                        u1Var.f21417n8 = true;
                        u1Var.forceLayout();
                        return;
                    }
                    return;
                } else if (view2 instanceof org.telegram.ui.Cells.w0) {
                    ((org.telegram.ui.Cells.w0) view2).f21726e0 = z14;
                    return;
                } else {
                    return;
                }
            default:
                w81 w81Var = (w81) this.f14918c;
                View view3 = (View) obj;
                w81Var.v.getClass();
                int S = RecyclerView.S(view3);
                if (view3 instanceof u81) {
                    u81 u81Var = (u81) view3;
                    if (this.f14917b && (v81Var = w81Var.f30007y) != null && ((l.d) v81Var).H(S)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    u81Var.setReordering(z12);
                    return;
                }
                return;
        }
    }
}
