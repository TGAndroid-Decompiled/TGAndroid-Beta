package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class h75 extends sb0 {
    public final j95 V;

    public h75(j95 j95Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.V = j95Var;
    }

    @Override
    public final void c() {
        j95 j95Var = this.V;
        k5 k5Var = j95Var.n1;
        i75 i75Var = j95Var.l1;
        long dialogId = i75Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User X1 = uc7.s1(k5Var.a).X1(Long.valueOf(dialogId));
            i75Var.H(null, jn5.m(k5Var.a, 0, X1), jn5.m(k5Var.a, 1, X1), false);
        }
    }
}
