package defpackage;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class oba implements Runnable {
    public final byte a;
    public final nfa b;

    public oba(nfa nfaVar, byte b) {
        this.a = b;
        this.b = nfaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        nfa nfaVar = this.b;
        switch (b) {
            case 0:
                nfaVar.g0();
                return;
            case 1:
                nfaVar.p2 = (int) nfaVar.S0.c(nfa.v2);
                nfaVar.n();
                if (nfaVar.b0 != null) {
                    nfaVar.F1();
                }
                iea[] ieaVarArr = nfaVar.n0;
                if (ieaVarArr != null) {
                    for (iea ieaVar : ieaVarArr) {
                        if (ieaVar != null) {
                            int paddingTop = ieaVar.h.getPaddingTop();
                            sca scaVar = ieaVar.h;
                            int paddingLeft = scaVar.getPaddingLeft();
                            int T = nfaVar.T(ieaVar.F);
                            int paddingRight = ieaVar.h.getPaddingRight();
                            sca scaVar2 = ieaVar.h;
                            int S = nfaVar.S(nfaVar.s0());
                            scaVar2.i3 = S;
                            scaVar.setPadding(paddingLeft, T, paddingRight, S);
                            gl.J(ieaVar.h, new wba(ieaVar, paddingTop - ieaVar.h.getPaddingTop(), (byte) 0));
                        }
                    }
                    return;
                }
                return;
            case 2:
                ij.P(nfaVar.getContext(), nfaVar.y1, nfaVar.I1, new qba(nfaVar));
                return;
            case 3:
                Bundle j = ls6.j(2, "type");
                j.putLong("dialog_id", -nfaVar.g1.id);
                zj6 zj6Var = new zj6(j, null);
                zj6Var.c = nfaVar.g1;
                nfaVar.y1.presentFragment(zj6Var);
                return;
            case 4:
                d dVar = nfaVar.y1;
                t7b C = t7b.C(dVar.getParentActivity(), dVar.getCurrentAccount());
                long j2 = nfaVar.m1;
                String currentLang = nfaVar.a0.getCurrentLang();
                C.w0 = j2;
                C.x0 = currentLang;
                C.Q(null);
                C.w0 = j2;
                C.x0 = currentLang;
                return;
            case 5:
                nfaVar.a0.f();
                return;
            case 6:
                kca kcaVar = nfaVar.a0;
                if (kcaVar.d()) {
                    kcaVar.h();
                    return;
                } else {
                    kcaVar.f();
                    return;
                }
            case 7:
                kca kcaVar2 = nfaVar.a0;
                kcaVar2.b(kcaVar2.getCurrentLang());
                return;
            case 8:
                d dVar2 = nfaVar.y1;
                dVar2.getMessagesController().T4(false);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", dVar2.getUserConfig().e());
                dVar2.presentFragment(new mu1(bundle), true);
                return;
            case 9:
                d dVar3 = nfaVar.y1;
                try {
                    hq6 mediaDataController = dVar3.getMediaDataController();
                    long e = dVar3.getUserConfig().e();
                    Pattern pattern = hq6.U1;
                    mediaDataController.z0(e, 0, null);
                    return;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
            case 10:
                d dVar4 = nfaVar.y1;
                TLRPC.User f = dVar4.getUserConfig().f();
                ij.r(dVar4, false, null, f, false, true, false, true, new kq8(nfaVar, f, (byte) 19));
                return;
            case 11:
                lca lcaVar = nfaVar.b0;
                lcaVar.getClass();
                lcaVar.h(new xp8(lcaVar, (byte) 1), null);
                return;
            case 12:
                nfaVar.b0.setReordering(true);
                return;
            case 13:
                if (!nfaVar.n0()) {
                    nfaVar.C1();
                    return;
                }
                return;
            default:
                nfaVar.l1(false);
                pha phaVar = nfaVar.I;
                if (phaVar != null) {
                    phaVar.n(true);
                } else {
                    nfaVar.H.n(true);
                }
                nfaVar.d1 = 0;
                return;
        }
    }
}
