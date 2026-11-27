package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.p;
public final class p28 implements y28 {
    public final Runnable a;
    public final p b;

    public p28(p pVar, Runnable runnable) {
        this.b = pVar;
        this.a = runnable;
    }

    @Override
    public final boolean c(String str, String str2, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        p pVar = this.b;
        pVar.z0 = tL_paymentSavedCredentialsCard;
        pVar.x0 = str;
        pVar.V0 = z;
        pVar.y0 = str2;
        pVar.K0 = tL_inputPaymentCredentialsGooglePay;
        dlb[] dlbVarArr = pVar.Z;
        dlb dlbVar = dlbVarArr[0];
        if (dlbVar != null) {
            dlbVar.setVisibility(0);
            dlb dlbVar2 = dlbVarArr[0];
            String str4 = pVar.y0;
            if (str4 != null && str4.length() > 1) {
                str3 = pVar.y0.substring(0, 1).toUpperCase() + pVar.y0.substring(1);
            } else {
                str3 = pVar.y0;
            }
            dlbVar2.b(2131232278, str3, ob6.M0(2131747141, null), true);
            dlb dlbVar3 = dlbVarArr[1];
            if (dlbVar3 != null) {
                dlbVar3.setVisibility(0);
            }
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
        return false;
    }

    @Override
    public final void b() {
    }

    @Override
    public final void a(TL_account.Password password) {
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
