package gg;

import ci.b9;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ar0;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.yt;
public final class s1 extends TimerTask {
    public final int f9920a;
    public final String f9921b;
    public final kl0 f9922c;

    public s1(kl0 kl0Var, String str, int i10) {
        this.f9920a = i10;
        this.f9922c = kl0Var;
        this.f9921b = str;
    }

    @Override
    public final void run() {
        switch (this.f9920a) {
            case 0:
                u1 u1Var = (u1) this.f9922c;
                try {
                    u1Var.f9945n.cancel();
                    u1Var.f9945n = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                String str = this.f9921b;
                u1Var.getClass();
                AndroidUtilities.runOnUIThread(new b9(29, u1Var, str));
                return;
            default:
                try {
                    ((yt) this.f9922c).d.cancel();
                    ((yt) this.f9922c).d = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                Utilities.searchQueue.postRunnable(new ar0(24, (yt) this.f9922c, this.f9921b));
                return;
        }
    }
}
