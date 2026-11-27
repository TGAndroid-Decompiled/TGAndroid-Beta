package defpackage;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class p08 implements Runnable {
    public final byte a;
    public final r08 b;
    public final TLRPC.TL_error c;
    public final TLObject d;

    public p08(r08 r08Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = (byte) 0;
        this.b = r08Var;
        this.d = tLObject;
        this.c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                r08 r08Var = this.b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.c;
                b18 b18Var = r08Var.e;
                if (tLObject instanceof Vector) {
                    b18Var.E = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i = 0; i < size; i++) {
                        b18Var.E.values.add((TLRPC.TL_secureValue) vector.objects.get(i));
                    }
                    r08Var.a();
                    return;
                }
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    jj.u0(b18Var.getParentActivity(), ob6.M0(2131743475, null), true);
                } else {
                    b18Var.P1(ob6.M0(2131689472, null), tL_error.text);
                }
                b18Var.Q1(true, false);
                return;
            case 1:
                r08 r08Var2 = this.b;
                TLRPC.TL_error tL_error2 = this.c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    r08Var2.e.K = password;
                    TwoStepVerificationActivity.e0(password);
                    r08Var2.b();
                    return;
                }
                return;
            default:
                r08 r08Var3 = this.b;
                TLRPC.TL_error tL_error3 = this.c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    r08Var3.e.K = password2;
                    TwoStepVerificationActivity.e0(password2);
                    Utilities.e.c(new gd7(r08Var3, r08Var3.b, r08Var3.d, (byte) 19));
                    return;
                }
                return;
        }
    }

    public p08(r08 r08Var, TLRPC.TL_error tL_error, TLObject tLObject, byte b) {
        this.a = b;
        this.b = r08Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}
