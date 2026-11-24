package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class i32 implements h59, n32 {
    public final w32 a;

    public i32(w32 w32Var) {
        this.a = w32Var;
    }

    @Override
    public final void b(TLRPC.TL_userContact_old2 tL_userContact_old2, boolean z, int i, long j) {
        w32 w32Var = this.a;
        w32Var.b.a(true);
        w32Var.K.b(tL_userContact_old2, z, i, j);
    }

    @Override
    public final boolean g(int i, View view) {
        Object O;
        w32 w32Var = this.a;
        y59 adapter = w32Var.s.getAdapter();
        s32 s32Var = w32Var.G;
        if (adapter == s32Var) {
            O = s32Var.E(i);
        } else {
            q32 q32Var = w32Var.F;
            O = q32Var.O(q32Var.S(i), q32Var.Q(i));
        }
        if (O != null) {
            w32Var.P((v32) view, O);
            return true;
        }
        return false;
    }

    @Override
    public final void a(ArrayList arrayList, String str, boolean z, int i, long j, boolean z2) {
    }
}
