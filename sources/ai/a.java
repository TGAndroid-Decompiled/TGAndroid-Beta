package ai;

import android.text.TextUtils;
import bi.r6;
import di.f6;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.kc;
public final class a implements p10 {
    public final int f1111a = 0;
    public final long f1112b;
    public final Object f1113c;
    public final Object d;
    public final Object f1114e;

    public a(d dVar, boolean[] zArr, long j3, b bVar) {
        this.f1113c = dVar;
        this.d = zArr;
        this.f1112b = j3;
        this.f1114e = bVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        String str;
        switch (this.f1111a) {
            case 0:
                boolean[] zArr = (boolean[]) this.d;
                b bVar = (b) this.f1114e;
                TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI = (TLRPC.TL_composedMessageWithAI) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ((d) this.f1113c).f1158b = -1;
                if (!zArr[0]) {
                    zArr[0] = true;
                    if (tL_composedMessageWithAI != null && (tL_textWithEntities = tL_composedMessageWithAI.result_text) != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                        org.telegram.messenger.g0.h3(new a1.e(8, bVar, tL_composedMessageWithAI), Math.max(0L, 900 - (System.currentTimeMillis() - this.f1112b)));
                        return;
                    } else {
                        bVar.b(tL_error, null);
                        return;
                    }
                }
                return;
            case 1:
                f6 f6Var = (f6) this.f1113c;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.d;
                bi.f2 f2Var = (bi.f2) this.f1114e;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (stargiftdepositpayload == null) {
                    t1Var.dismiss();
                    new kc(f2Var.f30229c, f6Var.J0).g0(tL_error2, false);
                    return;
                }
                di.p2 p2Var = new di.p2(f6Var, new boolean[1], t1Var, f2Var, this.f1112b, stargiftdepositpayload);
                di.f2 f2Var2 = new di.f2(1, r11, p2Var);
                org.telegram.messenger.g0.h3(f2Var2, 5000L);
                Runnable[] runnableArr = {org.telegram.ui.Wallet.v0.D(f6Var.f30223a).k(stargiftdepositpayload, new r6(1, f2Var2, p2Var))};
                return;
            default:
                boolean[] zArr2 = (boolean[]) this.d;
                bi.q2 q2Var = (bi.q2) this.f1113c;
                org.telegram.utils.twidget.d1 d1Var = (org.telegram.utils.twidget.d1) this.f1114e;
                TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (!zArr2[0]) {
                    int i7 = 1;
                    zArr2[0] = true;
                    org.telegram.messenger.g0.r(q2Var);
                    long j3 = this.f1112b;
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

    public a(f6 f6Var, org.telegram.ui.ActionBar.t1 t1Var, bi.f2 f2Var, long j3) {
        this.f1113c = f6Var;
        this.d = t1Var;
        this.f1114e = f2Var;
        this.f1112b = j3;
    }

    public a(boolean[] zArr, bi.q2 q2Var, org.telegram.utils.twidget.d1 d1Var, long j3) {
        this.d = zArr;
        this.f1113c = q2Var;
        this.f1114e = d1Var;
        this.f1112b = j3;
    }
}
