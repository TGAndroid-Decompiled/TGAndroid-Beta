package h2;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
public final class n implements Handler.Callback {
    public final int f13796a;
    public final Object f13797b;

    public n(Object obj, int i7) {
        this.f13796a = i7;
        this.f13797b = obj;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f13796a) {
            case 0:
                r rVar = (r) this.f13797b;
                p pVar = rVar.f13812c;
                pVar.getClass();
                Iterator it = rVar.d.iterator();
                while (it.hasNext()) {
                    q qVar = (q) it.next();
                    if (!qVar.d && qVar.f13809c) {
                        e2.s d = qVar.f13808b.d();
                        qVar.f13808b = new ca.i();
                        qVar.f13809c = false;
                        pVar.g(qVar.f13807a, d);
                    }
                    i0 i0Var = rVar.f13811b;
                    i0Var.getClass();
                    if (i0Var.f13768a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            default:
                e0 e0Var = (e0) this.f13797b;
                e0Var.getClass();
                int i7 = message.what;
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                return false;
                            }
                            ((d0) e0Var.f13751j).a();
                            return true;
                        }
                        ((c0) e0Var.f13750i).a();
                        return true;
                    }
                    ((b0) e0Var.h).a();
                    return true;
                }
                ((a0) e0Var.f13749g).a();
                return true;
        }
    }
}
