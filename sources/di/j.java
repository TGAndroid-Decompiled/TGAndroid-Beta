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
    public final int f8834a = 0;
    public final boolean f8835b;
    public final long f8836c;
    public final Object d;
    public final Object f8837e;
    public final Object f8838f;
    public final Object h;
    public final Object f8839n;

    public j(t tVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3, TLObject tLObject) {
        this.d = tVar;
        this.f8837e = tL_error;
        this.f8838f = twoStepVerificationActivity;
        this.h = activity;
        this.f8835b = z10;
        this.f8836c = j3;
        this.f8839n = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.j.run():void");
    }

    public j(si siVar, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.h hVar, long j3) {
        this.d = siVar;
        this.f8837e = arrayList;
        this.f8835b = z10;
        this.f8838f = arrayList2;
        this.h = arrayList3;
        this.f8839n = hVar;
        this.f8836c = j3;
    }

    public j(ti tiVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, long j3, u3 u3Var) {
        this.d = tiVar;
        this.f8837e = tL_error;
        this.f8839n = tLObject;
        this.f8838f = tL_chatInviteImporter;
        this.f8835b = z10;
        this.f8836c = j3;
        this.h = u3Var;
    }

    public j(c10 c10Var, y00 y00Var, TLObject tLObject, boolean z10, TLRPC.TL_error tL_error, long j3, HashSet hashSet) {
        this.d = c10Var;
        this.f8838f = y00Var;
        this.f8839n = tLObject;
        this.f8835b = z10;
        this.f8837e = tL_error;
        this.f8836c = j3;
        this.h = hashSet;
    }
}
