package ki;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e3;
public final class g0 implements Runnable {
    public final int f13687a = 2;
    public final boolean f13688b;
    public final boolean f13689c;
    public final int d;
    public final Object e;
    public final Object f13690f;
    public final Object h;
    public final Object f13691n;

    public g0(int i10, ci.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, e3[] e3VarArr) {
        this.e = dVar;
        this.f13690f = e3VarArr;
        this.d = i10;
        this.f13688b = z10;
        this.h = starsSubscription;
        this.f13689c = z11;
        this.f13691n = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ki.g0.run():void");
    }

    public g0(r0 r0Var, t tVar, boolean z10, File file, boolean z11, int i10, n0 n0Var) {
        this.e = r0Var;
        this.f13690f = tVar;
        this.f13688b = z10;
        this.h = file;
        this.f13689c = z11;
        this.d = i10;
        this.f13691n = n0Var;
    }

    public g0(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i10) {
        this.e = sendMessagesHelper;
        this.f13688b = z10;
        this.f13690f = message;
        this.h = arrayList;
        this.f13689c = z11;
        this.f13691n = arrayList2;
        this.d = i10;
    }
}
