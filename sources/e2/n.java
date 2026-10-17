package e2;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
public final class n implements Handler.Callback {
    public final int f8263a;
    public final Object f8264b;

    public n(Object obj, int i10) {
        this.f8263a = i10;
        this.f8264b = obj;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f8263a) {
            case 0:
                r rVar = (r) this.f8264b;
                p pVar = rVar.f8276c;
                pVar.getClass();
                Iterator it = rVar.d.iterator();
                while (it.hasNext()) {
                    q qVar = (q) it.next();
                    if (!qVar.d && qVar.f8273c) {
                        b2.u d = qVar.f8272b.d();
                        qVar.f8272b = new b2.t();
                        qVar.f8273c = false;
                        pVar.c(qVar.f8271a, d);
                    }
                    i0 i0Var = rVar.f8275b;
                    i0Var.getClass();
                    if (i0Var.f8239a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            default:
                e0 e0Var = (e0) this.f8264b;
                e0Var.getClass();
                int i10 = message.what;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                return false;
                            }
                            e0Var.f8222j.a();
                            return true;
                        }
                        e0Var.f8221i.a();
                        return true;
                    }
                    e0Var.h.a();
                    return true;
                }
                e0Var.f8220g.a();
                return true;
        }
    }
}
