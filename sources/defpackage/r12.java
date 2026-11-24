package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class r12 implements n32 {
    public final i22 a;

    public r12(i22 i22Var) {
        this.a = i22Var;
    }

    @Override
    public final void a(ArrayList arrayList, String str, boolean z, int i, long j, boolean z2) {
        ((yv1) this.a.Z1).Ab(arrayList, str, z, i, j, z2);
    }

    @Override
    public final void b(TLRPC.TL_userContact_old2 tL_userContact_old2, boolean z, int i, long j) {
        yv1 yv1Var = (yv1) this.a.Z1;
        if (yv1Var.s5()) {
            y5a g = y5a.g(tL_userContact_old2, yv1Var.l6, yv1Var.F5, yv1Var.m4, null, null, z, i, 0);
            g.K = yv1Var.X6();
            g.O = 0L;
            g.L = false;
            g.Q = j;
            g.R = yv1Var.k7();
            g.T = yv1Var.y5;
            yv1Var.getSendMessagesHelper().q0(g);
            yv1Var.E4();
        }
    }
}
