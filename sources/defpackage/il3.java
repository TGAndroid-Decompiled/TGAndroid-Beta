package defpackage;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Wallet.c;
public final class il3 implements i8c {
    public final byte a = 1;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;

    public il3(ll3 ll3Var, boolean[] zArr, long j, jl3 jl3Var) {
        this.c = ll3Var;
        this.d = zArr;
        this.b = j;
        this.e = jl3Var;
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
                jl3 jl3Var = (jl3) obj3;
                TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI = (TLRPC.TL_composedMessageWithAI) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ((ll3) obj4).b = -1;
                if (!zArr[0]) {
                    zArr[0] = true;
                    if (tL_composedMessageWithAI != null && (tL_textWithEntities = tL_composedMessageWithAI.result_text) != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                        gl.e3(new wc3(jl3Var, tL_composedMessageWithAI, (byte) 14), Math.max(0L, 900 - (System.currentTimeMillis() - j)));
                        return;
                    } else {
                        jl3Var.c(tL_error, null);
                        return;
                    }
                }
                return;
            case 1:
                hq6 hq6Var = (hq6) obj4;
                TL_aicompose.inputAiComposeStyle inputaicomposestyle = (TL_aicompose.inputAiComposeStyle) obj5;
                TL_aicompose.inputAiComposeStyle inputaicomposestyle2 = (TL_aicompose.inputAiComposeStyle) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 != null) {
                    fa4.d("aicompose.setChatStyle failed: " + tL_error2.text);
                    hq6Var.k();
                    if (hq6.j((TL_aicompose.inputAiComposeStyle) hq6Var.r1.f(j), inputaicomposestyle)) {
                        hq6Var.F1(j, inputaicomposestyle2);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                vqa vqaVar = (vqa) obj4;
                hd hdVar = (hd) obj5;
                xu4 xu4Var = (xu4) obj3;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (stargiftdepositpayload == null) {
                    hdVar.dismiss();
                    new u21(xu4Var.c, vqaVar.J0).g0(tL_error3, false);
                    return;
                }
                jq5 jq5Var = new jq5(vqaVar, new boolean[1], hdVar, xu4Var, this.b, stargiftdepositpayload);
                t7a t7aVar = new t7a(r1, jq5Var, (byte) 14);
                gl.e3(t7aVar, 5000L);
                Runnable[] runnableArr = {c.C(vqaVar.a).j(stargiftdepositpayload, new w77(t7aVar, jq5Var, (byte) 9))};
                return;
            default:
                boolean[] zArr2 = (boolean[]) obj5;
                o77 o77Var = (o77) obj4;
                bwc bwcVar = (bwc) obj3;
                TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    gl.r(o77Var);
                    if (tL_messages_botWidgetQueryAnswer != null) {
                        bwcVar.b(0, vvc.C(tL_messages_botWidgetQueryAnswer.result), j);
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
                    bwcVar.b(i, null, j);
                    return;
                }
                return;
        }
    }

    public il3(hq6 hq6Var, long j, TL_aicompose.inputAiComposeStyle inputaicomposestyle, TL_aicompose.inputAiComposeStyle inputaicomposestyle2) {
        this.c = hq6Var;
        this.b = j;
        this.d = inputaicomposestyle;
        this.e = inputaicomposestyle2;
    }

    public il3(vqa vqaVar, hd hdVar, xu4 xu4Var, long j) {
        this.c = vqaVar;
        this.d = hdVar;
        this.e = xu4Var;
        this.b = j;
    }

    public il3(boolean[] zArr, o77 o77Var, bwc bwcVar, long j) {
        this.d = zArr;
        this.c = o77Var;
        this.e = bwcVar;
        this.b = j;
    }
}
