package defpackage;

import android.content.SharedPreferences;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.CancellationException;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
public final class gf6 implements px2, OnSuccessListener, OnFailureListener {
    public final lf6 a;

    public gf6(lf6 lf6Var) {
        this.a = lf6Var;
    }

    @Override
    public final void onFailure(Exception exc) {
        int i;
        lf6 lf6Var = this.a;
        mf6 mf6Var = lf6Var.h0;
        if (!lf6Var.a0) {
            if (exc instanceof ConnectionsManager.RequestException) {
                String message = exc.getMessage();
                if (message != null) {
                    if (message.contains("SESSION_PASSWORD_NEEDED")) {
                        TL_account.getPassword getpassword = new TL_account.getPassword();
                        i = ((d) mf6Var).currentAccount;
                        ConnectionsManager.getInstance(i).sendRequest(getpassword, new ff6(lf6Var, (byte) 1), 10);
                        return;
                    }
                    boolean z = w01.a;
                    new u21(mf6Var.a0, null).f0(message, false);
                }
            } else if (!(exc instanceof CancellationException)) {
                fa4.g(exc, true);
            }
            if (lf6Var.o()) {
                lf6Var.t(false);
            }
        }
    }

    @Override
    public final void onSuccess(Object obj) {
        TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
        lf6 lf6Var = this.a;
        mf6 mf6Var = lf6Var.h0;
        if (lf6Var.a0) {
            return;
        }
        if (auth_authorization instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
            TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) auth_authorization).terms_of_service;
            if (tL_help_termsOfService != null) {
                mf6Var.s0 = tL_help_termsOfService;
            }
            mf6Var.I1(5, true, ir2.l("fromFirebasePhoneNumberVerification", true), false);
        } else if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
            mf6Var.B1((TLRPC.TL_auth_authorization) auth_authorization, false);
        } else {
            lf6Var.t(false);
        }
    }

    @Override
    public final void z(mx2 mx2Var) {
        lf6 lf6Var = this.a;
        lf6Var.L = true;
        String str = mx2Var.c;
        lf6Var.a.setText(str);
        lf6Var.u(str, mx2Var);
        lf6Var.G = mx2Var;
        lf6Var.F = (byte) 0;
        lf6Var.L = false;
        SharedPreferences.Editor edit = na7.c1().edit();
        edit.putString("phone_code_last_matched_" + mx2Var.c, mx2Var.d).apply();
        gl.d3(new bf6(lf6Var, (byte) 4), 300L);
        if6 if6Var = lf6Var.b;
        if6Var.requestFocus();
        if6Var.setSelection(if6Var.length());
    }
}
