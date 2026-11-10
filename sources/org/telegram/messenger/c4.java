package org.telegram.messenger;

import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class c4 implements ResultCallback {
    public final ig.b f21783a;
    public final org.telegram.ui.fe f21784b;

    public c4(ig.b bVar, org.telegram.ui.fe feVar) {
        this.f21783a = bVar;
        this.f21784b = feVar;
    }

    @Override
    public final void onComplete(Object obj) {
        org.telegram.ui.fe feVar;
        org.telegram.ui.ActionBar.s3 s3Var;
        Iterator it = ((List) obj).iterator();
        do {
            boolean hasNext = it.hasNext();
            feVar = this.f21784b;
            if (hasNext) {
                s3Var = (org.telegram.ui.ActionBar.s3) it.next();
            } else {
                feVar.onComplete(null);
                return;
            }
        } while (!this.f21783a.equals(s3Var.f28487c));
        s3Var.k();
        feVar.onComplete(s3Var);
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        this.f21784b.onComplete(null);
    }
}
