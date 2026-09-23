package ci;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e90;
public final class c4 implements Runnable {
    public final int f4435a;
    public final e4 f4436b;

    public c4(e4 e4Var, int i10) {
        this.f4435a = i10;
        this.f4436b = e4Var;
    }

    @Override
    public final void run() {
        switch (this.f4435a) {
            case 0:
                this.f4436b.getClass();
                return;
            case 1:
                AndroidUtilities.removeFromParent(this.f4436b);
                return;
            case 2:
                AndroidUtilities.removeFromParent(this.f4436b);
                return;
            default:
                AndroidUtilities.removeFromParent(this.f4436b);
                return;
        }
    }

    public c4(e4 e4Var, e90 e90Var, ClickableSpan clickableSpan) {
        this.f4435a = 0;
        this.f4436b = e4Var;
    }
}
