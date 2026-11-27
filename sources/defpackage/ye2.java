package defpackage;

import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class ye2 implements ResultCallback {
    public final dpb a;
    public final el1 b;

    public ye2(dpb dpbVar, el1 el1Var) {
        this.a = dpbVar;
        this.b = el1Var;
    }

    @Override
    public final void onComplete(Object obj) {
        el1 el1Var;
        ez3 ez3Var;
        Iterator it = ((List) obj).iterator();
        do {
            boolean hasNext = it.hasNext();
            el1Var = this.b;
            if (hasNext) {
                ez3Var = (ez3) it.next();
            } else {
                el1Var.onComplete(null);
                return;
            }
        } while (!this.a.equals(ez3Var.c));
        ez3Var.k();
        el1Var.onComplete(ez3Var);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        this.b.onComplete(null);
    }

    @Override
    public final void onError(Throwable th) {
    }
}
