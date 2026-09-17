package hg;

import fi.j4;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.yt;
import org.telegram.ui.zt;
public final class s1 extends TimerTask {
    public final int f11246a;
    public final String f11247b;
    public final kl0 f11248c;

    public s1(kl0 kl0Var, String str, int i10) {
        this.f11246a = i10;
        this.f11248c = kl0Var;
        this.f11247b = str;
    }

    @Override
    public final void run() {
        switch (this.f11246a) {
            case 0:
                u1 u1Var = (u1) this.f11248c;
                try {
                    u1Var.f11272n.cancel();
                    u1Var.f11272n = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                String str = this.f11247b;
                u1Var.getClass();
                AndroidUtilities.runOnUIThread(new j4(8, u1Var, str));
                return;
            default:
                try {
                    ((zt) this.f11248c).d.cancel();
                    ((zt) this.f11248c).d = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                Utilities.searchQueue.postRunnable(new yt(0, (zt) this.f11248c, this.f11247b));
                return;
        }
    }
}
