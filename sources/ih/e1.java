package ih;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.Instance;
public final class e1 implements Instance.OnStateUpdatedListener {
    public final f1 f11347a;

    public e1(f1 f1Var) {
        this.f11347a = f1Var;
    }

    @Override
    public final void onStateUpdated(int i9, boolean z10) {
        f1 f1Var = this.f11347a;
        boolean m10 = f1Var.m();
        f1Var.f11408y = i9;
        FileLog.d("[LivePlayer] connectionState = " + i9);
        if (m10 != f1Var.m()) {
            AndroidUtilities.runOnUIThread(new g(this, 2));
        }
    }
}
