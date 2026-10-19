package hg;

import ei.p6;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.mt;
public final class r1 extends TimerTask {
    public final int f12029a;
    public final String f12030b;
    public final hm0 f12031c;

    public r1(hm0 hm0Var, String str, int i10) {
        this.f12029a = i10;
        this.f12031c = hm0Var;
        this.f12030b = str;
    }

    @Override
    public final void run() {
        switch (this.f12029a) {
            case 0:
                t1 t1Var = (t1) this.f12031c;
                try {
                    t1Var.f12057n.cancel();
                    t1Var.f12057n = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                String str = this.f12030b;
                t1Var.getClass();
                AndroidUtilities.runOnUIThread(new p6(27, t1Var, str));
                return;
            default:
                try {
                    ((mt) this.f12031c).d.cancel();
                    ((mt) this.f12031c).d = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                Utilities.searchQueue.postRunnable(new go0(29, (mt) this.f12031c, this.f12030b));
                return;
        }
    }
}
