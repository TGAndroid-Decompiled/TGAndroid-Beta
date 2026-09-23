package gg;

import ci.y8;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ar0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.vt;
public final class s1 extends TimerTask {
    public final int f9906a;
    public final String f9907b;
    public final ll0 f9908c;

    public s1(ll0 ll0Var, String str, int i10) {
        this.f9906a = i10;
        this.f9908c = ll0Var;
        this.f9907b = str;
    }

    @Override
    public final void run() {
        switch (this.f9906a) {
            case 0:
                u1 u1Var = (u1) this.f9908c;
                try {
                    u1Var.f9931n.cancel();
                    u1Var.f9931n = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                String str = this.f9907b;
                u1Var.getClass();
                AndroidUtilities.runOnUIThread(new y8(29, u1Var, str));
                return;
            default:
                try {
                    ((vt) this.f9908c).d.cancel();
                    ((vt) this.f9908c).d = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                Utilities.searchQueue.postRunnable(new ar0(24, (vt) this.f9908c, this.f9907b));
                return;
        }
    }
}
