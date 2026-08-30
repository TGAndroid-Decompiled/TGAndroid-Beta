package kh;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f90;
public final class w implements Runnable {
    public final int f10900a;
    public final ph.f3 f10901b;

    public w(ph.f3 f3Var, int i10) {
        this.f10900a = i10;
        this.f10901b = f3Var;
    }

    @Override
    public final void run() {
        switch (this.f10900a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f10901b);
                return;
            case 1:
                AndroidUtilities.removeFromParent(this.f10901b);
                return;
            case 2:
                AndroidUtilities.removeFromParent(this.f10901b);
                return;
            default:
                this.f10901b.getClass();
                return;
        }
    }

    public w(ph.f3 f3Var, f90 f90Var, ClickableSpan clickableSpan) {
        this.f10900a = 3;
        this.f10901b = f3Var;
    }
}
