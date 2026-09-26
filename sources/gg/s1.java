package gg;

import ci.y8;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xn0;
import org.telegram.ui.ut;
public final class s1 extends TimerTask {
    public final int f9905a;
    public final String f9906b;
    public final wl0 f9907c;

    public s1(wl0 wl0Var, String str, int i10) {
        this.f9905a = i10;
        this.f9907c = wl0Var;
        this.f9906b = str;
    }

    @Override
    public final void run() {
        switch (this.f9905a) {
            case 0:
                u1 u1Var = (u1) this.f9907c;
                try {
                    u1Var.f9930n.cancel();
                    u1Var.f9930n = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                String str = this.f9906b;
                u1Var.getClass();
                AndroidUtilities.runOnUIThread(new y8(29, u1Var, str));
                return;
            default:
                try {
                    ((ut) this.f9907c).d.cancel();
                    ((ut) this.f9907c).d = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                Utilities.searchQueue.postRunnable(new xn0(29, (ut) this.f9907c, this.f9906b));
                return;
        }
    }
}
