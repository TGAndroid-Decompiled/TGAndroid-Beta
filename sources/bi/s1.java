package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.Instance;
public final class s1 implements Instance.OnStateUpdatedListener {
    public final t1 f3629a;

    public s1(t1 t1Var) {
        this.f3629a = t1Var;
    }

    @Override
    public final void onStateUpdated(int i10, boolean z10) {
        t1 t1Var = this.f3629a;
        boolean m10 = t1Var.m();
        t1Var.f3733y = i10;
        FileLog.d("[LivePlayer] connectionState = " + i10);
        if (m10 != t1Var.m()) {
            AndroidUtilities.runOnUIThread(new a3.d(this, 15));
        }
    }
}
