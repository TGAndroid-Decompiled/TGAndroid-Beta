package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class dn implements Runnable {
    public final int f22224a = 0;
    public final boolean f22225b;
    public final boolean f22226c;
    public final c1 d;
    public final Object f22227e;
    public final Object f22228f;
    public final Object h;

    public dn(hp hpVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.TL_channels_editAdmin tL_channels_editAdmin, boolean z10, boolean z11) {
        this.d = hpVar;
        this.f22227e = tL_error;
        this.f22228f = d2Var;
        this.h = tL_channels_editAdmin;
        this.f22225b = z10;
        this.f22226c = z11;
    }

    @Override
    public final void run() {
        int i3 = this.f22224a;
        Object obj = this.h;
        Object obj2 = this.f22228f;
        Object obj3 = this.f22227e;
        c1 c1Var = this.d;
        switch (i3) {
            case 0:
                org.telegram.ui.Components.t4.e0(((hp) c1Var).currentAccount, (TLRPC.TL_error) obj3, (org.telegram.ui.ActionBar.d2) obj2, (TLRPC.TL_channels_editAdmin) obj, Boolean.valueOf(this.f22225b), Boolean.valueOf(this.f22226c));
                return;
            default:
                us.e((us) c1Var, (ArrayList) obj3, (ArrayList) obj2, this.f22225b, this.f22226c, (CountDownLatch) obj);
                return;
        }
    }

    public dn(us usVar, ArrayList arrayList, ArrayList arrayList2, boolean z10, boolean z11, CountDownLatch countDownLatch) {
        this.d = usVar;
        this.f22227e = arrayList;
        this.f22228f = arrayList2;
        this.f22225b = z10;
        this.f22226c = z11;
        this.h = countDownLatch;
    }
}
