package ii;

import android.app.Activity;
import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.hp;
import org.telegram.messenger.zi;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.v60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ch;
import org.telegram.ui.tx0;
import org.telegram.ui.wm;
import org.telegram.ui.x30;
public final class x0 implements RequestDelegate {
    public final int f15310a = 0;
    public final long f15311b;
    public final int f15312c;
    public final Object d;
    public final Object f15313e;
    public final Object f15314f;
    public final Object f15315g;
    public final Object h;

    public x0(int i3, org.telegram.ui.ActionBar.s1 s1Var, Context context, long j10, e6 e6Var, org.telegram.ui.web.r rVar, ai.n0 n0Var) {
        this.f15312c = i3;
        this.d = s1Var;
        this.f15313e = context;
        this.f15311b = j10;
        this.f15314f = e6Var;
        this.f15315g = rVar;
        this.h = n0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i3 = this.f15310a;
        int i10 = this.f15312c;
        Object obj = this.h;
        Object obj2 = this.f15315g;
        Object obj3 = this.f15313e;
        Object obj4 = this.f15314f;
        Object obj5 = this.d;
        switch (i3) {
            case 0:
                org.telegram.messenger.g0.h3(new z0(tLObject, this.f15312c, (org.telegram.ui.ActionBar.s1) obj5, (Context) obj3, this.f15311b, (e6) obj4, (org.telegram.ui.web.r) obj2, (ai.n0) obj));
                return;
            case 1:
                x30 x30Var = (x30) obj5;
                HashSet hashSet = (HashSet) obj3;
                AtomicInteger atomicInteger = (AtomicInteger) obj4;
                org.telegram.messenger.r3 r3Var = (org.telegram.messenger.r3) obj2;
                String str = (String) obj;
                boolean z10 = tLObject instanceof TLRPC.Updates;
                long j10 = this.f15311b;
                if (z10) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    hp.s1(x30Var.f28583a).O3(updates, false);
                    org.telegram.messenger.g0.h3(new ai.r1(x30Var, updates, j10, 28));
                } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
                    hashSet.add(Long.valueOf(j10));
                }
                if (atomicInteger.incrementAndGet() == i10 && !hashSet.isEmpty()) {
                    org.telegram.messenger.g0.h3(new v60(x30Var, hashSet, r3Var, str, 13));
                    return;
                }
                return;
            case 2:
                String str2 = LaunchActivity.E1;
                org.telegram.messenger.g0.h3(new z0((LaunchActivity) obj5, tLObject, this.f15312c, (String) obj3, (String) obj4, (TLRPC.User) obj2, (String) obj, this.f15311b));
                return;
            default:
                Activity activity = (Activity) obj5;
                e6 e6Var = (e6) obj4;
                byte[] bArr = (byte[]) obj3;
                wm wmVar = (wm) obj2;
                zi ziVar = (zi) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        org.telegram.messenger.g0.h3(new cg.g0(tLObject, activity, e6Var, this.f15311b, bArr, wmVar, ziVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        org.telegram.messenger.g0.i3(new tx0(wmVar, activity, e6Var, ziVar, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        org.telegram.messenger.g0.i3(new ch(wmVar, i10, ziVar), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    org.telegram.messenger.g0.i3(new tx0(wmVar, activity, e6Var, ziVar, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public x0(Activity activity, e6 e6Var, long j10, byte[] bArr, wm wmVar, zi ziVar, int i3) {
        this.d = activity;
        this.f15314f = e6Var;
        this.f15311b = j10;
        this.f15313e = bArr;
        this.f15315g = wmVar;
        this.h = ziVar;
        this.f15312c = i3;
    }

    public x0(x30 x30Var, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i3, org.telegram.messenger.r3 r3Var, String str) {
        this.d = x30Var;
        this.f15311b = j10;
        this.f15313e = hashSet;
        this.f15314f = atomicInteger;
        this.f15312c = i3;
        this.f15315g = r3Var;
        this.h = str;
    }

    public x0(LaunchActivity launchActivity, int i3, String str, String str2, TLRPC.User user, String str3, long j10) {
        this.d = launchActivity;
        this.f15312c = i3;
        this.f15313e = str;
        this.f15314f = str2;
        this.f15315g = user;
        this.h = str3;
        this.f15311b = j10;
    }
}
