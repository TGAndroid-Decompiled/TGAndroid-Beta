package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
public final class qo3 implements Handler.Callback {
    public final byte a;
    public final Object b;

    public qo3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final boolean handleMessage(Message message) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((uo3) obj).handleMessage(message);
                return true;
            case 1:
                e86 e86Var = (e86) obj;
                c86 c86Var = e86Var.c;
                c86Var.getClass();
                Iterator it = e86Var.d.iterator();
                while (it.hasNext()) {
                    d86 d86Var = (d86) it.next();
                    if (!d86Var.d && d86Var.c) {
                        lk4 f = d86Var.b.f();
                        d86Var.b = new n31();
                        d86Var.c = false;
                        c86Var.a(d86Var.a, f);
                    }
                    xgb xgbVar = e86Var.b;
                    xgbVar.getClass();
                    if (xgbVar.a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            default:
                q90 q90Var = (q90) obj;
                int i = message.what;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return false;
                            }
                            ((xdb) q90Var.j).a();
                        } else {
                            ((wdb) q90Var.i).a();
                        }
                    } else {
                        ((vdb) q90Var.h).a();
                    }
                } else {
                    ((udb) q90Var.g).a();
                }
                return true;
        }
    }
}
