package defpackage;

import android.content.SharedPreferences;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.CancellationException;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
public final class hh6 implements zy2, OnSuccessListener, OnFailureListener {
    public final lh6 a;

    public hh6(lh6 lh6Var) {
        this.a = lh6Var;
    }

    @Override
    public final void g(wy2 wy2Var) {
        lh6 lh6Var = this.a;
        lh6Var.L = true;
        String str = wy2Var.c;
        lh6Var.a.setText(str);
        lh6Var.u(str, wy2Var);
        lh6Var.G = wy2Var;
        lh6Var.F = (byte) 0;
        lh6Var.L = false;
        SharedPreferences.Editor edit = oc7.d1().edit();
        edit.putString("phone_code_last_matched_" + wy2Var.c, wy2Var.d).apply();
        gm.d3(new ch6(lh6Var, (byte) 4), 300L);
        jh6 jh6Var = lh6Var.b;
        jh6Var.requestFocus();
        jh6Var.setSelection(jh6Var.length());
    }

    @Override
    public final void onFailure(Exception exc) {
        int i;
        lh6 lh6Var = this.a;
        mh6 mh6Var = lh6Var.h0;
        if (!lh6Var.a0) {
            if (exc instanceof ConnectionsManager.RequestException) {
                String message = exc.getMessage();
                if (message != null) {
                    if (message.contains("SESSION_PASSWORD_NEEDED")) {
                        TL_account.getPassword getpassword = new TL_account.getPassword();
                        i = ((d) mh6Var).currentAccount;
                        ConnectionsManager.getInstance(i).sendRequest(getpassword, new gh6(lh6Var, (byte) 1), 10);
                        return;
                    }
                    boolean z = e21.a;
                    new c41(mh6Var.a0, null).f0(message, false);
                }
            } else if (!(exc instanceof CancellationException)) {
                fc4.g(exc, true);
            }
            if (lh6Var.o()) {
                lh6Var.t(false);
            }
        }
    }

    @Override
    public final void onSuccess(Object obj) {
        TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
        lh6 lh6Var = this.a;
        mh6 mh6Var = lh6Var.h0;
        if (lh6Var.a0) {
            return;
        }
        if (auth_authorization instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
            TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) auth_authorization).terms_of_service;
            if (tL_help_termsOfService != null) {
                mh6Var.s0 = tL_help_termsOfService;
            }
            mh6Var.J1(5, true, ts2.l("fromFirebasePhoneNumberVerification", true), false);
        } else if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
            mh6Var.C1((TLRPC.TL_auth_authorization) auth_authorization, false);
        } else {
            lh6Var.t(false);
        }
    }
}
