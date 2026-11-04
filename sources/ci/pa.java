package ci;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.yy;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class pa implements Runnable {
    public final int f5774a = 0;
    public final boolean f5775b;
    public final boolean f5776c;
    public final int d;
    public final Object f5777e;
    public final Object f5778f;
    public final Object h;
    public final Object f5779n;

    public pa(int i3, gi.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, org.telegram.ui.ActionBar.t2[] t2VarArr) {
        this.f5777e = dVar;
        this.f5778f = t2VarArr;
        this.d = i3;
        this.f5775b = z10;
        this.h = starsSubscription;
        this.f5776c = z11;
        this.f5779n = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ci.pa.run():void");
    }

    public pa(yy yyVar, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i3) {
        this.f5777e = yyVar;
        this.f5775b = z10;
        this.f5778f = message;
        this.h = arrayList;
        this.f5776c = z11;
        this.f5779n = arrayList2;
        this.d = i3;
    }

    public pa(wi.t0 t0Var, wi.w wVar, boolean z10, File file, boolean z11, int i3, wi.p0 p0Var) {
        this.f5777e = t0Var;
        this.f5778f = wVar;
        this.f5775b = z10;
        this.h = file;
        this.f5776c = z11;
        this.d = i3;
        this.f5779n = p0Var;
    }
}
