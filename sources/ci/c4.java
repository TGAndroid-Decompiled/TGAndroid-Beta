package ci;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.r90;
public final class c4 implements Runnable {
    public final int f4802a;
    public final e4 f4803b;

    public c4(e4 e4Var, int i10) {
        this.f4802a = i10;
        this.f4803b = e4Var;
    }

    @Override
    public final void run() {
        switch (this.f4802a) {
            case 0:
                this.f4803b.getClass();
                return;
            case 1:
                AndroidUtilities.removeFromParent(this.f4803b);
                return;
            case 2:
                AndroidUtilities.removeFromParent(this.f4803b);
                return;
            default:
                AndroidUtilities.removeFromParent(this.f4803b);
                return;
        }
    }

    public c4(e4 e4Var, r90 r90Var, ClickableSpan clickableSpan) {
        this.f4802a = 0;
        this.f4803b = e4Var;
    }
}
