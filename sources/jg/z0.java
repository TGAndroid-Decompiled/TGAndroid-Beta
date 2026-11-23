package jg;

import bi.k2;
import org.telegram.messenger.np;
import org.telegram.messenger.ur;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z0 implements Runnable {
    public final String f17751a;
    public final String f17752b;
    public final np f17753c;
    public final ur d;
    public final h1 f17754e;

    public z0(h1 h1Var, String str, String str2, np npVar, ur urVar) {
        this.f17754e = h1Var;
        this.f17751a = str;
        this.f17752b = str2;
        this.f17753c = npVar;
        this.d = urVar;
    }

    @Override
    public final void run() {
        h1 h1Var = this.f17754e;
        if (h1Var.f17561z0 == this) {
            h1Var.f17561z0 = null;
            TLRPC.User user = h1Var.f17558x0;
            if (user == null && !h1Var.f17556w0) {
                String str = this.f17752b;
                h1Var.f17549r0 = str;
                np npVar = this.f17753c;
                TLObject h22 = npVar.h2(str);
                if (h22 instanceof TLRPC.User) {
                    h1Var.R((TLRPC.User) h22);
                    return;
                }
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = h1Var.f17549r0;
                h1Var.f17553u0 = ConnectionsManager.getInstance(h1Var.f17535f).sendRequest(tL_contacts_resolveUsername, new k2(this, str, npVar, this.d, 8));
            } else if (h1Var.f17556w0) {
            } else {
                h1Var.T(true, user, this.f17751a, "");
            }
        }
    }
}
