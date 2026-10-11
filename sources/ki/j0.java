package ki;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e3;
public final class j0 implements Runnable {
    public final int f14955a = 2;
    public final boolean f14956b;
    public final boolean f14957c;
    public final int d;
    public final Object f14958e;
    public final Object f14959f;
    public final Object h;
    public final Object f14960n;

    public j0(int i10, ci.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, e3[] e3VarArr) {
        this.f14958e = dVar;
        this.f14959f = e3VarArr;
        this.d = i10;
        this.f14956b = z10;
        this.h = starsSubscription;
        this.f14957c = z11;
        this.f14960n = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ki.j0.run():void");
    }

    public j0(v0 v0Var, w wVar, boolean z10, File file, boolean z11, int i10, r0 r0Var) {
        this.f14958e = v0Var;
        this.f14959f = wVar;
        this.f14956b = z10;
        this.h = file;
        this.f14957c = z11;
        this.d = i10;
        this.f14960n = r0Var;
    }

    public j0(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i10) {
        this.f14958e = sendMessagesHelper;
        this.f14956b = z10;
        this.f14959f = message;
        this.h = arrayList;
        this.f14957c = z11;
        this.f14960n = arrayList2;
        this.d = i10;
    }
}
