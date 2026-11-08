package jg;

import bi.g2;
import org.telegram.messenger.qp;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z0 implements Runnable {
    public final String f16988a;
    public final String f16989b;
    public final qp f16990c;
    public final yr d;
    public final i1 f16991e;

    public z0(i1 i1Var, String str, String str2, qp qpVar, yr yrVar) {
        this.f16991e = i1Var;
        this.f16988a = str;
        this.f16989b = str2;
        this.f16990c = qpVar;
        this.d = yrVar;
    }

    @Override
    public final void run() {
        i1 i1Var = this.f16991e;
        if (i1Var.f16806y0 == this) {
            i1Var.f16806y0 = null;
            TLRPC.User user = i1Var.f16802w0;
            if (user == null && !i1Var.f16800v0) {
                String str = this.f16989b;
                i1Var.f16793q0 = str;
                qp qpVar = this.f16990c;
                TLObject f22 = qpVar.f2(str);
                if (f22 instanceof TLRPC.User) {
                    i1Var.R((TLRPC.User) f22);
                    return;
                }
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = i1Var.f16793q0;
                i1Var.f16798t0 = ConnectionsManager.getInstance(i1Var.f16781f).sendRequest(tL_contacts_resolveUsername, new g2(this, str, qpVar, this.d, 7));
            } else if (i1Var.f16800v0) {
            } else {
                i1Var.T(true, user, this.f16988a, "");
            }
        }
    }
}
