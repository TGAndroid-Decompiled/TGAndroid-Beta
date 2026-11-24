package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class xba extends k69 {
    public final byte a;
    public final tca b;

    public xba(tca tcaVar, byte b) {
        this.a = b;
        this.b = tcaVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        y21 y21Var;
        byte b = this.a;
        tca tcaVar = this.b;
        switch (b) {
            case 0:
                if (i2 != 0) {
                    tcaVar.U0();
                    tcaVar.l2 = tcaVar.k2;
                }
                u31 u31Var = u31.x;
                if (u31Var != null && (y21Var = u31Var.e) != null && (y21Var.getParent() instanceof View) && ((View) u31.x.e.getParent()).getParent() == tcaVar.w1) {
                    u31.e();
                    return;
                }
                return;
            case 1:
                if (i2 != 0) {
                    tcaVar.U0();
                    tcaVar.l2 = tcaVar.k2;
                    return;
                }
                return;
            default:
                if (i2 != 0) {
                    tcaVar.U0();
                    tcaVar.l2 = tcaVar.k2;
                    return;
                }
                return;
        }
    }
}
