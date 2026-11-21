package ai;

import android.text.TextUtils;
import bi.p6;
import di.f6;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.lc;
public final class e implements q10 {
    public final int f1150a = 0;
    public final long f1151b;
    public final Object f1152c;
    public final Object d;
    public final Object f1153e;

    public e(h hVar, boolean[] zArr, long j3, f fVar) {
        this.f1152c = hVar;
        this.d = zArr;
        this.f1151b = j3;
        this.f1153e = fVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        String str;
        switch (this.f1150a) {
            case 0:
                boolean[] zArr = (boolean[]) this.d;
                f fVar = (f) this.f1153e;
                TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI = (TLRPC.TL_composedMessageWithAI) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ((h) this.f1152c).f1214b = -1;
                if (!zArr[0]) {
                    zArr[0] = true;
                    if (tL_composedMessageWithAI != null && (tL_textWithEntities = tL_composedMessageWithAI.result_text) != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                        org.telegram.messenger.g0.h3(new a1.e(10, fVar, tL_composedMessageWithAI), Math.max(0L, 900 - (System.currentTimeMillis() - this.f1151b)));
                        return;
                    } else {
                        fVar.c(tL_error, null);
                        return;
                    }
                }
                return;
            case 1:
                f6 f6Var = (f6) this.f1152c;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.d;
                bi.e2 e2Var = (bi.e2) this.f1153e;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (stargiftdepositpayload == null) {
                    t1Var.dismiss();
                    new lc(e2Var.f30176c, f6Var.J0).g0(tL_error2, false);
                    return;
                }
                di.p2 p2Var = new di.p2(f6Var, new boolean[1], t1Var, e2Var, this.f1151b, stargiftdepositpayload);
                di.f2 f2Var = new di.f2(1, r11, p2Var);
                org.telegram.messenger.g0.h3(f2Var, 5000L);
                Runnable[] runnableArr = {org.telegram.ui.Wallet.u0.D(f6Var.f30170a).k(stargiftdepositpayload, new p6(1, f2Var, p2Var))};
                return;
            default:
                boolean[] zArr2 = (boolean[]) this.d;
                bi.o2 o2Var = (bi.o2) this.f1152c;
                org.telegram.utils.twidget.d1 d1Var = (org.telegram.utils.twidget.d1) this.f1153e;
                TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (!zArr2[0]) {
                    int i7 = 1;
                    zArr2[0] = true;
                    org.telegram.messenger.g0.r(o2Var);
                    long j3 = this.f1151b;
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

    public e(f6 f6Var, org.telegram.ui.ActionBar.t1 t1Var, bi.e2 e2Var, long j3) {
        this.f1152c = f6Var;
        this.d = t1Var;
        this.f1153e = e2Var;
        this.f1151b = j3;
    }

    public e(boolean[] zArr, bi.o2 o2Var, org.telegram.utils.twidget.d1 d1Var, long j3) {
        this.d = zArr;
        this.f1152c = o2Var;
        this.f1153e = d1Var;
        this.f1151b = j3;
    }
}
