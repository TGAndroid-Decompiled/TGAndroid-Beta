package ai;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class vb implements Runnable {
    public final int f2337a = 0;
    public final boolean f2338b;
    public final boolean f2339c;
    public final int d;
    public final Object e;
    public final Object f2340f;
    public final Object h;
    public final Object f2341n;

    public vb(int i10, ei.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.e = dVar;
        this.f2340f = f3VarArr;
        this.d = i10;
        this.f2338b = z10;
        this.h = starsSubscription;
        this.f2339c = z11;
        this.f2341n = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.vb.run():void");
    }

    public vb(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i10) {
        this.e = sendMessagesHelper;
        this.f2338b = z10;
        this.f2340f = message;
        this.h = arrayList;
        this.f2339c = z11;
        this.f2341n = arrayList2;
        this.d = i10;
    }

    public vb(si.t0 t0Var, si.x xVar, boolean z10, File file, boolean z11, int i10, si.p0 p0Var) {
        this.e = t0Var;
        this.f2340f = xVar;
        this.f2338b = z10;
        this.h = file;
        this.f2339c = z11;
        this.d = i10;
        this.f2341n = p0Var;
    }
}
