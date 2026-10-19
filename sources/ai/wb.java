package ai;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class wb implements Runnable {
    public final int f2388a = 0;
    public final boolean f2389b;
    public final boolean f2390c;
    public final int d;
    public final Object e;
    public final Object f2391f;
    public final Object h;
    public final Object f2392n;

    public wb(int i10, ei.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.e = dVar;
        this.f2391f = f3VarArr;
        this.d = i10;
        this.f2389b = z10;
        this.h = starsSubscription;
        this.f2390c = z11;
        this.f2392n = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.wb.run():void");
    }

    public wb(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i10) {
        this.e = sendMessagesHelper;
        this.f2389b = z10;
        this.f2391f = message;
        this.h = arrayList;
        this.f2390c = z11;
        this.f2392n = arrayList2;
        this.d = i10;
    }

    public wb(si.s0 s0Var, si.w wVar, boolean z10, File file, boolean z11, int i10, si.o0 o0Var) {
        this.e = s0Var;
        this.f2391f = wVar;
        this.f2389b = z10;
        this.h = file;
        this.f2390c = z11;
        this.d = i10;
        this.f2392n = o0Var;
    }
}
