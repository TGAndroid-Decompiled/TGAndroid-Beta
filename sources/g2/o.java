package g2;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
public final class o implements Handler.Callback {
    public final int f11883a;
    public final Object f11884b;

    public o(Object obj, int i3) {
        this.f11883a = i3;
        this.f11884b = obj;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f11883a) {
            case 0:
                s sVar = (s) this.f11884b;
                q qVar = sVar.f11902c;
                qVar.getClass();
                Iterator it = sVar.d.iterator();
                while (it.hasNext()) {
                    r rVar = (r) it.next();
                    if (!rVar.d && rVar.f11899c) {
                        d2.t d = rVar.f11898b.d();
                        rVar.f11898b = new ba.i();
                        rVar.f11899c = false;
                        qVar.e(rVar.f11897a, d);
                    }
                    j0 j0Var = sVar.f11901b;
                    j0Var.getClass();
                    if (j0Var.f11857a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            default:
                f0 f0Var = (f0) this.f11884b;
                f0Var.getClass();
                int i3 = message.what;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                return false;
                            }
                            ((e0) f0Var.f11840j).a();
                            return true;
                        }
                        ((d0) f0Var.f11839i).a();
                        return true;
                    }
                    ((c0) f0Var.h).a();
                    return true;
                }
                ((b0) f0Var.f11838g).a();
                return true;
        }
    }
}
