package di;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ez;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class fa implements Runnable {
    public final int f8558a = 0;
    public final boolean f8559b;
    public final boolean f8560c;
    public final int d;
    public final Object f8561e;
    public final Object f8562f;
    public final Object h;
    public final Object f8563n;

    public fa(int i7, hi.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, org.telegram.ui.ActionBar.u2[] u2VarArr) {
        this.f8561e = dVar;
        this.f8562f = u2VarArr;
        this.d = i7;
        this.f8559b = z10;
        this.h = starsSubscription;
        this.f8560c = z11;
        this.f8563n = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.fa.run():void");
    }

    public fa(ez ezVar, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i7) {
        this.f8561e = ezVar;
        this.f8559b = z10;
        this.f8562f = message;
        this.h = arrayList;
        this.f8560c = z11;
        this.f8563n = arrayList2;
        this.d = i7;
    }

    public fa(zi.v0 v0Var, zi.y yVar, boolean z10, File file, boolean z11, int i7, zi.r0 r0Var) {
        this.f8561e = v0Var;
        this.f8562f = yVar;
        this.f8559b = z10;
        this.h = file;
        this.f8560c = z11;
        this.d = i7;
        this.f8563n = r0Var;
    }
}
