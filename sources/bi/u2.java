package bi;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.aa0;
public final class u2 implements Runnable {
    public final int f5507a;
    public final fi.v3 f5508b;

    public u2(fi.v3 v3Var, int i10) {
        this.f5507a = i10;
        this.f5508b = v3Var;
    }

    @Override
    public final void run() {
        switch (this.f5507a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f5508b);
                return;
            case 1:
                AndroidUtilities.removeFromParent(this.f5508b);
                return;
            case 2:
                this.f5508b.getClass();
                return;
            default:
                AndroidUtilities.removeFromParent(this.f5508b);
                return;
        }
    }

    public u2(fi.v3 v3Var, aa0 aa0Var, ClickableSpan clickableSpan) {
        this.f5507a = 2;
        this.f5508b = v3Var;
    }
}
