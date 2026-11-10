package hi;

import android.app.Activity;
import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
import org.telegram.ui.f40;
import org.telegram.ui.gy0;
import org.telegram.ui.ih;
public final class w0 implements RequestDelegate {
    public final int f15015a = 0;
    public final long f15016b;
    public final int f15017c;
    public final Object d;
    public final Object f15018e;
    public final Object f15019f;
    public final Object f15020g;
    public final Object h;

    public w0(int i7, org.telegram.ui.ActionBar.u1 u1Var, Context context, long j3, h6 h6Var, org.telegram.ui.web.p pVar, bi.t0 t0Var) {
        this.f15017c = i7;
        this.d = u1Var;
        this.f15018e = context;
        this.f15016b = j3;
        this.f15019f = h6Var;
        this.f15020g = pVar;
        this.h = t0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f15015a;
        int i10 = this.f15017c;
        Object obj = this.h;
        Object obj2 = this.f15020g;
        Object obj3 = this.f15018e;
        Object obj4 = this.f15019f;
        Object obj5 = this.d;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.h3(new y0(tLObject, this.f15017c, (org.telegram.ui.ActionBar.u1) obj5, (Context) obj3, this.f15016b, (h6) obj4, (org.telegram.ui.web.p) obj2, (bi.t0) obj));
                return;
            case 1:
                f40 f40Var = (f40) obj5;
                HashSet hashSet = (HashSet) obj3;
                AtomicInteger atomicInteger = (AtomicInteger) obj4;
                org.telegram.messenger.r3 r3Var = (org.telegram.messenger.r3) obj2;
                String str = (String) obj;
                boolean z9 = tLObject instanceof TLRPC.Updates;
                long j3 = this.f15016b;
                if (z9) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    qp.s1(f40Var.f28669a).O3(updates, false);
                    org.telegram.messenger.g0.h3(new bi.d3(f40Var, updates, j3, 27));
                } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
                    hashSet.add(Long.valueOf(j3));
                }
                if (atomicInteger.incrementAndGet() == i10 && !hashSet.isEmpty()) {
                    org.telegram.messenger.g0.h3(new kn0(f40Var, hashSet, r3Var, str, 7));
                    return;
                }
                return;
            case 2:
                String str2 = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new y0((LaunchActivity) obj5, tLObject, this.f15017c, (String) obj3, (String) obj4, (TLRPC.User) obj2, (String) obj, this.f15016b));
                return;
            default:
                Activity activity = (Activity) obj5;
                h6 h6Var = (h6) obj4;
                byte[] bArr = (byte[]) obj3;
                cn cnVar = (cn) obj2;
                ij ijVar = (ij) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        org.telegram.messenger.g0.h3(new bg.h0(tLObject, activity, h6Var, this.f15016b, bArr, cnVar, ijVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        org.telegram.messenger.g0.i3(new gy0(cnVar, activity, h6Var, ijVar, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        org.telegram.messenger.g0.i3(new ih(cnVar, i10, ijVar), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    org.telegram.messenger.g0.i3(new gy0(cnVar, activity, h6Var, ijVar, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public w0(Activity activity, h6 h6Var, long j3, byte[] bArr, cn cnVar, ij ijVar, int i7) {
        this.d = activity;
        this.f15019f = h6Var;
        this.f15016b = j3;
        this.f15018e = bArr;
        this.f15020g = cnVar;
        this.h = ijVar;
        this.f15017c = i7;
    }

    public w0(f40 f40Var, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i7, org.telegram.messenger.r3 r3Var, String str) {
        this.d = f40Var;
        this.f15016b = j3;
        this.f15018e = hashSet;
        this.f15019f = atomicInteger;
        this.f15017c = i7;
        this.f15020g = r3Var;
        this.h = str;
    }

    public w0(LaunchActivity launchActivity, int i7, String str, String str2, TLRPC.User user, String str3, long j3) {
        this.d = launchActivity;
        this.f15017c = i7;
        this.f15018e = str;
        this.f15019f = str2;
        this.f15020g = user;
        this.h = str3;
        this.f15016b = j3;
    }
}
