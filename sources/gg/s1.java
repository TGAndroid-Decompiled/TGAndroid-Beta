package gg;

import ci.b9;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.yt;
import org.telegram.ui.zt;
public final class s1 extends TimerTask {
    public final int f9924a;
    public final String f9925b;
    public final xl0 f9926c;

    public s1(xl0 xl0Var, String str, int i10) {
        this.f9924a = i10;
        this.f9926c = xl0Var;
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
                    ((zt) this.f9926c).d.cancel();
                    ((zt) this.f9926c).d = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                Utilities.searchQueue.postRunnable(new yt(0, (zt) this.f9926c, this.f9925b));
                return;
        }
    }
}
