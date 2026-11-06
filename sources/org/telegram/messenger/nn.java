package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class nn implements Runnable {
    public final int f24197a = 1;
    public final boolean f24198b;
    public final boolean f24199c;
    public final c1 d;
    public final Object f24200e;
    public final Object f24201f;
    public final Object h;

    public nn(qp qpVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.TL_channels_editAdmin tL_channels_editAdmin, boolean z9, boolean z10) {
        this.d = qpVar;
        this.f24200e = tL_error;
        this.f24201f = f2Var;
        this.h = tL_channels_editAdmin;
        this.f24198b = z9;
        this.f24199c = z10;
    }

    @Override
    public final void run() {
        int i7 = this.f24197a;
        Object obj = this.h;
        Object obj2 = this.f24201f;
        Object obj3 = this.f24200e;
        c1 c1Var = this.d;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.v4.c0(((qp) c1Var).currentAccount, (TLRPC.TL_error) obj3, (org.telegram.ui.ActionBar.f2) obj2, (TLRPC.TL_channels_editAdmin) obj, Boolean.valueOf(this.f24198b), Boolean.valueOf(this.f24199c));
                return;
            default:
                dt.e((dt) c1Var, (ArrayList) obj3, (ArrayList) obj2, this.f24198b, this.f24199c, (CountDownLatch) obj);
                return;
        }
    }

    public nn(dt dtVar, ArrayList arrayList, ArrayList arrayList2, boolean z9, boolean z10, CountDownLatch countDownLatch) {
        this.d = dtVar;
        this.f24200e = arrayList;
        this.f24201f = arrayList2;
        this.f24198b = z9;
        this.f24199c = z10;
        this.h = countDownLatch;
    }
}
