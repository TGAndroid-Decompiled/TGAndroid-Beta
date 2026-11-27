package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class am8 extends c79 {
    public final rk8 c;

    public am8(rk8 rk8Var) {
        this.c = rk8Var;
    }

    @Override
    public final boolean D(f89 f89Var) {
        return false;
    }

    @Override
    public final int b() {
        return Integer.MAX_VALUE;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        rk8 rk8Var = this.c;
        ArrayList arrayList = rk8Var.f3;
        if (arrayList.isEmpty()) {
            return;
        }
        cm8 cm8Var = (cm8) f89Var.a;
        cm8Var.r = (TLRPC.Document) arrayList.get(i % arrayList.size());
        cm8Var.s = true;
        cm8Var.a(!rk8Var.k3, false, false);
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        cm8 cm8Var = new cm8(this.c, viewGroup.getContext());
        cm8Var.setLayoutParams(new r79(-1, -2));
        return new f89(cm8Var);
    }
}
