package di;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e90;
public final class d4 implements Runnable {
    public final int f7090a;
    public final f4 f7091b;

    public d4(f4 f4Var, int i10) {
        this.f7090a = i10;
        this.f7091b = f4Var;
    }

    @Override
    public final void run() {
        switch (this.f7090a) {
            case 0:
                this.f7091b.getClass();
                return;
            case 1:
                AndroidUtilities.removeFromParent(this.f7091b);
                return;
            case 2:
                AndroidUtilities.removeFromParent(this.f7091b);
                return;
            default:
                AndroidUtilities.removeFromParent(this.f7091b);
                return;
        }
    }

    public d4(f4 f4Var, e90 e90Var, ClickableSpan clickableSpan) {
        this.f7090a = 0;
        this.f7091b = f4Var;
    }
}
