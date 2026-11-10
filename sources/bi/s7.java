package bi;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.messenger.c20;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ei0;
public final class s7 implements DialogInterface.OnDismissListener {
    public final int f4692a;
    public final Object f4693b;
    public final boolean[] f4694c;
    public final Object d;
    public final Object f4695e;

    public s7(ea eaVar, c20 c20Var, boolean[] zArr, boolean[] zArr2, Object obj, int i7) {
        this.f4692a = i7;
        this.f4693b = c20Var;
        this.f4694c = zArr;
        this.d = zArr2;
        this.f4695e = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f4692a) {
            case 0:
                c20 c20Var = (c20) this.f4693b;
                boolean[] zArr = (boolean[]) this.d;
                v10 v10Var = (v10) this.f4695e;
                if (c20Var != null && !this.f4694c[0]) {
                    c20Var.a(Boolean.FALSE);
                    if (!zArr[0]) {
                        v10Var.a("cancelled", 0L);
                        zArr[0] = true;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                c20 c20Var2 = (c20) this.f4693b;
                boolean[] zArr2 = (boolean[]) this.d;
                c20 c20Var3 = (c20) this.f4695e;
                if (c20Var2 != null && !this.f4694c[0]) {
                    c20Var2.a(Boolean.FALSE);
                    if (!zArr2[0] && c20Var3 != null) {
                        c20Var3.a("cancelled");
                        zArr2[0] = true;
                        return;
                    }
                    return;
                }
                return;
            case 2:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.f4693b;
                org.telegram.ui.ActionBar.w2[] w2VarArr = (org.telegram.ui.ActionBar.w2[]) this.d;
                org.telegram.ui.ActionBar.w2[] w2VarArr2 = (org.telegram.ui.ActionBar.w2[]) this.f4695e;
                this.f4694c[0] = true;
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
                ei0.f45313a = null;
                org.telegram.ui.ActionBar.w2 w2Var2 = w2VarArr2[0];
                if (w2Var2 != null) {
                    w2Var2.dismiss();
                    w2VarArr2[0] = null;
                    return;
                }
                return;
            default:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.f4693b;
                di.p7 p7Var = (di.p7) this.d;
                String str = (String) this.f4695e;
                x0Var.getClass();
                boolean[] zArr3 = this.f4694c;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    x0Var.x(p7Var, "requested_chat_failed", org.telegram.ui.web.x0.A(str, "req_id"));
                    return;
                }
                return;
        }
    }

    public s7(org.telegram.ui.web.x0 x0Var, boolean[] zArr, di.p7 p7Var, String str) {
        this.f4692a = 3;
        this.f4693b = x0Var;
        this.f4694c = zArr;
        this.d = p7Var;
        this.f4695e = str;
    }

    public s7(boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, org.telegram.ui.ActionBar.w2[] w2VarArr, org.telegram.ui.ActionBar.w2[] w2VarArr2) {
        this.f4692a = 2;
        this.f4694c = zArr;
        this.f4693b = inputtonconnectoauthsessionArr;
        this.d = w2VarArr;
        this.f4695e = w2VarArr2;
    }
}
