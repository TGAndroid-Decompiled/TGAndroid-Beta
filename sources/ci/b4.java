package ci;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ja0;
public final class b4 implements Runnable {
    public final int f4749a;
    public final d4 f4750b;

    public b4(d4 d4Var, int i10) {
        this.f4749a = i10;
        this.f4750b = d4Var;
    }

    @Override
    public final void run() {
        switch (this.f4749a) {
            case 0:
                this.f4750b.getClass();
                return;
            case 1:
                AndroidUtilities.removeFromParent(this.f4750b);
                return;
            case 2:
                AndroidUtilities.removeFromParent(this.f4750b);
                return;
            default:
                AndroidUtilities.removeFromParent(this.f4750b);
                return;
        }
    }

    public b4(d4 d4Var, ja0 ja0Var, ClickableSpan clickableSpan) {
        this.f4749a = 0;
        this.f4750b = d4Var;
    }
}
