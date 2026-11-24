package defpackage;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Wallet.c;
public final class tm3 implements jac {
    public final byte a = 1;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;

    public tm3(wm3 wm3Var, boolean[] zArr, long j, um3 um3Var) {
        this.c = wm3Var;
        this.d = zArr;
        this.b = j;
        this.e = um3Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        String str;
        byte b = this.a;
        int i = 1;
        long j = this.b;
        Object obj3 = this.e;
        Object obj4 = this.c;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                boolean[] zArr = (boolean[]) obj5;
                um3 um3Var = (um3) obj3;
                TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI = (TLRPC.TL_composedMessageWithAI) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ((wm3) obj4).b = -1;
                if (!zArr[0]) {
                    zArr[0] = true;
                    if (tL_composedMessageWithAI != null && (tL_textWithEntities = tL_composedMessageWithAI.result_text) != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                        gm.d3(new rd3(um3Var, tL_composedMessageWithAI, (byte) 15), Math.max(0L, 900 - (System.currentTimeMillis() - j)));
                        return;
                    } else {
                        um3Var.c(tL_error, null);
                        return;
                    }
                }
                return;
            case 1:
                hs6 hs6Var = (hs6) obj4;
                TL_aicompose.inputAiComposeStyle inputaicomposestyle = (TL_aicompose.inputAiComposeStyle) obj5;
                TL_aicompose.inputAiComposeStyle inputaicomposestyle2 = (TL_aicompose.inputAiComposeStyle) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 != null) {
                    fc4.d("aicompose.setChatStyle failed: " + tL_error2.text);
                    hs6Var.k();
                    if (hs6.j((TL_aicompose.inputAiComposeStyle) hs6Var.r1.f(j), inputaicomposestyle)) {
                        hs6Var.F1(j, inputaicomposestyle2);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                wsa wsaVar = (wsa) obj4;
                he heVar = (he) obj5;
                yw4 yw4Var = (yw4) obj3;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (stargiftdepositpayload == null) {
                    heVar.dismiss();
                    new c41(yw4Var.c, wsaVar.J0).g0(tL_error3, false);
                    return;
                }
                hs5 hs5Var = new hs5(wsaVar, new boolean[1], heVar, yw4Var, this.b, stargiftdepositpayload);
                e6a e6aVar = new e6a(r1, hs5Var, (byte) 16);
                gm.d3(e6aVar, 5000L);
                Runnable[] runnableArr = {c.C(wsaVar.a).j(stargiftdepositpayload, new s87(e6aVar, hs5Var, (byte) 11))};
                return;
            default:
                boolean[] zArr2 = (boolean[]) obj5;
                r97 r97Var = (r97) obj4;
                cyc cycVar = (cyc) obj3;
                TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    gm.r(r97Var);
                    if (tL_messages_botWidgetQueryAnswer != null) {
                        cycVar.b(0, wxc.D(tL_messages_botWidgetQueryAnswer.result), j);
                        return;
                    }
                    if (tL_error4 != null) {
                        str = tL_error4.text;
                    } else {
                        str = "";
                    }
                    if (!"WIDGET_RESPONSE_TIMEOUT".equals(str)) {
                        if (str != null && str.startsWith("FLOOD_WAIT")) {
                            i = 2;
                        } else {
                            i = 3;
                        }
                    }
                    cycVar.b(i, null, j);
                    return;
                }
                return;
        }
    }

    public tm3(hs6 hs6Var, long j, TL_aicompose.inputAiComposeStyle inputaicomposestyle, TL_aicompose.inputAiComposeStyle inputaicomposestyle2) {
        this.c = hs6Var;
        this.b = j;
        this.d = inputaicomposestyle;
        this.e = inputaicomposestyle2;
    }

    public tm3(wsa wsaVar, he heVar, yw4 yw4Var, long j) {
        this.c = wsaVar;
        this.d = heVar;
        this.e = yw4Var;
        this.b = j;
    }

    public tm3(boolean[] zArr, r97 r97Var, cyc cycVar, long j) {
        this.d = zArr;
        this.c = r97Var;
        this.e = cycVar;
        this.b = j;
    }
}
