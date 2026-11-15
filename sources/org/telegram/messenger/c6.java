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
public final class c6 implements Runnable {
    public final int f22800a;

    public c6(int i7) {
        this.f22800a = i7;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.e2 Q;
        switch (this.f22800a) {
            case 0:
                ns.e().k(259, new Object[0]);
                return;
            case 1:
                KeepAliveJob.a();
                return;
            case 2:
                if (!KeepAliveJob.f22318b && KeepAliveJob.f22317a == null) {
                    try {
                        if (r2.f26198a) {
                            a8.b("starting keep-alive job");
                        }
                        synchronized (KeepAliveJob.f22319c) {
                            KeepAliveJob.f22318b = true;
                        }
                        JobIntentService.enqueueWork(t0.f26600b, KeepAliveJob.class, 1000, new Intent());
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 3:
                int i7 = -1;
                try {
                    BatteryManager batteryManager = (BatteryManager) t0.f26600b.getSystemService("batterymanager");
                    if (batteryManager != null) {
                        i7 = batteryManager.getIntProperty(4);
                    }
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
                qc.f26075l = SystemClock.elapsedRealtime();
                qc.f26076m = false;
                if (i7 >= 0 && i7 <= 100) {
                    qc.f26075l = SystemClock.elapsedRealtime();
                    if (qc.f26074k != i7) {
                        qc.f26074k = i7;
                        g0.h3(new c6(4));
                        return;
                    }
                    return;
                }
                return;
            case 4:
                qc.d(false);
                return;
            case 5:
                ns.e().k(274, new Object[0]);
                return;
            case 6:
                ns.e().k(281, new Object[0]);
                return;
            case 7:
                int i10 = LocationSharingService.d;
                for (int i11 = 0; i11 < 4; i11++) {
                    rd.f(i11).t();
                }
                return;
            case 8:
                MediaController.Z1 = null;
                MediaController.O(0);
                return;
            case 9:
                try {
                    g0.f.n(t0.f26600b);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 10:
                org.telegram.ui.ActionBar.j6.F(false);
                return;
            case 11:
                ns.e().k(254, new Object[0]);
                return;
            case 12:
                gz.y();
                return;
            case 13:
                try {
                    File file = new File(Environment.getExternalStorageDirectory(), "Telegram");
                    File file2 = new File(file, "Telegram Images");
                    file2.mkdir();
                    File file3 = new File(file, "Telegram Video");
                    file3.mkdir();
                    if (!r2.f26199b) {
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
            case 14:
                if (!gz.f23932b && (Q = LaunchActivity.Q()) != null && Q.getParentActivity() != null) {
                    gz.f23949h0 = null;
                    gz.y();
                    fc.D().i(new c6(15));
                    gz.f23932b = true;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(Q.getParentActivity());
                    alertDialog$Builder.f28392a.S = hd.M0(2131745838, null);
                    alertDialog$Builder.f28392a.T = hd.M0(2131745837, null);
                    alertDialog$Builder.k(hd.M0(2131751355, null), new fd(15));
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                    t1Var.setCanceledOnTouchOutside(false);
                    t1Var.show();
                    return;
                }
                return;
            case 15:
                int i12 = gz.f23929a;
                return;
            case 16:
                pz.f26024y = null;
                return;
            case 17:
                org.telegram.ui.ActionBar.j6.F(false);
                return;
            case 18:
                int i13 = org.telegram.ui.an.f45108ld;
                return;
            case 19:
                ch.l0.b(true);
                return;
            case 20:
                ns e11 = ns.e();
                Boolean bool = Boolean.TRUE;
                e11.k(264, Boolean.FALSE, bool, bool);
                return;
            case 21:
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != 0) {
                    ?? obj = new Object();
                    obj.f28476a = true;
                    T.showAsSheet(new PremiumPreviewFragment(0, "schedule_repeat"), obj);
                    return;
                }
                return;
            case 22:
                Pattern pattern = org.telegram.ui.Components.t4.f39507a;
                return;
            case 23:
                g0.r(org.telegram.ui.Components.g5.f34799w);
                try {
                    if (org.telegram.ui.Components.g5.f34795r != null) {
                        for (int i14 = 0; i14 < org.telegram.ui.Components.g5.f34795r.size(); i14++) {
                            LongSparseArray longSparseArray = (LongSparseArray) org.telegram.ui.Components.g5.f34795r.valueAt(i14);
                            int i15 = 0;
                            while (i15 < longSparseArray.size()) {
                                if (!((org.telegram.ui.Components.g5) longSparseArray.valueAt(i15)).f34801a) {
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
                    boolean z10 = r2.f26198a;
                    return;
                }
            case 24:
                org.telegram.ui.Components.y7 y7Var = org.telegram.ui.Components.y7.T2;
                return;
            case 25:
                tv.h();
                return;
            case 26:
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity != null && !launchActivity.isFinishing()) {
                    Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
                    intent.setFlags(268468224);
                    LaunchActivity.H1.startActivity(intent);
                    return;
                }
                return;
            case 27:
                org.telegram.ui.ActionBar.e2 Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", m10.i(Q2.getCurrentAccount()).e());
                    bundle.putInt("chatMode", 1);
                    Q2.presentFragment(new org.telegram.ui.an(bundle));
                    return;
                }
                return;
            case 28:
                MediaController.B().B0(0, 0, false, false);
                return;
            default:
                MediaController.B().B0(0, 0, false, false);
                return;
        }
    }
}
