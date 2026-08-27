package gh;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.q80;

public final class z implements Runnable {

    public final int f7691a;

    public final lh.w3 f7692b;

    public z(lh.w3 w3Var, int i10) {
        this.f7691a = i10;
        this.f7692b = w3Var;
    }

    @Override
    public final void run() {
        switch (this.f7691a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f7692b);
                break;
            case 1:
                AndroidUtilities.removeFromParent(this.f7692b);
                break;
            case 2:
                AndroidUtilities.removeFromParent(this.f7692b);
                break;
            default:
                this.f7692b.getClass();
                break;
        }
    }

    public z(lh.w3 w3Var, q80 q80Var, ClickableSpan clickableSpan) {
        this.f7691a = 3;
        this.f7692b = w3Var;
    }
}
