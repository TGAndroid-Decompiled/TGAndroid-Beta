package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class qg3 implements hk3, cv2 {
    public final ug3 a;

    public qg3(ug3 ug3Var) {
        this.a = ug3Var;
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final void b(TLRPC.User user) {
        this.a.q0(user);
    }

    @Override
    public final boolean q(nk3 nk3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, sxb sxbVar) {
        if (!arrayList.isEmpty()) {
            long j = ((bf7) arrayList.get(0)).a;
            if (pg3.D(j)) {
                ug3 ug3Var = this.a;
                ug3Var.q0(ug3Var.getMessagesController().W1(Long.valueOf(j)));
                return true;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean s(nk3 nk3Var) {
        return false;
    }
}
