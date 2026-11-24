package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class df3 implements wi3, rt2 {
    public final hf3 a;

    public df3(hf3 hf3Var) {
        this.a = hf3Var;
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public final void b(TLRPC.User user) {
        this.a.p0(user);
    }

    @Override
    public final boolean r(cj3 cj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, qvb qvbVar) {
        if (!arrayList.isEmpty()) {
            long j = ((zc7) arrayList.get(0)).a;
            if (cf3.D(j)) {
                hf3 hf3Var = this.a;
                hf3Var.p0(hf3Var.getMessagesController().V1(Long.valueOf(j)));
                return true;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean t(cj3 cj3Var) {
        return false;
    }
}
