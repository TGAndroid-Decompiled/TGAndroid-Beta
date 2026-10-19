package ai;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.y90;
public final class a3 implements Runnable {
    public final int f950a;
    public final ei.x3 f951b;

    public a3(ei.x3 x3Var, int i10) {
        this.f950a = i10;
        this.f951b = x3Var;
    }

    @Override
    public final void run() {
        switch (this.f950a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f951b);
                return;
            case 1:
                AndroidUtilities.removeFromParent(this.f951b);
                return;
            case 2:
                this.f951b.getClass();
                return;
            default:
                AndroidUtilities.removeFromParent(this.f951b);
                return;
        }
    }

    public a3(ei.x3 x3Var, y90 y90Var, ClickableSpan clickableSpan) {
        this.f950a = 2;
        this.f951b = x3Var;
    }
}
