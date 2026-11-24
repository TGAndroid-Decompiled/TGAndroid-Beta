package defpackage;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class goa implements Runnable {
    public final byte a = 0;
    public final vqa b;
    public final TLObject c;
    public final long d;
    public final long e;
    public final TLRPC.TL_error f;
    public final long h;
    public final Object n;

    public goa(vqa vqaVar, hd hdVar, TLObject tLObject, long j, long j2, long j3, TLRPC.TL_error tL_error) {
        this.b = vqaVar;
        this.n = hdVar;
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
                vqa vqaVar = this.b;
                TLObject tLObject = this.c;
                long j = this.d;
                long j2 = this.e;
                long j3 = this.h;
                TLRPC.TL_error tL_error = this.f;
                vqaVar.getClass();
                ((hd) this.n).b(400L);
                d S = LaunchActivity.S();
                if (S != null) {
                    if (tLObject instanceof TLRPC.TL_boolTrue) {
                        vqaVar.dismiss();
                        gta.v(vqaVar.a, false).M(j);
                        if (j >= 0) {
                            TLRPC.UserFull W1 = na7.q1(vqaVar.a).W1(j2);
                            if (W1 != null) {
                                int max = Math.max(0, W1.stargifts_count - 1);
                                W1.stargifts_count = max;
                                if (max <= 0) {
                                    W1.flags2 &= -257;
                                }
                            }
                            gta.v(vqaVar.a, false).L();
                            gta.v(vqaVar.a, false).P(true);
                            if (!(S instanceof jva)) {
                                jva jvaVar = new jva();
                                jvaVar.whenFullyVisible(new sma(jvaVar, j3, (byte) 1));
                                S.presentFragment(jvaVar);
                                return;
                            }
                            u21.b0(S).I(2131624222, k96.M0(2131750205, null), k96.H(',', "Gift2Converted", (int) j3)).k(true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", -j);
                        bundle.putBoolean("start_from_monetization", true);
                        uxa uxaVar = new uxa(bundle);
                        ct0.g(vqaVar.a).h(j, true);
                        ct0.g(vqaVar.a).l(j);
                        uxaVar.whenFullyVisible(new sma(uxaVar, j3, (byte) 2));
                        S.presentFragment(uxaVar);
                        return;
                    } else if (tL_error != null) {
                        vqaVar.j().t(u21.W(tL_error.text), null).k(false);
                        return;
                    } else {
                        vqaVar.j().t(k96.M0(2131743640, null), null).k(false);
                        return;
                    }
                }
                return;
            default:
                vqa vqaVar2 = this.b;
                TLObject tLObject2 = this.c;
                long j4 = this.d;
                long j5 = this.e;
                p8c p8cVar = (p8c) this.n;
                TLRPC.TL_error tL_error2 = this.f;
                long j6 = this.h;
                if (tLObject2 instanceof TLRPC.TL_payments_paymentResult) {
                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                    na7.q1(vqaVar2.a).a4(tL_payments_paymentResult.updates.users, false);
                    na7.q1(vqaVar2.a).U3(tL_payments_paymentResult.updates.chats, false);
                    gta.v(vqaVar2.a, false).P(false);
                    gta.v(vqaVar2.a, false).M(j4);
                    gta.v(vqaVar2.a, false).M(j5);
                    gta.v(vqaVar2.a, false).L();
                    p8cVar.a(null);
                    d S2 = LaunchActivity.S();
                    if (S2 != null) {
                        if (j4 >= 0 && j5 >= 0) {
                            mu1 U9 = mu1.U9(j4);
                            U9.whenFullyVisible(new koa(vqaVar2, U9, j4, (byte) 1));
                            S2.presentFragment(U9);
                        } else {
                            m21 I = u21.b0(S2).I(2131624029, k96.M0(2131749881, null), gl.T2(k96.a0(null, null, 2131749882, vqaVar2.s1(), cf3.s(j4))));
                            I.t = true;
                            I.j();
                        }
                    }
                    Utilities.d.c(new ooa(vqaVar2, tL_payments_paymentResult, (byte) 1));
                    return;
                } else if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                    if (!na7.q1(vqaVar2.a).Z4()) {
                        vqaVar2.f2.setLoading(false);
                        gta.c0(vqaVar2.getContext(), vqaVar2.J0);
                        return;
                    }
                    gta v = gta.v(vqaVar2.a, false);
                    n30 n30Var = new n30(vqaVar2, j6, j4, p8cVar, (byte) 15);
                    v.e = false;
                    v.n(n30Var, false, true);
                    v.e = true;
                    return;
                } else {
                    p8cVar.a(tL_error2);
                    vqaVar2.j().g0(tL_error2, false);
                    return;
                }
        }
    }

    public goa(vqa vqaVar, TLObject tLObject, long j, long j2, p8c p8cVar, TLRPC.TL_error tL_error, long j3) {
        this.b = vqaVar;
        this.c = tLObject;
        this.d = j;
        this.e = j2;
        this.n = p8cVar;
        this.f = tL_error;
        this.h = j3;
    }
}
