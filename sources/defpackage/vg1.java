package defpackage;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class vg1 implements Runnable {
    public final byte a = 1;
    public final TLObject b;
    public final TLRPC.TL_error c;
    public final pcc d;

    public vg1(jxa jxaVar, TLObject tLObject, TLRPC.TL_error tL_error, pcc pccVar) {
        this.b = tLObject;
        this.c = tL_error;
        this.d = pccVar;
    }

    @Override
    public final void run() {
        String str;
        byte b = this.a;
        pcc pccVar = this.d;
        TLRPC.TL_error tL_error = this.c;
        TLObject tLObject = this.b;
        switch (b) {
            case 0:
                if (tLObject != null) {
                    pccVar.a((TL_stories.TL_premium_boostsStatus) tLObject);
                    return;
                }
                e Q = LaunchActivity.Q();
                if (tL_error != null && Q != null && "CHANNEL_PRIVATE".equals(tL_error.text)) {
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity == null || !launchActivity.isFinishing()) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getResourceProvider(), Q.getContext());
                        String M0 = ob6.M0(2131689472, null);
                        id idVar = alertDialog$Builder.a;
                        idVar.S = M0;
                        HashMap hashMap = new HashMap();
                        int i = aob.L5;
                        hashMap.put("info1", Integer.valueOf(aob.w0(null, i, false)));
                        hashMap.put("info2", Integer.valueOf(aob.w0(null, i, false)));
                        alertDialog$Builder.l(2131624108, 52, aob.w0(null, i, false), hashMap);
                        idVar.X = true;
                        idVar.S = ob6.M0(2131752299, null);
                        idVar.U = ob6.M0(2131752415, null);
                        c00.u(null, 2131752006, alertDialog$Builder, null);
                    }
                } else {
                    d31.Y().g0(tL_error, false);
                }
                pccVar.a(null);
                return;
            default:
                if (!(tLObject instanceof TLRPC.TL_payments_paymentFormStarGift)) {
                    if (tL_error == null) {
                        str = "NO_PAYMENT_FORM";
                    } else {
                        str = tL_error.text;
                    }
                    jxa.c(str);
                    pccVar.a(null);
                    return;
                }
                pccVar.a((TLRPC.TL_payments_paymentFormStarGift) tLObject);
                return;
        }
    }

    public vg1(TLObject tLObject, pcc pccVar, TLRPC.TL_error tL_error) {
        this.b = tLObject;
        this.d = pccVar;
        this.c = tL_error;
    }
}
