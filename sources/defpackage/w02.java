package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class w02 implements s22 {
    public final n12 a;

    public w02(n12 n12Var) {
        this.a = n12Var;
    }

    @Override
    public final void a(ArrayList arrayList, String str, boolean z, int i, long j, boolean z2) {
        ((zu1) this.a.Z1).Bb(arrayList, str, z, i, j, z2);
    }

    @Override
    public final void b(TLRPC.TL_userContact_old2 tL_userContact_old2, boolean z, int i, long j) {
        zu1 zu1Var = (zu1) this.a.Z1;
        if (zu1Var.r5()) {
            p7a g = p7a.g(tL_userContact_old2, zu1Var.l6, zu1Var.F5, zu1Var.m4, null, null, z, i, 0);
            g.K = zu1Var.X6();
            g.O = 0L;
            g.L = false;
            g.Q = j;
            g.R = zu1Var.k7();
            g.T = zu1Var.y5;
            zu1Var.getSendMessagesHelper().q0(g);
            zu1Var.E4();
        }
    }
}
