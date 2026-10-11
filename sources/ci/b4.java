package ci;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fa0;
public final class b4 implements Runnable {
    public final int f4750a;
    public final d4 f4751b;

    public b4(d4 d4Var, int i10) {
        this.f4750a = i10;
        this.f4751b = d4Var;
    }

    @Override
    public final void run() {
        switch (this.f4750a) {
            case 0:
                this.f4751b.getClass();
                return;
            case 1:
                AndroidUtilities.removeFromParent(this.f4751b);
                return;
            case 2:
                AndroidUtilities.removeFromParent(this.f4751b);
                return;
            default:
                AndroidUtilities.removeFromParent(this.f4751b);
                return;
        }
    }

    public b4(d4 d4Var, fa0 fa0Var, ClickableSpan clickableSpan) {
        this.f4750a = 0;
        this.f4751b = d4Var;
    }
}
