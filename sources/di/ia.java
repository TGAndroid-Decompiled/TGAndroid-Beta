package di;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.az;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ia implements Runnable {
    public final int f9028a = 0;
    public final boolean f9029b;
    public final boolean f9030c;
    public final int d;
    public final Object f9031e;
    public final Object f9032f;
    public final Object h;
    public final Object f9033n;

    public ia(int i7, hi.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, org.telegram.ui.ActionBar.w2[] w2VarArr) {
        this.f9031e = dVar;
        this.f9032f = w2VarArr;
        this.d = i7;
        this.f9029b = z10;
        this.h = starsSubscription;
        this.f9030c = z11;
        this.f9033n = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.ia.run():void");
    }

    public ia(az azVar, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i7) {
        this.f9031e = azVar;
        this.f9029b = z10;
        this.f9032f = message;
        this.h = arrayList;
        this.f9030c = z11;
        this.f9033n = arrayList2;
        this.d = i7;
    }

    public ia(zi.u0 u0Var, zi.x xVar, boolean z10, File file, boolean z11, int i7, zi.q0 q0Var) {
        this.f9031e = u0Var;
        this.f9032f = xVar;
        this.f9029b = z10;
        this.h = file;
        this.f9030c = z11;
        this.d = i7;
        this.f9033n = q0Var;
    }
}
