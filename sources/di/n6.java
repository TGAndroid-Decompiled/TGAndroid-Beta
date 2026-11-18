package di;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.messenger.q10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.gi0;
public final class n6 implements DialogInterface.OnDismissListener {
    public final int f9377a;
    public final Object f9378b;
    public final boolean[] f9379c;
    public final Object d;
    public final Object f9380e;

    public n6(x8 x8Var, x10 x10Var, boolean[] zArr, boolean[] zArr2, Object obj, int i7) {
        this.f9377a = i7;
        this.f9378b = x10Var;
        this.f9379c = zArr;
        this.d = zArr2;
        this.f9380e = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9377a) {
            case 0:
                x10 x10Var = (x10) this.f9378b;
                boolean[] zArr = (boolean[]) this.d;
                q10 q10Var = (q10) this.f9380e;
                if (x10Var != null && !this.f9379c[0]) {
                    x10Var.a(Boolean.FALSE);
                    if (!zArr[0]) {
                        q10Var.a("cancelled", 0L);
                        zArr[0] = true;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                x10 x10Var2 = (x10) this.f9378b;
                boolean[] zArr2 = (boolean[]) this.d;
                x10 x10Var3 = (x10) this.f9380e;
                if (x10Var2 != null && !this.f9379c[0]) {
                    x10Var2.a(Boolean.FALSE);
                    if (!zArr2[0] && x10Var3 != null) {
                        x10Var3.a("cancelled");
                        zArr2[0] = true;
                        return;
                    }
                    return;
                }
                return;
            case 2:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.f9378b;
                org.telegram.ui.ActionBar.x2[] x2VarArr = (org.telegram.ui.ActionBar.x2[]) this.d;
                org.telegram.ui.ActionBar.x2[] x2VarArr2 = (org.telegram.ui.ActionBar.x2[]) this.f9380e;
                this.f9379c[0] = true;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0];
                if (inputtonconnectoauthsession != null) {
                    Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                    inputtonconnectoauthsessionArr[0] = null;
                }
                org.telegram.ui.ActionBar.x2 x2Var = x2VarArr[0];
                if (x2Var != null) {
                    x2Var.dismiss();
                    x2VarArr[0] = null;
                }
                gi0.f48115a = null;
                org.telegram.ui.ActionBar.x2 x2Var2 = x2VarArr2[0];
                if (x2Var2 != null) {
                    x2Var2.dismiss();
                    x2VarArr2[0] = null;
                    return;
                }
                return;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.f9378b;
                fi.f7 f7Var = (fi.f7) this.d;
                String str = (String) this.f9380e;
                v0Var.getClass();
                boolean[] zArr3 = this.f9379c;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    v0Var.x(f7Var, "requested_chat_failed", org.telegram.ui.web.v0.A(str, "req_id"));
                    return;
                }
                return;
        }
    }

    public n6(org.telegram.ui.web.v0 v0Var, boolean[] zArr, fi.f7 f7Var, String str) {
        this.f9377a = 3;
        this.f9378b = v0Var;
        this.f9379c = zArr;
        this.d = f7Var;
        this.f9380e = str;
    }

    public n6(boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, org.telegram.ui.ActionBar.x2[] x2VarArr, org.telegram.ui.ActionBar.x2[] x2VarArr2) {
        this.f9377a = 2;
        this.f9379c = zArr;
        this.f9378b = inputtonconnectoauthsessionArr;
        this.d = x2VarArr;
        this.f9380e = x2VarArr2;
    }
}
