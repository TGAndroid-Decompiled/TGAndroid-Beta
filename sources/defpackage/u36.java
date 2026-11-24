package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
public final class u36 implements i8c {
    public final byte a;
    public final a46 b;
    public final String c;

    public u36(a46 a46Var, String str, byte b) {
        this.a = b;
        this.b = a46Var;
        this.c = str;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        String str = this.c;
        a46 a46Var = this.b;
        switch (b) {
            case 0:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                a46Var.c();
                if (passkeys != null) {
                    a46Var.u(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(str)) {
                        a46Var.x("addPasskeyRow");
                        return;
                    }
                    return;
                }
                return;
            default:
                r25 r25Var = (r25) obj;
                String str2 = (String) obj2;
                a46Var.c();
                if (r25Var == null) {
                    if (str2 == null) {
                        str2 = k96.M0(2131742728, null);
                    }
                    u21.c0(str2);
                    return;
                }
                d S = LaunchActivity.S();
                if (S != null && S.getContext() != null) {
                    w25.D(S.getContext(), a46Var.b, r25Var, null, S.getResourceProvider(), null, new t36(a46Var, str, (byte) 1));
                    return;
                }
                return;
        }
    }
}
