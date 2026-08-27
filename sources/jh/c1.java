package jh;

import hh.y9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.Instance;

public final class c1 implements Instance.OnStateUpdatedListener {

    public final d1 f13136a;

    public c1(d1 d1Var) {
        this.f13136a = d1Var;
    }

    @Override
    public final void onStateUpdated(int i10, boolean z10) {
        d1 d1Var = this.f13136a;
        boolean zM = d1Var.m();
        d1Var.f13184y = i10;
        FileLog.d("[LivePlayer] connectionState = " + i10);
        if (zM != d1Var.m()) {
            AndroidUtilities.runOnUIThread(new y9(this, 9));
        }
    }
}
