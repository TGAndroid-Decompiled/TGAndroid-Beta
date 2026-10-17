package ai;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.y90;
public final class w2 implements Runnable {
    public final int f2353a;
    public final ei.x3 f2354b;

    public w2(ei.x3 x3Var, int i10) {
        this.f2353a = i10;
        this.f2354b = x3Var;
    }

    @Override
    public final void run() {
        switch (this.f2353a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f2354b);
                return;
            case 1:
                AndroidUtilities.removeFromParent(this.f2354b);
                return;
            case 2:
                this.f2354b.getClass();
                return;
            default:
                AndroidUtilities.removeFromParent(this.f2354b);
                return;
        }
    }

    public w2(ei.x3 x3Var, y90 y90Var, ClickableSpan clickableSpan) {
        this.f2353a = 2;
        this.f2354b = x3Var;
    }
}
