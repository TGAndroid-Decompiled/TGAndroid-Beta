package ai;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.y90;
public final class x2 implements Runnable {
    public final int f2422a;
    public final ei.x3 f2423b;

    public x2(ei.x3 x3Var, int i10) {
        this.f2422a = i10;
        this.f2423b = x3Var;
    }

    @Override
    public final void run() {
        switch (this.f2422a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f2423b);
                return;
            case 1:
                AndroidUtilities.removeFromParent(this.f2423b);
                return;
            case 2:
                this.f2423b.getClass();
                return;
            default:
                AndroidUtilities.removeFromParent(this.f2423b);
                return;
        }
    }

    public x2(ei.x3 x3Var, y90 y90Var, ClickableSpan clickableSpan) {
        this.f2422a = 2;
        this.f2423b = x3Var;
    }
}
