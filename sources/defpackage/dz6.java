package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dz6 implements Runnable {
    public final String a;
    public final String b;
    public final na7 c;
    public final ad7 d;
    public final kz6 e;

    public dz6(kz6 kz6Var, String str, String str2, na7 na7Var, ad7 ad7Var) {
        this.e = kz6Var;
        this.a = str;
        this.b = str2;
        this.c = na7Var;
        this.d = ad7Var;
    }

    @Override
    public final void run() {
        kz6 kz6Var = this.e;
        if (kz6Var.z0 == this) {
            kz6Var.z0 = null;
            TLRPC.User user = kz6Var.x0;
            if (user == null && !kz6Var.w0) {
                String str = this.b;
                kz6Var.r0 = str;
                na7 na7Var = this.c;
                TLObject a2 = na7Var.a2(str);
                if (a2 instanceof TLRPC.User) {
                    kz6Var.R((TLRPC.User) a2);
                    return;
                }
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = kz6Var.r0;
                kz6Var.u0 = ConnectionsManager.getInstance(kz6Var.f).sendRequest(tL_contacts_resolveUsername, new rt0((Object) this, str, (Object) na7Var, (Object) this.d, (byte) 9));
            } else if (kz6Var.w0) {
            } else {
                kz6Var.T(true, user, this.a, "");
            }
        }
    }
}
