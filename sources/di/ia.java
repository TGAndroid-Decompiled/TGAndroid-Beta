package di;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.zy;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ia implements Runnable {
    public final int f9025a = 0;
    public final boolean f9026b;
    public final boolean f9027c;
    public final int d;
    public final Object f9028e;
    public final Object f9029f;
    public final Object h;
    public final Object f9030n;

    public ia(int i7, hi.e eVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, org.telegram.ui.ActionBar.w2[] w2VarArr) {
        this.f9028e = eVar;
        this.f9029f = w2VarArr;
        this.d = i7;
        this.f9026b = z10;
        this.h = starsSubscription;
        this.f9027c = z11;
        this.f9030n = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.ia.run():void");
    }

    public ia(zy zyVar, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i7) {
        this.f9028e = zyVar;
        this.f9026b = z10;
        this.f9029f = message;
        this.h = arrayList;
        this.f9027c = z11;
        this.f9030n = arrayList2;
        this.d = i7;
    }

    public ia(zi.u0 u0Var, zi.x xVar, boolean z10, File file, boolean z11, int i7, zi.q0 q0Var) {
        this.f9028e = u0Var;
        this.f9029f = xVar;
        this.f9026b = z10;
        this.h = file;
        this.f9027c = z11;
        this.d = i7;
        this.f9030n = q0Var;
    }
}
