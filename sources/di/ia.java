package di;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.zy;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ia implements Runnable {
    public final int f9037a = 0;
    public final boolean f9038b;
    public final boolean f9039c;
    public final int d;
    public final Object f9040e;
    public final Object f9041f;
    public final Object h;
    public final Object f9042n;

    public ia(int i7, hi.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, org.telegram.ui.ActionBar.x2[] x2VarArr) {
        this.f9040e = dVar;
        this.f9041f = x2VarArr;
        this.d = i7;
        this.f9038b = z10;
        this.h = starsSubscription;
        this.f9039c = z11;
        this.f9042n = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.ia.run():void");
    }

    public ia(zy zyVar, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i7) {
        this.f9040e = zyVar;
        this.f9038b = z10;
        this.f9041f = message;
        this.h = arrayList;
        this.f9039c = z11;
        this.f9042n = arrayList2;
        this.d = i7;
    }

    public ia(zi.u0 u0Var, zi.x xVar, boolean z10, File file, boolean z11, int i7, zi.q0 q0Var) {
        this.f9040e = u0Var;
        this.f9041f = xVar;
        this.f9038b = z10;
        this.h = file;
        this.f9039c = z11;
        this.d = i7;
        this.f9042n = q0Var;
    }
}
