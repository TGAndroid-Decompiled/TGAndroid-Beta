package eg;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ql0;
public final class g2 extends ql0 {
    public final g1 f5283c;

    public g2(g1 g1Var) {
        this.f5283c = g1Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    @Override
    public final int h() {
        return Integer.MAX_VALUE;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        g1 g1Var = this.f5283c;
        ArrayList arrayList = g1Var.U2;
        if (arrayList.isEmpty()) {
            return;
        }
        i2 i2Var = (i2) l1Var.f5774a;
        i2Var.f5301r = (TLRPC.Document) arrayList.get(i10 % arrayList.size());
        i2Var.f5302s = true;
        i2Var.a(true ^ g1Var.Z2, false, false);
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        i2 i2Var = new i2(this.f5283c, viewGroup.getContext());
        i2Var.setLayoutParams(new f2.w0(-1, -2));
        return new f2.l1(i2Var);
    }
}
