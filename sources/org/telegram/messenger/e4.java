package org.telegram.messenger;

import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class e4 implements ResultCallback {
    public final ig.b f23665a;
    public final org.telegram.ui.ee f23666b;

    public e4(ig.b bVar, org.telegram.ui.ee eeVar) {
        this.f23665a = bVar;
        this.f23666b = eeVar;
    }

    @Override
    public final void onComplete(Object obj) {
        org.telegram.ui.ee eeVar;
        org.telegram.ui.ActionBar.t3 t3Var;
        Iterator it = ((List) obj).iterator();
        do {
            boolean hasNext = it.hasNext();
            eeVar = this.f23666b;
            if (hasNext) {
                t3Var = (org.telegram.ui.ActionBar.t3) it.next();
            } else {
                eeVar.onComplete(null);
                return;
            }
        } while (!this.f23665a.equals(t3Var.f30001c));
        t3Var.k();
        eeVar.onComplete(t3Var);
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        this.f23666b.onComplete(null);
    }
}
