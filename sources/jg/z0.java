package jg;

import bi.g2;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z0 implements Runnable {
    public final String f17723a;
    public final String f17724b;
    public final mp f17725c;
    public final tr d;
    public final h1 f17726e;

    public z0(h1 h1Var, String str, String str2, mp mpVar, tr trVar) {
        this.f17726e = h1Var;
        this.f17723a = str;
        this.f17724b = str2;
        this.f17725c = mpVar;
        this.d = trVar;
    }

    @Override
    public final void run() {
        h1 h1Var = this.f17726e;
        if (h1Var.f17533z0 == this) {
            h1Var.f17533z0 = null;
            TLRPC.User user = h1Var.f17530x0;
            if (user == null && !h1Var.f17528w0) {
                String str = this.f17724b;
                h1Var.f17521r0 = str;
                mp mpVar = this.f17725c;
                TLObject h22 = mpVar.h2(str);
                if (h22 instanceof TLRPC.User) {
                    h1Var.R((TLRPC.User) h22);
                    return;
                }
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = h1Var.f17521r0;
                h1Var.f17525u0 = ConnectionsManager.getInstance(h1Var.f17507f).sendRequest(tL_contacts_resolveUsername, new g2(this, str, mpVar, this.d, 8));
            } else if (h1Var.f17528w0) {
            } else {
                h1Var.T(true, user, this.f17723a, "");
            }
        }
    }
}
