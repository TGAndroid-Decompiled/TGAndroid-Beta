package h2;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
public final class n implements Handler.Callback {
    public final int f14124a;
    public final Object f14125b;

    public n(Object obj, int i7) {
        this.f14124a = i7;
        this.f14125b = obj;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f14124a) {
            case 0:
                r rVar = (r) this.f14125b;
                p pVar = rVar.f14143c;
                pVar.getClass();
                Iterator it = rVar.d.iterator();
                while (it.hasNext()) {
                    q qVar = (q) it.next();
                    if (!qVar.d && qVar.f14140c) {
                        e2.s d = qVar.f14139b.d();
                        qVar.f14139b = new ca.i();
                        qVar.f14140c = false;
                        pVar.h(qVar.f14138a, d);
                    }
                    i0 i0Var = rVar.f14142b;
                    i0Var.getClass();
                    if (i0Var.f14098a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            default:
                e0 e0Var = (e0) this.f14125b;
                e0Var.getClass();
                int i7 = message.what;
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                return false;
                            }
                            ((d0) e0Var.f14081j).a();
                            return true;
                        }
                        ((c0) e0Var.f14080i).a();
                        return true;
                    }
                    ((b0) e0Var.h).a();
                    return true;
                }
                ((a0) e0Var.f14079g).a();
                return true;
        }
    }
}
