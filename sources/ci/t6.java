package ci;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.yh0;
public final class t6 implements DialogInterface.OnDismissListener {
    public final int f6027a;
    public final Object f6028b;
    public final boolean[] f6029c;
    public final Object d;
    public final Object f6030e;

    public t6(e9 e9Var, u10 u10Var, boolean[] zArr, boolean[] zArr2, Object obj, int i3) {
        this.f6027a = i3;
        this.f6028b = u10Var;
        this.f6029c = zArr;
        this.d = zArr2;
        this.f6030e = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f6027a) {
            case 0:
                u10 u10Var = (u10) this.f6028b;
                boolean[] zArr = (boolean[]) this.d;
                n10 n10Var = (n10) this.f6030e;
                if (u10Var != null && !this.f6029c[0]) {
                    u10Var.a(Boolean.FALSE);
                    if (!zArr[0]) {
                        n10Var.a("cancelled", 0L);
                        zArr[0] = true;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                u10 u10Var2 = (u10) this.f6028b;
                boolean[] zArr2 = (boolean[]) this.d;
                u10 u10Var3 = (u10) this.f6030e;
                if (u10Var2 != null && !this.f6029c[0]) {
                    u10Var2.a(Boolean.FALSE);
                    if (!zArr2[0] && u10Var3 != null) {
                        u10Var3.a("cancelled");
                        zArr2[0] = true;
                        return;
                    }
                    return;
                }
                return;
            case 2:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.f6028b;
                org.telegram.ui.ActionBar.t2[] t2VarArr = (org.telegram.ui.ActionBar.t2[]) this.d;
                org.telegram.ui.ActionBar.t2[] t2VarArr2 = (org.telegram.ui.ActionBar.t2[]) this.f6030e;
                this.f6029c[0] = true;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0];
                if (inputtonconnectoauthsession != null) {
                    Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                    inputtonconnectoauthsessionArr[0] = null;
                }
                org.telegram.ui.ActionBar.t2 t2Var = t2VarArr[0];
                if (t2Var != null) {
                    t2Var.dismiss();
                    t2VarArr[0] = null;
                }
                yh0.f52282a = null;
                org.telegram.ui.ActionBar.t2 t2Var2 = t2VarArr2[0];
                if (t2Var2 != null) {
                    t2Var2.dismiss();
                    t2VarArr2[0] = null;
                    return;
                }
                return;
            default:
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) this.f6028b;
                ei.p7 p7Var = (ei.p7) this.d;
                String str = (String) this.f6030e;
                w0Var.getClass();
                boolean[] zArr3 = this.f6029c;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    w0Var.x(p7Var, "requested_chat_failed", org.telegram.ui.web.w0.A(str, "req_id"));
                    return;
                }
                return;
        }
    }

    public t6(org.telegram.ui.web.w0 w0Var, boolean[] zArr, ei.p7 p7Var, String str) {
        this.f6027a = 3;
        this.f6028b = w0Var;
        this.f6029c = zArr;
        this.d = p7Var;
        this.f6030e = str;
    }

    public t6(boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, org.telegram.ui.ActionBar.t2[] t2VarArr, org.telegram.ui.ActionBar.t2[] t2VarArr2) {
        this.f6027a = 2;
        this.f6029c = zArr;
        this.f6028b = inputtonconnectoauthsessionArr;
        this.d = t2VarArr;
        this.f6030e = t2VarArr2;
    }
}
