package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class xr0 implements RequestDelegate {
    public final byte a = 0;
    public final int b;
    public final long c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public xr0(int i, id idVar, Context context, long j, vnb vnbVar, bu0 bu0Var, p pVar) {
        this.b = i;
        this.d = idVar;
        this.e = context;
        this.c = j;
        this.f = vnbVar;
        this.g = bu0Var;
        this.h = pVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        int i = this.b;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.e;
        Object obj4 = this.f;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                hl.c3(new as0(tLObject, this.b, (id) obj5, (Context) obj3, this.c, (vnb) obj4, (bu0) obj2, (p) obj));
                return;
            case 1:
                hl.c3(new as0(this.b, tL_error, (qs0) obj5, (TLRPC.TL_inputCheckPasswordSRP) obj3, (TwoStepVerificationActivity) obj4, (wy) obj2, (e) obj, this.c));
                return;
            case 2:
                j95 j95Var = (j95) obj5;
                HashSet hashSet = (HashSet) obj3;
                AtomicInteger atomicInteger = (AtomicInteger) obj4;
                vc2 vc2Var = (vc2) obj2;
                String str = (String) obj;
                boolean z = tLObject instanceof TLRPC.Updates;
                long j = this.c;
                if (z) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    uc7.s1(j95Var.a).Y3(updates, false);
                    hl.c3(new ue2(j95Var, updates, j, (byte) 24));
                } else {
                    j95Var.getClass();
                    if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
                        hashSet.add(Long.valueOf(j));
                    }
                }
                if (atomicInteger.incrementAndGet() == i && !hashSet.isEmpty()) {
                    hl.c3(new g65(j95Var, hashSet, vc2Var, str, (byte) 1));
                    return;
                }
                return;
            case 3:
                String str2 = LaunchActivity.C1;
                hl.c3(new as0((LaunchActivity) obj5, tLObject, this.b, (String) obj3, (String) obj4, (TLRPC.User) obj2, (String) obj, this.c));
                return;
            default:
                Activity activity = (Activity) obj5;
                vnb vnbVar = (vnb) obj4;
                byte[] bArr = (byte[]) obj3;
                zu1 zu1Var = (zu1) obj2;
                r47 r47Var = (r47) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        hl.c3(new sp6((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject, activity, vnbVar, this.c, bArr, zu1Var, r47Var, (byte) 4));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        hl.d3(new eb9(zu1Var, activity, vnbVar, r47Var, (byte) 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        hl.d3(new tl1(zu1Var, i, r47Var), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    hl.d3(new eb9(zu1Var, activity, vnbVar, r47Var, (byte) 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public xr0(int i, qs0 qs0Var, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, wy wyVar, e eVar, long j) {
        this.b = i;
        this.d = qs0Var;
        this.e = tL_inputCheckPasswordSRP;
        this.f = twoStepVerificationActivity;
        this.g = wyVar;
        this.h = eVar;
        this.c = j;
    }

    public xr0(j95 j95Var, long j, HashSet hashSet, AtomicInteger atomicInteger, int i, vc2 vc2Var, String str) {
        this.d = j95Var;
        this.c = j;
        this.e = hashSet;
        this.f = atomicInteger;
        this.b = i;
        this.g = vc2Var;
        this.h = str;
    }

    public xr0(Activity activity, vnb vnbVar, long j, byte[] bArr, zu1 zu1Var, r47 r47Var, int i) {
        this.d = activity;
        this.f = vnbVar;
        this.c = j;
        this.e = bArr;
        this.g = zu1Var;
        this.h = r47Var;
        this.b = i;
    }

    public xr0(LaunchActivity launchActivity, int i, String str, String str2, TLRPC.User user, String str3, long j) {
        this.d = launchActivity;
        this.b = i;
        this.e = str;
        this.f = str2;
        this.g = user;
        this.h = str3;
        this.c = j;
    }
}
