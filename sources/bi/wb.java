package bi;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.qq0;
import org.telegram.ui.zq0;
public final class wb extends qq0 {
    public final org.telegram.ui.Components.k9 f4990a;
    public final LinearLayout f4991b;
    public final long f4992c;

    public wb(org.telegram.ui.Components.k9 k9Var, LinearLayout linearLayout, long j3) {
        this.f4990a = k9Var;
        this.f4991b = linearLayout;
        this.f4992c = j3;
    }

    @Override
    public final zq0 E(ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        org.telegram.ui.Components.k9 k9Var = this.f4990a;
        ImageReceiver imageReceiver = k9Var.getImageReceiver();
        int[] iArr = new int[2];
        k9Var.getLocationInWindow(iArr);
        zq0 zq0Var = new zq0();
        zq0Var.f52504b = iArr[0];
        zq0Var.f52505c = iArr[1];
        zq0Var.d = this.f4991b;
        zq0Var.f52513m = null;
        zq0Var.f52503a = imageReceiver;
        if (z9) {
            zq0Var.f52506e = imageReceiver.p();
        }
        zq0Var.h = imageReceiver.E();
        zq0Var.f52507f = this.f4992c;
        zq0Var.f52510j = 0;
        zq0Var.f52509i = 0;
        return zq0Var;
    }

    @Override
    public final boolean L() {
        return true;
    }
}
