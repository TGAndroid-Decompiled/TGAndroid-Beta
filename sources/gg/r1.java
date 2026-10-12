package gg;

import ci.y8;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.au;
public final class r1 extends TimerTask {
    public final int f10784a;
    public final String f10785b;
    public final vm0 f10786c;

    public r1(vm0 vm0Var, String str, int i10) {
        this.f10784a = i10;
        this.f10786c = vm0Var;
        this.f10785b = str;
    }

    @Override
    public final void run() {
        switch (this.f10784a) {
            case 0:
                t1 t1Var = (t1) this.f10786c;
                try {
                    t1Var.f10814n.cancel();
                    t1Var.f10814n = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                String str = this.f10785b;
                t1Var.getClass();
                AndroidUtilities.runOnUIThread(new y8(29, t1Var, str));
                return;
            default:
                try {
                    ((au) this.f10786c).d.cancel();
                    ((au) this.f10786c).d = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                Utilities.searchQueue.postRunnable(new org.telegram.ui.Components.voip.y(2, (au) this.f10786c, this.f10785b));
                return;
        }
    }
}
