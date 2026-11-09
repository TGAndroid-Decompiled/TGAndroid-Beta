package org.telegram.messenger;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.util.LongSparseArray;
import java.io.File;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
public final class rc implements Runnable {
    public final int f25275a;

    public rc(int i7) {
        this.f25275a = i7;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.f2 Q;
        switch (this.f25275a) {
            case 0:
                sc.d(false);
                return;
            case 1:
                qs.e().k(274, new Object[0]);
                return;
            case 2:
                qs.e().k(281, new Object[0]);
                return;
            case 3:
                int i7 = LocationSharingService.d;
                for (int i10 = 0; i10 < 4; i10++) {
                    sd.f(i10).t();
                }
                return;
            case 4:
                MediaController.Y1 = null;
                MediaController.O(0);
                return;
            case 5:
                try {
                    g0.f.n(t0.f25566b);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 6:
                org.telegram.ui.ActionBar.l6.F(false);
                return;
            case 7:
                qs.e().k(254, new Object[0]);
                return;
            case 8:
                iz.y();
                return;
            case 9:
                try {
                    File file = new File(Environment.getExternalStorageDirectory(), "Telegram");
                    File file2 = new File(file, "Telegram Images");
                    file2.mkdir();
                    File file3 = new File(file, "Telegram Video");
                    file3.mkdir();
                    if (!r2.f25213b) {
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
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return;
                }
            case 10:
                if (!iz.f23388b && (Q = LaunchActivity.Q()) != null && Q.getParentActivity() != null) {
                    iz.f23405h0 = null;
                    iz.y();
                    gc.D().i(new rc(11));
                    iz.f23388b = true;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(Q.getParentActivity());
                    alertDialog$Builder.f27296a.R = id.M0(2131745838, null);
                    alertDialog$Builder.f27296a.S = id.M0(2131745837, null);
                    alertDialog$Builder.k(id.M0(2131751355, null), new ch(11));
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    u1Var.setCanceledOnTouchOutside(false);
                    u1Var.show();
                    return;
                }
                return;
            case 11:
                int i11 = iz.f23385a;
                return;
            case 12:
                rz.f25377y = null;
                return;
            case 13:
                org.telegram.ui.ActionBar.l6.F(false);
                return;
            case 14:
                int i12 = org.telegram.ui.cn.f44367kd;
                return;
            case 15:
                ch.k0.b(true);
                return;
            case 16:
                qs e11 = qs.e();
                Boolean bool = Boolean.TRUE;
                e11.k(264, Boolean.FALSE, bool, bool);
                return;
            case 17:
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != 0) {
                    ?? obj = new Object();
                    obj.f27408a = true;
                    T.showAsSheet(new PremiumPreviewFragment(0, "schedule_repeat"), obj);
                    return;
                }
                return;
            case 18:
                Pattern pattern = org.telegram.ui.Components.v4.f38913a;
                return;
            case 19:
                g0.r(org.telegram.ui.Components.i5.f34558w);
                try {
                    if (org.telegram.ui.Components.i5.f34554r != null) {
                        for (int i13 = 0; i13 < org.telegram.ui.Components.i5.f34554r.size(); i13++) {
                            LongSparseArray longSparseArray = (LongSparseArray) org.telegram.ui.Components.i5.f34554r.valueAt(i13);
                            int i14 = 0;
                            while (i14 < longSparseArray.size()) {
                                if (!((org.telegram.ui.Components.i5) longSparseArray.valueAt(i14)).f34560a) {
                                    longSparseArray.removeAt(i14);
                                    i14--;
                                }
                                i14++;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    boolean z9 = r2.f25212a;
                    return;
                }
            case 20:
                org.telegram.ui.Components.b8 b8Var = org.telegram.ui.Components.b8.P2;
                return;
            case 21:
                vv.h();
                return;
            case 22:
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && !launchActivity.isFinishing()) {
                    Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
                    intent.setFlags(268468224);
                    LaunchActivity.G1.startActivity(intent);
                    return;
                }
                return;
            case 23:
                org.telegram.ui.ActionBar.f2 Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", p10.i(Q2.getCurrentAccount()).e());
                    bundle.putInt("chatMode", 1);
                    Q2.presentFragment(new org.telegram.ui.cn(bundle));
                    return;
                }
                return;
            case 24:
                MediaController.B().B0(0, 0, false, false);
                return;
            case 25:
                MediaController.B().B0(0, 0, false, false);
                return;
            case 26:
                return;
            case 27:
                int i15 = org.telegram.ui.Components.bn.f32284r1;
                return;
            case 28:
                PhotoViewer.p1().z0(false, false);
                return;
            default:
                PhotoViewer.p1().z0(false, false);
                return;
        }
    }

    private final void a() {
    }
}
