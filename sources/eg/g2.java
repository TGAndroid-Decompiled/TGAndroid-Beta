package eg;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.rl0;
public final class g2 extends rl0 {
    public final g1 f5294c;

    public g2(g1 g1Var) {
        this.f5294c = g1Var;
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
        g1 g1Var = this.f5294c;
        ArrayList arrayList = g1Var.U2;
        if (arrayList.isEmpty()) {
            return;
        }
        i2 i2Var = (i2) l1Var.f5785a;
        i2Var.f5312r = (TLRPC.Document) arrayList.get(i10 % arrayList.size());
        i2Var.f5313s = true;
        i2Var.a(true ^ g1Var.Z2, false, false);
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        i2 i2Var = new i2(this.f5294c, viewGroup.getContext());
        i2Var.setLayoutParams(new f2.w0(-1, -2));
        return new f2.l1(i2Var);
    }
}
