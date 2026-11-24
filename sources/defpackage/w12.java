package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class w12 implements e39, b22 {
    public final k22 a;

    public w12(k22 k22Var) {
        this.a = k22Var;
    }

    @Override
    public final void b(TLRPC.TL_userContact_old2 tL_userContact_old2, boolean z, int i, long j) {
        k22 k22Var = this.a;
        k22Var.b.a(true);
        k22Var.K.b(tL_userContact_old2, z, i, j);
    }

    @Override
    public final boolean d(int i, View view) {
        Object O;
        k22 k22Var = this.a;
        w39 adapter = k22Var.s.getAdapter();
        g22 g22Var = k22Var.G;
        if (adapter == g22Var) {
            O = g22Var.E(i);
        } else {
            e22 e22Var = k22Var.F;
            O = e22Var.O(e22Var.S(i), e22Var.Q(i));
        }
        if (O != null) {
            k22Var.Q((j22) view, O);
            return true;
        }
        return false;
    }

    @Override
    public final void a(ArrayList arrayList, String str, boolean z, int i, long j, boolean z2) {
    }
}
