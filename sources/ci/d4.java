package ci;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.m90;
public final class d4 implements Runnable {
    public final int f4498a;
    public final f4 f4499b;

    public d4(f4 f4Var, int i10) {
        this.f4498a = i10;
        this.f4499b = f4Var;
    }

    @Override
    public final void run() {
        switch (this.f4498a) {
            case 0:
                this.f4499b.getClass();
                return;
            case 1:
                AndroidUtilities.removeFromParent(this.f4499b);
                return;
            case 2:
                AndroidUtilities.removeFromParent(this.f4499b);
                return;
            default:
                AndroidUtilities.removeFromParent(this.f4499b);
                return;
        }
    }

    public d4(f4 f4Var, m90 m90Var, ClickableSpan clickableSpan) {
        this.f4498a = 0;
        this.f4499b = f4Var;
    }
}
