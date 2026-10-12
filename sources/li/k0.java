package li;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e3;
public final class k0 implements Runnable {
    public final int f14822a = 2;
    public final boolean f14823b;
    public final boolean f14824c;
    public final int d;
    public final Object e;
    public final Object f14825f;
    public final Object h;
    public final Object f14826n;

    public k0(int i10, di.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, e3[] e3VarArr) {
        this.e = dVar;
        this.f14825f = e3VarArr;
        this.d = i10;
        this.f14823b = z10;
        this.h = starsSubscription;
        this.f14824c = z11;
        this.f14826n = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: li.k0.run():void");
    }

    public k0(u0 u0Var, x xVar, boolean z10, File file, boolean z11, int i10, q0 q0Var) {
        this.e = u0Var;
        this.f14825f = xVar;
        this.f14823b = z10;
        this.h = file;
        this.f14824c = z11;
        this.d = i10;
        this.f14826n = q0Var;
    }

    public k0(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i10) {
        this.e = sendMessagesHelper;
        this.f14823b = z10;
        this.f14825f = message;
        this.h = arrayList;
        this.f14824c = z11;
        this.f14826n = arrayList2;
        this.d = i10;
    }
}
