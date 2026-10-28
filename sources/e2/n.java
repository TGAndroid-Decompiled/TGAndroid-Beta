package e2;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
public final class n implements Handler.Callback {
    public final int f9689a;
    public final Object f9690b;

    public n(Object obj, int i10) {
        this.f9689a = i10;
        this.f9690b = obj;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f9689a) {
            case 0:
                r rVar = (r) this.f9690b;
                p pVar = rVar.f9714c;
                pVar.getClass();
                Iterator it = rVar.d.iterator();
                while (it.hasNext()) {
                    q qVar = (q) it.next();
                    if (!qVar.d && qVar.f9708c) {
                        b2.v d = qVar.f9707b.d();
                        qVar.f9707b = new b2.u();
                        qVar.f9708c = false;
                        pVar.f(qVar.f9706a, d);
                    }
                    i0 i0Var = rVar.f9713b;
                    i0Var.getClass();
                    if (i0Var.f9671a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            default:
                e0 e0Var = (e0) this.f9690b;
                e0Var.getClass();
                int i10 = message.what;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                return false;
                            }
                            e0Var.f9654j.a();
                            return true;
                        }
                        e0Var.f9653i.a();
                        return true;
                    }
                    e0Var.h.a();
                    return true;
                }
                e0Var.f9652g.a();
                return true;
        }
    }
}
