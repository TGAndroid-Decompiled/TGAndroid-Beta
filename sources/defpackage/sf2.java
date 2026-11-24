package defpackage;

import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class sf2 implements ResultCallback {
    public final fnb a;
    public final gm1 b;

    public sf2(fnb fnbVar, gm1 gm1Var) {
        this.a = fnbVar;
        this.b = gm1Var;
    }

    @Override
    public final void onComplete(Object obj) {
        gm1 gm1Var;
        tz3 tz3Var;
        Iterator it = ((List) obj).iterator();
        do {
            boolean hasNext = it.hasNext();
            gm1Var = this.b;
            if (hasNext) {
                tz3Var = (tz3) it.next();
            } else {
                gm1Var.onComplete(null);
                return;
            }
        } while (!this.a.equals(tz3Var.c));
        tz3Var.k();
        gm1Var.onComplete(tz3Var);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        this.b.onComplete(null);
    }

    @Override
    public final void onError(Throwable th) {
    }
}
