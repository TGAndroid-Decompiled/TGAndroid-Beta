package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ng2 implements ic5 {
    public final oc5 a;
    public final wg2 b;

    public ng2(wg2 wg2Var, oc5 oc5Var) {
        this.b = wg2Var;
        this.a = oc5Var;
    }

    @Override
    public final void d(TLRPC.User user) {
        this.b.x0(user.id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void f(int i, ArrayList arrayList) {
        if (this.a.getParentActivity() == null) {
            return;
        }
        wg2 wg2Var = this.b;
        wg2Var.getMessagesController().l(wg2Var.n, wg2Var, arrayList, i, new gx(this, (byte) 6), new o52((byte) 1), null);
    }
}
