package bi;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nq0;
import org.telegram.ui.wq0;
public final class wb extends nq0 {
    public final org.telegram.ui.Components.l9 f4988a;
    public final LinearLayout f4989b;
    public final long f4990c;

    public wb(org.telegram.ui.Components.l9 l9Var, LinearLayout linearLayout, long j3) {
        this.f4988a = l9Var;
        this.f4989b = linearLayout;
        this.f4990c = j3;
    }

    @Override
    public final wq0 E(ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        org.telegram.ui.Components.l9 l9Var = this.f4988a;
        ImageReceiver imageReceiver = l9Var.getImageReceiver();
        int[] iArr = new int[2];
        l9Var.getLocationInWindow(iArr);
        wq0 wq0Var = new wq0();
        wq0Var.f51477b = iArr[0];
        wq0Var.f51478c = iArr[1];
        wq0Var.d = this.f4989b;
        wq0Var.f51486m = null;
        wq0Var.f51476a = imageReceiver;
        if (z9) {
            wq0Var.f51479e = imageReceiver.p();
        }
        wq0Var.h = imageReceiver.E();
        wq0Var.f51480f = this.f4990c;
        wq0Var.f51483j = 0;
        wq0Var.f51482i = 0;
        return wq0Var;
    }

    @Override
    public final boolean L() {
        return true;
    }
}
