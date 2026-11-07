package bi;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.gz;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class sb implements Runnable {
    public final int f4714a = 0;
    public final boolean f4715b;
    public final boolean f4716c;
    public final int d;
    public final Object f4717e;
    public final Object f4718f;
    public final Object h;
    public final Object f4719n;

    public sb(int i7, fi.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z9, boolean z10, org.telegram.ui.ActionBar.v2[] v2VarArr) {
        this.f4717e = dVar;
        this.f4718f = v2VarArr;
        this.d = i7;
        this.f4715b = z9;
        this.h = starsSubscription;
        this.f4716c = z10;
        this.f4719n = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.sb.run():void");
    }

    public sb(gz gzVar, boolean z9, TLRPC.Message message, ArrayList arrayList, boolean z10, ArrayList arrayList2, int i7) {
        this.f4717e = gzVar;
        this.f4715b = z9;
        this.f4718f = message;
        this.h = arrayList;
        this.f4716c = z10;
        this.f4719n = arrayList2;
        this.d = i7;
    }

    public sb(wi.u0 u0Var, wi.y yVar, boolean z9, File file, boolean z10, int i7, wi.q0 q0Var) {
        this.f4717e = u0Var;
        this.f4718f = yVar;
        this.f4715b = z9;
        this.h = file;
        this.f4716c = z10;
        this.d = i7;
        this.f4719n = q0Var;
    }
}
