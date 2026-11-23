package ii;

import android.app.Activity;
import android.content.Context;
import bg.i0;
import bi.h0;
import bi.q2;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.messenger.t3;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.q20;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bn;
import org.telegram.ui.f40;
import org.telegram.ui.fy0;
import org.telegram.ui.hh;
public final class f implements RequestDelegate {
    public final int f16312a = 0;
    public final int f16313b;
    public final long f16314c;
    public final Object d;
    public final Object f16315e;
    public final Object f16316f;
    public final Object f16317g;
    public final Object h;

    public f(int i7, r10 r10Var, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, Runnable runnable, g2 g2Var, long j3) {
        this.f16313b = i7;
        this.d = r10Var;
        this.f16315e = inputCheckPasswordSRP;
        this.f16316f = twoStepVerificationActivity;
        this.f16317g = runnable;
        this.h = g2Var;
        this.f16314c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f16312a;
        int i10 = this.f16313b;
        Object obj = this.h;
        Object obj2 = this.f16317g;
        Object obj3 = this.f16316f;
        Object obj4 = this.f16315e;
        Object obj5 = this.d;
        switch (i7) {
            case 0:
                g0.g3(new i(this.f16313b, tL_error, (r10) obj5, (TLRPC.InputCheckPasswordSRP) obj4, (TwoStepVerificationActivity) obj3, (Runnable) obj2, (g2) obj, this.f16314c));
                return;
            case 1:
                g0.g3(new i(tLObject, this.f16313b, (t1) obj5, (Context) obj4, this.f16314c, (h6) obj3, (org.telegram.ui.web.q) obj2, (h0) obj));
                return;
            case 2:
                f40 f40Var = (f40) obj5;
                HashSet hashSet = (HashSet) obj4;
                AtomicInteger atomicInteger = (AtomicInteger) obj3;
                t3 t3Var = (t3) obj2;
                String str = (String) obj;
                boolean z10 = tLObject instanceof TLRPC.Updates;
                long j3 = this.f16314c;
                if (z10) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    np.u1(f40Var.f30173a).V3(updates, false);
                    g0.g3(new q2(f40Var, updates, j3, 28));
                } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
                    hashSet.add(Long.valueOf(j3));
                }
                if (atomicInteger.incrementAndGet() == i10 && !hashSet.isEmpty()) {
                    g0.g3(new q20(f40Var, hashSet, t3Var, str, 14));
                    return;
                }
                return;
            case 3:
                String str2 = LaunchActivity.C1;
                g0.g3(new i((LaunchActivity) obj5, tLObject, this.f16313b, (String) obj4, (String) obj3, (TLRPC.User) obj2, (String) obj, this.f16314c));
                return;
            default:
                Activity activity = (Activity) obj5;
                h6 h6Var = (h6) obj4;
                byte[] bArr = (byte[]) obj3;
                bn bnVar = (bn) obj2;
                gj gjVar = (gj) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        g0.g3(new i0(tLObject, activity, h6Var, this.f16314c, bArr, bnVar, gjVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        g0.h3(new fy0(bnVar, activity, h6Var, gjVar, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        g0.h3(new hh(bnVar, i10, gjVar), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    g0.h3(new fy0(bnVar, activity, h6Var, gjVar, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public f(int i7, t1 t1Var, Context context, long j3, h6 h6Var, org.telegram.ui.web.q qVar, h0 h0Var) {
        this.f16313b = i7;
        this.d = t1Var;
        this.f16315e = context;
        this.f16314c = j3;
        this.f16316f = h6Var;
        this.f16317g = qVar;
        this.h = h0Var;
    }

    public f(Activity activity, h6 h6Var, long j3, byte[] bArr, bn bnVar, gj gjVar, int i7) {
        this.d = activity;
        this.f16315e = h6Var;
        this.f16314c = j3;
        this.f16316f = bArr;
        this.f16317g = bnVar;
        this.h = gjVar;
        this.f16313b = i7;
    }

    public f(f40 f40Var, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i7, t3 t3Var, String str) {
        this.d = f40Var;
        this.f16314c = j3;
        this.f16315e = hashSet;
        this.f16316f = atomicInteger;
        this.f16313b = i7;
        this.f16317g = t3Var;
        this.h = str;
    }

    public f(LaunchActivity launchActivity, int i7, String str, String str2, TLRPC.User user, String str3, long j3) {
        this.d = launchActivity;
        this.f16313b = i7;
        this.f16315e = str;
        this.f16316f = str2;
        this.f16317g = user;
        this.h = str3;
        this.f16314c = j3;
    }
}
