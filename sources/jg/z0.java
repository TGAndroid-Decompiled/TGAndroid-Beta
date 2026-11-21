package jg;

import bi.k2;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z0 implements Runnable {
    public final String f17748a;
    public final String f17749b;
    public final mp f17750c;
    public final tr d;
    public final h1 f17751e;

    public z0(h1 h1Var, String str, String str2, mp mpVar, tr trVar) {
        this.f17751e = h1Var;
        this.f17748a = str;
        this.f17749b = str2;
        this.f17750c = mpVar;
        this.d = trVar;
    }

    @Override
    public final void run() {
        h1 h1Var = this.f17751e;
        if (h1Var.f17558z0 == this) {
            h1Var.f17558z0 = null;
            TLRPC.User user = h1Var.f17555x0;
            if (user == null && !h1Var.f17553w0) {
                String str = this.f17749b;
                h1Var.f17546r0 = str;
                mp mpVar = this.f17750c;
                TLObject h22 = mpVar.h2(str);
                if (h22 instanceof TLRPC.User) {
                    h1Var.R((TLRPC.User) h22);
                    return;
                }
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = h1Var.f17546r0;
                h1Var.f17550u0 = ConnectionsManager.getInstance(h1Var.f17532f).sendRequest(tL_contacts_resolveUsername, new k2(this, str, mpVar, this.d, 8));
            } else if (h1Var.f17553w0) {
            } else {
                h1Var.T(true, user, this.f17748a, "");
            }
        }
    }
}
