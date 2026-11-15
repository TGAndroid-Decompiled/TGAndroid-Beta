package di;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.mq0;
import org.telegram.ui.uq0;
public final class ha extends mq0 {
    public final org.telegram.ui.Components.i9 f8739a;
    public final LinearLayout f8740b;
    public final long f8741c;

    public ha(org.telegram.ui.Components.i9 i9Var, LinearLayout linearLayout, long j3) {
        this.f8739a = i9Var;
        this.f8740b = linearLayout;
        this.f8741c = j3;
    }

    @Override
    public final uq0 E(gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        org.telegram.ui.Components.i9 i9Var = this.f8739a;
        ImageReceiver imageReceiver = i9Var.getImageReceiver();
        int[] iArr = new int[2];
        i9Var.getLocationInWindow(iArr);
        uq0 uq0Var = new uq0();
        uq0Var.f51998b = iArr[0];
        uq0Var.f51999c = iArr[1];
        uq0Var.d = this.f8740b;
        uq0Var.f52007m = null;
        uq0Var.f51997a = imageReceiver;
        if (z10) {
            uq0Var.f52000e = imageReceiver.p();
        }
        uq0Var.h = imageReceiver.E();
        uq0Var.f52001f = this.f8741c;
        uq0Var.f52004j = 0;
        uq0Var.f52003i = 0;
        return uq0Var;
    }

    @Override
    public final boolean L() {
        return true;
    }
}
