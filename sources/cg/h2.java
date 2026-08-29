package cg;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.il0;
public final class h2 extends il0 {
    public final h1 f3155c;

    public h2(h1 h1Var) {
        this.f3155c = h1Var;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return false;
    }

    @Override
    public final int h() {
        return Integer.MAX_VALUE;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        h1 h1Var = this.f3155c;
        ArrayList arrayList = h1Var.T2;
        if (arrayList.isEmpty()) {
            return;
        }
        j2 j2Var = (j2) n1Var.f6432a;
        j2Var.f3175r = (TLRPC.Document) arrayList.get(i10 % arrayList.size());
        j2Var.f3176s = true;
        j2Var.a(true ^ h1Var.Y2, false, false);
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        j2 j2Var = new j2(this.f3155c, viewGroup.getContext());
        j2Var.setLayoutParams(new f2.x0(-1, -2));
        return new f2.n1(j2Var);
    }
}
