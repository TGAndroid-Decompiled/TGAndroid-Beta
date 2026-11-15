package org.telegram.messenger;

import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class c4 implements ResultCallback {
    public final ig.b f22798a;
    public final org.telegram.ui.ce f22799b;

    public c4(ig.b bVar, org.telegram.ui.ce ceVar) {
        this.f22798a = bVar;
        this.f22799b = ceVar;
    }

    @Override
    public final void onComplete(Object obj) {
        org.telegram.ui.ce ceVar;
        org.telegram.ui.ActionBar.p3 p3Var;
        Iterator it = ((List) obj).iterator();
        do {
            boolean hasNext = it.hasNext();
            ceVar = this.f22799b;
            if (hasNext) {
                p3Var = (org.telegram.ui.ActionBar.p3) it.next();
            } else {
                ceVar.onComplete(null);
                return;
            }
        } while (!this.f22798a.equals(p3Var.f29472c));
        p3Var.k();
        ceVar.onComplete(p3Var);
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        this.f22799b.onComplete(null);
    }
}
