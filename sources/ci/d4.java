package ci;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d90;
public final class d4 implements Runnable {
    public final int f4493a;
    public final f4 f4494b;

    public d4(f4 f4Var, int i10) {
        this.f4493a = i10;
        this.f4494b = f4Var;
    }

    @Override
    public final void run() {
        switch (this.f4493a) {
            case 0:
                this.f4494b.getClass();
                return;
            case 1:
                AndroidUtilities.removeFromParent(this.f4494b);
                return;
            case 2:
                AndroidUtilities.removeFromParent(this.f4494b);
                return;
            default:
                AndroidUtilities.removeFromParent(this.f4494b);
                return;
        }
    }

    public d4(f4 f4Var, d90 d90Var, ClickableSpan clickableSpan) {
        this.f4493a = 0;
        this.f4494b = f4Var;
    }
}
