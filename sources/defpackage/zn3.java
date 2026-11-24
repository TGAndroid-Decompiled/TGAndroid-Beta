package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
public final class zn3 implements Handler.Callback {
    public final byte a;
    public final Object b;

    public zn3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final boolean handleMessage(Message message) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((do3) obj).handleMessage(message);
                return true;
            case 1:
                a66 a66Var = (a66) obj;
                y56 y56Var = a66Var.c;
                y56Var.getClass();
                Iterator it = a66Var.d.iterator();
                while (it.hasNext()) {
                    z56 z56Var = (z56) it.next();
                    if (!z56Var.d && z56Var.c) {
                        gi4 f = z56Var.b.f();
                        z56Var.b = new e31();
                        z56Var.c = false;
                        y56Var.c(z56Var.a, f);
                    }
                    cdb cdbVar = a66Var.b;
                    cdbVar.getClass();
                    if (cdbVar.a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            default:
                o90 o90Var = (o90) obj;
                int i = message.what;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return false;
                            }
                            ((z9b) o90Var.j).a();
                        } else {
                            ((y9b) o90Var.i).a();
                        }
                    } else {
                        ((x9b) o90Var.h).a();
                    }
                } else {
                    ((w9b) o90Var.g).a();
                }
                return true;
        }
    }
}
