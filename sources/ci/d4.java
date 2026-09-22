package ci;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.o90;
public final class d4 implements Runnable {
    public final int f4497a;
    public final f4 f4498b;

    public d4(f4 f4Var, int i10) {
        this.f4497a = i10;
        this.f4498b = f4Var;
    }

    @Override
    public final void run() {
        switch (this.f4497a) {
            case 0:
                this.f4498b.getClass();
                return;
            case 1:
                AndroidUtilities.removeFromParent(this.f4498b);
                return;
            case 2:
                AndroidUtilities.removeFromParent(this.f4498b);
                return;
            default:
                AndroidUtilities.removeFromParent(this.f4498b);
                return;
        }
    }

    public d4(f4 f4Var, o90 o90Var, ClickableSpan clickableSpan) {
        this.f4497a = 0;
        this.f4498b = f4Var;
    }
}
