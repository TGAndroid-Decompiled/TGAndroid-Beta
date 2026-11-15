package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class kn implements Runnable {
    public final int f24733a = 1;
    public final boolean f24734b;
    public final boolean f24735c;
    public final c1 d;
    public final Object f24736e;
    public final Object f24737f;
    public final Object h;

    public kn(np npVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.TL_channels_editAdmin tL_channels_editAdmin, boolean z10, boolean z11) {
        this.d = npVar;
        this.f24736e = tL_error;
        this.f24737f = e2Var;
        this.h = tL_channels_editAdmin;
        this.f24734b = z10;
        this.f24735c = z11;
    }

    @Override
    public final void run() {
        int i7 = this.f24733a;
        Object obj = this.h;
        Object obj2 = this.f24737f;
        Object obj3 = this.f24736e;
        c1 c1Var = this.d;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.t4.c0(((np) c1Var).currentAccount, (TLRPC.TL_error) obj3, (org.telegram.ui.ActionBar.e2) obj2, (TLRPC.TL_channels_editAdmin) obj, Boolean.valueOf(this.f24734b), Boolean.valueOf(this.f24735c));
                return;
            default:
                at.e((at) c1Var, (ArrayList) obj3, (ArrayList) obj2, this.f24734b, this.f24735c, (CountDownLatch) obj);
                return;
        }
    }

    public kn(at atVar, ArrayList arrayList, ArrayList arrayList2, boolean z10, boolean z11, CountDownLatch countDownLatch) {
        this.d = atVar;
        this.f24736e = arrayList;
        this.f24737f = arrayList2;
        this.f24734b = z10;
        this.f24735c = z11;
        this.h = countDownLatch;
    }
}
