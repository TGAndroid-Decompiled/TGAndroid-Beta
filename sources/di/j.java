package di;

import android.app.Activity;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.c10;
import org.telegram.messenger.si;
import org.telegram.messenger.ti;
import org.telegram.messenger.y00;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class j implements Runnable {
    public final int f8829a = 0;
    public final boolean f8830b;
    public final long f8831c;
    public final Object d;
    public final Object f8832e;
    public final Object f8833f;
    public final Object h;
    public final Object f8834n;

    public j(t tVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3, TLObject tLObject) {
        this.d = tVar;
        this.f8832e = tL_error;
        this.f8833f = twoStepVerificationActivity;
        this.h = activity;
        this.f8830b = z10;
        this.f8831c = j3;
        this.f8834n = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.j.run():void");
    }

    public j(si siVar, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.h hVar, long j3) {
        this.d = siVar;
        this.f8832e = arrayList;
        this.f8830b = z10;
        this.f8833f = arrayList2;
        this.h = arrayList3;
        this.f8834n = hVar;
        this.f8831c = j3;
    }

    public j(ti tiVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, long j3, u3 u3Var) {
        this.d = tiVar;
        this.f8832e = tL_error;
        this.f8834n = tLObject;
        this.f8833f = tL_chatInviteImporter;
        this.f8830b = z10;
        this.f8831c = j3;
        this.h = u3Var;
    }

    public j(c10 c10Var, y00 y00Var, TLObject tLObject, boolean z10, TLRPC.TL_error tL_error, long j3, HashSet hashSet) {
        this.d = c10Var;
        this.f8833f = y00Var;
        this.f8834n = tLObject;
        this.f8830b = z10;
        this.f8832e = tL_error;
        this.f8831c = j3;
        this.h = hashSet;
    }
}
