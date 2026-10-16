package hg;

import fi.q3;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.n51;
import org.telegram.ui.du;
public final class r1 extends TimerTask {
    public final int f10725a;
    public final String f10726b;
    public final lm0 f10727c;

    public r1(lm0 lm0Var, String str, int i10) {
        this.f10725a = i10;
        this.f10727c = lm0Var;
        this.f10726b = str;
    }

    @Override
    public final void run() {
        switch (this.f10725a) {
            case 0:
                t1 t1Var = (t1) this.f10727c;
                try {
                    t1Var.f10753n.cancel();
                    t1Var.f10753n = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                String str = this.f10726b;
                t1Var.getClass();
                AndroidUtilities.runOnUIThread(new q3(10, t1Var, str));
                return;
            default:
                try {
                    ((du) this.f10727c).d.cancel();
                    ((du) this.f10727c).d = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                Utilities.searchQueue.postRunnable(new n51(11, (du) this.f10727c, this.f10726b));
                return;
        }
    }
}
