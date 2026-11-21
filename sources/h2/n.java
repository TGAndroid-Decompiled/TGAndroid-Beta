package h2;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
public final class n implements Handler.Callback {
    public final int f13825a;
    public final Object f13826b;

    public n(Object obj, int i7) {
        this.f13825a = i7;
        this.f13826b = obj;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f13825a) {
            case 0:
                r rVar = (r) this.f13826b;
                p pVar = rVar.f13841c;
                pVar.getClass();
                Iterator it = rVar.d.iterator();
                while (it.hasNext()) {
                    q qVar = (q) it.next();
                    if (!qVar.d && qVar.f13838c) {
                        e2.s d = qVar.f13837b.d();
                        qVar.f13837b = new ca.i();
                        qVar.f13838c = false;
                        pVar.i(qVar.f13836a, d);
                    }
                    i0 i0Var = rVar.f13840b;
                    i0Var.getClass();
                    if (i0Var.f13797a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            default:
                e0 e0Var = (e0) this.f13826b;
                e0Var.getClass();
                int i7 = message.what;
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                return false;
                            }
                            ((d0) e0Var.f13780j).a();
                            return true;
                        }
                        ((c0) e0Var.f13779i).a();
                        return true;
                    }
                    ((b0) e0Var.h).a();
                    return true;
                }
                ((a0) e0Var.f13778g).a();
                return true;
        }
    }
}
