package ci;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l90;
public final class d4 implements Runnable {
    public final int f4499a;
    public final f4 f4500b;

    public d4(f4 f4Var, int i10) {
        this.f4499a = i10;
        this.f4500b = f4Var;
    }

    @Override
    public final void run() {
        switch (this.f4499a) {
            case 0:
                this.f4500b.getClass();
                return;
            case 1:
                AndroidUtilities.removeFromParent(this.f4500b);
                return;
            case 2:
                AndroidUtilities.removeFromParent(this.f4500b);
                return;
            default:
                AndroidUtilities.removeFromParent(this.f4500b);
                return;
        }
    }

    public d4(f4 f4Var, l90 l90Var, ClickableSpan clickableSpan) {
        this.f4499a = 0;
        this.f4500b = f4Var;
    }
}
