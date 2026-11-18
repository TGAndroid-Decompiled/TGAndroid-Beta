package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class gn implements Runnable {
    public final int f24284a = 0;
    public final boolean f24285b;
    public final boolean f24286c;
    public final c1 d;
    public final Object f24287e;
    public final Object f24288f;
    public final Object h;

    public gn(mp mpVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.h2 h2Var, TLRPC.TL_channels_editAdmin tL_channels_editAdmin, boolean z10, boolean z11) {
        this.d = mpVar;
        this.f24287e = tL_error;
        this.f24288f = h2Var;
        this.h = tL_channels_editAdmin;
        this.f24285b = z10;
        this.f24286c = z11;
    }

    @Override
    public final void run() {
        int i7 = this.f24284a;
        Object obj = this.h;
        Object obj2 = this.f24288f;
        Object obj3 = this.f24287e;
        c1 c1Var = this.d;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.b5.c0(((mp) c1Var).currentAccount, (TLRPC.TL_error) obj3, (org.telegram.ui.ActionBar.h2) obj2, (TLRPC.TL_channels_editAdmin) obj, Boolean.valueOf(this.f24285b), Boolean.valueOf(this.f24286c));
                return;
            default:
                xs.e((xs) c1Var, (ArrayList) obj3, (ArrayList) obj2, this.f24285b, this.f24286c, (CountDownLatch) obj);
                return;
        }
    }

    public gn(xs xsVar, ArrayList arrayList, ArrayList arrayList2, boolean z10, boolean z11, CountDownLatch countDownLatch) {
        this.d = xsVar;
        this.f24287e = arrayList;
        this.f24288f = arrayList2;
        this.f24285b = z10;
        this.f24286c = z11;
        this.h = countDownLatch;
    }
}
