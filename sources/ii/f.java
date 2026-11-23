package ii;

import android.app.Activity;
import android.content.Context;
import bg.i0;
import bi.h0;
import bi.s2;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.messenger.t3;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.xz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bn;
import org.telegram.ui.dy0;
import org.telegram.ui.e40;
import org.telegram.ui.hh;
public final class f implements RequestDelegate {
    public final int f16375a = 0;
    public final int f16376b;
    public final long f16377c;
    public final Object d;
    public final Object f16378e;
    public final Object f16379f;
    public final Object f16380g;
    public final Object h;

    public f(int i7, p10 p10Var, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, Runnable runnable, g2 g2Var, long j3) {
        this.f16376b = i7;
        this.d = p10Var;
        this.f16378e = inputCheckPasswordSRP;
        this.f16379f = twoStepVerificationActivity;
        this.f16380g = runnable;
        this.h = g2Var;
        this.f16377c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f16375a;
        int i10 = this.f16376b;
        Object obj = this.h;
        Object obj2 = this.f16380g;
        Object obj3 = this.f16379f;
        Object obj4 = this.f16378e;
        Object obj5 = this.d;
        switch (i7) {
            case 0:
                g0.g3(new i(this.f16376b, tL_error, (p10) obj5, (TLRPC.InputCheckPasswordSRP) obj4, (TwoStepVerificationActivity) obj3, (Runnable) obj2, (g2) obj, this.f16377c));
                return;
            case 1:
                g0.g3(new i(tLObject, this.f16376b, (t1) obj5, (Context) obj4, this.f16377c, (i6) obj3, (org.telegram.ui.web.q) obj2, (h0) obj));
                return;
            case 2:
                e40 e40Var = (e40) obj5;
                HashSet hashSet = (HashSet) obj4;
                AtomicInteger atomicInteger = (AtomicInteger) obj3;
                t3 t3Var = (t3) obj2;
                String str = (String) obj;
                boolean z10 = tLObject instanceof TLRPC.Updates;
                long j3 = this.f16377c;
                if (z10) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    mp.u1(e40Var.f30223a).V3(updates, false);
                    g0.g3(new s2(e40Var, updates, j3, 28));
                } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
                    hashSet.add(Long.valueOf(j3));
                }
                if (atomicInteger.incrementAndGet() == i10 && !hashSet.isEmpty()) {
                    g0.g3(new xz(e40Var, hashSet, t3Var, str, 15));
                    return;
                }
                return;
            case 3:
                String str2 = LaunchActivity.C1;
                g0.g3(new i((LaunchActivity) obj5, tLObject, this.f16376b, (String) obj4, (String) obj3, (TLRPC.User) obj2, (String) obj, this.f16377c));
                return;
            default:
                Activity activity = (Activity) obj5;
                i6 i6Var = (i6) obj4;
                byte[] bArr = (byte[]) obj3;
                bn bnVar = (bn) obj2;
                fj fjVar = (fj) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        g0.g3(new i0(tLObject, activity, i6Var, this.f16377c, bArr, bnVar, fjVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        g0.h3(new dy0(bnVar, activity, i6Var, fjVar, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        g0.h3(new hh(bnVar, i10, fjVar), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    g0.h3(new dy0(bnVar, activity, i6Var, fjVar, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public f(int i7, t1 t1Var, Context context, long j3, i6 i6Var, org.telegram.ui.web.q qVar, h0 h0Var) {
        this.f16376b = i7;
        this.d = t1Var;
        this.f16378e = context;
        this.f16377c = j3;
        this.f16379f = i6Var;
        this.f16380g = qVar;
        this.h = h0Var;
    }

    public f(Activity activity, i6 i6Var, long j3, byte[] bArr, bn bnVar, fj fjVar, int i7) {
        this.d = activity;
        this.f16378e = i6Var;
        this.f16377c = j3;
        this.f16379f = bArr;
        this.f16380g = bnVar;
        this.h = fjVar;
        this.f16376b = i7;
    }

    public f(e40 e40Var, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i7, t3 t3Var, String str) {
        this.d = e40Var;
        this.f16377c = j3;
        this.f16378e = hashSet;
        this.f16379f = atomicInteger;
        this.f16376b = i7;
        this.f16380g = t3Var;
        this.h = str;
    }

    public f(LaunchActivity launchActivity, int i7, String str, String str2, TLRPC.User user, String str3, long j3) {
        this.d = launchActivity;
        this.f16376b = i7;
        this.f16378e = str;
        this.f16379f = str2;
        this.f16380g = user;
        this.h = str3;
        this.f16377c = j3;
    }
}
