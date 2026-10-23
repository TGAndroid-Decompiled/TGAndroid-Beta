package e2;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
public final class n implements Handler.Callback {
    public final int f8268a;
    public final Object f8269b;

    public n(Object obj, int i10) {
        this.f8268a = i10;
        this.f8269b = obj;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f8268a) {
            case 0:
                r rVar = (r) this.f8269b;
                p pVar = rVar.f8281c;
                pVar.getClass();
                Iterator it = rVar.d.iterator();
                while (it.hasNext()) {
                    q qVar = (q) it.next();
                    if (!qVar.d && qVar.f8278c) {
                        b2.u d = qVar.f8277b.d();
                        qVar.f8277b = new b2.t();
                        qVar.f8278c = false;
                        pVar.a(qVar.f8276a, d);
                    }
                    i0 i0Var = rVar.f8280b;
                    i0Var.getClass();
                    if (i0Var.f8244a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            default:
                e0 e0Var = (e0) this.f8269b;
                e0Var.getClass();
                int i10 = message.what;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                return false;
                            }
                            e0Var.f8227j.a();
                            return true;
                        }
                        e0Var.f8226i.a();
                        return true;
                    }
                    e0Var.h.a();
                    return true;
                }
                e0Var.f8225g.a();
                return true;
        }
    }
}
