package h2;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
public final class n implements Handler.Callback {
    public final int f13799a;
    public final Object f13800b;

    public n(Object obj, int i7) {
        this.f13799a = i7;
        this.f13800b = obj;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f13799a) {
            case 0:
                r rVar = (r) this.f13800b;
                p pVar = rVar.f13815c;
                pVar.getClass();
                Iterator it = rVar.d.iterator();
                while (it.hasNext()) {
                    q qVar = (q) it.next();
                    if (!qVar.d && qVar.f13812c) {
                        e2.s d = qVar.f13811b.d();
                        qVar.f13811b = new ca.i();
                        qVar.f13812c = false;
                        pVar.g(qVar.f13810a, d);
                    }
                    i0 i0Var = rVar.f13814b;
                    i0Var.getClass();
                    if (i0Var.f13771a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            default:
                e0 e0Var = (e0) this.f13800b;
                e0Var.getClass();
                int i7 = message.what;
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                return false;
                            }
                            ((d0) e0Var.f13754j).a();
                            return true;
                        }
                        ((c0) e0Var.f13753i).a();
                        return true;
                    }
                    ((b0) e0Var.h).a();
                    return true;
                }
                ((a0) e0Var.f13752g).a();
                return true;
        }
    }
}
