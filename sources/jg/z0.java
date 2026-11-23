package jg;

import bi.m2;
import org.telegram.messenger.np;
import org.telegram.messenger.ur;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z0 implements Runnable {
    public final String f17717a;
    public final String f17718b;
    public final np f17719c;
    public final ur d;
    public final h1 f17720e;

    public z0(h1 h1Var, String str, String str2, np npVar, ur urVar) {
        this.f17720e = h1Var;
        this.f17717a = str;
        this.f17718b = str2;
        this.f17719c = npVar;
        this.d = urVar;
    }

    @Override
    public final void run() {
        h1 h1Var = this.f17720e;
        if (h1Var.f17527z0 == this) {
            h1Var.f17527z0 = null;
            TLRPC.User user = h1Var.f17524x0;
            if (user == null && !h1Var.f17522w0) {
                String str = this.f17718b;
                h1Var.f17515r0 = str;
                np npVar = this.f17719c;
                TLObject h22 = npVar.h2(str);
                if (h22 instanceof TLRPC.User) {
                    h1Var.R((TLRPC.User) h22);
                    return;
                }
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = h1Var.f17515r0;
                h1Var.f17519u0 = ConnectionsManager.getInstance(h1Var.f17501f).sendRequest(tL_contacts_resolveUsername, new m2(this, str, npVar, this.d, 8));
            } else if (h1Var.f17522w0) {
            } else {
                h1Var.T(true, user, this.f17717a, "");
            }
        }
    }
}
