package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class sf2 implements lc5 {
    public final rc5 a;
    public final bg2 b;

    public sf2(bg2 bg2Var, rc5 rc5Var) {
        this.b = bg2Var;
        this.a = rc5Var;
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
        bg2 bg2Var = this.b;
        bg2Var.getMessagesController().l(bg2Var.n, bg2Var, arrayList, i, new hw(this, (byte) 6), new t42((byte) 1), null);
    }
}
