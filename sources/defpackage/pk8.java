package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pk8 extends q59 {
    public final fj8 c;

    public pk8(fj8 fj8Var) {
        this.c = fj8Var;
    }

    @Override
    public final boolean D(u69 u69Var) {
        return false;
    }

    @Override
    public final int b() {
        return Integer.MAX_VALUE;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        fj8 fj8Var = this.c;
        ArrayList arrayList = fj8Var.f3;
        if (arrayList.isEmpty()) {
            return;
        }
        rk8 rk8Var = (rk8) u69Var.a;
        rk8Var.r = (TLRPC.Document) arrayList.get(i % arrayList.size());
        rk8Var.s = true;
        rk8Var.a(!fj8Var.k3, false, false);
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        rk8 rk8Var = new rk8(this.c, viewGroup.getContext());
        rk8Var.setLayoutParams(new g69(-1, -2));
        return new u69(rk8Var);
    }
}
