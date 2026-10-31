package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class dn implements Runnable {
    public final int f15283a = 1;
    public final boolean f15284b;
    public final boolean f15285c;
    public final f1 d;
    public final Object e;
    public final Object f15286f;
    public final Object h;

    public dn(vp vpVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.k2 k2Var, TLRPC.TL_channels_editAdmin tL_channels_editAdmin, boolean z10, boolean z11) {
        this.d = vpVar;
        this.e = tL_error;
        this.f15286f = k2Var;
        this.h = tL_channels_editAdmin;
        this.f15284b = z10;
        this.f15285c = z11;
    }

    @Override
    public final void run() {
        int i10 = this.f15283a;
        Object obj = this.h;
        Object obj2 = this.f15286f;
        Object obj3 = this.e;
        f1 f1Var = this.d;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.s4.e0(((vp) f1Var).currentAccount, (TLRPC.TL_error) obj3, (org.telegram.ui.ActionBar.k2) obj2, (TLRPC.TL_channels_editAdmin) obj, Boolean.valueOf(this.f15284b), Boolean.valueOf(this.f15285c));
                return;
            default:
                ot.e((ot) f1Var, (ArrayList) obj3, (ArrayList) obj2, this.f15284b, this.f15285c, (CountDownLatch) obj);
                return;
        }
    }

    public dn(ot otVar, ArrayList arrayList, ArrayList arrayList2, boolean z10, boolean z11, CountDownLatch countDownLatch) {
        this.d = otVar;
        this.e = arrayList;
        this.f15286f = arrayList2;
        this.f15284b = z10;
        this.f15285c = z11;
        this.h = countDownLatch;
    }
}
