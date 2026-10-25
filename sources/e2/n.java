package e2;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
public final class n implements Handler.Callback {
    public final int f9690a;
    public final Object f9691b;

    public n(Object obj, int i10) {
        this.f9690a = i10;
        this.f9691b = obj;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f9690a) {
            case 0:
                r rVar = (r) this.f9691b;
                p pVar = rVar.f9715c;
                pVar.getClass();
                Iterator it = rVar.d.iterator();
                while (it.hasNext()) {
                    q qVar = (q) it.next();
                    if (!qVar.d && qVar.f9709c) {
                        b2.v d = qVar.f9708b.d();
                        qVar.f9708b = new b2.u();
                        qVar.f9709c = false;
                        pVar.f(qVar.f9707a, d);
                    }
                    i0 i0Var = rVar.f9714b;
                    i0Var.getClass();
                    if (i0Var.f9672a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            default:
                e0 e0Var = (e0) this.f9691b;
                e0Var.getClass();
                int i10 = message.what;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                return false;
                            }
                            e0Var.f9655j.a();
                            return true;
                        }
                        e0Var.f9654i.a();
                        return true;
                    }
                    e0Var.h.a();
                    return true;
                }
                e0Var.f9653g.a();
                return true;
        }
    }
}
