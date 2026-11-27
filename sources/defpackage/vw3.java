package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.TimerTask;
public final class vw3 extends TimerTask {
    public final byte a;
    public final Object b;

    public vw3(Object obj, byte b) {
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
                hl.c3(new lw3(this, (byte) 2));
                return;
            case 1:
                if (((sf6) obj).O != null) {
                    hl.c3(new z96(this, (byte) 7));
                    return;
                }
                return;
            case 2:
                hl.c3(new ge7(this, (byte) 24));
                return;
            case 3:
                try {
                    Socket socket = ((c59) obj).a.a.g;
                    if (socket != null) {
                        socket.close();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            default:
                bu6 bu6Var = (bu6) obj;
                ArrayDeque arrayDeque = bu6Var.h;
                if (!arrayDeque.isEmpty() && bu6Var.k == null && bu6Var.b != 0) {
                    v99 v99Var = bu6Var.c;
                    int[] e = qd1.e(arrayDeque);
                    v99Var.getClass();
                    xve.e("Must be called from the main thread.");
                    if (!v99Var.w()) {
                        basePendingResult = v99.t();
                    } else {
                        hed hedVar = new hed(v99Var, e);
                        v99.x(hedVar);
                        basePendingResult = hedVar;
                    }
                    bu6Var.k = basePendingResult;
                    basePendingResult.i(new baf(bu6Var, (byte) 1));
                    arrayDeque.clear();
                    return;
                }
                return;
        }
    }
}
