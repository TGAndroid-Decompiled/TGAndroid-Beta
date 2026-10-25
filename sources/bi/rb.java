package bi;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class rb implements Runnable {
    public final int f5366a = 0;
    public final boolean f5367b;
    public final boolean f5368c;
    public final int d;
    public final Object e;
    public final Object f5369f;
    public final Object h;
    public final Object f5370n;

    public rb(int i10, fi.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, org.telegram.ui.ActionBar.k3[] k3VarArr) {
        this.e = dVar;
        this.f5369f = k3VarArr;
        this.d = i10;
        this.f5367b = z10;
        this.h = starsSubscription;
        this.f5368c = z11;
        this.f5370n = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.rb.run():void");
    }

    public rb(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i10) {
        this.e = sendMessagesHelper;
        this.f5367b = z10;
        this.f5369f = message;
        this.h = arrayList;
        this.f5368c = z11;
        this.f5370n = arrayList2;
        this.d = i10;
    }

    public rb(vi.s0 s0Var, vi.v vVar, boolean z10, File file, boolean z11, int i10, vi.o0 o0Var) {
        this.e = s0Var;
        this.f5369f = vVar;
        this.f5367b = z10;
        this.h = file;
        this.f5368c = z11;
        this.d = i10;
        this.f5370n = o0Var;
    }
}
