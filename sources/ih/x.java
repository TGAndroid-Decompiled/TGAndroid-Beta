package ih;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.z80;
public final class x implements Runnable {
    public final int f9495a;
    public final nh.t3 f9496b;

    public x(nh.t3 t3Var, int i10) {
        this.f9495a = i10;
        this.f9496b = t3Var;
    }

    @Override
    public final void run() {
        switch (this.f9495a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f9496b);
                return;
            case 1:
                AndroidUtilities.removeFromParent(this.f9496b);
                return;
            case 2:
                AndroidUtilities.removeFromParent(this.f9496b);
                return;
            default:
                this.f9496b.getClass();
                return;
        }
    }

    public x(nh.t3 t3Var, z80 z80Var, ClickableSpan clickableSpan) {
        this.f9495a = 3;
        this.f9496b = t3Var;
    }
}
