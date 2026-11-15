package ki;

import android.app.Activity;
import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.gj;
import org.telegram.messenger.np;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.u80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.ay0;
import org.telegram.ui.c40;
import org.telegram.ui.gh;
public final class x0 implements RequestDelegate {
    public final int f18640a = 0;
    public final long f18641b;
    public final int f18642c;
    public final Object d;
    public final Object f18643e;
    public final Object f18644f;
    public final Object f18645g;
    public final Object h;

    public x0(int i7, org.telegram.ui.ActionBar.t1 t1Var, Context context, long j3, e6 e6Var, org.telegram.ui.web.q qVar, bi.h0 h0Var) {
        this.f18642c = i7;
        this.d = t1Var;
        this.f18643e = context;
        this.f18641b = j3;
        this.f18644f = e6Var;
        this.f18645g = qVar;
        this.h = h0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f18640a;
        int i10 = this.f18642c;
        Object obj = this.h;
        Object obj2 = this.f18645g;
        Object obj3 = this.f18643e;
        Object obj4 = this.f18644f;
        Object obj5 = this.d;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.h3(new z0(tLObject, this.f18642c, (org.telegram.ui.ActionBar.t1) obj5, (Context) obj3, this.f18641b, (e6) obj4, (org.telegram.ui.web.q) obj2, (bi.h0) obj));
                return;
            case 1:
                c40 c40Var = (c40) obj5;
                HashSet hashSet = (HashSet) obj3;
                AtomicInteger atomicInteger = (AtomicInteger) obj4;
                org.telegram.messenger.r3 r3Var = (org.telegram.messenger.r3) obj2;
                String str = (String) obj;
                boolean z10 = tLObject instanceof TLRPC.Updates;
                long j3 = this.f18641b;
                if (z10) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    np.s1(c40Var.f29679a).O3(updates, false);
                    org.telegram.messenger.g0.h3(new bi.m1(c40Var, updates, j3, 28));
                } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
                    hashSet.add(Long.valueOf(j3));
                }
                if (atomicInteger.incrementAndGet() == i10 && !hashSet.isEmpty()) {
                    org.telegram.messenger.g0.h3(new u80(c40Var, hashSet, r3Var, str, 11));
                    return;
                }
                return;
            case 2:
                String str2 = LaunchActivity.C1;
                org.telegram.messenger.g0.h3(new z0((LaunchActivity) obj5, tLObject, this.f18642c, (String) obj3, (String) obj4, (TLRPC.User) obj2, (String) obj, this.f18641b));
                return;
            default:
                Activity activity = (Activity) obj5;
                e6 e6Var = (e6) obj4;
                byte[] bArr = (byte[]) obj3;
                an anVar = (an) obj2;
                gj gjVar = (gj) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        org.telegram.messenger.g0.h3(new bg.h0(tLObject, activity, e6Var, this.f18641b, bArr, anVar, gjVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        org.telegram.messenger.g0.i3(new ay0(anVar, activity, e6Var, gjVar, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        org.telegram.messenger.g0.i3(new gh(anVar, i10, gjVar), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    org.telegram.messenger.g0.i3(new ay0(anVar, activity, e6Var, gjVar, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public x0(Activity activity, e6 e6Var, long j3, byte[] bArr, an anVar, gj gjVar, int i7) {
        this.d = activity;
        this.f18644f = e6Var;
        this.f18641b = j3;
        this.f18643e = bArr;
        this.f18645g = anVar;
        this.h = gjVar;
        this.f18642c = i7;
    }

    public x0(c40 c40Var, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i7, org.telegram.messenger.r3 r3Var, String str) {
        this.d = c40Var;
        this.f18641b = j3;
        this.f18643e = hashSet;
        this.f18644f = atomicInteger;
        this.f18642c = i7;
        this.f18645g = r3Var;
        this.h = str;
    }

    public x0(LaunchActivity launchActivity, int i7, String str, String str2, TLRPC.User user, String str3, long j3) {
        this.d = launchActivity;
        this.f18642c = i7;
        this.f18643e = str;
        this.f18644f = str2;
        this.f18645g = user;
        this.h = str3;
        this.f18641b = j3;
    }
}
