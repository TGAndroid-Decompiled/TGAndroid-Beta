package defpackage;

import android.graphics.Typeface;
import android.provider.Settings;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
public final class w35 implements Runnable {
    public final byte a;
    public final h75 b;

    public w35(h75 h75Var, byte b) {
        this.a = b;
        this.b = h75Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        h75 h75Var = this.b;
        switch (b) {
            case 0:
                if (!h75Var.i1()) {
                    LaunchActivity launchActivity = h75Var.b2;
                    Typeface typeface = gl.a;
                    if (Settings.canDrawOverlays(launchActivity)) {
                        o85.g0 = false;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                h75Var.O0();
                return;
            case 2:
                if (h75Var.T2 != null && h75Var.K3 && VoIPService.getSharedInstance() != null) {
                    try {
                        h75Var.v1.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    h75Var.H1(1, true);
                    gl.d3(h75Var.p4, 80L);
                    h75Var.K3 = false;
                    h75Var.L3 = true;
                    return;
                }
                return;
            case 3:
                int i = h75Var.M3;
                if (i == 1 || i == 2 || i == 6 || i == 5) {
                    h75Var.L1(true, false);
                    return;
                }
                return;
            case 4:
                h75Var.O0();
                h75Var.L0();
                h75Var.K0();
                h75Var.y1.setTranslationY((-h75Var.w3.d()) + h75Var.b.getPaddingBottom());
                h75Var.z1.invalidate();
                h75Var.P0();
                h75Var.b.invalidate();
                return;
            case 5:
                h75Var.p1();
                return;
            case 6:
                h75Var.dismiss();
                return;
            case 7:
                h75Var.I1();
                gl.d3(h75Var.x3, 1000L);
                return;
            case 8:
                j65 j65Var = h75Var.k2;
                if (j65Var != null) {
                    j65Var.show();
                    return;
                }
                return;
            case 9:
                na7.q1(h75Var.n1.a).h0(null);
                return;
            default:
                h75Var.m5 = null;
                h75Var.D1(true);
                return;
        }
    }
}
