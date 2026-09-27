package gg;

import ci.x8;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.dp0;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.wt;
public final class s1 extends TimerTask {
    public final int f9911a;
    public final String f9912b;
    public final xl0 f9913c;

    public s1(xl0 xl0Var, String str, int i10) {
        this.f9911a = i10;
        this.f9913c = xl0Var;
        this.f9912b = str;
    }

    @Override
    public final void run() {
        switch (this.f9911a) {
            case 0:
                u1 u1Var = (u1) this.f9913c;
                try {
                    u1Var.f9936n.cancel();
                    u1Var.f9936n = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                String str = this.f9912b;
                u1Var.getClass();
                AndroidUtilities.runOnUIThread(new x8(29, u1Var, str));
                return;
            default:
                try {
                    ((wt) this.f9913c).d.cancel();
                    ((wt) this.f9913c).d = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                Utilities.searchQueue.postRunnable(new dp0(26, (wt) this.f9913c, this.f9912b));
                return;
        }
    }
}
