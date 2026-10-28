package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.Instance;
public final class g1 implements Instance.OnStateUpdatedListener {
    public final h1 f8572a;

    public g1(h1 h1Var) {
        this.f8572a = h1Var;
    }

    @Override
    public final void onStateUpdated(int i10, boolean z10) {
        h1 h1Var = this.f8572a;
        boolean m10 = h1Var.m();
        h1Var.f8612y = i10;
        FileLog.d("[LivePlayer] connectionState = " + i10);
        if (m10 != h1Var.m()) {
            AndroidUtilities.runOnUIThread(new bi.u6(this, 15));
        }
    }
}
