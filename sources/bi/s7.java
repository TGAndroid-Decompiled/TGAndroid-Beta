package bi;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.fl0;
public final class s7 implements DialogInterface.OnDismissListener {
    public final int f5407a;
    public final Object f5408b;
    public final boolean[] f5409c;
    public final Object d;
    public final Object e;

    public s7(ca caVar, Utilities.Callback callback, boolean[] zArr, boolean[] zArr2, Object obj, int i10) {
        this.f5407a = i10;
        this.f5408b = callback;
        this.f5409c = zArr;
        this.d = zArr2;
        this.e = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f5407a) {
            case 0:
                Utilities.Callback callback = (Utilities.Callback) this.f5408b;
                boolean[] zArr = (boolean[]) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.e;
                if (callback != null && !this.f5409c[0]) {
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
                Utilities.Callback callback3 = (Utilities.Callback) this.f5408b;
                boolean[] zArr2 = (boolean[]) this.d;
                Utilities.Callback callback4 = (Utilities.Callback) this.e;
                if (callback3 != null && !this.f5409c[0]) {
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
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.f5408b;
                org.telegram.ui.ActionBar.k3[] k3VarArr = (org.telegram.ui.ActionBar.k3[]) this.d;
                org.telegram.ui.ActionBar.k3[] k3VarArr2 = (org.telegram.ui.ActionBar.k3[]) this.e;
                this.f5409c[0] = true;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0];
                if (inputtonconnectoauthsession != null) {
                    Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                    inputtonconnectoauthsessionArr[0] = null;
                }
                org.telegram.ui.ActionBar.k3 k3Var = k3VarArr[0];
                if (k3Var != null) {
                    k3Var.dismiss();
                    k3VarArr[0] = null;
                }
                fl0.f39397a = null;
                org.telegram.ui.ActionBar.k3 k3Var2 = k3VarArr2[0];
                if (k3Var2 != null) {
                    k3Var2.dismiss();
                    k3VarArr2[0] = null;
                    return;
                }
                return;
            default:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.f5408b;
                di.x7 x7Var = (di.x7) this.d;
                String str = (String) this.e;
                a1Var.getClass();
                boolean[] zArr3 = this.f5409c;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    a1Var.x(x7Var, "requested_chat_failed", org.telegram.ui.web.a1.A(str, "req_id"));
                    return;
                }
                return;
        }
    }

    public s7(org.telegram.ui.web.a1 a1Var, boolean[] zArr, di.x7 x7Var, String str) {
        this.f5407a = 3;
        this.f5408b = a1Var;
        this.f5409c = zArr;
        this.d = x7Var;
        this.e = str;
    }

    public s7(boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, org.telegram.ui.ActionBar.k3[] k3VarArr, org.telegram.ui.ActionBar.k3[] k3VarArr2) {
        this.f5407a = 2;
        this.f5409c = zArr;
        this.f5408b = inputtonconnectoauthsessionArr;
        this.d = k3VarArr;
        this.e = k3VarArr2;
    }
}
