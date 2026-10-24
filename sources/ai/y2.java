package ai;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.x90;
public final class y2 implements Runnable {
    public final int f2481a;
    public final ei.x3 f2482b;

    public y2(ei.x3 x3Var, int i10) {
        this.f2481a = i10;
        this.f2482b = x3Var;
    }

    @Override
    public final void run() {
        switch (this.f2481a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f2482b);
                return;
            case 1:
                AndroidUtilities.removeFromParent(this.f2482b);
                return;
            case 2:
                this.f2482b.getClass();
                return;
            default:
                AndroidUtilities.removeFromParent(this.f2482b);
                return;
        }
    }

    public y2(ei.x3 x3Var, x90 x90Var, ClickableSpan clickableSpan) {
        this.f2481a = 2;
        this.f2482b = x3Var;
    }
}
