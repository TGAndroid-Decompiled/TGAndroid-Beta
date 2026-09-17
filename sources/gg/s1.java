package gg;

import ci.b9;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.br0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.au;
public final class s1 extends TimerTask {
    public final int f9924a;
    public final String f9925b;
    public final ll0 f9926c;

    public s1(ll0 ll0Var, String str, int i10) {
        this.f9924a = i10;
        this.f9926c = ll0Var;
        this.f9925b = str;
    }

    @Override
    public final void run() {
        switch (this.f9924a) {
            case 0:
                u1 u1Var = (u1) this.f9926c;
                try {
                    u1Var.f9949n.cancel();
                    u1Var.f9949n = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                String str = this.f9925b;
                u1Var.getClass();
                AndroidUtilities.runOnUIThread(new b9(29, u1Var, str));
                return;
            default:
                try {
                    ((au) this.f9926c).d.cancel();
                    ((au) this.f9926c).d = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                Utilities.searchQueue.postRunnable(new br0(24, (au) this.f9926c, this.f9925b));
                return;
        }
    }
}
