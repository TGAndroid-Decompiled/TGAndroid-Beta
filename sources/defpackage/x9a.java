package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class x9a extends i49 {
    public final byte a;
    public final taa b;

    public x9a(taa taaVar, byte b) {
        this.a = b;
        this.b = taaVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        q11 q11Var;
        byte b = this.a;
        taa taaVar = this.b;
        switch (b) {
            case 0:
                if (i2 != 0) {
                    taaVar.U0();
                    taaVar.l2 = taaVar.k2;
                }
                m21 m21Var = m21.w;
                if (m21Var != null && (q11Var = m21Var.e) != null && (q11Var.getParent() instanceof View) && ((View) m21.w.e.getParent()).getParent() == taaVar.w1) {
                    m21.e();
                    return;
                }
                return;
            case 1:
                if (i2 != 0) {
                    taaVar.U0();
                    taaVar.l2 = taaVar.k2;
                    return;
                }
                return;
            default:
                if (i2 != 0) {
                    taaVar.U0();
                    taaVar.l2 = taaVar.k2;
                    return;
                }
                return;
        }
    }
}
