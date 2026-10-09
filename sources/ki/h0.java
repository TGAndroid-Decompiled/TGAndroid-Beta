package ki;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f3;
public final class h0 implements Runnable {
    public final int f14937a = 2;
    public final boolean f14938b;
    public final boolean f14939c;
    public final int d;
    public final Object f14940e;
    public final Object f14941f;
    public final Object h;
    public final Object f14942n;

    public h0(int i10, ci.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, f3[] f3VarArr) {
        this.f14940e = dVar;
        this.f14941f = f3VarArr;
        this.d = i10;
        this.f14938b = z10;
        this.h = starsSubscription;
        this.f14939c = z11;
        this.f14942n = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ki.h0.run():void");
    }

    public h0(t0 t0Var, u uVar, boolean z10, File file, boolean z11, int i10, p0 p0Var) {
        this.f14940e = t0Var;
        this.f14941f = uVar;
        this.f14938b = z10;
        this.h = file;
        this.f14939c = z11;
        this.d = i10;
        this.f14942n = p0Var;
    }

    public h0(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i10) {
        this.f14940e = sendMessagesHelper;
        this.f14938b = z10;
        this.f14941f = message;
        this.h = arrayList;
        this.f14939c = z11;
        this.f14942n = arrayList2;
        this.d = i10;
    }
}
