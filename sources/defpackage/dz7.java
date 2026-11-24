package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.p;
public final class dz7 implements sz7 {
    public final p a;

    public dz7(p pVar) {
        this.a = pVar;
    }

    @Override
    public final boolean c(String str, String str2, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        p pVar = this.a;
        pVar.J0 = tL_payments_validateRequestedInfo;
        pVar.G0(tL_payments_validateRequestedInfo.info);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void a(TL_account.Password password) {
    }
}
