package org.telegram.messenger;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.LongSparseArray;
import java.util.regex.Pattern;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.i01;
import org.telegram.ui.Components.p21;
import org.telegram.ui.Components.sz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
public final class sz implements Runnable {
    public final int f18185a;

    public sz(int i10) {
        this.f18185a = i10;
    }

    @Override
    public final void run() {
        switch (this.f18185a) {
            case 0:
                int i10 = uz.f18500a;
                return;
            case 1:
                d00.f15259y = null;
                return;
            case 2:
                org.telegram.ui.ActionBar.t6.F(false);
                return;
            case 3:
                int i11 = org.telegram.ui.un.f41979bd;
                return;
            case 4:
                sg.k0.b(true);
                return;
            case 5:
                at e = at.e();
                Boolean bool = Boolean.TRUE;
                e.k(264, Boolean.FALSE, bool, bool);
                return;
            case 6:
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != 0) {
                    ?? obj = new Object();
                    obj.f20390a = true;
                    T.showAsSheet(new PremiumPreviewFragment(0, "schedule_repeat"), obj);
                    return;
                }
                return;
            case 7:
                Pattern pattern = org.telegram.ui.Components.s4.f30174a;
                return;
            case 8:
                i0.r(org.telegram.ui.Components.f5.f26061w);
                try {
                    if (org.telegram.ui.Components.f5.f26057r != null) {
                        for (int i12 = 0; i12 < org.telegram.ui.Components.f5.f26057r.size(); i12++) {
                            LongSparseArray longSparseArray = (LongSparseArray) org.telegram.ui.Components.f5.f26057r.valueAt(i12);
                            int i13 = 0;
                            while (i13 < longSparseArray.size()) {
                                if (!((org.telegram.ui.Components.f5) longSparseArray.valueAt(i13)).f26063a) {
                                    longSparseArray.removeAt(i13);
                                    i13--;
                                }
                                i13++;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    boolean z10 = v2.f18578a;
                    return;
                }
            case 9:
                org.telegram.ui.Components.w7 w7Var = org.telegram.ui.Components.w7.P2;
                return;
            case 10:
                hw.h();
                return;
            case 11:
                LaunchActivity launchActivity = LaunchActivity.I1;
                if (launchActivity != null && !launchActivity.isFinishing()) {
                    Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
                    intent.setFlags(268468224);
                    LaunchActivity.I1.startActivity(intent);
                    return;
                }
                return;
            case 12:
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", e20.i(Q.getCurrentAccount()).e());
                    bundle.putInt("chatMode", 1);
                    Q.presentFragment(new org.telegram.ui.un(bundle));
                    return;
                }
                return;
            case 13:
                MediaController.B().B0(0, 0, false, false);
                return;
            case 14:
                MediaController.B().B0(0, 0, false, false);
                return;
            case 15:
                return;
            case 16:
                int i14 = org.telegram.ui.Components.jn.f27475r1;
                return;
            case 17:
                PhotoViewer.v1().H0(false, false);
                return;
            case 18:
                PhotoViewer.v1().H0(false, false);
                return;
            case 19:
                int[] iArr = org.telegram.ui.Components.mt.X1;
                return;
            case 20:
                at.e().k(175, new Object[0]);
                return;
            case 21:
                if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    return;
                }
                return;
            case 22:
                at.e().k(98, 512);
                return;
            case 23:
                at.e().k(99, 512);
                return;
            case 24:
                org.telegram.ui.ActionBar.k2 Q2 = LaunchActivity.Q();
                if (Q2 != 0) {
                    ?? obj2 = new Object();
                    obj2.f20390a = true;
                    Q2.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj2);
                    return;
                }
                return;
            case 25:
                int i15 = sz0.f30471f;
                return;
            case 26:
                SharedPreferences.Editor edit = wp.d1().edit();
                i01.f26975f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                return;
            case 27:
                SharedPreferences.Editor edit2 = wp.d1().edit();
                i01.f26975f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                return;
            case 28:
                int i16 = p21.f29321l0;
                return;
            default:
                hw.h();
                return;
        }
    }

    private final void a() {
    }
}
