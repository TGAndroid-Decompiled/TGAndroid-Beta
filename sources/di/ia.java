package di;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.zy;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ia implements Runnable {
    public final int f9040a = 0;
    public final boolean f9041b;
    public final boolean f9042c;
    public final int d;
    public final Object f9043e;
    public final Object f9044f;
    public final Object h;
    public final Object f9045n;

    public ia(int i7, hi.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, org.telegram.ui.ActionBar.x2[] x2VarArr) {
        this.f9043e = dVar;
        this.f9044f = x2VarArr;
        this.d = i7;
        this.f9041b = z10;
        this.h = starsSubscription;
        this.f9042c = z11;
        this.f9045n = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.ia.run():void");
    }

    public ia(zy zyVar, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i7) {
        this.f9043e = zyVar;
        this.f9041b = z10;
        this.f9044f = message;
        this.h = arrayList;
        this.f9042c = z11;
        this.f9045n = arrayList2;
        this.d = i7;
    }

    public ia(zi.u0 u0Var, zi.x xVar, boolean z10, File file, boolean z11, int i7, zi.q0 q0Var) {
        this.f9043e = u0Var;
        this.f9044f = xVar;
        this.f9041b = z10;
        this.h = file;
        this.f9042c = z11;
        this.d = i7;
        this.f9045n = q0Var;
    }
}
