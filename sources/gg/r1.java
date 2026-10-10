package gg;

import ci.y8;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.fa1;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.xt;
public final class r1 extends TimerTask {
    public final int f10786a;
    public final String f10787b;
    public final qm0 f10788c;

    public r1(qm0 qm0Var, String str, int i10) {
        this.f10786a = i10;
        this.f10788c = qm0Var;
        this.f10787b = str;
    }

    @Override
    public final void run() {
        switch (this.f10786a) {
            case 0:
                t1 t1Var = (t1) this.f10788c;
                try {
                    t1Var.f10816n.cancel();
                    t1Var.f10816n = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                String str = this.f10787b;
                t1Var.getClass();
                AndroidUtilities.runOnUIThread(new y8(29, t1Var, str));
                return;
            default:
                try {
                    ((xt) this.f10788c).d.cancel();
                    ((xt) this.f10788c).d = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                Utilities.searchQueue.postRunnable(new fa1(5, (xt) this.f10788c, this.f10787b));
                return;
        }
    }
}
