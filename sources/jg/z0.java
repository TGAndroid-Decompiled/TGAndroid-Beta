package jg;

import org.telegram.messenger.np;
import org.telegram.messenger.vr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z0 implements Runnable {
    public final String f17340a;
    public final String f17341b;
    public final np f17342c;
    public final vr d;
    public final h1 f17343e;

    public z0(h1 h1Var, String str, String str2, np npVar, vr vrVar) {
        this.f17343e = h1Var;
        this.f17340a = str;
        this.f17341b = str2;
        this.f17342c = npVar;
        this.d = vrVar;
    }

    @Override
    public final void run() {
        h1 h1Var = this.f17343e;
        if (h1Var.f17150z0 == this) {
            h1Var.f17150z0 = null;
            TLRPC.User user = h1Var.f17147x0;
            if (user == null && !h1Var.f17145w0) {
                String str = this.f17341b;
                h1Var.f17138r0 = str;
                np npVar = this.f17342c;
                TLObject f22 = npVar.f2(str);
                if (f22 instanceof TLRPC.User) {
                    h1Var.R((TLRPC.User) f22);
                    return;
                }
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = h1Var.f17138r0;
                h1Var.f17142u0 = ConnectionsManager.getInstance(h1Var.f17124f).sendRequest(tL_contacts_resolveUsername, new bi.l1(this, str, npVar, this.d, 8));
            } else if (h1Var.f17145w0) {
            } else {
                h1Var.T(true, user, this.f17340a, "");
            }
        }
    }
}
