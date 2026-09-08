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
    public final int f11272a;
    public final String f11273b;
    public final kl0 f11274c;

    public s1(kl0 kl0Var, String str, int i10) {
        this.f11272a = i10;
        this.f11274c = kl0Var;
        this.f11273b = str;
    }

    @Override
    public final void run() {
        switch (this.f11272a) {
            case 0:
                u1 u1Var = (u1) this.f11274c;
                try {
                    u1Var.f11298n.cancel();
                    u1Var.f11298n = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                String str = this.f11273b;
                u1Var.getClass();
                AndroidUtilities.runOnUIThread(new j4(8, u1Var, str));
                return;
            default:
                try {
                    ((zt) this.f11274c).d.cancel();
                    ((zt) this.f11274c).d = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                Utilities.searchQueue.postRunnable(new yt(0, (zt) this.f11274c, this.f11273b));
                return;
        }
    }
}
