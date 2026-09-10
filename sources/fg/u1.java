package fg;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.yo0;
import org.telegram.ui.zt;
public final class u1 extends TimerTask {
    public final int f8230a;
    public final String f8231b;
    public final ul0 f8232c;

    public u1(ul0 ul0Var, String str, int i10) {
        this.f8230a = i10;
        this.f8232c = ul0Var;
        this.f8231b = str;
    }

    @Override
    public final void run() {
        switch (this.f8230a) {
            case 0:
                w1 w1Var = (w1) this.f8232c;
                try {
                    w1Var.f8247n.cancel();
                    w1Var.f8247n = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                String str = this.f8231b;
                w1Var.getClass();
                AndroidUtilities.runOnUIThread(new s1(0, w1Var, str));
                return;
            default:
                try {
                    ((zt) this.f8232c).d.cancel();
                    ((zt) this.f8232c).d = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                Utilities.searchQueue.postRunnable(new yo0(27, (zt) this.f8232c, this.f8231b));
                return;
        }
    }
}
