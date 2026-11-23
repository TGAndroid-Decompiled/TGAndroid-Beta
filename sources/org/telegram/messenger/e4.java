package org.telegram.messenger;

import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class e4 implements ResultCallback {
    public final ig.b f23764a;
    public final org.telegram.ui.ee f23765b;

    public e4(ig.b bVar, org.telegram.ui.ee eeVar) {
        this.f23764a = bVar;
        this.f23765b = eeVar;
    }

    @Override
    public final void onComplete(Object obj) {
        org.telegram.ui.ee eeVar;
        org.telegram.ui.ActionBar.s3 s3Var;
        Iterator it = ((List) obj).iterator();
        do {
            boolean hasNext = it.hasNext();
            eeVar = this.f23765b;
            if (hasNext) {
                s3Var = (org.telegram.ui.ActionBar.s3) it.next();
            } else {
                eeVar.onComplete(null);
                return;
            }
        } while (!this.f23764a.equals(s3Var.f30047c));
        s3Var.k();
        eeVar.onComplete(s3Var);
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        this.f23765b.onComplete(null);
    }
}
