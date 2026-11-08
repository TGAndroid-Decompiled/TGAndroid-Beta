package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class nn implements Runnable {
    public final int f24208a = 1;
    public final boolean f24209b;
    public final boolean f24210c;
    public final c1 d;
    public final Object f24211e;
    public final Object f24212f;
    public final Object h;

    public nn(qp qpVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.TL_channels_editAdmin tL_channels_editAdmin, boolean z9, boolean z10) {
        this.d = qpVar;
        this.f24211e = tL_error;
        this.f24212f = f2Var;
        this.h = tL_channels_editAdmin;
        this.f24209b = z9;
        this.f24210c = z10;
    }

    @Override
    public final void run() {
        int i7 = this.f24208a;
        Object obj = this.h;
        Object obj2 = this.f24212f;
        Object obj3 = this.f24211e;
        c1 c1Var = this.d;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.v4.c0(((qp) c1Var).currentAccount, (TLRPC.TL_error) obj3, (org.telegram.ui.ActionBar.f2) obj2, (TLRPC.TL_channels_editAdmin) obj, Boolean.valueOf(this.f24209b), Boolean.valueOf(this.f24210c));
                return;
            default:
                dt.e((dt) c1Var, (ArrayList) obj3, (ArrayList) obj2, this.f24209b, this.f24210c, (CountDownLatch) obj);
                return;
        }
    }

    public nn(dt dtVar, ArrayList arrayList, ArrayList arrayList2, boolean z9, boolean z10, CountDownLatch countDownLatch) {
        this.d = dtVar;
        this.f24211e = arrayList;
        this.f24212f = arrayList2;
        this.f24209b = z9;
        this.f24210c = z10;
        this.h = countDownLatch;
    }
}
