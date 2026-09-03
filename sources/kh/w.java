package kh;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g90;
public final class w implements Runnable {
    public final int f11009a;
    public final ph.f3 f11010b;

    public w(ph.f3 f3Var, int i10) {
        this.f11009a = i10;
        this.f11010b = f3Var;
    }

    @Override
    public final void run() {
        switch (this.f11009a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f11010b);
                return;
            case 1:
                AndroidUtilities.removeFromParent(this.f11010b);
                return;
            case 2:
                AndroidUtilities.removeFromParent(this.f11010b);
                return;
            default:
                this.f11010b.getClass();
                return;
        }
    }

    public w(ph.f3 f3Var, g90 g90Var, ClickableSpan clickableSpan) {
        this.f11009a = 3;
        this.f11010b = f3Var;
    }
}
