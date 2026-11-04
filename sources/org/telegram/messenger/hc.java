package org.telegram.messenger;

import android.content.Intent;
import android.os.BatteryManager;
import android.os.Bundle;
import android.os.Environment;
import android.os.SystemClock;
import android.util.LongSparseArray;
import java.io.File;
import java.util.regex.Pattern;
import org.telegram.messenger.support.JobIntentService;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class hc implements Runnable {
    public final int f22914a;

    public hc(int i3) {
        this.f22914a = i3;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.d2 Q;
        switch (this.f22914a) {
            case 0:
                if (!KeepAliveJob.f21289b && KeepAliveJob.f21288a == null) {
                    try {
                        if (r2.f25040a) {
                            a8.b("starting keep-alive job");
                        }
                        synchronized (KeepAliveJob.f21290c) {
                            KeepAliveJob.f21289b = true;
                        }
                        JobIntentService.enqueueWork(t0.f25457b, KeepAliveJob.class, 1000, new Intent());
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 1:
                lc.d(false);
                return;
            case 2:
                int i3 = -1;
                try {
                    BatteryManager batteryManager = (BatteryManager) t0.f25457b.getSystemService("batterymanager");
                    if (batteryManager != null) {
                        i3 = batteryManager.getIntProperty(4);
                    }
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
                lc.f23971l = SystemClock.elapsedRealtime();
                lc.f23972m = false;
                if (i3 >= 0 && i3 <= 100) {
                    lc.f23971l = SystemClock.elapsedRealtime();
                    if (lc.f23970k != i3) {
                        lc.f23970k = i3;
                        g0.h3(new hc(1));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                hs.e().k(274, new Object[0]);
                return;
            case 4:
                hs.e().k(281, new Object[0]);
                return;
            case 5:
                int i10 = LocationSharingService.d;
                for (int i11 = 0; i11 < 4; i11++) {
                    ld.f(i11).t();
                }
                return;
            case 6:
                MediaController.Z1 = null;
                MediaController.O(0);
                return;
            case 7:
                try {
                    g0.f.n(t0.f25457b);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 8:
                org.telegram.ui.ActionBar.k6.F(false);
                return;
            case 9:
                hs.e().k(254, new Object[0]);
                return;
            case 10:
                az.y();
                return;
            case 11:
                try {
                    File file = new File(Environment.getExternalStorageDirectory(), "Telegram");
                    File file2 = new File(file, "Telegram Images");
                    file2.mkdir();
                    File file3 = new File(file, "Telegram Video");
                    file3.mkdir();
                    if (!r2.f25041b) {
                        if (file2.isDirectory()) {
                            new File(file2, ".nomedia").delete();
                        }
                        if (file3.isDirectory()) {
                            new File(file3, ".nomedia").delete();
                            return;
                        }
                        return;
                    }
                    if (file2.isDirectory()) {
                        g0.G(new File(file2, ".nomedia"));
                    }
                    if (file3.isDirectory()) {
                        g0.G(new File(file3, ".nomedia"));
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    a8.g(th3, true);
                    return;
                }
            case 12:
                if (!az.f21615b && (Q = LaunchActivity.Q()) != null && Q.getParentActivity() != null) {
                    az.f21632h0 = null;
                    az.y();
                    zb.D().i(new hc(13));
                    az.f21615b = true;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(Q.getParentActivity());
                    alertDialog$Builder.f27343a.S = bd.M0(2131745848, null);
                    alertDialog$Builder.f27343a.T = bd.M0(2131745847, null);
                    alertDialog$Builder.k(bd.M0(2131751356, null), new go(8));
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.setCanceledOnTouchOutside(false);
                    s1Var.show();
                    return;
                }
                return;
            case 13:
                int i12 = az.f21612a;
                return;
            case 14:
                jz.f23758y = null;
                return;
            case 15:
                org.telegram.ui.ActionBar.k6.F(false);
                return;
            case 16:
                int i13 = org.telegram.ui.wm.f51227jd;
                return;
            case 17:
                dh.j0.b(true);
                return;
            case 18:
                hs e11 = hs.e();
                Boolean bool = Boolean.TRUE;
                e11.k(264, Boolean.FALSE, bool, bool);
                return;
            case 19:
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != 0) {
                    ?? obj = new Object();
                    obj.f27395a = true;
                    T.showAsSheet(new PremiumPreviewFragment(0, "schedule_repeat"), obj);
                    return;
                }
                return;
            case 20:
                Pattern pattern = org.telegram.ui.Components.t4.f38241a;
                return;
            case 21:
                g0.r(org.telegram.ui.Components.g5.f33961w);
                try {
                    if (org.telegram.ui.Components.g5.f33957r != null) {
                        for (int i14 = 0; i14 < org.telegram.ui.Components.g5.f33957r.size(); i14++) {
                            LongSparseArray longSparseArray = (LongSparseArray) org.telegram.ui.Components.g5.f33957r.valueAt(i14);
                            int i15 = 0;
                            while (i15 < longSparseArray.size()) {
                                if (!((org.telegram.ui.Components.g5) longSparseArray.valueAt(i15)).f33963a) {
                                    longSparseArray.removeAt(i15);
                                    i15--;
                                }
                                i15++;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Exception unused2) {
                    boolean z10 = r2.f25040a;
                    return;
                }
            case 22:
                org.telegram.ui.Components.z7 z7Var = org.telegram.ui.Components.z7.Q2;
                return;
            case 23:
                nv.h();
                return;
            case 24:
                LaunchActivity launchActivity = LaunchActivity.K1;
                if (launchActivity != null && !launchActivity.isFinishing()) {
                    Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
                    intent.setFlags(268468224);
                    LaunchActivity.K1.startActivity(intent);
                    return;
                }
                return;
            case 25:
                org.telegram.ui.ActionBar.d2 Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", h10.i(Q2.getCurrentAccount()).e());
                    bundle.putInt("chatMode", 1);
                    Q2.presentFragment(new org.telegram.ui.wm(bundle));
                    return;
                }
                return;
            case 26:
                MediaController.B().B0(0, 0, false, false);
                return;
            case 27:
                MediaController.B().B0(0, 0, false, false);
                return;
            case 28:
                return;
            default:
                int i16 = org.telegram.ui.Components.an.f31903s1;
                return;
        }
    }

    private final void a() {
    }
}
