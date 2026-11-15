package h2;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
public final class n implements Handler.Callback {
    public final int f13484a;
    public final Object f13485b;

    public n(Object obj, int i7) {
        this.f13484a = i7;
        this.f13485b = obj;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f13484a) {
            case 0:
                r rVar = (r) this.f13485b;
                p pVar = rVar.f13500c;
                pVar.getClass();
                Iterator it = rVar.d.iterator();
                while (it.hasNext()) {
                    q qVar = (q) it.next();
                    if (!qVar.d && qVar.f13497c) {
                        e2.s d = qVar.f13496b.d();
                        qVar.f13496b = new ca.i();
                        qVar.f13497c = false;
                        pVar.e(qVar.f13495a, d);
                    }
                    i0 i0Var = rVar.f13499b;
                    i0Var.getClass();
                    if (i0Var.f13456a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            default:
                e0 e0Var = (e0) this.f13485b;
                e0Var.getClass();
                int i7 = message.what;
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                return false;
                            }
                            ((d0) e0Var.f13439j).a();
                            return true;
                        }
                        ((c0) e0Var.f13438i).a();
                        return true;
                    }
                    ((b0) e0Var.h).a();
                    return true;
                }
                ((a0) e0Var.f13437g).a();
                return true;
        }
    }
}
