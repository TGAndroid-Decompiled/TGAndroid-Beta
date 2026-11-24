package defpackage;

import android.graphics.Typeface;
import android.provider.Settings;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
public final class v55 implements Runnable {
    public final byte a;
    public final g95 b;

    public v55(g95 g95Var, byte b) {
        this.a = b;
        this.b = g95Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        g95 g95Var = this.b;
        switch (b) {
            case 0:
                if (!g95Var.i1()) {
                    LaunchActivity launchActivity = g95Var.b2;
                    Typeface typeface = gm.a;
                    if (Settings.canDrawOverlays(launchActivity)) {
                        oa5.g0 = false;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                g95Var.O0();
                return;
            case 2:
                if (g95Var.T2 != null && g95Var.K3 && VoIPService.getSharedInstance() != null) {
                    try {
                        g95Var.v1.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    g95Var.H1(1, true);
                    gm.d3(g95Var.p4, 80L);
                    g95Var.K3 = false;
                    g95Var.L3 = true;
                    return;
                }
                return;
            case 3:
                int i = g95Var.M3;
                if (i == 1 || i == 2 || i == 6 || i == 5) {
                    g95Var.L1(true, false);
                    return;
                }
                return;
            case 4:
                g95Var.O0();
                g95Var.L0();
                g95Var.K0();
                g95Var.y1.setTranslationY((-g95Var.w3.d()) + g95Var.b.getPaddingBottom());
                g95Var.z1.invalidate();
                g95Var.P0();
                g95Var.b.invalidate();
                return;
            case 5:
                g95Var.p1();
                return;
            case 6:
                g95Var.dismiss();
                return;
            case 7:
                g95Var.I1();
                gm.d3(g95Var.x3, 1000L);
                return;
            case 8:
                h85 h85Var = g95Var.k2;
                if (h85Var != null) {
                    h85Var.show();
                    return;
                }
                return;
            case 9:
                oc7.r1(g95Var.n1.a).h0(null);
                return;
            default:
                g95Var.m5 = null;
                g95Var.D1(true);
                return;
        }
    }
}
