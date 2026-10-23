package ai;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class xb implements Runnable {
    public final int f2459a = 0;
    public final boolean f2460b;
    public final boolean f2461c;
    public final int d;
    public final Object e;
    public final Object f2462f;
    public final Object h;
    public final Object f2463n;

    public xb(int i10, ei.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, org.telegram.ui.ActionBar.h3[] h3VarArr) {
        this.e = dVar;
        this.f2462f = h3VarArr;
        this.d = i10;
        this.f2460b = z10;
        this.h = starsSubscription;
        this.f2461c = z11;
        this.f2463n = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.xb.run():void");
    }

    public xb(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i10) {
        this.e = sendMessagesHelper;
        this.f2460b = z10;
        this.f2462f = message;
        this.h = arrayList;
        this.f2461c = z11;
        this.f2463n = arrayList2;
        this.d = i10;
    }

    public xb(si.u0 u0Var, si.w wVar, boolean z10, File file, boolean z11, int i10, si.q0 q0Var) {
        this.e = u0Var;
        this.f2462f = wVar;
        this.f2460b = z10;
        this.h = file;
        this.f2461c = z11;
        this.d = i10;
        this.f2463n = q0Var;
    }
}
