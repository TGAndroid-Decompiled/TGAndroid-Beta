package di;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.messenger.r10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.gi0;
public final class n6 implements DialogInterface.OnDismissListener {
    public final int f9399a;
    public final Object f9400b;
    public final boolean[] f9401c;
    public final Object d;
    public final Object f9402e;

    public n6(y8 y8Var, y10 y10Var, boolean[] zArr, boolean[] zArr2, Object obj, int i7) {
        this.f9399a = i7;
        this.f9400b = y10Var;
        this.f9401c = zArr;
        this.d = zArr2;
        this.f9402e = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9399a) {
            case 0:
                y10 y10Var = (y10) this.f9400b;
                boolean[] zArr = (boolean[]) this.d;
                r10 r10Var = (r10) this.f9402e;
                if (y10Var != null && !this.f9401c[0]) {
                    y10Var.a(Boolean.FALSE);
                    if (!zArr[0]) {
                        r10Var.a("cancelled", 0L);
                        zArr[0] = true;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                y10 y10Var2 = (y10) this.f9400b;
                boolean[] zArr2 = (boolean[]) this.d;
                y10 y10Var3 = (y10) this.f9402e;
                if (y10Var2 != null && !this.f9401c[0]) {
                    y10Var2.a(Boolean.FALSE);
                    if (!zArr2[0] && y10Var3 != null) {
                        y10Var3.a("cancelled");
                        zArr2[0] = true;
                        return;
                    }
                    return;
                }
                return;
            case 2:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.f9400b;
                org.telegram.ui.ActionBar.w2[] w2VarArr = (org.telegram.ui.ActionBar.w2[]) this.d;
                org.telegram.ui.ActionBar.w2[] w2VarArr2 = (org.telegram.ui.ActionBar.w2[]) this.f9402e;
                this.f9401c[0] = true;
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
                gi0.f48124a = null;
                org.telegram.ui.ActionBar.w2 w2Var2 = w2VarArr2[0];
                if (w2Var2 != null) {
                    w2Var2.dismiss();
                    w2VarArr2[0] = null;
                    return;
                }
                return;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.f9400b;
                fi.f7 f7Var = (fi.f7) this.d;
                String str = (String) this.f9402e;
                v0Var.getClass();
                boolean[] zArr3 = this.f9401c;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    v0Var.x(f7Var, "requested_chat_failed", org.telegram.ui.web.v0.A(str, "req_id"));
                    return;
                }
                return;
        }
    }

    public n6(org.telegram.ui.web.v0 v0Var, boolean[] zArr, fi.f7 f7Var, String str) {
        this.f9399a = 3;
        this.f9400b = v0Var;
        this.f9401c = zArr;
        this.d = f7Var;
        this.f9402e = str;
    }

    public n6(boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, org.telegram.ui.ActionBar.w2[] w2VarArr, org.telegram.ui.ActionBar.w2[] w2VarArr2) {
        this.f9399a = 2;
        this.f9401c = zArr;
        this.f9400b = inputtonconnectoauthsessionArr;
        this.d = w2VarArr;
        this.f9402e = w2VarArr2;
    }
}
