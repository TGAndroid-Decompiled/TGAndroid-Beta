package kg;

import org.telegram.messenger.hp;
import org.telegram.messenger.qr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w0 implements Runnable {
    public final String f17224a;
    public final String f17225b;
    public final hp f17226c;
    public final qr d;
    public final e1 f17227e;

    public w0(e1 e1Var, String str, String str2, hp hpVar, qr qrVar) {
        this.f17227e = e1Var;
        this.f17224a = str;
        this.f17225b = str2;
        this.f17226c = hpVar;
        this.d = qrVar;
    }

    @Override
    public final void run() {
        e1 e1Var = this.f17227e;
        if (e1Var.f17023z0 == this) {
            e1Var.f17023z0 = null;
            TLRPC.User user = e1Var.f17020x0;
            if (user == null && !e1Var.f17018w0) {
                String str = this.f17225b;
                e1Var.f17011r0 = str;
                hp hpVar = this.f17226c;
                TLObject f22 = hpVar.f2(str);
                if (f22 instanceof TLRPC.User) {
                    e1Var.R((TLRPC.User) f22);
                    return;
                }
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = e1Var.f17011r0;
                e1Var.f17015u0 = ConnectionsManager.getInstance(e1Var.f16997f).sendRequest(tL_contacts_resolveUsername, new ai.q1(this, str, hpVar, this.d, 8));
            } else if (e1Var.f17018w0) {
            } else {
                e1Var.T(true, user, this.f17224a, "");
            }
        }
    }
}
