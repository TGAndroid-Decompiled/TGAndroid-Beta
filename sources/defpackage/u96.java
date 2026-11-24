package defpackage;

import android.provider.Settings;
import org.telegram.ui.LaunchActivity;
public final class u96 implements Runnable {
    public final byte a;
    public final w96 b;

    public u96(w96 w96Var, byte b) {
        this.a = b;
        this.b = w96Var;
    }

    @Override
    public final void run() {
        ad8 ad8Var;
        LaunchActivity launchActivity;
        byte b = this.a;
        w96 w96Var = this.b;
        switch (b) {
            case 0:
                ad8 ad8Var2 = w96Var.a;
                if (ad8Var2 != null) {
                    ad8Var2.d();
                    return;
                }
                return;
            default:
                oab oabVar = w96Var.c;
                if (oabVar != null && w96Var.P() && (ad8Var = w96Var.a) != null && ad8Var.c == 0 && (launchActivity = LaunchActivity.H1) != null && Settings.canDrawOverlays(launchActivity)) {
                    oabVar.S();
                    return;
                }
                return;
        }
    }
}
