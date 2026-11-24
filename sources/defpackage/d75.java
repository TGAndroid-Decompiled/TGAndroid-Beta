package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class d75 extends qc0 {
    public final g95 V;

    public d75(g95 g95Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.V = g95Var;
    }

    @Override
    public final void c() {
        g95 g95Var = this.V;
        j5 j5Var = g95Var.n1;
        e75 e75Var = g95Var.l1;
        long dialogId = e75Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User W1 = oc7.r1(j5Var.a).W1(Long.valueOf(dialogId));
            e75Var.H(null, gn5.m(j5Var.a, 0, W1), gn5.m(j5Var.a, 1, W1), false);
        }
    }
}
