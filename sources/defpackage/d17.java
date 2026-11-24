package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d17 implements Runnable {
    public final String a;
    public final String b;
    public final oc7 c;
    public final cf7 d;
    public final k17 e;

    public d17(k17 k17Var, String str, String str2, oc7 oc7Var, cf7 cf7Var) {
        this.e = k17Var;
        this.a = str;
        this.b = str2;
        this.c = oc7Var;
        this.d = cf7Var;
    }

    @Override
    public final void run() {
        k17 k17Var = this.e;
        if (k17Var.z0 == this) {
            k17Var.z0 = null;
            TLRPC.User user = k17Var.x0;
            if (user == null && !k17Var.w0) {
                String str = this.b;
                k17Var.r0 = str;
                oc7 oc7Var = this.c;
                TLObject b2 = oc7Var.b2(str);
                if (b2 instanceof TLRPC.User) {
                    k17Var.R((TLRPC.User) b2);
                    return;
                }
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = k17Var.r0;
                k17Var.u0 = ConnectionsManager.getInstance(k17Var.f).sendRequest(tL_contacts_resolveUsername, new av0((Object) this, str, (Object) oc7Var, (Object) this.d, (byte) 9));
            } else if (k17Var.w0) {
            } else {
                k17Var.T(true, user, this.a, "");
            }
        }
    }
}
