package hg;

import fi.q3;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.k31;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.du;
public final class r1 extends TimerTask {
    public final int f10721a;
    public final String f10722b;
    public final lm0 f10723c;

    public r1(lm0 lm0Var, String str, int i10) {
        this.f10721a = i10;
        this.f10723c = lm0Var;
        this.f10722b = str;
    }

    @Override
    public final void run() {
        switch (this.f10721a) {
            case 0:
                t1 t1Var = (t1) this.f10723c;
                try {
                    t1Var.f10749n.cancel();
                    t1Var.f10749n = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                String str = this.f10722b;
                t1Var.getClass();
                AndroidUtilities.runOnUIThread(new q3(10, t1Var, str));
                return;
            default:
                try {
                    ((du) this.f10723c).d.cancel();
                    ((du) this.f10723c).d = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                Utilities.searchQueue.postRunnable(new k31(16, (du) this.f10723c, this.f10722b));
                return;
        }
    }
}
