package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.Instance;
public final class c1 implements Instance.OnStateUpdatedListener {
    public final d1 f15419a;

    public c1(d1 d1Var) {
        this.f15419a = d1Var;
    }

    @Override
    public final void onStateUpdated(int i10, boolean z10) {
        d1 d1Var = this.f15419a;
        boolean m10 = d1Var.m();
        d1Var.f15463y = i10;
        FileLog.d("[LivePlayer] connectionState = " + i10);
        if (m10 != d1Var.m()) {
            AndroidUtilities.runOnUIThread(new jh.o(this, 23));
        }
    }
}
