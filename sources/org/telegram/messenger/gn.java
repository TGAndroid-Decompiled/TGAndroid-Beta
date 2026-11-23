package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class gn implements Runnable {
    public final int f24382a = 0;
    public final boolean f24383b;
    public final boolean f24384c;
    public final c1 d;
    public final Object f24385e;
    public final Object f24386f;
    public final Object h;

    public gn(mp mpVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.TL_channels_editAdmin tL_channels_editAdmin, boolean z10, boolean z11) {
        this.d = mpVar;
        this.f24385e = tL_error;
        this.f24386f = g2Var;
        this.h = tL_channels_editAdmin;
        this.f24383b = z10;
        this.f24384c = z11;
    }

    @Override
    public final void run() {
        int i7 = this.f24382a;
        Object obj = this.h;
        Object obj2 = this.f24386f;
        Object obj3 = this.f24385e;
        c1 c1Var = this.d;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.b5.c0(((mp) c1Var).currentAccount, (TLRPC.TL_error) obj3, (org.telegram.ui.ActionBar.g2) obj2, (TLRPC.TL_channels_editAdmin) obj, Boolean.valueOf(this.f24383b), Boolean.valueOf(this.f24384c));
                return;
            default:
                xs.e((xs) c1Var, (ArrayList) obj3, (ArrayList) obj2, this.f24383b, this.f24384c, (CountDownLatch) obj);
                return;
        }
    }

    public gn(xs xsVar, ArrayList arrayList, ArrayList arrayList2, boolean z10, boolean z11, CountDownLatch countDownLatch) {
        this.d = xsVar;
        this.f24385e = arrayList;
        this.f24386f = arrayList2;
        this.f24383b = z10;
        this.f24384c = z11;
        this.h = countDownLatch;
    }
}
