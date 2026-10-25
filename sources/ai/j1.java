package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.b3;
public final class j1 implements Runnable {
    public final int f1556a = 0;
    public final Utilities.Callback f1557b;
    public final String f1558c;

    public j1(String str, Utilities.Callback callback) {
        this.f1558c = str;
        this.f1557b = callback;
    }

    @Override
    public final void run() {
        switch (this.f1556a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a1.f(17, this.f1557b, h.c(this.f1558c, AndroidUtilities.dp(240.0f), jc.c.M, 0.75f, null)));
                return;
            default:
                this.f1557b.run(this.f1558c);
                return;
        }
    }

    public j1(b3 b3Var, String str) {
        this.f1557b = b3Var;
        this.f1558c = str;
    }
}
