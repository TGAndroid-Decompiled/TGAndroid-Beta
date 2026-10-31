package e2;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
public final class n implements Handler.Callback {
    public final int f6177a;
    public final Object f6178b;

    public n(Object obj, int i10) {
        this.f6177a = i10;
        this.f6178b = obj;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f6177a) {
            case 0:
                r rVar = (r) this.f6178b;
                p pVar = rVar.f6190c;
                pVar.getClass();
                Iterator it = rVar.d.iterator();
                while (it.hasNext()) {
                    q qVar = (q) it.next();
                    if (!qVar.d && qVar.f6187c) {
                        b2.v d = qVar.f6186b.d();
                        qVar.f6186b = new b2.u();
                        qVar.f6187c = false;
                        pVar.c(qVar.f6185a, d);
                    }
                    i0 i0Var = rVar.f6189b;
                    i0Var.getClass();
                    if (i0Var.f6151a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            default:
                e0 e0Var = (e0) this.f6178b;
                e0Var.getClass();
                int i10 = message.what;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                return false;
                            }
                            e0Var.f6134j.a();
                            return true;
                        }
                        e0Var.f6133i.a();
                        return true;
                    }
                    e0Var.h.a();
                    return true;
                }
                e0Var.f6132g.a();
                return true;
        }
    }
}
