package bi;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.pq0;
import org.telegram.ui.yq0;
public final class wb extends pq0 {
    public final org.telegram.ui.Components.l9 f4986a;
    public final LinearLayout f4987b;
    public final long f4988c;

    public wb(org.telegram.ui.Components.l9 l9Var, LinearLayout linearLayout, long j3) {
        this.f4986a = l9Var;
        this.f4987b = linearLayout;
        this.f4988c = j3;
    }

    @Override
    public final yq0 E(ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        org.telegram.ui.Components.l9 l9Var = this.f4986a;
        ImageReceiver imageReceiver = l9Var.getImageReceiver();
        int[] iArr = new int[2];
        l9Var.getLocationInWindow(iArr);
        yq0 yq0Var = new yq0();
        yq0Var.f52160b = iArr[0];
        yq0Var.f52161c = iArr[1];
        yq0Var.d = this.f4987b;
        yq0Var.f52169m = null;
        yq0Var.f52159a = imageReceiver;
        if (z9) {
            yq0Var.f52162e = imageReceiver.p();
        }
        yq0Var.h = imageReceiver.E();
        yq0Var.f52163f = this.f4988c;
        yq0Var.f52166j = 0;
        yq0Var.f52165i = 0;
        return yq0Var;
    }

    @Override
    public final boolean L() {
        return true;
    }
}
