package hg;

import ei.p6;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ko0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.pt;
public final class r1 extends TimerTask {
    public final int f12059a;
    public final String f12060b;
    public final lm0 f12061c;

    public r1(lm0 lm0Var, String str, int i10) {
        this.f12059a = i10;
        this.f12061c = lm0Var;
        this.f12060b = str;
    }

    @Override
    public final void run() {
        switch (this.f12059a) {
            case 0:
                t1 t1Var = (t1) this.f12061c;
                try {
                    t1Var.f12087n.cancel();
                    t1Var.f12087n = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                String str = this.f12060b;
                t1Var.getClass();
                AndroidUtilities.runOnUIThread(new p6(27, t1Var, str));
                return;
            default:
                try {
                    ((pt) this.f12061c).d.cancel();
                    ((pt) this.f12061c).d = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                Utilities.searchQueue.postRunnable(new ko0(29, (pt) this.f12061c, this.f12060b));
                return;
        }
    }
}
