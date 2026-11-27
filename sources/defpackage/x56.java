package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
public final class x56 implements icc {
    public final byte a;
    public final e66 b;
    public final String c;

    public x56(e66 e66Var, String str, byte b) {
        this.a = b;
        this.b = e66Var;
        this.c = str;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        String str = this.c;
        e66 e66Var = this.b;
        switch (b) {
            case 0:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                e66Var.c();
                if (passkeys != null) {
                    e66Var.u(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(str)) {
                        e66Var.x("addPasskeyRow");
                        return;
                    }
                    return;
                }
                return;
            default:
                v45 v45Var = (v45) obj;
                String str2 = (String) obj2;
                e66Var.c();
                if (v45Var == null) {
                    if (str2 == null) {
                        str2 = ob6.M0(2131742622, null);
                    }
                    d31.c0(str2);
                    return;
                }
                e S = LaunchActivity.S();
                if (S != null && S.getContext() != null) {
                    a55.D(S.getContext(), e66Var.b, v45Var, null, S.getResourceProvider(), null, new w56(e66Var, str, (byte) 1));
                    return;
                }
                return;
        }
    }
}
