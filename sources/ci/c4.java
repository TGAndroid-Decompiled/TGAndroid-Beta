package ci;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.q90;
public final class c4 implements Runnable {
    public final int f4443a;
    public final e4 f4444b;

    public c4(e4 e4Var, int i10) {
        this.f4443a = i10;
        this.f4444b = e4Var;
    }

    @Override
    public final void run() {
        switch (this.f4443a) {
            case 0:
                this.f4444b.getClass();
                return;
            case 1:
                AndroidUtilities.removeFromParent(this.f4444b);
                return;
            case 2:
                AndroidUtilities.removeFromParent(this.f4444b);
                return;
            default:
                AndroidUtilities.removeFromParent(this.f4444b);
                return;
        }
    }

    public c4(e4 e4Var, q90 q90Var, ClickableSpan clickableSpan) {
        this.f4443a = 0;
        this.f4444b = e4Var;
    }
}
