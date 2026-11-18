package di;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.oq0;
import org.telegram.ui.wq0;
public final class la extends oq0 {
    public final org.telegram.ui.Components.q9 f9271a;
    public final LinearLayout f9272b;
    public final long f9273c;

    public la(org.telegram.ui.Components.q9 q9Var, LinearLayout linearLayout, long j3) {
        this.f9271a = q9Var;
        this.f9272b = linearLayout;
        this.f9273c = j3;
    }

    @Override
    public final wq0 E(fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        org.telegram.ui.Components.q9 q9Var = this.f9271a;
        ImageReceiver imageReceiver = q9Var.getImageReceiver();
        int[] iArr = new int[2];
        q9Var.getLocationInWindow(iArr);
        wq0 wq0Var = new wq0();
        wq0Var.f53497b = iArr[0];
        wq0Var.f53498c = iArr[1];
        wq0Var.d = this.f9272b;
        wq0Var.f53506m = null;
        wq0Var.f53496a = imageReceiver;
        if (z10) {
            wq0Var.f53499e = imageReceiver.p();
        }
        wq0Var.h = imageReceiver.E();
        wq0Var.f53500f = this.f9273c;
        wq0Var.f53503j = 0;
        wq0Var.f53502i = 0;
        return wq0Var;
    }

    @Override
    public final boolean L() {
        return true;
    }
}
