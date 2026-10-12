package di;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ea0;
public final class b4 implements Runnable {
    public final int f6653a;
    public final d4 f6654b;

    public b4(d4 d4Var, int i10) {
        this.f6653a = i10;
        this.f6654b = d4Var;
    }

    @Override
    public final void run() {
        switch (this.f6653a) {
            case 0:
                this.f6654b.getClass();
                return;
            case 1:
                AndroidUtilities.removeFromParent(this.f6654b);
                return;
            case 2:
                AndroidUtilities.removeFromParent(this.f6654b);
                return;
            default:
                AndroidUtilities.removeFromParent(this.f6654b);
                return;
        }
    }

    public b4(d4 d4Var, ea0 ea0Var, ClickableSpan clickableSpan) {
        this.f6653a = 0;
        this.f6654b = d4Var;
    }
}
