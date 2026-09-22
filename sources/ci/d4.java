package ci;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d90;
public final class d4 implements Runnable {
    public final int f4495a;
    public final f4 f4496b;

    public d4(f4 f4Var, int i10) {
        this.f4495a = i10;
        this.f4496b = f4Var;
    }

    @Override
    public final void run() {
        switch (this.f4495a) {
            case 0:
                this.f4496b.getClass();
                return;
            case 1:
                AndroidUtilities.removeFromParent(this.f4496b);
                return;
            case 2:
                AndroidUtilities.removeFromParent(this.f4496b);
                return;
            default:
                AndroidUtilities.removeFromParent(this.f4496b);
                return;
        }
    }

    public d4(f4 f4Var, d90 d90Var, ClickableSpan clickableSpan) {
        this.f4495a = 0;
        this.f4496b = f4Var;
    }
}
