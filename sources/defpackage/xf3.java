package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xf3 implements oj3, lu2 {
    public final bg3 a;

    public xf3(bg3 bg3Var) {
        this.a = bg3Var;
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final void b(TLRPC.User user) {
        this.a.p0(user);
    }

    @Override
    public final boolean q(uj3 uj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, tzb tzbVar) {
        if (!arrayList.isEmpty()) {
            long j = ((jf7) arrayList.get(0)).a;
            if (wf3.D(j)) {
                bg3 bg3Var = this.a;
                bg3Var.p0(bg3Var.getMessagesController().X1(Long.valueOf(j)));
                return true;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean s(uj3 uj3Var) {
        return false;
    }
}
