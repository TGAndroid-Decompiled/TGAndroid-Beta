package org.telegram.messenger;

import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class c4 implements ResultCallback {
    public final ig.b f21742a;
    public final org.telegram.ui.fe f21743b;

    public c4(ig.b bVar, org.telegram.ui.fe feVar) {
        this.f21742a = bVar;
        this.f21743b = feVar;
    }

    @Override
    public final void onComplete(Object obj) {
        org.telegram.ui.fe feVar;
        org.telegram.ui.ActionBar.r3 r3Var;
        Iterator it = ((List) obj).iterator();
        do {
            boolean hasNext = it.hasNext();
            feVar = this.f21743b;
            if (hasNext) {
                r3Var = (org.telegram.ui.ActionBar.r3) it.next();
            } else {
                feVar.onComplete(null);
                return;
            }
        } while (!this.f21742a.equals(r3Var.f28458c));
        r3Var.k();
        feVar.onComplete(r3Var);
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        this.f21743b.onComplete(null);
    }
}
