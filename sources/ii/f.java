package ii;

import android.app.Activity;
import android.content.Context;
import bg.i0;
import bi.h0;
import bi.m2;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.messenger.t3;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.n20;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bn;
import org.telegram.ui.f40;
import org.telegram.ui.fy0;
import org.telegram.ui.gh;
public final class f implements RequestDelegate {
    public final int f16284a = 0;
    public final int f16285b;
    public final long f16286c;
    public final Object d;
    public final Object f16287e;
    public final Object f16288f;
    public final Object f16289g;
    public final Object h;

    public f(int i7, q10 q10Var, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, Runnable runnable, h2 h2Var, long j3) {
        this.f16285b = i7;
        this.d = q10Var;
        this.f16287e = inputCheckPasswordSRP;
        this.f16288f = twoStepVerificationActivity;
        this.f16289g = runnable;
        this.h = h2Var;
        this.f16286c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f16284a;
        int i10 = this.f16285b;
        Object obj = this.h;
        Object obj2 = this.f16289g;
        Object obj3 = this.f16288f;
        Object obj4 = this.f16287e;
        Object obj5 = this.d;
        switch (i7) {
            case 0:
                g0.g3(new i(this.f16285b, tL_error, (q10) obj5, (TLRPC.InputCheckPasswordSRP) obj4, (TwoStepVerificationActivity) obj3, (Runnable) obj2, (h2) obj, this.f16286c));
                return;
            case 1:
                g0.g3(new i(tLObject, this.f16285b, (u1) obj5, (Context) obj4, this.f16286c, (i6) obj3, (org.telegram.ui.web.q) obj2, (h0) obj));
                return;
            case 2:
                f40 f40Var = (f40) obj5;
                HashSet hashSet = (HashSet) obj4;
                AtomicInteger atomicInteger = (AtomicInteger) obj3;
                t3 t3Var = (t3) obj2;
                String str = (String) obj;
                boolean z10 = tLObject instanceof TLRPC.Updates;
                long j3 = this.f16286c;
                if (z10) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    mp.u1(f40Var.f30187a).V3(updates, false);
                    g0.g3(new m2(f40Var, updates, j3, 28));
                } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
                    hashSet.add(Long.valueOf(j3));
                }
                if (atomicInteger.incrementAndGet() == i10 && !hashSet.isEmpty()) {
                    g0.g3(new n20(f40Var, hashSet, t3Var, str, 14));
                    return;
                }
                return;
            case 3:
                String str2 = LaunchActivity.C1;
                g0.g3(new i((LaunchActivity) obj5, tLObject, this.f16285b, (String) obj4, (String) obj3, (TLRPC.User) obj2, (String) obj, this.f16286c));
                return;
            default:
                Activity activity = (Activity) obj5;
                i6 i6Var = (i6) obj4;
                byte[] bArr = (byte[]) obj3;
                bn bnVar = (bn) obj2;
                fj fjVar = (fj) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        g0.g3(new i0(tLObject, activity, i6Var, this.f16286c, bArr, bnVar, fjVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        g0.h3(new fy0(bnVar, activity, i6Var, fjVar, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        g0.h3(new gh(bnVar, i10, fjVar), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    g0.h3(new fy0(bnVar, activity, i6Var, fjVar, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public f(int i7, u1 u1Var, Context context, long j3, i6 i6Var, org.telegram.ui.web.q qVar, h0 h0Var) {
        this.f16285b = i7;
        this.d = u1Var;
        this.f16287e = context;
        this.f16286c = j3;
        this.f16288f = i6Var;
        this.f16289g = qVar;
        this.h = h0Var;
    }

    public f(Activity activity, i6 i6Var, long j3, byte[] bArr, bn bnVar, fj fjVar, int i7) {
        this.d = activity;
        this.f16287e = i6Var;
        this.f16286c = j3;
        this.f16288f = bArr;
        this.f16289g = bnVar;
        this.h = fjVar;
        this.f16285b = i7;
    }

    public f(f40 f40Var, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i7, t3 t3Var, String str) {
        this.d = f40Var;
        this.f16286c = j3;
        this.f16287e = hashSet;
        this.f16288f = atomicInteger;
        this.f16285b = i7;
        this.f16289g = t3Var;
        this.h = str;
    }

    public f(LaunchActivity launchActivity, int i7, String str, String str2, TLRPC.User user, String str3, long j3) {
        this.d = launchActivity;
        this.f16285b = i7;
        this.f16287e = str;
        this.f16288f = str2;
        this.f16289g = user;
        this.h = str3;
        this.f16286c = j3;
    }
}
