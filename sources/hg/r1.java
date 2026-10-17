package hg;

import ei.p6;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.ot;
public final class r1 extends TimerTask {
    public final int f12030a;
    public final String f12031b;
    public final hm0 f12032c;

    public r1(hm0 hm0Var, String str, int i10) {
        this.f12030a = i10;
        this.f12032c = hm0Var;
        this.f12031b = str;
    }

    @Override
    public final void run() {
        switch (this.f12030a) {
            case 0:
                t1 t1Var = (t1) this.f12032c;
                try {
                    t1Var.f12058n.cancel();
                    t1Var.f12058n = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                String str = this.f12031b;
                t1Var.getClass();
                AndroidUtilities.runOnUIThread(new p6(27, t1Var, str));
                return;
            default:
                try {
                    ((ot) this.f12032c).d.cancel();
                    ((ot) this.f12032c).d = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                Utilities.searchQueue.postRunnable(new go0(29, (ot) this.f12032c, this.f12031b));
                return;
        }
    }
}
