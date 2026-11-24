package defpackage;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class mg1 implements Runnable {
    public final byte a = 1;
    public final TLObject b;
    public final TLRPC.TL_error c;
    public final p8c d;

    public mg1(gta gtaVar, TLObject tLObject, TLRPC.TL_error tL_error, p8c p8cVar) {
        this.b = tLObject;
        this.c = tL_error;
        this.d = p8cVar;
    }

    @Override
    public final void run() {
        String str;
        byte b = this.a;
        p8c p8cVar = this.d;
        TLRPC.TL_error tL_error = this.c;
        TLObject tLObject = this.b;
        switch (b) {
            case 0:
                if (tLObject != null) {
                    p8cVar.a((TL_stories.TL_premium_boostsStatus) tLObject);
                    return;
                }
                d Q = LaunchActivity.Q();
                if (tL_error != null && Q != null && "CHANNEL_PRIVATE".equals(tL_error.text)) {
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity == null || !launchActivity.isFinishing()) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getResourceProvider(), Q.getContext());
                        String M0 = k96.M0(2131689472, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M0;
                        HashMap hashMap = new HashMap();
                        int i = bkb.K5;
                        hashMap.put("info1", Integer.valueOf(bkb.w0(null, i, false)));
                        hashMap.put("info2", Integer.valueOf(bkb.w0(null, i, false)));
                        alertDialog$Builder.l(2131624108, 52, bkb.w0(null, i, false), hashMap);
                        hdVar.X = true;
                        hdVar.S = k96.M0(2131752317, null);
                        hdVar.U = k96.M0(2131752429, null);
                        b00.t(null, 2131752029, alertDialog$Builder, null);
                    }
                } else {
                    u21.Y().g0(tL_error, false);
                }
                p8cVar.a(null);
                return;
            default:
                if (!(tLObject instanceof TLRPC.TL_payments_paymentFormStarGift)) {
                    if (tL_error == null) {
                        str = "NO_PAYMENT_FORM";
                    } else {
                        str = tL_error.text;
                    }
                    gta.c(str);
                    p8cVar.a(null);
                    return;
                }
                p8cVar.a((TLRPC.TL_payments_paymentFormStarGift) tLObject);
                return;
        }
    }

    public mg1(TLObject tLObject, p8c p8cVar, TLRPC.TL_error tL_error) {
        this.b = tLObject;
        this.d = p8cVar;
        this.c = tL_error;
    }
}
