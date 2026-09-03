package lh;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.h90;
public final class w implements Runnable {
    public final int f13056a;
    public final qh.e3 f13057b;

    public w(qh.e3 e3Var, int i10) {
        this.f13056a = i10;
        this.f13057b = e3Var;
    }

    @Override
    public final void run() {
        switch (this.f13056a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f13057b);
                return;
            case 1:
                AndroidUtilities.removeFromParent(this.f13057b);
                return;
            case 2:
                AndroidUtilities.removeFromParent(this.f13057b);
                return;
            default:
                this.f13057b.getClass();
                return;
        }
    }

    public w(qh.e3 e3Var, h90 h90Var, ClickableSpan clickableSpan) {
        this.f13056a = 3;
        this.f13057b = e3Var;
    }
}
