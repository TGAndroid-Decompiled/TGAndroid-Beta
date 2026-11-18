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
    public final int f24804a;

    public j2(int i7) {
        this.f24804a = i7;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.h2 Q;
        int i7 = 0;
        switch (this.f24804a) {
            case 0:
                return;
            case 1:
                break;
            case 2:
                ks.e().k(261, new Object[0]);
                return;
            case 3:
                KeepAliveJob.a();
                return;
            case 4:
                if (!KeepAliveJob.f22684b && KeepAliveJob.f22683a == null) {
                    try {
                        if (s2.f26723a) {
                            a8.b("starting keep-alive job");
                        }
                        synchronized (KeepAliveJob.f22685c) {
                            KeepAliveJob.f22684b = true;
                        }
                        JobIntentService.enqueueWork(t0.f26915b, KeepAliveJob.class, 1000, new Intent());
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 5:
                int i10 = -1;
                try {
                    BatteryManager batteryManager = (BatteryManager) t0.f26915b.getSystemService("batterymanager");
                    if (batteryManager != null) {
                        i10 = batteryManager.getIntProperty(4);
                    }
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
                pc.f26224l = SystemClock.elapsedRealtime();
                pc.f26225m = false;
                if (i10 >= 0 && i10 <= 100) {
                    pc.f26224l = SystemClock.elapsedRealtime();
                    if (pc.f26223k != i10) {
                        pc.f26223k = i10;
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
                ks.e().k(276, new Object[0]);
                return;
            case 8:
                ks.e().k(283, new Object[0]);
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
                    g0.f.n(t0.f26915b);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 12:
                org.telegram.ui.ActionBar.n6.F(false);
                return;
            case 13:
                ks.e().k(256, new Object[0]);
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
                    if (!s2.f26724b) {
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
                if (!bz.f23151b && (Q = LaunchActivity.Q()) != null && Q.getParentActivity() != null) {
                    bz.f23168h0 = null;
                    bz.y();
                    ec.D().i(new j2(17));
                    bz.f23151b = true;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(Q.getParentActivity());
                    alertDialog$Builder.f28746a.S = gd.M0(2131745643, null);
                    alertDialog$Builder.f28746a.T = gd.M0(2131745642, null);
                    alertDialog$Builder.k(gd.M0(2131751344, null), new ed(16));
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                    u1Var.setCanceledOnTouchOutside(false);
                    u1Var.show();
                    return;
                }
                return;
            case 17:
                int i12 = bz.f23148a;
                return;
            case 18:
                lz.f25483y = null;
                return;
            case 19:
                org.telegram.ui.ActionBar.n6.F(false);
                return;
            case 20:
                int i13 = org.telegram.ui.bn.f45922md;
                return;
            case 21:
                ch.l0.b(true);
                return;
            case 22:
                ks e11 = ks.e();
                Boolean bool = Boolean.TRUE;
                e11.k(266, Boolean.FALSE, bool, bool);
                return;
            case 23:
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != 0) {
                    ?? obj = new Object();
                    obj.f28923a = true;
                    T.showAsSheet(new PremiumPreviewFragment(0, "schedule_repeat"), obj);
                    return;
                }
                return;
            case 24:
                Pattern pattern = org.telegram.ui.Components.b5.f33529a;
                return;
            case 25:
                g0.r(org.telegram.ui.Components.o5.f37966w);
                try {
                    if (org.telegram.ui.Components.o5.f37962r != null) {
                        for (int i14 = 0; i14 < org.telegram.ui.Components.o5.f37962r.size(); i14++) {
                            LongSparseArray longSparseArray = (LongSparseArray) org.telegram.ui.Components.o5.f37962r.valueAt(i14);
                            int i15 = 0;
                            while (i15 < longSparseArray.size()) {
                                if (!((org.telegram.ui.Components.o5) longSparseArray.valueAt(i15)).f37968a) {
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
                    boolean z10 = s2.f26723a;
                    return;
                }
            case 26:
                org.telegram.ui.Components.g8 g8Var = org.telegram.ui.Components.g8.T2;
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
                org.telegram.ui.ActionBar.h2 Q2 = LaunchActivity.Q();
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
                Utilities.f22782e.c(new m4(i5.r(i7), 3));
            }
            i7++;
        }
    }

    private final void a() {
    }
}
