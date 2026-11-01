package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class en implements Runnable {
    public final int f15613a = 1;
    public final boolean f15614b;
    public final boolean f15615c;
    public final f1 d;
    public final Object e;
    public final Object f15616f;
    public final Object h;

    public en(wp wpVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.k2 k2Var, TLRPC.TL_channels_editAdmin tL_channels_editAdmin, boolean z10, boolean z11) {
        this.d = wpVar;
        this.e = tL_error;
        this.f15616f = k2Var;
        this.h = tL_channels_editAdmin;
        this.f15614b = z10;
        this.f15615c = z11;
    }

    @Override
    public final void run() {
        int i10 = this.f15613a;
        Object obj = this.h;
        Object obj2 = this.f15616f;
        Object obj3 = this.e;
        f1 f1Var = this.d;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.s4.e0(((wp) f1Var).currentAccount, (TLRPC.TL_error) obj3, (org.telegram.ui.ActionBar.k2) obj2, (TLRPC.TL_channels_editAdmin) obj, Boolean.valueOf(this.f15614b), Boolean.valueOf(this.f15615c));
                return;
            default:
                pt.e((pt) f1Var, (ArrayList) obj3, (ArrayList) obj2, this.f15614b, this.f15615c, (CountDownLatch) obj);
                return;
        }
    }

    public en(pt ptVar, ArrayList arrayList, ArrayList arrayList2, boolean z10, boolean z11, CountDownLatch countDownLatch) {
        this.d = ptVar;
        this.e = arrayList;
        this.f15616f = arrayList2;
        this.f15614b = z10;
        this.f15615c = z11;
        this.h = countDownLatch;
    }
}
