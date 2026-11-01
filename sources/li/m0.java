package li;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.rz;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.z2;
public final class m0 implements Runnable {
    public final int f12177a = 2;
    public final boolean f12178b;
    public final boolean f12179c;
    public final int d;
    public final Object e;
    public final Object f12180f;
    public final Object h;
    public final Object f12181n;

    public m0(int i10, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, vh.d dVar, boolean z10, boolean z11, z2[] z2VarArr) {
        this.e = dVar;
        this.f12180f = z2VarArr;
        this.d = i10;
        this.f12178b = z10;
        this.h = starsSubscription;
        this.f12179c = z11;
        this.f12181n = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: li.m0.run():void");
    }

    public m0(x0 x0Var, z zVar, boolean z10, File file, boolean z11, int i10, t0 t0Var) {
        this.e = x0Var;
        this.f12180f = zVar;
        this.f12178b = z10;
        this.h = file;
        this.f12179c = z11;
        this.d = i10;
        this.f12181n = t0Var;
    }

    public m0(rz rzVar, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i10) {
        this.e = rzVar;
        this.f12178b = z10;
        this.f12180f = message;
        this.h = arrayList;
        this.f12179c = z11;
        this.f12181n = arrayList2;
        this.d = i10;
    }
}
