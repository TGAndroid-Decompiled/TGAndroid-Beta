package bi;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.n90;
public final class v4 implements Runnable {
    public final int f3784a;
    public final x4 f3785b;

    public v4(x4 x4Var, int i10) {
        this.f3784a = i10;
        this.f3785b = x4Var;
    }

    @Override
    public final void run() {
        switch (this.f3784a) {
            case 0:
                this.f3785b.getClass();
                return;
            case 1:
                AndroidUtilities.removeFromParent(this.f3785b);
                return;
            case 2:
                AndroidUtilities.removeFromParent(this.f3785b);
                return;
            default:
                AndroidUtilities.removeFromParent(this.f3785b);
                return;
        }
    }

    public v4(x4 x4Var, n90 n90Var, ClickableSpan clickableSpan) {
        this.f3784a = 0;
        this.f3785b = x4Var;
    }
}
