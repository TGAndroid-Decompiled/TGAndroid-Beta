package gg;

import ci.x8;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.uo0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.xt;
public final class s1 extends TimerTask {
    public final int f10788a;
    public final String f10789b;
    public final yl0 f10790c;

    public s1(yl0 yl0Var, String str, int i10) {
        this.f10788a = i10;
        this.f10790c = yl0Var;
        this.f10789b = str;
    }

    @Override
    public final void run() {
        switch (this.f10788a) {
            case 0:
                u1 u1Var = (u1) this.f10790c;
                try {
                    u1Var.f10814n.cancel();
                    u1Var.f10814n = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                String str = this.f10789b;
                u1Var.getClass();
                AndroidUtilities.runOnUIThread(new x8(29, u1Var, str));
                return;
            default:
                try {
                    ((xt) this.f10790c).d.cancel();
                    ((xt) this.f10790c).d = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                Utilities.searchQueue.postRunnable(new uo0(28, (xt) this.f10790c, this.f10789b));
                return;
        }
    }
}
