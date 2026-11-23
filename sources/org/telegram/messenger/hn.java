package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class hn implements Runnable {
    public final int f24512a = 0;
    public final boolean f24513b;
    public final boolean f24514c;
    public final c1 d;
    public final Object f24515e;
    public final Object f24516f;
    public final Object h;

    public hn(np npVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.TL_channels_editAdmin tL_channels_editAdmin, boolean z10, boolean z11) {
        this.d = npVar;
        this.f24515e = tL_error;
        this.f24516f = g2Var;
        this.h = tL_channels_editAdmin;
        this.f24513b = z10;
        this.f24514c = z11;
    }

    @Override
    public final void run() {
        int i7 = this.f24512a;
        Object obj = this.h;
        Object obj2 = this.f24516f;
        Object obj3 = this.f24515e;
        c1 c1Var = this.d;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.c5.c0(((np) c1Var).currentAccount, (TLRPC.TL_error) obj3, (org.telegram.ui.ActionBar.g2) obj2, (TLRPC.TL_channels_editAdmin) obj, Boolean.valueOf(this.f24513b), Boolean.valueOf(this.f24514c));
                return;
            default:
                ys.e((ys) c1Var, (ArrayList) obj3, (ArrayList) obj2, this.f24513b, this.f24514c, (CountDownLatch) obj);
                return;
        }
    }

    public hn(ys ysVar, ArrayList arrayList, ArrayList arrayList2, boolean z10, boolean z11, CountDownLatch countDownLatch) {
        this.d = ysVar;
        this.f24515e = arrayList;
        this.f24516f = arrayList2;
        this.f24513b = z10;
        this.f24514c = z11;
        this.h = countDownLatch;
    }
}
