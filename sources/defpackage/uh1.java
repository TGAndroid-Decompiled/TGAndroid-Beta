package defpackage;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class uh1 implements Runnable {
    public final byte a = 1;
    public final TLObject b;
    public final TLRPC.TL_error c;
    public final qac d;

    public uh1(jva jvaVar, TLObject tLObject, TLRPC.TL_error tL_error, qac qacVar) {
        this.b = tLObject;
        this.c = tL_error;
        this.d = qacVar;
    }

    @Override
    public final void run() {
        String str;
        byte b = this.a;
        qac qacVar = this.d;
        TLRPC.TL_error tL_error = this.c;
        TLObject tLObject = this.b;
        switch (b) {
            case 0:
                if (tLObject != null) {
                    qacVar.a((TL_stories.TL_premium_boostsStatus) tLObject);
                    return;
                }
                d Q = LaunchActivity.Q();
                if (tL_error != null && Q != null && "CHANNEL_PRIVATE".equals(tL_error.text)) {
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity == null || !launchActivity.isFinishing()) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getResourceProvider(), Q.getContext());
                        String M0 = jb6.M0(2131689472, null);
                        he heVar = alertDialog$Builder.a;
                        heVar.S = M0;
                        HashMap hashMap = new HashMap();
                        int i = cmb.K5;
                        hashMap.put("info1", Integer.valueOf(cmb.w0(null, i, false)));
                        hashMap.put("info2", Integer.valueOf(cmb.w0(null, i, false)));
                        alertDialog$Builder.l(2131624108, 52, cmb.w0(null, i, false), hashMap);
                        heVar.X = true;
                        heVar.S = jb6.M0(2131752271, null);
                        heVar.U = jb6.M0(2131752387, null);
                        b10.t(null, 2131751978, alertDialog$Builder, null);
                    }
                } else {
                    c41.Y().g0(tL_error, false);
                }
                qacVar.a(null);
                return;
            default:
                if (!(tLObject instanceof TLRPC.TL_payments_paymentFormStarGift)) {
                    if (tL_error == null) {
                        str = "NO_PAYMENT_FORM";
                    } else {
                        str = tL_error.text;
                    }
                    jva.c(str);
                    qacVar.a(null);
                    return;
                }
                qacVar.a((TLRPC.TL_payments_paymentFormStarGift) tLObject);
                return;
        }
    }

    public uh1(TLObject tLObject, qac qacVar, TLRPC.TL_error tL_error) {
        this.b = tLObject;
        this.d = qacVar;
        this.c = tL_error;
    }
}
