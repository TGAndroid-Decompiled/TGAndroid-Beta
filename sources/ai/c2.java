package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.Instance;
public final class c2 implements Instance.OnStateUpdatedListener {
    public final d2 f621a;

    public c2(d2 d2Var) {
        this.f621a = d2Var;
    }

    @Override
    public final void onStateUpdated(int i10, boolean z10) {
        d2 d2Var = this.f621a;
        boolean m10 = d2Var.m();
        d2Var.f697y = i10;
        FileLog.d("[LivePlayer] connectionState = " + i10);
        if (m10 != d2Var.m()) {
            AndroidUtilities.runOnUIThread(new a3.d(this, 4));
        }
    }
}
