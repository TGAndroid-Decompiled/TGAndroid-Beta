package ai;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.uk0;
public final class v7 implements DialogInterface.OnDismissListener {
    public final int f2313a;
    public final Object f2314b;
    public final boolean[] f2315c;
    public final Object d;
    public final Object e;

    public v7(ga gaVar, Utilities.Callback callback, boolean[] zArr, boolean[] zArr2, Object obj, int i10) {
        this.f2313a = i10;
        this.f2314b = callback;
        this.f2315c = zArr;
        this.d = zArr2;
        this.e = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f2313a) {
            case 0:
                Utilities.Callback callback = (Utilities.Callback) this.f2314b;
                boolean[] zArr = (boolean[]) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.e;
                if (callback != null && !this.f2315c[0]) {
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
                Utilities.Callback callback3 = (Utilities.Callback) this.f2314b;
                boolean[] zArr2 = (boolean[]) this.d;
                Utilities.Callback callback4 = (Utilities.Callback) this.e;
                if (callback3 != null && !this.f2315c[0]) {
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
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.f2314b;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.d;
                org.telegram.ui.ActionBar.f3[] f3VarArr2 = (org.telegram.ui.ActionBar.f3[]) this.e;
                this.f2315c[0] = true;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0];
                if (inputtonconnectoauthsession != null) {
                    Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                    inputtonconnectoauthsessionArr[0] = null;
                }
                org.telegram.ui.ActionBar.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    f3VarArr[0] = null;
                }
                uk0.f42005a = null;
                org.telegram.ui.ActionBar.f3 f3Var2 = f3VarArr2[0];
                if (f3Var2 != null) {
                    f3Var2.dismiss();
                    f3VarArr2[0] = null;
                    return;
                }
                return;
            default:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.f2314b;
                ci.z7 z7Var = (ci.z7) this.d;
                String str = (String) this.e;
                a1Var.getClass();
                boolean[] zArr3 = this.f2315c;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    a1Var.x(z7Var, "requested_chat_failed", org.telegram.ui.web.a1.A(str, "req_id"));
                    return;
                }
                return;
        }
    }

    public v7(org.telegram.ui.web.a1 a1Var, boolean[] zArr, ci.z7 z7Var, String str) {
        this.f2313a = 3;
        this.f2314b = a1Var;
        this.f2315c = zArr;
        this.d = z7Var;
        this.e = str;
    }

    public v7(boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, org.telegram.ui.ActionBar.f3[] f3VarArr, org.telegram.ui.ActionBar.f3[] f3VarArr2) {
        this.f2313a = 2;
        this.f2315c = zArr;
        this.f2314b = inputtonconnectoauthsessionArr;
        this.d = f3VarArr;
        this.e = f3VarArr2;
    }
}
