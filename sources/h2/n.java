package h2;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
public final class n implements Handler.Callback {
    public final int f13828a;
    public final Object f13829b;

    public n(Object obj, int i7) {
        this.f13828a = i7;
        this.f13829b = obj;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f13828a) {
            case 0:
                r rVar = (r) this.f13829b;
                p pVar = rVar.f13844c;
                pVar.getClass();
                Iterator it = rVar.d.iterator();
                while (it.hasNext()) {
                    q qVar = (q) it.next();
                    if (!qVar.d && qVar.f13841c) {
                        e2.s d = qVar.f13840b.d();
                        qVar.f13840b = new ca.i();
                        qVar.f13841c = false;
                        pVar.i(qVar.f13839a, d);
                    }
                    i0 i0Var = rVar.f13843b;
                    i0Var.getClass();
                    if (i0Var.f13800a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            default:
                e0 e0Var = (e0) this.f13829b;
                e0Var.getClass();
                int i7 = message.what;
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                return false;
                            }
                            ((d0) e0Var.f13783j).a();
                            return true;
                        }
                        ((c0) e0Var.f13782i).a();
                        return true;
                    }
                    ((b0) e0Var.h).a();
                    return true;
                }
                ((a0) e0Var.f13781g).a();
                return true;
        }
    }
}
