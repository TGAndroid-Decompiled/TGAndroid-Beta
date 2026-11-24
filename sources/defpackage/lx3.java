package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.TimerTask;
public final class lx3 extends TimerTask {
    public final byte a;
    public final Object b;

    public lx3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void run() {
        BasePendingResult basePendingResult;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                gm.c3(new bi3(this, (byte) 28));
                return;
            case 1:
                if (((pf6) obj).O != null) {
                    gm.c3(new kg5(this, (byte) 29));
                    return;
                }
                return;
            case 2:
                gm.c3(new kl7(this, (byte) 16));
                return;
            case 3:
                try {
                    Socket socket = ((q39) obj).a.a.g;
                    if (socket != null) {
                        socket.close();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            default:
                xt6 xt6Var = (xt6) obj;
                ArrayDeque arrayDeque = xt6Var.h;
                if (!arrayDeque.isEmpty() && xt6Var.k == null && xt6Var.b != 0) {
                    k89 k89Var = xt6Var.c;
                    int[] e = qe1.e(arrayDeque);
                    k89Var.getClass();
                    ite.e("Must be called from the main thread.");
                    if (!k89Var.w()) {
                        basePendingResult = k89.t();
                    } else {
                        qbd qbdVar = new qbd(k89Var, e);
                        k89.x(qbdVar);
                        basePendingResult = qbdVar;
                    }
                    xt6Var.k = basePendingResult;
                    basePendingResult.i(new m7f(xt6Var, (byte) 1));
                    arrayDeque.clear();
                    return;
                }
                return;
        }
    }
}
