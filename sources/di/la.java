package di;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.oq0;
import org.telegram.ui.wq0;
public final class la extends oq0 {
    public final org.telegram.ui.Components.q9 f9268a;
    public final LinearLayout f9269b;
    public final long f9270c;

    public la(org.telegram.ui.Components.q9 q9Var, LinearLayout linearLayout, long j3) {
        this.f9268a = q9Var;
        this.f9269b = linearLayout;
        this.f9270c = j3;
    }

    @Override
    public final wq0 E(fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        org.telegram.ui.Components.q9 q9Var = this.f9268a;
        ImageReceiver imageReceiver = q9Var.getImageReceiver();
        int[] iArr = new int[2];
        q9Var.getLocationInWindow(iArr);
        wq0 wq0Var = new wq0();
        wq0Var.f53448b = iArr[0];
        wq0Var.f53449c = iArr[1];
        wq0Var.d = this.f9269b;
        wq0Var.f53457m = null;
        wq0Var.f53447a = imageReceiver;
        if (z10) {
            wq0Var.f53450e = imageReceiver.p();
        }
        wq0Var.h = imageReceiver.E();
        wq0Var.f53451f = this.f9270c;
        wq0Var.f53454j = 0;
        wq0Var.f53453i = 0;
        return wq0Var;
    }

    @Override
    public final boolean L() {
        return true;
    }
}
