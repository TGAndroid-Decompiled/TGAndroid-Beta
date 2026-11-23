package di;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.messenger.p10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ei0;
public final class n6 implements DialogInterface.OnDismissListener {
    public final int f9360a;
    public final Object f9361b;
    public final boolean[] f9362c;
    public final Object d;
    public final Object f9363e;

    public n6(y8 y8Var, w10 w10Var, boolean[] zArr, boolean[] zArr2, Object obj, int i7) {
        this.f9360a = i7;
        this.f9361b = w10Var;
        this.f9362c = zArr;
        this.d = zArr2;
        this.f9363e = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9360a) {
            case 0:
                w10 w10Var = (w10) this.f9361b;
                boolean[] zArr = (boolean[]) this.d;
                p10 p10Var = (p10) this.f9363e;
                if (w10Var != null && !this.f9362c[0]) {
                    w10Var.a(Boolean.FALSE);
                    if (!zArr[0]) {
                        p10Var.a("cancelled", 0L);
                        zArr[0] = true;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                w10 w10Var2 = (w10) this.f9361b;
                boolean[] zArr2 = (boolean[]) this.d;
                w10 w10Var3 = (w10) this.f9363e;
                if (w10Var2 != null && !this.f9362c[0]) {
                    w10Var2.a(Boolean.FALSE);
                    if (!zArr2[0] && w10Var3 != null) {
                        w10Var3.a("cancelled");
                        zArr2[0] = true;
                        return;
                    }
                    return;
                }
                return;
            case 2:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.f9361b;
                org.telegram.ui.ActionBar.w2[] w2VarArr = (org.telegram.ui.ActionBar.w2[]) this.d;
                org.telegram.ui.ActionBar.w2[] w2VarArr2 = (org.telegram.ui.ActionBar.w2[]) this.f9363e;
                this.f9362c[0] = true;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0];
                if (inputtonconnectoauthsession != null) {
                    Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                    inputtonconnectoauthsessionArr[0] = null;
                }
                org.telegram.ui.ActionBar.w2 w2Var = w2VarArr[0];
                if (w2Var != null) {
                    w2Var.dismiss();
                    w2VarArr[0] = null;
                }
                ei0.f47562a = null;
                org.telegram.ui.ActionBar.w2 w2Var2 = w2VarArr2[0];
                if (w2Var2 != null) {
                    w2Var2.dismiss();
                    w2VarArr2[0] = null;
                    return;
                }
                return;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.f9361b;
                fi.f7 f7Var = (fi.f7) this.d;
                String str = (String) this.f9363e;
                v0Var.getClass();
                boolean[] zArr3 = this.f9362c;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    v0Var.x(f7Var, "requested_chat_failed", org.telegram.ui.web.v0.A(str, "req_id"));
                    return;
                }
                return;
        }
    }

    public n6(org.telegram.ui.web.v0 v0Var, boolean[] zArr, fi.f7 f7Var, String str) {
        this.f9360a = 3;
        this.f9361b = v0Var;
        this.f9362c = zArr;
        this.d = f7Var;
        this.f9363e = str;
    }

    public n6(boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, org.telegram.ui.ActionBar.w2[] w2VarArr, org.telegram.ui.ActionBar.w2[] w2VarArr2) {
        this.f9360a = 2;
        this.f9362c = zArr;
        this.f9361b = inputtonconnectoauthsessionArr;
        this.d = w2VarArr;
        this.f9363e = w2VarArr2;
    }
}
