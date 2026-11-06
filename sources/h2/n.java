package h2;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
public final class n implements Handler.Callback {
    public final int f14122a;
    public final Object f14123b;

    public n(Object obj, int i7) {
        this.f14122a = i7;
        this.f14123b = obj;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f14122a) {
            case 0:
                r rVar = (r) this.f14123b;
                p pVar = rVar.f14141c;
                pVar.getClass();
                Iterator it = rVar.d.iterator();
                while (it.hasNext()) {
                    q qVar = (q) it.next();
                    if (!qVar.d && qVar.f14138c) {
                        e2.s d = qVar.f14137b.d();
                        qVar.f14137b = new ca.i();
                        qVar.f14138c = false;
                        pVar.h(qVar.f14136a, d);
                    }
                    i0 i0Var = rVar.f14140b;
                    i0Var.getClass();
                    if (i0Var.f14096a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            default:
                e0 e0Var = (e0) this.f14123b;
                e0Var.getClass();
                int i7 = message.what;
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                return false;
                            }
                            ((d0) e0Var.f14079j).a();
                            return true;
                        }
                        ((c0) e0Var.f14078i).a();
                        return true;
                    }
                    ((b0) e0Var.h).a();
                    return true;
                }
                ((a0) e0Var.f14077g).a();
                return true;
        }
    }
}
