package lh;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.h90;
public final class w implements Runnable {
    public final int f13054a;
    public final qh.f3 f13055b;

    public w(qh.f3 f3Var, int i10) {
        this.f13054a = i10;
        this.f13055b = f3Var;
    }

    @Override
    public final void run() {
        switch (this.f13054a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f13055b);
                return;
            case 1:
                AndroidUtilities.removeFromParent(this.f13055b);
                return;
            case 2:
                AndroidUtilities.removeFromParent(this.f13055b);
                return;
            default:
                this.f13055b.getClass();
                return;
        }
    }

    public w(qh.f3 f3Var, h90 h90Var, ClickableSpan clickableSpan) {
        this.f13054a = 3;
        this.f13055b = f3Var;
    }
}
