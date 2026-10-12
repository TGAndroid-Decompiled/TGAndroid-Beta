package e2;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
public final class n implements Handler.Callback {
    public final int f8381a;
    public final Object f8382b;

    public n(Object obj, int i10) {
        this.f8381a = i10;
        this.f8382b = obj;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f8381a) {
            case 0:
                r rVar = (r) this.f8382b;
                p pVar = rVar.f8394c;
                pVar.getClass();
                Iterator it = rVar.d.iterator();
                while (it.hasNext()) {
                    q qVar = (q) it.next();
                    if (!qVar.d && qVar.f8391c) {
                        b2.v d = qVar.f8390b.d();
                        qVar.f8390b = new b2.u();
                        qVar.f8391c = false;
                        pVar.c(qVar.f8389a, d);
                    }
                    i0 i0Var = rVar.f8393b;
                    i0Var.getClass();
                    if (i0Var.f8357a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            default:
                e0 e0Var = (e0) this.f8382b;
                e0Var.getClass();
                int i10 = message.what;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                return false;
                            }
                            e0Var.f8340j.a();
                            return true;
                        }
                        e0Var.f8339i.a();
                        return true;
                    }
                    e0Var.h.a();
                    return true;
                }
                e0Var.f8338g.a();
                return true;
        }
    }
}
