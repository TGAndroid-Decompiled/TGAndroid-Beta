package defpackage;

import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class he2 implements ResultCallback {
    public final elb a;
    public final yk1 b;

    public he2(elb elbVar, yk1 yk1Var) {
        this.a = elbVar;
        this.b = yk1Var;
    }

    @Override
    public final void onComplete(Object obj) {
        yk1 yk1Var;
        jy3 jy3Var;
        Iterator it = ((List) obj).iterator();
        do {
            boolean hasNext = it.hasNext();
            yk1Var = this.b;
            if (hasNext) {
                jy3Var = (jy3) it.next();
            } else {
                yk1Var.onComplete(null);
                return;
            }
        } while (!this.a.equals(jy3Var.c));
        jy3Var.k();
        yk1Var.onComplete(jy3Var);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        this.b.onComplete(null);
    }

    @Override
    public final void onError(Throwable th) {
    }
}
