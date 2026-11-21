package di;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.zy;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ia implements Runnable {
    public final int f9061a = 0;
    public final boolean f9062b;
    public final boolean f9063c;
    public final int d;
    public final Object f9064e;
    public final Object f9065f;
    public final Object h;
    public final Object f9066n;

    public ia(int i7, hi.e eVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, org.telegram.ui.ActionBar.w2[] w2VarArr) {
        this.f9064e = eVar;
        this.f9065f = w2VarArr;
        this.d = i7;
        this.f9062b = z10;
        this.h = starsSubscription;
        this.f9063c = z11;
        this.f9066n = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.ia.run():void");
    }

    public ia(zy zyVar, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i7) {
        this.f9064e = zyVar;
        this.f9062b = z10;
        this.f9065f = message;
        this.h = arrayList;
        this.f9063c = z11;
        this.f9066n = arrayList2;
        this.d = i7;
    }

    public ia(zi.u0 u0Var, zi.x xVar, boolean z10, File file, boolean z11, int i7, zi.q0 q0Var) {
        this.f9064e = u0Var;
        this.f9065f = xVar;
        this.f9062b = z10;
        this.h = file;
        this.f9063c = z11;
        this.d = i7;
        this.f9066n = q0Var;
    }
}
