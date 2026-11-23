package jg;

import bi.m2;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z0 implements Runnable {
    public final String f17819a;
    public final String f17820b;
    public final mp f17821c;
    public final tr d;
    public final h1 f17822e;

    public z0(h1 h1Var, String str, String str2, mp mpVar, tr trVar) {
        this.f17822e = h1Var;
        this.f17819a = str;
        this.f17820b = str2;
        this.f17821c = mpVar;
        this.d = trVar;
    }

    @Override
    public final void run() {
        h1 h1Var = this.f17822e;
        if (h1Var.f17629z0 == this) {
            h1Var.f17629z0 = null;
            TLRPC.User user = h1Var.f17626x0;
            if (user == null && !h1Var.f17624w0) {
                String str = this.f17820b;
                h1Var.f17617r0 = str;
                mp mpVar = this.f17821c;
                TLObject h22 = mpVar.h2(str);
                if (h22 instanceof TLRPC.User) {
                    h1Var.R((TLRPC.User) h22);
                    return;
                }
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = h1Var.f17617r0;
                h1Var.f17621u0 = ConnectionsManager.getInstance(h1Var.f17603f).sendRequest(tL_contacts_resolveUsername, new m2(this, str, mpVar, this.d, 8));
            } else if (h1Var.f17624w0) {
            } else {
                h1Var.T(true, user, this.f17819a, "");
            }
        }
    }
}
