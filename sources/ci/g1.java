package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.Instance;
public final class g1 implements Instance.OnStateUpdatedListener {
    public final h1 f5415a;

    public g1(h1 h1Var) {
        this.f5415a = h1Var;
    }

    @Override
    public final void onStateUpdated(int i10, boolean z10) {
        h1 h1Var = this.f5415a;
        boolean m10 = h1Var.m();
        h1Var.f5452y = i10;
        FileLog.d("[LivePlayer] connectionState = " + i10);
        if (m10 != h1Var.m()) {
            AndroidUtilities.runOnUIThread(new androidx.fragment.app.d(this, 8));
        }
    }
}
