package oh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.Instance;
public final class d1 implements Instance.OnStateUpdatedListener {
    public final e1 f16956a;

    public d1(e1 e1Var) {
        this.f16956a = e1Var;
    }

    @Override
    public final void onStateUpdated(int i10, boolean z4) {
        e1 e1Var = this.f16956a;
        boolean m9 = e1Var.m();
        e1Var.f17012y = i10;
        FileLog.d("[LivePlayer] connectionState = " + i10);
        if (m9 != e1Var.m()) {
            AndroidUtilities.runOnUIThread(new lh.c3(this, 26));
        }
    }
}
