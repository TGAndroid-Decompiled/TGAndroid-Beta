package defpackage;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class oda implements Runnable {
    public final byte a;
    public final nha b;

    public oda(nha nhaVar, byte b) {
        this.a = b;
        this.b = nhaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        nha nhaVar = this.b;
        switch (b) {
            case 0:
                nhaVar.g0();
                return;
            case 1:
                nhaVar.p2 = (int) nhaVar.S0.c(nha.v2);
                nhaVar.n();
                if (nhaVar.b0 != null) {
                    nhaVar.F1();
                }
                iga[] igaVarArr = nhaVar.n0;
                if (igaVarArr != null) {
                    for (iga igaVar : igaVarArr) {
                        if (igaVar != null) {
                            int paddingTop = igaVar.h.getPaddingTop();
                            sea seaVar = igaVar.h;
                            int paddingLeft = seaVar.getPaddingLeft();
                            int T = nhaVar.T(igaVar.F);
                            int paddingRight = igaVar.h.getPaddingRight();
                            sea seaVar2 = igaVar.h;
                            int S = nhaVar.S(nhaVar.s0());
                            seaVar2.i3 = S;
                            seaVar.setPadding(paddingLeft, T, paddingRight, S);
                            gm.J(igaVar.h, new xda(igaVar, paddingTop - igaVar.h.getPaddingTop(), (byte) 0));
                        }
                    }
                    return;
                }
                return;
            case 2:
                ik.P(nhaVar.getContext(), nhaVar.y1, nhaVar.I1, new qda(nhaVar));
                return;
            case 3:
                Bundle j = kt6.j(2, "type");
                j.putLong("dialog_id", -nhaVar.g1.id);
                cm6 cm6Var = new cm6(j, null);
                cm6Var.c = nhaVar.g1;
                nhaVar.y1.presentFragment(cm6Var);
                return;
            case 4:
                d dVar = nhaVar.y1;
                v9b C = v9b.C(dVar.getParentActivity(), dVar.getCurrentAccount());
                long j2 = nhaVar.m1;
                String currentLang = nhaVar.a0.getCurrentLang();
                C.w0 = j2;
                C.x0 = currentLang;
                C.Q(null);
                C.w0 = j2;
                C.x0 = currentLang;
                return;
            case 5:
                nhaVar.a0.f();
                return;
            case 6:
                kea keaVar = nhaVar.a0;
                if (keaVar.d()) {
                    keaVar.h();
                    return;
                } else {
                    keaVar.f();
                    return;
                }
            case 7:
                kea keaVar2 = nhaVar.a0;
                keaVar2.b(keaVar2.getCurrentLang());
                return;
            case 8:
                d dVar2 = nhaVar.y1;
                dVar2.getMessagesController().V4(false);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", dVar2.getUserConfig().e());
                dVar2.presentFragment(new yv1(bundle), true);
                return;
            case 9:
                d dVar3 = nhaVar.y1;
                try {
                    hs6 mediaDataController = dVar3.getMediaDataController();
                    long e = dVar3.getUserConfig().e();
                    Pattern pattern = hs6.U1;
                    mediaDataController.z0(e, 0, null);
                    return;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
            case 10:
                d dVar4 = nhaVar.y1;
                TLRPC.User f = dVar4.getUserConfig().f();
                ik.r(dVar4, false, null, f, false, true, false, true, new xr8(nhaVar, f, (byte) 20));
                return;
            case 11:
                lea leaVar = nhaVar.b0;
                leaVar.getClass();
                leaVar.h(new zr8(leaVar, (byte) 1), null);
                return;
            case 12:
                nhaVar.b0.setReordering(true);
                return;
            case 13:
                if (!nhaVar.n0()) {
                    nhaVar.C1();
                    return;
                }
                return;
            default:
                nhaVar.l1(false);
                rja rjaVar = nhaVar.I;
                if (rjaVar != null) {
                    rjaVar.o(true);
                } else {
                    nhaVar.H.o(true);
                }
                nhaVar.d1 = 0;
                return;
        }
    }
}
