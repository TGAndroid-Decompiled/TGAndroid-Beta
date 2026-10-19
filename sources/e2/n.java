package e2;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
public final class n implements Handler.Callback {
    public final int f8261a;
    public final Object f8262b;

    public n(Object obj, int i10) {
        this.f8261a = i10;
        this.f8262b = obj;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f8261a) {
            case 0:
                r rVar = (r) this.f8262b;
                p pVar = rVar.f8274c;
                pVar.getClass();
                Iterator it = rVar.d.iterator();
                while (it.hasNext()) {
                    q qVar = (q) it.next();
                    if (!qVar.d && qVar.f8271c) {
                        b2.u d = qVar.f8270b.d();
                        qVar.f8270b = new b2.t();
                        qVar.f8271c = false;
                        pVar.c(qVar.f8269a, d);
                    }
                    i0 i0Var = rVar.f8273b;
                    i0Var.getClass();
                    if (i0Var.f8237a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            default:
                e0 e0Var = (e0) this.f8262b;
                e0Var.getClass();
                int i10 = message.what;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                return false;
                            }
                            e0Var.f8220j.a();
                            return true;
                        }
                        e0Var.f8219i.a();
                        return true;
                    }
                    e0Var.h.a();
                    return true;
                }
                e0Var.f8218g.a();
                return true;
        }
    }
}
