package di;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e90;
public final class d4 implements Runnable {
    public final int f7062a;
    public final f4 f7063b;

    public d4(f4 f4Var, int i10) {
        this.f7062a = i10;
        this.f7063b = f4Var;
    }

    @Override
    public final void run() {
        switch (this.f7062a) {
            case 0:
                this.f7063b.getClass();
                return;
            case 1:
                AndroidUtilities.removeFromParent(this.f7063b);
                return;
            case 2:
                AndroidUtilities.removeFromParent(this.f7063b);
                return;
            default:
                AndroidUtilities.removeFromParent(this.f7063b);
                return;
        }
    }

    public d4(f4 f4Var, e90 e90Var, ClickableSpan clickableSpan) {
        this.f7062a = 0;
        this.f7063b = f4Var;
    }
}
