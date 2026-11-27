package defpackage;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class gfa implements Runnable {
    public final byte a;
    public final eja b;

    public gfa(eja ejaVar, byte b) {
        this.a = b;
        this.b = ejaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        eja ejaVar = this.b;
        switch (b) {
            case 0:
                ejaVar.p2 = (int) ejaVar.S0.c(eja.v2);
                ejaVar.n();
                if (ejaVar.b0 != null) {
                    ejaVar.F1();
                }
                zha[] zhaVarArr = ejaVar.n0;
                if (zhaVarArr != null) {
                    for (zha zhaVar : zhaVarArr) {
                        if (zhaVar != null) {
                            int paddingTop = zhaVar.h.getPaddingTop();
                            jga jgaVar = zhaVar.h;
                            int paddingLeft = jgaVar.getPaddingLeft();
                            int T = ejaVar.T(zhaVar.F);
                            int paddingRight = zhaVar.h.getPaddingRight();
                            jga jgaVar2 = zhaVar.h;
                            int S = ejaVar.S(ejaVar.s0());
                            jgaVar2.i3 = S;
                            jgaVar.setPadding(paddingLeft, T, paddingRight, S);
                            hl.J(zhaVar.h, new jfa(zhaVar, paddingTop - zhaVar.h.getPaddingTop(), (byte) 0));
                        }
                    }
                    return;
                }
                return;
            case 1:
                jj.P(ejaVar.getContext(), ejaVar.y1, ejaVar.I1, new hfa(ejaVar));
                return;
            case 2:
                Bundle j = qu6.j(2, "type");
                j.putLong("dialog_id", -ejaVar.g1.id);
                em6 em6Var = new em6(j, null);
                em6Var.c = ejaVar.g1;
                ejaVar.y1.presentFragment(em6Var);
                return;
            case 3:
                e eVar = ejaVar.y1;
                sbb C = sbb.C(eVar.getParentActivity(), eVar.getCurrentAccount());
                long j2 = ejaVar.m1;
                String currentLang = ejaVar.a0.getCurrentLang();
                C.w0 = j2;
                C.x0 = currentLang;
                C.Q(null);
                C.w0 = j2;
                C.x0 = currentLang;
                return;
            case 4:
                ejaVar.a0.f();
                return;
            case 5:
                bga bgaVar = ejaVar.a0;
                if (bgaVar.d()) {
                    bgaVar.h();
                    return;
                } else {
                    bgaVar.f();
                    return;
                }
            case 6:
                bga bgaVar2 = ejaVar.a0;
                bgaVar2.b(bgaVar2.getCurrentLang());
                return;
            case 7:
                e eVar2 = ejaVar.y1;
                eVar2.getMessagesController().b5(false);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", eVar2.getUserConfig().e());
                eVar2.presentFragment(new zu1(bundle), true);
                return;
            case 8:
                e eVar3 = ejaVar.y1;
                try {
                    ls6 mediaDataController = eVar3.getMediaDataController();
                    long e = eVar3.getUserConfig().e();
                    Pattern pattern = ls6.U1;
                    mediaDataController.z0(e, 0, null);
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
            case 9:
                e eVar4 = ejaVar.y1;
                TLRPC.User f = eVar4.getUserConfig().f();
                jj.r(eVar4, false, null, f, false, true, false, true, new yw9(ejaVar, f, (byte) 5));
                return;
            case 10:
                cga cgaVar = ejaVar.b0;
                cgaVar.getClass();
                cgaVar.h(new jt8(cgaVar, (byte) 1), null);
                return;
            case 11:
                ejaVar.b0.setReordering(true);
                return;
            case 12:
                if (!ejaVar.n0()) {
                    ejaVar.C1();
                    return;
                }
                return;
            case 13:
                ejaVar.l1(false);
                jla jlaVar = ejaVar.I;
                if (jlaVar != null) {
                    jlaVar.o(true);
                } else {
                    ejaVar.H.o(true);
                }
                ejaVar.d1 = 0;
                return;
            default:
                ejaVar.g0();
                return;
        }
    }
}
