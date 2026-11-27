package defpackage;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class gsa implements Runnable {
    public final byte a = 0;
    public final wua b;
    public final TLObject c;
    public final long d;
    public final long e;
    public final TLRPC.TL_error f;
    public final long h;
    public final Object n;

    public gsa(wua wuaVar, id idVar, TLObject tLObject, long j, long j2, long j3, TLRPC.TL_error tL_error) {
        this.b = wuaVar;
        this.n = idVar;
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
                wua wuaVar = this.b;
                TLObject tLObject = this.c;
                long j = this.d;
                long j2 = this.e;
                long j3 = this.h;
                TLRPC.TL_error tL_error = this.f;
                wuaVar.getClass();
                ((id) this.n).b(400L);
                e S = LaunchActivity.S();
                if (S != null) {
                    if (tLObject instanceof TLRPC.TL_boolTrue) {
                        wuaVar.dismiss();
                        jxa.v(wuaVar.a, false).M(j);
                        if (j >= 0) {
                            TLRPC.UserFull Y1 = uc7.s1(wuaVar.a).Y1(j2);
                            if (Y1 != null) {
                                int max = Math.max(0, Y1.stargifts_count - 1);
                                Y1.stargifts_count = max;
                                if (max <= 0) {
                                    Y1.flags2 &= -257;
                                }
                            }
                            jxa.v(wuaVar.a, false).L();
                            jxa.v(wuaVar.a, false).Q(true);
                            if (!(S instanceof nza)) {
                                nza nzaVar = new nza();
                                nzaVar.whenFullyVisible(new pqa(nzaVar, j3, (byte) 1));
                                S.presentFragment(nzaVar);
                                return;
                            }
                            d31.b0(S).I(2131624221, ob6.M0(2131750180, null), ob6.H(',', "Gift2Converted", (int) j3)).k(true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", -j);
                        bundle.putBoolean("start_from_monetization", true);
                        w1b w1bVar = new w1b(bundle);
                        kt0.g(wuaVar.a).h(j, true);
                        kt0.g(wuaVar.a).l(j);
                        w1bVar.whenFullyVisible(new pqa(w1bVar, j3, (byte) 2));
                        S.presentFragment(w1bVar);
                        return;
                    } else if (tL_error != null) {
                        wuaVar.j().t(d31.W(tL_error.text), null).k(false);
                        return;
                    } else {
                        wuaVar.j().t(ob6.M0(2131743534, null), null).k(false);
                        return;
                    }
                }
                return;
            default:
                wua wuaVar2 = this.b;
                TLObject tLObject2 = this.c;
                long j4 = this.d;
                long j5 = this.e;
                pcc pccVar = (pcc) this.n;
                TLRPC.TL_error tL_error2 = this.f;
                long j6 = this.h;
                if (tLObject2 instanceof TLRPC.TL_payments_paymentResult) {
                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                    uc7.s1(wuaVar2.a).j4(tL_payments_paymentResult.updates.users, false);
                    uc7.s1(wuaVar2.a).c4(tL_payments_paymentResult.updates.chats, false);
                    jxa.v(wuaVar2.a, false).Q(false);
                    jxa.v(wuaVar2.a, false).M(j4);
                    jxa.v(wuaVar2.a, false).M(j5);
                    jxa.v(wuaVar2.a, false).L();
                    pccVar.a(null);
                    e S2 = LaunchActivity.S();
                    if (S2 != null) {
                        if (j4 >= 0 && j5 >= 0) {
                            zu1 ha = zu1.ha(j4);
                            ha.whenFullyVisible(new lsa(wuaVar2, ha, j4, (byte) 1));
                            S2.presentFragment(ha);
                        } else {
                            v21 I = d31.b0(S2).I(2131624029, ob6.M0(2131749843, null), hl.S2(ob6.a0(null, null, 2131749844, wuaVar2.t1(), wf3.s(j4))));
                            I.u = true;
                            I.j();
                        }
                    }
                    Utilities.d.c(new psa(wuaVar2, tL_payments_paymentResult, (byte) 1));
                    return;
                } else if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                    if (!uc7.s1(wuaVar2.a).i5()) {
                        wuaVar2.f2.setLoading(false);
                        jxa.d0(wuaVar2.getContext(), wuaVar2.J0);
                        return;
                    }
                    jxa v = jxa.v(wuaVar2.a, false);
                    o30 o30Var = new o30(wuaVar2, j6, j4, pccVar, (byte) 15);
                    v.e = false;
                    v.n(o30Var, false, true);
                    v.e = true;
                    return;
                } else {
                    pccVar.a(tL_error2);
                    wuaVar2.j().g0(tL_error2, false);
                    return;
                }
        }
    }

    public gsa(wua wuaVar, TLObject tLObject, long j, long j2, pcc pccVar, TLRPC.TL_error tL_error, long j3) {
        this.b = wuaVar;
        this.c = tLObject;
        this.d = j;
        this.e = j2;
        this.n = pccVar;
        this.f = tL_error;
        this.h = j3;
    }
}
