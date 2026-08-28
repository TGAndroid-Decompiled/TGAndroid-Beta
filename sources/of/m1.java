package of;

import java.util.TimerTask;
import kh.o8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.ot;
public final class m1 extends TimerTask {
    public final int f19424a;
    public final String f19425b;
    public final vk0 f19426c;

    public m1(vk0 vk0Var, String str, int i9) {
        this.f19424a = i9;
        this.f19426c = vk0Var;
        this.f19425b = str;
    }

    @Override
    public final void run() {
        switch (this.f19424a) {
            case 0:
                o1 o1Var = (o1) this.f19426c;
                try {
                    o1Var.f19441n.cancel();
                    o1Var.f19441n = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                String str = this.f19425b;
                o1Var.getClass();
                AndroidUtilities.runOnUIThread(new o8(17, o1Var, str));
                return;
            default:
                try {
                    ((ot) this.f19426c).d.cancel();
                    ((ot) this.f19426c).d = null;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                Utilities.searchQueue.postRunnable(new p61(6, (ot) this.f19426c, this.f19425b));
                return;
        }
    }
}
