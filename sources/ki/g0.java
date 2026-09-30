package ki;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e3;
public final class g0 implements Runnable {
    public final int f13685a = 2;
    public final boolean f13686b;
    public final boolean f13687c;
    public final int d;
    public final Object e;
    public final Object f13688f;
    public final Object h;
    public final Object f13689n;

    public g0(int i10, ci.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, e3[] e3VarArr) {
        this.e = dVar;
        this.f13688f = e3VarArr;
        this.d = i10;
        this.f13686b = z10;
        this.h = starsSubscription;
        this.f13687c = z11;
        this.f13689n = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ki.g0.run():void");
    }

    public g0(s0 s0Var, t tVar, boolean z10, File file, boolean z11, int i10, o0 o0Var) {
        this.e = s0Var;
        this.f13688f = tVar;
        this.f13686b = z10;
        this.h = file;
        this.f13687c = z11;
        this.d = i10;
        this.f13689n = o0Var;
    }

    public g0(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i10) {
        this.e = sendMessagesHelper;
        this.f13686b = z10;
        this.f13688f = message;
        this.h = arrayList;
        this.f13687c = z11;
        this.f13689n = arrayList2;
        this.d = i10;
    }
}
