package bi;

import android.app.Activity;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.b10;
import org.telegram.messenger.f10;
import org.telegram.messenger.ui;
import org.telegram.messenger.vi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class l implements Runnable {
    public final int f4238a = 0;
    public final boolean f4239b;
    public final long f4240c;
    public final Object d;
    public final Object f4241e;
    public final Object f4242f;
    public final Object h;
    public final Object f4243n;

    public l(z zVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z9, long j3, TLObject tLObject) {
        this.d = zVar;
        this.f4241e = tL_error;
        this.f4242f = twoStepVerificationActivity;
        this.h = activity;
        this.f4239b = z9;
        this.f4240c = j3;
        this.f4243n = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.l.run():void");
    }

    public l(ui uiVar, ArrayList arrayList, boolean z9, ArrayList arrayList2, ArrayList arrayList3, a0.h hVar, long j3) {
        this.d = uiVar;
        this.f4241e = arrayList;
        this.f4239b = z9;
        this.f4242f = arrayList2;
        this.h = arrayList3;
        this.f4243n = hVar;
        this.f4240c = j3;
    }

    public l(vi viVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z9, long j3, t4 t4Var) {
        this.d = viVar;
        this.f4241e = tL_error;
        this.f4243n = tLObject;
        this.f4242f = tL_chatInviteImporter;
        this.f4239b = z9;
        this.f4240c = j3;
        this.h = t4Var;
    }

    public l(f10 f10Var, b10 b10Var, TLObject tLObject, boolean z9, TLRPC.TL_error tL_error, long j3, HashSet hashSet) {
        this.d = f10Var;
        this.f4242f = b10Var;
        this.f4243n = tLObject;
        this.f4239b = z9;
        this.f4241e = tL_error;
        this.f4240c = j3;
        this.h = hashSet;
    }
}
