package ai;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.xk0;
public final class w7 implements DialogInterface.OnDismissListener {
    public final int f2373a;
    public final Object f2374b;
    public final boolean[] f2375c;
    public final Object d;
    public final Object e;

    public w7(ha haVar, Utilities.Callback callback, boolean[] zArr, boolean[] zArr2, Object obj, int i10) {
        this.f2373a = i10;
        this.f2374b = callback;
        this.f2375c = zArr;
        this.d = zArr2;
        this.e = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f2373a) {
            case 0:
                Utilities.Callback callback = (Utilities.Callback) this.f2374b;
                boolean[] zArr = (boolean[]) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.e;
                if (callback != null && !this.f2375c[0]) {
                    callback.run(Boolean.FALSE);
                    if (!zArr[0]) {
                        callback2.run("cancelled", 0L);
                        zArr[0] = true;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                Utilities.Callback callback3 = (Utilities.Callback) this.f2374b;
                boolean[] zArr2 = (boolean[]) this.d;
                Utilities.Callback callback4 = (Utilities.Callback) this.e;
                if (callback3 != null && !this.f2375c[0]) {
                    callback3.run(Boolean.FALSE);
                    if (!zArr2[0] && callback4 != null) {
                        callback4.run("cancelled");
                        zArr2[0] = true;
                        return;
                    }
                    return;
                }
                return;
            case 2:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.f2374b;
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) this.d;
                org.telegram.ui.ActionBar.h3[] h3VarArr2 = (org.telegram.ui.ActionBar.h3[]) this.e;
                this.f2375c[0] = true;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0];
                if (inputtonconnectoauthsession != null) {
                    Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                    inputtonconnectoauthsessionArr[0] = null;
                }
                org.telegram.ui.ActionBar.h3 h3Var = h3VarArr[0];
                if (h3Var != null) {
                    h3Var.dismiss();
                    h3VarArr[0] = null;
                }
                xk0.f43614a = null;
                org.telegram.ui.ActionBar.h3 h3Var2 = h3VarArr2[0];
                if (h3Var2 != null) {
                    h3Var2.dismiss();
                    h3VarArr2[0] = null;
                    return;
                }
                return;
            default:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.f2374b;
                ci.y7 y7Var = (ci.y7) this.d;
                String str = (String) this.e;
                b1Var.getClass();
                boolean[] zArr3 = this.f2375c;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    b1Var.x(y7Var, "requested_chat_failed", org.telegram.ui.web.b1.A(str, "req_id"));
                    return;
                }
                return;
        }
    }

    public w7(org.telegram.ui.web.b1 b1Var, boolean[] zArr, ci.y7 y7Var, String str) {
        this.f2373a = 3;
        this.f2374b = b1Var;
        this.f2375c = zArr;
        this.d = y7Var;
        this.e = str;
    }

    public w7(boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, org.telegram.ui.ActionBar.h3[] h3VarArr, org.telegram.ui.ActionBar.h3[] h3VarArr2) {
        this.f2373a = 2;
        this.f2375c = zArr;
        this.f2374b = inputtonconnectoauthsessionArr;
        this.d = h3VarArr;
        this.e = h3VarArr2;
    }
}
