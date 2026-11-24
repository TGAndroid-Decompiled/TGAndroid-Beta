package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
public final class u56 implements jac {
    public final byte a;
    public final a66 b;
    public final String c;

    public u56(a66 a66Var, String str, byte b) {
        this.a = b;
        this.b = a66Var;
        this.c = str;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        String str = this.c;
        a66 a66Var = this.b;
        switch (b) {
            case 0:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                a66Var.c();
                if (passkeys != null) {
                    a66Var.u(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(str)) {
                        a66Var.x("addPasskeyRow");
                        return;
                    }
                    return;
                }
                return;
            default:
                r45 r45Var = (r45) obj;
                String str2 = (String) obj2;
                a66Var.c();
                if (r45Var == null) {
                    if (str2 == null) {
                        str2 = jb6.M0(2131742654, null);
                    }
                    c41.c0(str2);
                    return;
                }
                d S = LaunchActivity.S();
                if (S != null && S.getContext() != null) {
                    w45.D(S.getContext(), a66Var.b, r45Var, null, S.getResourceProvider(), null, new t56(a66Var, str, (byte) 1));
                    return;
                }
                return;
        }
    }
}
