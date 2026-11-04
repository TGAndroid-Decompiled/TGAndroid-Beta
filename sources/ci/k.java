package ci;

import android.app.Activity;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.li;
import org.telegram.messenger.mi;
import org.telegram.messenger.t00;
import org.telegram.messenger.x00;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class k implements Runnable {
    public final int f5365a = 0;
    public final boolean f5366b;
    public final long f5367c;
    public final Object d;
    public final Object f5368e;
    public final Object f5369f;
    public final Object h;
    public final Object f5370n;

    public k(v vVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j10, TLObject tLObject) {
        this.d = vVar;
        this.f5368e = tL_error;
        this.f5369f = twoStepVerificationActivity;
        this.h = activity;
        this.f5366b = z10;
        this.f5367c = j10;
        this.f5370n = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ci.k.run():void");
    }

    public k(li liVar, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.h hVar, long j10) {
        this.d = liVar;
        this.f5368e = arrayList;
        this.f5366b = z10;
        this.f5369f = arrayList2;
        this.h = arrayList3;
        this.f5370n = hVar;
        this.f5367c = j10;
    }

    public k(mi miVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, long j10, d4 d4Var) {
        this.d = miVar;
        this.f5368e = tL_error;
        this.f5370n = tLObject;
        this.f5369f = tL_chatInviteImporter;
        this.f5366b = z10;
        this.f5367c = j10;
        this.h = d4Var;
    }

    public k(x00 x00Var, t00 t00Var, TLObject tLObject, boolean z10, TLRPC.TL_error tL_error, long j10, HashSet hashSet) {
        this.d = x00Var;
        this.f5369f = t00Var;
        this.f5370n = tLObject;
        this.f5366b = z10;
        this.f5368e = tL_error;
        this.f5367c = j10;
        this.h = hashSet;
    }
}
