package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ni8 extends n39 {
    public final dh8 c;

    public ni8(dh8 dh8Var) {
        this.c = dh8Var;
    }

    @Override
    public final boolean D(s49 s49Var) {
        return false;
    }

    @Override
    public final int b() {
        return Integer.MAX_VALUE;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        dh8 dh8Var = this.c;
        ArrayList arrayList = dh8Var.f3;
        if (arrayList.isEmpty()) {
            return;
        }
        pi8 pi8Var = (pi8) s49Var.a;
        pi8Var.r = (TLRPC.Document) arrayList.get(i % arrayList.size());
        pi8Var.s = true;
        pi8Var.a(!dh8Var.k3, false, false);
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        pi8 pi8Var = new pi8(this.c, viewGroup.getContext());
        pi8Var.setLayoutParams(new e49(-1, -2));
        return new s49(pi8Var);
    }
}
