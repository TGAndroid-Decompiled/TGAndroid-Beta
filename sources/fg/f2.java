package fg;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.sl0;
public final class f2 extends sl0 {
    public final f1 f6316c;

    public f2(f1 f1Var) {
        this.f6316c = f1Var;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return false;
    }

    @Override
    public final int h() {
        return Integer.MAX_VALUE;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        f1 f1Var = this.f6316c;
        ArrayList arrayList = f1Var.U2;
        if (arrayList.isEmpty()) {
            return;
        }
        h2 h2Var = (h2) m1Var.f5875a;
        h2Var.f6333r = (TLRPC.Document) arrayList.get(i10 % arrayList.size());
        h2Var.f6334s = true;
        h2Var.a(true ^ f1Var.Z2, false, false);
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        h2 h2Var = new h2(this.f6316c, viewGroup.getContext());
        h2Var.setLayoutParams(new f2.x0(-1, -2));
        return new f2.m1(h2Var);
    }
}
