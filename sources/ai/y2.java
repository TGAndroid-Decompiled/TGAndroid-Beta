package ai;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.y90;
public final class y2 implements Runnable {
    public final int f2474a;
    public final ei.x3 f2475b;

    public y2(ei.x3 x3Var, int i10) {
        this.f2474a = i10;
        this.f2475b = x3Var;
    }

    @Override
    public final void run() {
        switch (this.f2474a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f2475b);
                return;
            case 1:
                AndroidUtilities.removeFromParent(this.f2475b);
                return;
            case 2:
                this.f2475b.getClass();
                return;
            default:
                AndroidUtilities.removeFromParent(this.f2475b);
                return;
        }
    }

    public y2(ei.x3 x3Var, y90 y90Var, ClickableSpan clickableSpan) {
        this.f2474a = 2;
        this.f2475b = x3Var;
    }
}
