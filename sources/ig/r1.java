package ig;

import hi.u2;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.mt;
public final class r1 extends TimerTask {
    public final int f14225a;
    public final String f14226b;
    public final lm0 f14227c;

    public r1(lm0 lm0Var, String str, int i10) {
        this.f14225a = i10;
        this.f14227c = lm0Var;
        this.f14226b = str;
    }

    @Override
    public final void run() {
        switch (this.f14225a) {
            case 0:
                t1 t1Var = (t1) this.f14227c;
                try {
                    t1Var.f14253n.cancel();
                    t1Var.f14253n = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                String str = this.f14226b;
                t1Var.getClass();
                AndroidUtilities.runOnUIThread(new u2(11, t1Var, str));
                return;
            default:
                try {
                    ((mt) this.f14227c).d.cancel();
                    ((mt) this.f14227c).d = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                Utilities.searchQueue.postRunnable(new c71(17, (mt) this.f14227c, this.f14226b));
                return;
        }
    }
}
