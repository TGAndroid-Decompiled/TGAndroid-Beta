package gg;

import ci.y8;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.wt;
public final class r1 extends TimerTask {
    public final int f10785a;
    public final String f10786b;
    public final rm0 f10787c;

    public r1(rm0 rm0Var, String str, int i10) {
        this.f10785a = i10;
        this.f10787c = rm0Var;
        this.f10786b = str;
    }

    @Override
    public final void run() {
        switch (this.f10785a) {
            case 0:
                t1 t1Var = (t1) this.f10787c;
                try {
                    t1Var.f10815n.cancel();
                    t1Var.f10815n = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                String str = this.f10786b;
                t1Var.getClass();
                AndroidUtilities.runOnUIThread(new y8(29, t1Var, str));
                return;
            default:
                try {
                    ((wt) this.f10787c).d.cancel();
                    ((wt) this.f10787c).d = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                Utilities.searchQueue.postRunnable(new org.telegram.ui.Components.voip.i(4, (wt) this.f10787c, this.f10786b));
                return;
        }
    }
}
