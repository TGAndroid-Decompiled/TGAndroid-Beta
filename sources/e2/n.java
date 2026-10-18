package e2;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
public final class n implements Handler.Callback {
    public final int f8264a;
    public final Object f8265b;

    public n(Object obj, int i10) {
        this.f8264a = i10;
        this.f8265b = obj;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f8264a) {
            case 0:
                r rVar = (r) this.f8265b;
                p pVar = rVar.f8277c;
                pVar.getClass();
                Iterator it = rVar.d.iterator();
                while (it.hasNext()) {
                    q qVar = (q) it.next();
                    if (!qVar.d && qVar.f8274c) {
                        b2.u d = qVar.f8273b.d();
                        qVar.f8273b = new b2.t();
                        qVar.f8274c = false;
                        pVar.c(qVar.f8272a, d);
                    }
                    i0 i0Var = rVar.f8276b;
                    i0Var.getClass();
                    if (i0Var.f8240a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            default:
                e0 e0Var = (e0) this.f8265b;
                e0Var.getClass();
                int i10 = message.what;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                return false;
                            }
                            e0Var.f8223j.a();
                            return true;
                        }
                        e0Var.f8222i.a();
                        return true;
                    }
                    e0Var.h.a();
                    return true;
                }
                e0Var.f8221g.a();
                return true;
        }
    }
}
