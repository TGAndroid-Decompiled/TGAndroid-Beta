package di;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.oq0;
import org.telegram.ui.wq0;
public final class la extends oq0 {
    public final org.telegram.ui.Components.q9 f9298a;
    public final LinearLayout f9299b;
    public final long f9300c;

    public la(org.telegram.ui.Components.q9 q9Var, LinearLayout linearLayout, long j3) {
        this.f9298a = q9Var;
        this.f9299b = linearLayout;
        this.f9300c = j3;
    }

    @Override
    public final wq0 E(fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        org.telegram.ui.Components.q9 q9Var = this.f9298a;
        ImageReceiver imageReceiver = q9Var.getImageReceiver();
        int[] iArr = new int[2];
        q9Var.getLocationInWindow(iArr);
        wq0 wq0Var = new wq0();
        wq0Var.f53494b = iArr[0];
        wq0Var.f53495c = iArr[1];
        wq0Var.d = this.f9299b;
        wq0Var.f53503m = null;
        wq0Var.f53493a = imageReceiver;
        if (z10) {
            wq0Var.f53496e = imageReceiver.p();
        }
        wq0Var.h = imageReceiver.E();
        wq0Var.f53497f = this.f9300c;
        wq0Var.f53500j = 0;
        wq0Var.f53499i = 0;
        return wq0Var;
    }

    @Override
    public final boolean L() {
        return true;
    }
}
