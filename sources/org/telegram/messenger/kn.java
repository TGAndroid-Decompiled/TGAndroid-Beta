package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class kn implements Runnable {
    public final int f24730a = 1;
    public final boolean f24731b;
    public final boolean f24732c;
    public final c1 d;
    public final Object f24733e;
    public final Object f24734f;
    public final Object h;

    public kn(np npVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.TL_channels_editAdmin tL_channels_editAdmin, boolean z10, boolean z11) {
        this.d = npVar;
        this.f24733e = tL_error;
        this.f24734f = e2Var;
        this.h = tL_channels_editAdmin;
        this.f24731b = z10;
        this.f24732c = z11;
    }

    @Override
    public final void run() {
        int i7 = this.f24730a;
        Object obj = this.h;
        Object obj2 = this.f24734f;
        Object obj3 = this.f24733e;
        c1 c1Var = this.d;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.t4.c0(((np) c1Var).currentAccount, (TLRPC.TL_error) obj3, (org.telegram.ui.ActionBar.e2) obj2, (TLRPC.TL_channels_editAdmin) obj, Boolean.valueOf(this.f24731b), Boolean.valueOf(this.f24732c));
                return;
            default:
                at.e((at) c1Var, (ArrayList) obj3, (ArrayList) obj2, this.f24731b, this.f24732c, (CountDownLatch) obj);
                return;
        }
    }

    public kn(at atVar, ArrayList arrayList, ArrayList arrayList2, boolean z10, boolean z11, CountDownLatch countDownLatch) {
        this.d = atVar;
        this.f24733e = arrayList;
        this.f24734f = arrayList2;
        this.f24731b = z10;
        this.f24732c = z11;
        this.h = countDownLatch;
    }
}
