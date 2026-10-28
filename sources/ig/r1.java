package ig;

import hi.u2;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.ot;
public final class r1 extends TimerTask {
    public final int f14224a;
    public final String f14225b;
    public final mm0 f14226c;

    public r1(mm0 mm0Var, String str, int i10) {
        this.f14224a = i10;
        this.f14226c = mm0Var;
        this.f14225b = str;
    }

    @Override
    public final void run() {
        switch (this.f14224a) {
            case 0:
                t1 t1Var = (t1) this.f14226c;
                try {
                    t1Var.f14252n.cancel();
                    t1Var.f14252n = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                String str = this.f14225b;
                t1Var.getClass();
                AndroidUtilities.runOnUIThread(new u2(11, t1Var, str));
                return;
            default:
                try {
                    ((ot) this.f14226c).d.cancel();
                    ((ot) this.f14226c).d = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                Utilities.searchQueue.postRunnable(new d71(18, (ot) this.f14226c, this.f14225b));
                return;
        }
    }
}
