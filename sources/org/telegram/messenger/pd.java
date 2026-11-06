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
public final class pd implements Runnable {
    public final int f24532a;

    public pd(int i7) {
        this.f24532a = i7;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.f2 Q;
        switch (this.f24532a) {
            case 0:
                qs.e().k(281, new Object[0]);
                return;
            case 1:
                int i7 = LocationSharingService.d;
                for (int i10 = 0; i10 < 4; i10++) {
                    sd.f(i10).t();
                }
                return;
            case 2:
                MediaController.Y1 = null;
                MediaController.O(0);
                return;
            case 3:
                try {
                    g0.f.n(t0.f25555b);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 4:
                org.telegram.ui.ActionBar.k6.F(false);
                return;
            case 5:
                qs.e().k(254, new Object[0]);
                return;
            case 6:
                iz.y();
                return;
            case 7:
                try {
                    File file = new File(Environment.getExternalStorageDirectory(), "Telegram");
                    File file2 = new File(file, "Telegram Images");
                    file2.mkdir();
                    File file3 = new File(file, "Telegram Video");
                    file3.mkdir();
                    if (!r2.f25192b) {
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
            case 8:
                if (!iz.f23360b && (Q = LaunchActivity.Q()) != null && Q.getParentActivity() != null) {
                    iz.f23377h0 = null;
                    iz.y();
                    gc.D().i(new pd(9));
                    iz.f23360b = true;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(Q.getParentActivity());
                    alertDialog$Builder.f27292a.R = hd.M0(2131745839, null);
                    alertDialog$Builder.f27292a.S = hd.M0(2131745838, null);
                    alertDialog$Builder.k(hd.M0(2131751356, null), new ch(11));
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                    u1Var.setCanceledOnTouchOutside(false);
                    u1Var.show();
                    return;
                }
                return;
            case 9:
                int i11 = iz.f23357a;
                return;
            case 10:
                rz.f25373y = null;
                return;
            case 11:
                org.telegram.ui.ActionBar.k6.F(false);
                return;
            case 12:
                int i12 = org.telegram.ui.an.f43682id;
                return;
            case 13:
                ch.k0.b(true);
                return;
            case 14:
                qs e11 = qs.e();
                Boolean bool = Boolean.TRUE;
                e11.k(264, Boolean.FALSE, bool, bool);
                return;
            case 15:
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != 0) {
                    ?? obj = new Object();
                    obj.f27420a = true;
                    T.showAsSheet(new PremiumPreviewFragment(0, "schedule_repeat"), obj);
                    return;
                }
                return;
            case 16:
                Pattern pattern = org.telegram.ui.Components.v4.f38823a;
                return;
            case 17:
                g0.r(org.telegram.ui.Components.i5.f34495w);
                try {
                    if (org.telegram.ui.Components.i5.f34491r != null) {
                        for (int i13 = 0; i13 < org.telegram.ui.Components.i5.f34491r.size(); i13++) {
                            LongSparseArray longSparseArray = (LongSparseArray) org.telegram.ui.Components.i5.f34491r.valueAt(i13);
                            int i14 = 0;
                            while (i14 < longSparseArray.size()) {
                                if (!((org.telegram.ui.Components.i5) longSparseArray.valueAt(i14)).f34497a) {
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
                    boolean z9 = r2.f25191a;
                    return;
                }
            case 18:
                org.telegram.ui.Components.b8 b8Var = org.telegram.ui.Components.b8.P2;
                return;
            case 19:
                vv.h();
                return;
            case 20:
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && !launchActivity.isFinishing()) {
                    Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
                    intent.setFlags(268468224);
                    LaunchActivity.G1.startActivity(intent);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.ActionBar.f2 Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", p10.i(Q2.getCurrentAccount()).e());
                    bundle.putInt("chatMode", 1);
                    Q2.presentFragment(new org.telegram.ui.an(bundle));
                    return;
                }
                return;
            case 22:
                MediaController.B().B0(0, 0, false, false);
                return;
            case 23:
                MediaController.B().B0(0, 0, false, false);
                return;
            case 24:
                return;
            case 25:
                int i15 = org.telegram.ui.Components.bn.f32176r1;
                return;
            case 26:
                PhotoViewer.p1().z0(false, false);
                return;
            case 27:
                PhotoViewer.p1().z0(false, false);
                return;
            case 28:
                int[] iArr = org.telegram.ui.Components.ys.X1;
                return;
            default:
                qs.e().k(175, new Object[0]);
                return;
        }
    }

    private final void a() {
    }
}
