package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class bf2 implements ka5 {
    public final qa5 a;
    public final kf2 b;

    public bf2(kf2 kf2Var, qa5 qa5Var) {
        this.b = kf2Var;
        this.a = qa5Var;
    }

    @Override
    public final void e(TLRPC.User user) {
        this.b.w0(user.id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void f(int i, ArrayList arrayList) {
        if (this.a.getParentActivity() == null) {
            return;
        }
        kf2 kf2Var = this.b;
        kf2Var.getMessagesController().l(kf2Var.n, kf2Var, arrayList, i, new gw(this, (byte) 6), new d42((byte) 1), null);
    }
}
