package defpackage;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class mz7 implements Runnable {
    public final byte a;
    public final nz7 b;
    public final TLRPC.TL_error c;
    public final TLObject d;

    public mz7(nz7 nz7Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = (byte) 0;
        this.b = nz7Var;
        this.d = tLObject;
        this.c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                nz7 nz7Var = this.b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.c;
                xz7 xz7Var = nz7Var.e;
                if (tLObject instanceof Vector) {
                    xz7Var.E = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i = 0; i < size; i++) {
                        xz7Var.E.values.add((TLRPC.TL_secureValue) vector.objects.get(i));
                    }
                    nz7Var.a();
                    return;
                }
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    ik.u0(xz7Var.getParentActivity(), jb6.M0(2131743507, null), true);
                } else {
                    xz7Var.P1(jb6.M0(2131689472, null), tL_error.text);
                }
                xz7Var.Q1(true, false);
                return;
            case 1:
                nz7 nz7Var2 = this.b;
                TLRPC.TL_error tL_error2 = this.c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    nz7Var2.e.K = password;
                    TwoStepVerificationActivity.f0(password);
                    nz7Var2.b();
                    return;
                }
                return;
            default:
                nz7 nz7Var3 = this.b;
                TLRPC.TL_error tL_error3 = this.c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    nz7Var3.e.K = password2;
                    TwoStepVerificationActivity.f0(password2);
                    Utilities.e.c(new ud7((byte) 14, nz7Var3, nz7Var3.b, nz7Var3.d));
                    return;
                }
                return;
        }
    }

    public mz7(nz7 nz7Var, TLRPC.TL_error tL_error, TLObject tLObject, byte b) {
        this.a = b;
        this.b = nz7Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}
