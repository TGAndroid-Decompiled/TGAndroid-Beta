package org.telegram.messenger;

import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class f4 implements ResultCallback {
    public final yf.b f15690a;
    public final org.telegram.ui.re f15691b;

    public f4(yf.b bVar, org.telegram.ui.re reVar) {
        this.f15690a = bVar;
        this.f15691b = reVar;
    }

    @Override
    public final void onComplete(Object obj) {
        org.telegram.ui.re reVar;
        org.telegram.ui.ActionBar.y3 y3Var;
        Iterator it = ((List) obj).iterator();
        do {
            boolean hasNext = it.hasNext();
            reVar = this.f15691b;
            if (hasNext) {
                y3Var = (org.telegram.ui.ActionBar.y3) it.next();
            } else {
                reVar.onComplete(null);
                return;
            }
        } while (!this.f15690a.equals(y3Var.f21561c));
        y3Var.k();
        reVar.onComplete(y3Var);
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        this.f15691b.onComplete(null);
    }
}
