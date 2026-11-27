package defpackage;

import android.content.SharedPreferences;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.CancellationException;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e;
public final class kh6 implements jy2, OnSuccessListener, OnFailureListener {
    public final ph6 a;

    public kh6(ph6 ph6Var) {
        this.a = ph6Var;
    }

    @Override
    public final void B(gy2 gy2Var) {
        ph6 ph6Var = this.a;
        ph6Var.L = true;
        String str = gy2Var.c;
        ph6Var.a.setText(str);
        ph6Var.u(str, gy2Var);
        ph6Var.G = gy2Var;
        ph6Var.F = (byte) 0;
        ph6Var.L = false;
        SharedPreferences.Editor edit = uc7.e1().edit();
        edit.putString("phone_code_last_matched_" + gy2Var.c, gy2Var.d).apply();
        hl.d3(new fh6(ph6Var, (byte) 4), 300L);
        mh6 mh6Var = ph6Var.b;
        mh6Var.requestFocus();
        mh6Var.setSelection(mh6Var.length());
    }

    @Override
    public final void onFailure(Exception exc) {
        int i;
        ph6 ph6Var = this.a;
        qh6 qh6Var = ph6Var.h0;
        if (!ph6Var.a0) {
            if (exc instanceof ConnectionsManager.RequestException) {
                String message = exc.getMessage();
                if (message != null) {
                    if (message.contains("SESSION_PASSWORD_NEEDED")) {
                        TL_account.getPassword getpassword = new TL_account.getPassword();
                        i = ((e) qh6Var).currentAccount;
                        ConnectionsManager.getInstance(i).sendRequest(getpassword, new jh6(ph6Var, (byte) 1), 10);
                        return;
                    }
                    boolean z = f11.a;
                    new d31(qh6Var.a0, null).f0(message, false);
                }
            } else if (!(exc instanceof CancellationException)) {
                cc4.g(exc, true);
            }
            if (ph6Var.o()) {
                ph6Var.t(false);
            }
        }
    }

    @Override
    public final void onSuccess(Object obj) {
        TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
        ph6 ph6Var = this.a;
        qh6 qh6Var = ph6Var.h0;
        if (ph6Var.a0) {
            return;
        }
        if (auth_authorization instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
            TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) auth_authorization).terms_of_service;
            if (tL_help_termsOfService != null) {
                qh6Var.s0 = tL_help_termsOfService;
            }
            qh6Var.J1(5, true, bs2.l("fromFirebasePhoneNumberVerification", true), false);
        } else if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
            qh6Var.C1((TLRPC.TL_auth_authorization) auth_authorization, false);
        } else {
            ph6Var.t(false);
        }
    }
}
