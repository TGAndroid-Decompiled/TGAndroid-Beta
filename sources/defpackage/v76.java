package defpackage;

import android.provider.Settings;
import org.telegram.ui.LaunchActivity;
public final class v76 implements Runnable {
    public final byte a;
    public final x76 b;

    public v76(x76 x76Var, byte b) {
        this.a = b;
        this.b = x76Var;
    }

    @Override
    public final void run() {
        xa8 xa8Var;
        LaunchActivity launchActivity;
        byte b = this.a;
        x76 x76Var = this.b;
        switch (b) {
            case 0:
                xa8 xa8Var2 = x76Var.a;
                if (xa8Var2 != null) {
                    xa8Var2.d();
                    return;
                }
                return;
            default:
                m8b m8bVar = x76Var.c;
                if (m8bVar != null && x76Var.G0() && (xa8Var = x76Var.a) != null && xa8Var.c == 0 && (launchActivity = LaunchActivity.H1) != null && Settings.canDrawOverlays(launchActivity)) {
                    m8bVar.S();
                    return;
                }
                return;
        }
    }
}
