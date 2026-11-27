package defpackage;

import android.provider.Settings;
import org.telegram.ui.LaunchActivity;
public final class y96 implements Runnable {
    public final byte a;
    public final ba6 b;

    public y96(ba6 ba6Var, byte b) {
        this.a = b;
        this.b = ba6Var;
    }

    @Override
    public final void run() {
        me8 me8Var;
        LaunchActivity launchActivity;
        byte b = this.a;
        ba6 ba6Var = this.b;
        switch (b) {
            case 0:
                me8 me8Var2 = ba6Var.a;
                if (me8Var2 != null) {
                    me8Var2.e();
                    return;
                }
                return;
            default:
                lcb lcbVar = ba6Var.c;
                if (lcbVar != null && ba6Var.Q() && (me8Var = ba6Var.a) != null && me8Var.c == 0 && (launchActivity = LaunchActivity.H1) != null && Settings.canDrawOverlays(launchActivity)) {
                    lcbVar.S();
                    return;
                }
                return;
        }
    }
}
