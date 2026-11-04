package org.telegram.messenger;

import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class c4 implements ResultCallback {
    public final jg.b f21938a;
    public final org.telegram.ui.de f21939b;

    public c4(jg.b bVar, org.telegram.ui.de deVar) {
        this.f21938a = bVar;
        this.f21939b = deVar;
    }

    @Override
    public final void onComplete(Object obj) {
        org.telegram.ui.de deVar;
        org.telegram.ui.ActionBar.p3 p3Var;
        Iterator it = ((List) obj).iterator();
        do {
            boolean hasNext = it.hasNext();
            deVar = this.f21939b;
            if (hasNext) {
                p3Var = (org.telegram.ui.ActionBar.p3) it.next();
            } else {
                deVar.onComplete(null);
                return;
            }
        } while (!this.f21938a.equals(p3Var.f28421c));
        p3Var.k();
        deVar.onComplete(p3Var);
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        this.f21939b.onComplete(null);
    }
}
