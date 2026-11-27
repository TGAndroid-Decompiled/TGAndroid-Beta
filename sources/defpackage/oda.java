package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class oda extends v79 {
    public final byte a;
    public final kea b;

    public oda(kea keaVar, byte b) {
        this.a = b;
        this.b = keaVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        z11 z11Var;
        byte b = this.a;
        kea keaVar = this.b;
        switch (b) {
            case 0:
                if (i2 != 0) {
                    keaVar.V0();
                    keaVar.l2 = keaVar.k2;
                }
                v21 v21Var = v21.x;
                if (v21Var != null && (z11Var = v21Var.e) != null && (z11Var.getParent() instanceof View) && ((View) v21.x.e.getParent()).getParent() == keaVar.w1) {
                    v21.e();
                    return;
                }
                return;
            case 1:
                if (i2 != 0) {
                    keaVar.V0();
                    keaVar.l2 = keaVar.k2;
                    return;
                }
                return;
            default:
                if (i2 != 0) {
                    keaVar.V0();
                    keaVar.l2 = keaVar.k2;
                    return;
                }
                return;
        }
    }
}
