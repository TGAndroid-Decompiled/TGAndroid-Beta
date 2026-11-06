package bi;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.mq0;
import org.telegram.ui.vq0;
public final class wb extends mq0 {
    public final org.telegram.ui.Components.l9 f4988a;
    public final LinearLayout f4989b;
    public final long f4990c;

    public wb(org.telegram.ui.Components.l9 l9Var, LinearLayout linearLayout, long j3) {
        this.f4988a = l9Var;
        this.f4989b = linearLayout;
        this.f4990c = j3;
    }

    @Override
    public final vq0 E(ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        org.telegram.ui.Components.l9 l9Var = this.f4988a;
        ImageReceiver imageReceiver = l9Var.getImageReceiver();
        int[] iArr = new int[2];
        l9Var.getLocationInWindow(iArr);
        vq0 vq0Var = new vq0();
        vq0Var.f50791b = iArr[0];
        vq0Var.f50792c = iArr[1];
        vq0Var.d = this.f4989b;
        vq0Var.f50800m = null;
        vq0Var.f50790a = imageReceiver;
        if (z9) {
            vq0Var.f50793e = imageReceiver.p();
        }
        vq0Var.h = imageReceiver.E();
        vq0Var.f50794f = this.f4990c;
        vq0Var.f50797j = 0;
        vq0Var.f50796i = 0;
        return vq0Var;
    }

    @Override
    public final boolean L() {
        return true;
    }
}
