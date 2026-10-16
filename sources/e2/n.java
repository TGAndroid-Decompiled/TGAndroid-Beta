package e2;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
public final class n implements Handler.Callback {
    public final int f8384a;
    public final Object f8385b;

    public n(Object obj, int i10) {
        this.f8384a = i10;
        this.f8385b = obj;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f8384a) {
            case 0:
                r rVar = (r) this.f8385b;
                p pVar = rVar.f8397c;
                pVar.getClass();
                Iterator it = rVar.d.iterator();
                while (it.hasNext()) {
                    q qVar = (q) it.next();
                    if (!qVar.d && qVar.f8394c) {
                        b2.v d = qVar.f8393b.d();
                        qVar.f8393b = new b2.u();
                        qVar.f8394c = false;
                        pVar.c(qVar.f8392a, d);
                    }
                    i0 i0Var = rVar.f8396b;
                    i0Var.getClass();
                    if (i0Var.f8360a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            default:
                e0 e0Var = (e0) this.f8385b;
                e0Var.getClass();
                int i10 = message.what;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                return false;
                            }
                            e0Var.f8343j.a();
                            return true;
                        }
                        e0Var.f8342i.a();
                        return true;
                    }
                    e0Var.h.a();
                    return true;
                }
                e0Var.f8341g.a();
                return true;
        }
    }
}
