package ai;

import android.text.TextUtils;
import bi.l6;
import di.f6;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.lc;
public final class e implements q10 {
    public final int f1179a = 0;
    public final long f1180b;
    public final Object f1181c;
    public final Object d;
    public final Object f1182e;

    public e(h hVar, boolean[] zArr, long j3, f fVar) {
        this.f1181c = hVar;
        this.d = zArr;
        this.f1180b = j3;
        this.f1182e = fVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        String str;
        switch (this.f1179a) {
            case 0:
                boolean[] zArr = (boolean[]) this.d;
                f fVar = (f) this.f1182e;
                TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI = (TLRPC.TL_composedMessageWithAI) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ((h) this.f1181c).f1213b = -1;
                if (!zArr[0]) {
                    zArr[0] = true;
                    if (tL_composedMessageWithAI != null && (tL_textWithEntities = tL_composedMessageWithAI.result_text) != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                        org.telegram.messenger.g0.h3(new a1.e(10, fVar, tL_composedMessageWithAI), Math.max(0L, 900 - (System.currentTimeMillis() - this.f1180b)));
                        return;
                    } else {
                        fVar.c(tL_error, null);
                        return;
                    }
                }
                return;
            case 1:
                f6 f6Var = (f6) this.f1181c;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.d;
                bi.a2 a2Var = (bi.a2) this.f1182e;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (stargiftdepositpayload == null) {
                    u1Var.dismiss();
                    new lc(a2Var.f30193c, f6Var.J0).g0(tL_error2, false);
                    return;
                }
                di.o2 o2Var = new di.o2(f6Var, new boolean[1], u1Var, a2Var, this.f1180b, stargiftdepositpayload);
                c1.c cVar = new c1.c(29, r11, o2Var);
                org.telegram.messenger.g0.h3(cVar, 5000L);
                Runnable[] runnableArr = {org.telegram.ui.Wallet.u0.D(f6Var.f30187a).k(stargiftdepositpayload, new l6(1, cVar, o2Var))};
                return;
            default:
                boolean[] zArr2 = (boolean[]) this.d;
                bi.k2 k2Var = (bi.k2) this.f1181c;
                org.telegram.utils.twidget.d1 d1Var = (org.telegram.utils.twidget.d1) this.f1182e;
                TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (!zArr2[0]) {
                    int i7 = 1;
                    zArr2[0] = true;
                    org.telegram.messenger.g0.r(k2Var);
                    long j3 = this.f1180b;
                    if (tL_messages_botWidgetQueryAnswer != null) {
                        d1Var.b(0, org.telegram.utils.twidget.n0.C(tL_messages_botWidgetQueryAnswer.result), j3);
                        return;
                    }
                    if (tL_error3 != null) {
                        str = tL_error3.text;
                    } else {
                        str = "";
                    }
                    if (!"WIDGET_RESPONSE_TIMEOUT".equals(str)) {
                        if (str != null && str.startsWith("FLOOD_WAIT")) {
                            i7 = 2;
                        } else {
                            i7 = 3;
                        }
                    }
                    d1Var.b(i7, null, j3);
                    return;
                }
                return;
        }
    }

    public e(f6 f6Var, org.telegram.ui.ActionBar.u1 u1Var, bi.a2 a2Var, long j3) {
        this.f1181c = f6Var;
        this.d = u1Var;
        this.f1182e = a2Var;
        this.f1180b = j3;
    }

    public e(boolean[] zArr, bi.k2 k2Var, org.telegram.utils.twidget.d1 d1Var, long j3) {
        this.d = zArr;
        this.f1181c = k2Var;
        this.f1182e = d1Var;
        this.f1180b = j3;
    }
}
