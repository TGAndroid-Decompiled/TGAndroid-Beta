package h2;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
public final class n implements Handler.Callback {
    public final int f13791a;
    public final Object f13792b;

    public n(Object obj, int i7) {
        this.f13791a = i7;
        this.f13792b = obj;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f13791a) {
            case 0:
                r rVar = (r) this.f13792b;
                p pVar = rVar.f13807c;
                pVar.getClass();
                Iterator it = rVar.d.iterator();
                while (it.hasNext()) {
                    q qVar = (q) it.next();
                    if (!qVar.d && qVar.f13804c) {
                        e2.s d = qVar.f13803b.d();
                        qVar.f13803b = new ca.i();
                        qVar.f13804c = false;
                        pVar.f(qVar.f13802a, d);
                    }
                    i0 i0Var = rVar.f13806b;
                    i0Var.getClass();
                    if (i0Var.f13763a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            default:
                e0 e0Var = (e0) this.f13792b;
                e0Var.getClass();
                int i7 = message.what;
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                return false;
                            }
                            ((d0) e0Var.f13746j).a();
                            return true;
                        }
                        ((c0) e0Var.f13745i).a();
                        return true;
                    }
                    ((b0) e0Var.h).a();
                    return true;
                }
                ((a0) e0Var.f13744g).a();
                return true;
        }
    }
}
