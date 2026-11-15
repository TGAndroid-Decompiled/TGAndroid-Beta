package di;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.di0;
public final class k6 implements DialogInterface.OnDismissListener {
    public final int f8912a;
    public final Object f8913b;
    public final boolean[] f8914c;
    public final Object d;
    public final Object f8915e;

    public k6(u8 u8Var, z10 z10Var, boolean[] zArr, boolean[] zArr2, Object obj, int i7) {
        this.f8912a = i7;
        this.f8913b = z10Var;
        this.f8914c = zArr;
        this.d = zArr2;
        this.f8915e = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f8912a) {
            case 0:
                z10 z10Var = (z10) this.f8913b;
                boolean[] zArr = (boolean[]) this.d;
                s10 s10Var = (s10) this.f8915e;
                if (z10Var != null && !this.f8914c[0]) {
                    z10Var.a(Boolean.FALSE);
                    if (!zArr[0]) {
                        s10Var.a("cancelled", 0L);
                        zArr[0] = true;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                z10 z10Var2 = (z10) this.f8913b;
                boolean[] zArr2 = (boolean[]) this.d;
                z10 z10Var3 = (z10) this.f8915e;
                if (z10Var2 != null && !this.f8914c[0]) {
                    z10Var2.a(Boolean.FALSE);
                    if (!zArr2[0] && z10Var3 != null) {
                        z10Var3.a("cancelled");
                        zArr2[0] = true;
                        return;
                    }
                    return;
                }
                return;
            case 2:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.f8913b;
                org.telegram.ui.ActionBar.u2[] u2VarArr = (org.telegram.ui.ActionBar.u2[]) this.d;
                org.telegram.ui.ActionBar.u2[] u2VarArr2 = (org.telegram.ui.ActionBar.u2[]) this.f8915e;
                this.f8914c[0] = true;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0];
                if (inputtonconnectoauthsession != null) {
                    Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                    inputtonconnectoauthsessionArr[0] = null;
                }
                org.telegram.ui.ActionBar.u2 u2Var = u2VarArr[0];
                if (u2Var != null) {
                    u2Var.dismiss();
                    u2VarArr[0] = null;
                }
                di0.f46383a = null;
                org.telegram.ui.ActionBar.u2 u2Var2 = u2VarArr2[0];
                if (u2Var2 != null) {
                    u2Var2.dismiss();
                    u2VarArr2[0] = null;
                    return;
                }
                return;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.f8913b;
                fi.i7 i7Var = (fi.i7) this.d;
                String str = (String) this.f8915e;
                v0Var.getClass();
                boolean[] zArr3 = this.f8914c;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    v0Var.x(i7Var, "requested_chat_failed", org.telegram.ui.web.v0.A(str, "req_id"));
                    return;
                }
                return;
        }
    }

    public k6(org.telegram.ui.web.v0 v0Var, boolean[] zArr, fi.i7 i7Var, String str) {
        this.f8912a = 3;
        this.f8913b = v0Var;
        this.f8914c = zArr;
        this.d = i7Var;
        this.f8915e = str;
    }

    public k6(boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, org.telegram.ui.ActionBar.u2[] u2VarArr, org.telegram.ui.ActionBar.u2[] u2VarArr2) {
        this.f8912a = 2;
        this.f8914c = zArr;
        this.f8913b = inputtonconnectoauthsessionArr;
        this.d = u2VarArr;
        this.f8915e = u2VarArr2;
    }
}
