package ci;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fa0;
public final class b4 implements Runnable {
    public final int f4751a;
    public final d4 f4752b;

    public b4(d4 d4Var, int i10) {
        this.f4751a = i10;
        this.f4752b = d4Var;
    }

    @Override
    public final void run() {
        switch (this.f4751a) {
            case 0:
                this.f4752b.getClass();
                return;
            case 1:
                AndroidUtilities.removeFromParent(this.f4752b);
                return;
            case 2:
                AndroidUtilities.removeFromParent(this.f4752b);
                return;
            default:
                AndroidUtilities.removeFromParent(this.f4752b);
                return;
        }
    }

    public b4(d4 d4Var, fa0 fa0Var, ClickableSpan clickableSpan) {
        this.f4751a = 0;
        this.f4752b = d4Var;
    }
}
