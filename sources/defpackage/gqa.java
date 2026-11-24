package defpackage;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class gqa implements Runnable {
    public final byte a = 0;
    public final wsa b;
    public final TLObject c;
    public final long d;
    public final long e;
    public final TLRPC.TL_error f;
    public final long h;
    public final Object n;

    public gqa(wsa wsaVar, he heVar, TLObject tLObject, long j, long j2, long j3, TLRPC.TL_error tL_error) {
        this.b = wsaVar;
        this.n = heVar;
        this.c = tLObject;
        this.d = j;
        this.e = j2;
        this.h = j3;
        this.f = tL_error;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                wsa wsaVar = this.b;
                TLObject tLObject = this.c;
                long j = this.d;
                long j2 = this.e;
                long j3 = this.h;
                TLRPC.TL_error tL_error = this.f;
                wsaVar.getClass();
                ((he) this.n).b(400L);
                d S = LaunchActivity.S();
                if (S != null) {
                    if (tLObject instanceof TLRPC.TL_boolTrue) {
                        wsaVar.dismiss();
                        jva.v(wsaVar.a, false).M(j);
                        if (j >= 0) {
                            TLRPC.UserFull X1 = oc7.r1(wsaVar.a).X1(j2);
                            if (X1 != null) {
                                int max = Math.max(0, X1.stargifts_count - 1);
                                X1.stargifts_count = max;
                                if (max <= 0) {
                                    X1.flags2 &= -257;
                                }
                            }
                            jva.v(wsaVar.a, false).L();
                            jva.v(wsaVar.a, false).P(true);
                            if (!(S instanceof nxa)) {
                                nxa nxaVar = new nxa();
                                nxaVar.whenFullyVisible(new toa(nxaVar, j3, (byte) 1));
                                S.presentFragment(nxaVar);
                                return;
                            }
                            c41.b0(S).I(2131624221, jb6.M0(2131750154, null), jb6.H(',', "Gift2Converted", (int) j3)).k(true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", -j);
                        bundle.putBoolean("start_from_monetization", true);
                        xza xzaVar = new xza(bundle);
                        ku0.g(wsaVar.a).h(j, true);
                        ku0.g(wsaVar.a).l(j);
                        xzaVar.whenFullyVisible(new toa(xzaVar, j3, (byte) 2));
                        S.presentFragment(xzaVar);
                        return;
                    } else if (tL_error != null) {
                        wsaVar.j().t(c41.W(tL_error.text), null).k(false);
                        return;
                    } else {
                        wsaVar.j().t(jb6.M0(2131743566, null), null).k(false);
                        return;
                    }
                }
                return;
            default:
                wsa wsaVar2 = this.b;
                TLObject tLObject2 = this.c;
                long j4 = this.d;
                long j5 = this.e;
                qac qacVar = (qac) this.n;
                TLRPC.TL_error tL_error2 = this.f;
                long j6 = this.h;
                if (tLObject2 instanceof TLRPC.TL_payments_paymentResult) {
                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                    oc7.r1(wsaVar2.a).d4(tL_payments_paymentResult.updates.users, false);
                    oc7.r1(wsaVar2.a).X3(tL_payments_paymentResult.updates.chats, false);
                    jva.v(wsaVar2.a, false).P(false);
                    jva.v(wsaVar2.a, false).M(j4);
                    jva.v(wsaVar2.a, false).M(j5);
                    jva.v(wsaVar2.a, false).L();
                    qacVar.a(null);
                    d S2 = LaunchActivity.S();
                    if (S2 != null) {
                        if (j4 >= 0 && j5 >= 0) {
                            yv1 ga = yv1.ga(j4);
                            ga.whenFullyVisible(new kqa(wsaVar2, ga, j4, (byte) 1));
                            S2.presentFragment(ga);
                        } else {
                            u31 I = c41.b0(S2).I(2131624029, jb6.M0(2131749830, null), gm.S2(jb6.a0(null, null, 2131749831, wsaVar2.s1(), pg3.s(j4))));
                            I.u = true;
                            I.j();
                        }
                    }
                    Utilities.d.c(new oqa(wsaVar2, tL_payments_paymentResult, (byte) 1));
                    return;
                } else if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                    if (!oc7.r1(wsaVar2.a).c5()) {
                        wsaVar2.f2.setLoading(false);
                        jva.c0(wsaVar2.getContext(), wsaVar2.J0);
                        return;
                    }
                    jva v = jva.v(wsaVar2.a, false);
                    n40 n40Var = new n40(wsaVar2, j6, j4, qacVar, (byte) 15);
                    v.e = false;
                    v.n(n40Var, false, true);
                    v.e = true;
                    return;
                } else {
                    qacVar.a(tL_error2);
                    wsaVar2.j().g0(tL_error2, false);
                    return;
                }
        }
    }

    public gqa(wsa wsaVar, TLObject tLObject, long j, long j2, qac qacVar, TLRPC.TL_error tL_error, long j3) {
        this.b = wsaVar;
        this.c = tLObject;
        this.d = j;
        this.e = j2;
        this.n = qacVar;
        this.f = tL_error;
        this.h = j3;
    }
}
