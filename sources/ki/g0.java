package ki;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f3;
public final class g0 implements Runnable {
    public final int f14877a = 2;
    public final boolean f14878b;
    public final boolean f14879c;
    public final int d;
    public final Object f14880e;
    public final Object f14881f;
    public final Object h;
    public final Object f14882n;

    public g0(int i10, ci.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, f3[] f3VarArr) {
        this.f14880e = dVar;
        this.f14881f = f3VarArr;
        this.d = i10;
        this.f14878b = z10;
        this.h = starsSubscription;
        this.f14879c = z11;
        this.f14882n = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ki.g0.run():void");
    }

    public g0(s0 s0Var, t tVar, boolean z10, File file, boolean z11, int i10, o0 o0Var) {
        this.f14880e = s0Var;
        this.f14881f = tVar;
        this.f14878b = z10;
        this.h = file;
        this.f14879c = z11;
        this.d = i10;
        this.f14882n = o0Var;
    }

    public g0(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i10) {
        this.f14880e = sendMessagesHelper;
        this.f14878b = z10;
        this.f14881f = message;
        this.h = arrayList;
        this.f14879c = z11;
        this.f14882n = arrayList2;
        this.d = i10;
    }
}
