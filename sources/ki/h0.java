package ki;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e3;
public final class h0 implements Runnable {
    public final int f14936a = 2;
    public final boolean f14937b;
    public final boolean f14938c;
    public final int d;
    public final Object f14939e;
    public final Object f14940f;
    public final Object h;
    public final Object f14941n;

    public h0(int i10, ci.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, e3[] e3VarArr) {
        this.f14939e = dVar;
        this.f14940f = e3VarArr;
        this.d = i10;
        this.f14937b = z10;
        this.h = starsSubscription;
        this.f14938c = z11;
        this.f14941n = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ki.h0.run():void");
    }

    public h0(t0 t0Var, u uVar, boolean z10, File file, boolean z11, int i10, p0 p0Var) {
        this.f14939e = t0Var;
        this.f14940f = uVar;
        this.f14937b = z10;
        this.h = file;
        this.f14938c = z11;
        this.d = i10;
        this.f14941n = p0Var;
    }

    public h0(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i10) {
        this.f14939e = sendMessagesHelper;
        this.f14937b = z10;
        this.f14940f = message;
        this.h = arrayList;
        this.f14938c = z11;
        this.f14941n = arrayList2;
        this.d = i10;
    }
}
