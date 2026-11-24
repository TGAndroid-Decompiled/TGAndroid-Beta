package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.p;
public final class kz7 implements sz7 {
    public final p a;

    public kz7(p pVar) {
        this.a = pVar;
    }

    @Override
    public final void a(TL_account.Password password) {
        this.a.b0 = password;
    }

    @Override
    public final void b() {
        this.a.g0 = null;
    }

    @Override
    public final boolean c(String str, String str2, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        p pVar = this.a;
        sz7 sz7Var = pVar.U;
        if (sz7Var != null) {
            sz7Var.c(str, str2, z, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (pVar.T0) {
            pVar.removeSelfFromStack();
        }
        if (pVar.U != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
