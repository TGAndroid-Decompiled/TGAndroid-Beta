package jg;

import bi.g2;
import org.telegram.messenger.qp;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z0 implements Runnable {
    public final String f16985a;
    public final String f16986b;
    public final qp f16987c;
    public final yr d;
    public final i1 f16988e;

    public z0(i1 i1Var, String str, String str2, qp qpVar, yr yrVar) {
        this.f16988e = i1Var;
        this.f16985a = str;
        this.f16986b = str2;
        this.f16987c = qpVar;
        this.d = yrVar;
    }

    @Override
    public final void run() {
        i1 i1Var = this.f16988e;
        if (i1Var.f16803y0 == this) {
            i1Var.f16803y0 = null;
            TLRPC.User user = i1Var.f16799w0;
            if (user == null && !i1Var.f16797v0) {
                String str = this.f16986b;
                i1Var.f16790q0 = str;
                qp qpVar = this.f16987c;
                TLObject f22 = qpVar.f2(str);
                if (f22 instanceof TLRPC.User) {
                    i1Var.R((TLRPC.User) f22);
                    return;
                }
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = i1Var.f16790q0;
                i1Var.f16795t0 = ConnectionsManager.getInstance(i1Var.f16778f).sendRequest(tL_contacts_resolveUsername, new g2(this, str, qpVar, this.d, 7));
            } else if (i1Var.f16797v0) {
            } else {
                i1Var.T(true, user, this.f16985a, "");
            }
        }
    }
}
