package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class gn implements Runnable {
    public final int f24281a = 0;
    public final boolean f24282b;
    public final boolean f24283c;
    public final c1 d;
    public final Object f24284e;
    public final Object f24285f;
    public final Object h;

    public gn(mp mpVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.h2 h2Var, TLRPC.TL_channels_editAdmin tL_channels_editAdmin, boolean z10, boolean z11) {
        this.d = mpVar;
        this.f24284e = tL_error;
        this.f24285f = h2Var;
        this.h = tL_channels_editAdmin;
        this.f24282b = z10;
        this.f24283c = z11;
    }

    @Override
    public final void run() {
        int i7 = this.f24281a;
        Object obj = this.h;
        Object obj2 = this.f24285f;
        Object obj3 = this.f24284e;
        c1 c1Var = this.d;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.b5.c0(((mp) c1Var).currentAccount, (TLRPC.TL_error) obj3, (org.telegram.ui.ActionBar.h2) obj2, (TLRPC.TL_channels_editAdmin) obj, Boolean.valueOf(this.f24282b), Boolean.valueOf(this.f24283c));
                return;
            default:
                xs.e((xs) c1Var, (ArrayList) obj3, (ArrayList) obj2, this.f24282b, this.f24283c, (CountDownLatch) obj);
                return;
        }
    }

    public gn(xs xsVar, ArrayList arrayList, ArrayList arrayList2, boolean z10, boolean z11, CountDownLatch countDownLatch) {
        this.d = xsVar;
        this.f24284e = arrayList;
        this.f24285f = arrayList2;
        this.f24282b = z10;
        this.f24283c = z11;
        this.h = countDownLatch;
    }
}
