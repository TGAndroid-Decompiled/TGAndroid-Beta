package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class xs0 implements RequestDelegate {
    public final byte a = 0;
    public final int b;
    public final long c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public xs0(int i, he heVar, Context context, long j, ylb ylbVar, bv0 bv0Var, p pVar) {
        this.b = i;
        this.d = heVar;
        this.e = context;
        this.c = j;
        this.f = ylbVar;
        this.g = bv0Var;
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
                gm.c3(new at0(tLObject, this.b, (he) obj5, (Context) obj3, this.c, (ylb) obj4, (bv0) obj2, (p) obj));
                return;
            case 1:
                gm.c3(new at0(this.b, tL_error, (qt0) obj5, (TLRPC.TL_inputCheckPasswordSRP) obj3, (TwoStepVerificationActivity) obj4, (wz) obj2, (d) obj, this.c));
                return;
            case 2:
                g95 g95Var = (g95) obj5;
                HashSet hashSet = (HashSet) obj3;
                AtomicInteger atomicInteger = (AtomicInteger) obj4;
                qd2 qd2Var = (qd2) obj2;
                String str = (String) obj;
                boolean z = tLObject instanceof TLRPC.Updates;
                long j = this.c;
                if (z) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    oc7.r1(g95Var.a).T3(updates, false);
                    gm.c3(new of2(g95Var, updates, j, (byte) 24));
                } else {
                    g95Var.getClass();
                    if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
                        hashSet.add(Long.valueOf(j));
                    }
                }
                if (atomicInteger.incrementAndGet() == i && !hashSet.isEmpty()) {
                    gm.c3(new d65(g95Var, hashSet, qd2Var, str, (byte) 1));
                    return;
                }
                return;
            case 3:
                String str2 = LaunchActivity.C1;
                gm.c3(new at0((LaunchActivity) obj5, tLObject, this.b, (String) obj3, (String) obj4, (TLRPC.User) obj2, (String) obj, this.c));
                return;
            default:
                Activity activity = (Activity) obj5;
                ylb ylbVar = (ylb) obj4;
                byte[] bArr = (byte[]) obj3;
                yv1 yv1Var = (yv1) obj2;
                k47 k47Var = (k47) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        gm.c3(new rr6((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject, activity, ylbVar, this.c, bArr, yv1Var, k47Var, (byte) 4));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        gm.d3(new t99(yv1Var, activity, ylbVar, k47Var, (byte) 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        gm.d3(new vp1(yv1Var, i, k47Var), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    gm.d3(new t99(yv1Var, activity, ylbVar, k47Var, (byte) 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public xs0(int i, qt0 qt0Var, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, wz wzVar, d dVar, long j) {
        this.b = i;
        this.d = qt0Var;
        this.e = tL_inputCheckPasswordSRP;
        this.f = twoStepVerificationActivity;
        this.g = wzVar;
        this.h = dVar;
        this.c = j;
    }

    public xs0(g95 g95Var, long j, HashSet hashSet, AtomicInteger atomicInteger, int i, qd2 qd2Var, String str) {
        this.d = g95Var;
        this.c = j;
        this.e = hashSet;
        this.f = atomicInteger;
        this.b = i;
        this.g = qd2Var;
        this.h = str;
    }

    public xs0(Activity activity, ylb ylbVar, long j, byte[] bArr, yv1 yv1Var, k47 k47Var, int i) {
        this.d = activity;
        this.f = ylbVar;
        this.c = j;
        this.e = bArr;
        this.g = yv1Var;
        this.h = k47Var;
        this.b = i;
    }

    public xs0(LaunchActivity launchActivity, int i, String str, String str2, TLRPC.User user, String str3, long j) {
        this.d = launchActivity;
        this.b = i;
        this.e = str;
        this.f = str2;
        this.g = user;
        this.h = str3;
        this.c = j;
    }
}
