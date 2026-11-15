package di;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ez;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ea implements Runnable {
    public final int f8507a = 0;
    public final boolean f8508b;
    public final boolean f8509c;
    public final int d;
    public final Object f8510e;
    public final Object f8511f;
    public final Object h;
    public final Object f8512n;

    public ea(int i7, hi.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, org.telegram.ui.ActionBar.u2[] u2VarArr) {
        this.f8510e = dVar;
        this.f8511f = u2VarArr;
        this.d = i7;
        this.f8508b = z10;
        this.h = starsSubscription;
        this.f8509c = z11;
        this.f8512n = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.ea.run():void");
    }

    public ea(ez ezVar, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i7) {
        this.f8510e = ezVar;
        this.f8508b = z10;
        this.f8511f = message;
        this.h = arrayList;
        this.f8509c = z11;
        this.f8512n = arrayList2;
        this.d = i7;
    }

    public ea(zi.v0 v0Var, zi.y yVar, boolean z10, File file, boolean z11, int i7, zi.r0 r0Var) {
        this.f8510e = v0Var;
        this.f8511f = yVar;
        this.f8508b = z10;
        this.h = file;
        this.f8509c = z11;
        this.d = i7;
        this.f8512n = r0Var;
    }
}
