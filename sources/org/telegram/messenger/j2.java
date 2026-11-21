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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class j2 implements Runnable {
    public final int f24829a;

    public j2(int i7) {
        this.f24829a = i7;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.g2 Q;
        int i7 = 0;
        switch (this.f24829a) {
            case 0:
                return;
            case 1:
                break;
            case 2:
                ks.e().k(262, new Object[0]);
                return;
            case 3:
                KeepAliveJob.a();
                return;
            case 4:
                if (!KeepAliveJob.f22709b && KeepAliveJob.f22708a == null) {
                    try {
                        if (s2.f26749a) {
                            a8.b("starting keep-alive job");
                        }
                        synchronized (KeepAliveJob.f22710c) {
                            KeepAliveJob.f22709b = true;
                        }
                        JobIntentService.enqueueWork(t0.f26941b, KeepAliveJob.class, 1000, new Intent());
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 5:
                int i10 = -1;
                try {
                    BatteryManager batteryManager = (BatteryManager) t0.f26941b.getSystemService("batterymanager");
                    if (batteryManager != null) {
                        i10 = batteryManager.getIntProperty(4);
                    }
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
                pc.f26250l = SystemClock.elapsedRealtime();
                pc.f26251m = false;
                if (i10 >= 0 && i10 <= 100) {
                    pc.f26250l = SystemClock.elapsedRealtime();
                    if (pc.f26249k != i10) {
                        pc.f26249k = i10;
                        g0.g3(new j2(6));
                        return;
                    }
                    return;
                }
                return;
            case 6:
                pc.d(false);
                return;
            case 7:
                ks.e().k(277, new Object[0]);
                return;
            case 8:
                ks.e().k(284, new Object[0]);
                return;
            case 9:
                int i11 = LocationSharingService.d;
                while (i7 < 4) {
                    qd.f(i7).t();
                    i7++;
                }
                return;
            case 10:
                MediaController.Z1 = null;
                MediaController.O(0);
                return;
            case 11:
                try {
                    g0.f.n(t0.f26941b);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 12:
                org.telegram.ui.ActionBar.m6.F(false);
                return;
            case 13:
                ks.e().k(257, new Object[0]);
                return;
            case 14:
                bz.y();
                return;
            case 15:
                try {
                    File file = new File(Environment.getExternalStorageDirectory(), "Telegram");
                    File file2 = new File(file, "Telegram Images");
                    file2.mkdir();
                    File file3 = new File(file, "Telegram Video");
                    file3.mkdir();
                    if (!s2.f26750b) {
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
            case 16:
                if (!bz.f23176b && (Q = LaunchActivity.Q()) != null && Q.getParentActivity() != null) {
                    bz.f23193h0 = null;
                    bz.y();
                    ec.D().i(new j2(17));
                    bz.f23176b = true;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(Q.getParentActivity());
                    alertDialog$Builder.f28774a.S = gd.N0(2131745642, null);
                    alertDialog$Builder.f28774a.T = gd.N0(2131745641, null);
                    alertDialog$Builder.k(gd.N0(2131751343, null), new ed(16));
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
                    t1Var.setCanceledOnTouchOutside(false);
                    t1Var.show();
                    return;
                }
                return;
            case 17:
                int i12 = bz.f23173a;
                return;
            case 18:
                lz.f25509y = null;
                return;
            case 19:
                org.telegram.ui.ActionBar.m6.F(false);
                return;
            case 20:
                int i13 = org.telegram.ui.bn.f45936md;
                return;
            case 21:
                ch.l0.b(true);
                return;
            case 22:
                ks e11 = ks.e();
                Boolean bool = Boolean.TRUE;
                e11.k(267, Boolean.FALSE, bool, bool);
                return;
            case 23:
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != 0) {
                    ?? obj = new Object();
                    obj.f28902a = true;
                    T.showAsSheet(new PremiumPreviewFragment(0, "schedule_repeat"), obj);
                    return;
                }
                return;
            case 24:
                Pattern pattern = org.telegram.ui.Components.c5.f34019a;
                return;
            case 25:
                g0.r(org.telegram.ui.Components.p5.f38491w);
                try {
                    if (org.telegram.ui.Components.p5.f38487r != null) {
                        for (int i14 = 0; i14 < org.telegram.ui.Components.p5.f38487r.size(); i14++) {
                            LongSparseArray longSparseArray = (LongSparseArray) org.telegram.ui.Components.p5.f38487r.valueAt(i14);
                            int i15 = 0;
                            while (i15 < longSparseArray.size()) {
                                if (!((org.telegram.ui.Components.p5) longSparseArray.valueAt(i15)).f38493a) {
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
                    boolean z10 = s2.f26749a;
                    return;
                }
            case 26:
                org.telegram.ui.Components.f8 f8Var = org.telegram.ui.Components.f8.T2;
                return;
            case 27:
                pv.h();
                return;
            case 28:
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity != null && !launchActivity.isFinishing()) {
                    Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
                    intent.setFlags(268468224);
                    LaunchActivity.H1.startActivity(intent);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.g2 Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", j10.i(Q2.getCurrentAccount()).e());
                    bundle.putInt("chatMode", 1);
                    Q2.presentFragment(new org.telegram.ui.bn(bundle));
                    return;
                }
                return;
        }
        while (i7 < 4) {
            if (j10.i(i7).p()) {
                ConnectionsManager.getInstance(i7).resumeNetworkMaybe();
                Utilities.f22807e.c(new m4(i5.r(i7), 3));
            }
            i7++;
        }
    }

    private final void a() {
    }
}
