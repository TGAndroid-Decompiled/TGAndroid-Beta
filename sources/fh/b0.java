package fh;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.m80;
public final class b0 implements Runnable {
    public final int f6357a;
    public final kh.x3 f6358b;

    public b0(kh.x3 x3Var, int i9) {
        this.f6357a = i9;
        this.f6358b = x3Var;
    }

    @Override
    public final void run() {
        switch (this.f6357a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f6358b);
                return;
            case 1:
                AndroidUtilities.removeFromParent(this.f6358b);
                return;
            case 2:
                AndroidUtilities.removeFromParent(this.f6358b);
                return;
            default:
                this.f6358b.getClass();
                return;
        }
    }

    public b0(kh.x3 x3Var, m80 m80Var, ClickableSpan clickableSpan) {
        this.f6357a = 3;
        this.f6358b = x3Var;
    }
}
