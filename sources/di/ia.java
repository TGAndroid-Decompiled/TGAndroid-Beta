package di;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.mq0;
import org.telegram.ui.uq0;
public final class ia extends mq0 {
    public final org.telegram.ui.Components.i9 f8814a;
    public final LinearLayout f8815b;
    public final long f8816c;

    public ia(org.telegram.ui.Components.i9 i9Var, LinearLayout linearLayout, long j3) {
        this.f8814a = i9Var;
        this.f8815b = linearLayout;
        this.f8816c = j3;
    }

    @Override
    public final uq0 E(gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        org.telegram.ui.Components.i9 i9Var = this.f8814a;
        ImageReceiver imageReceiver = i9Var.getImageReceiver();
        int[] iArr = new int[2];
        i9Var.getLocationInWindow(iArr);
        uq0 uq0Var = new uq0();
        uq0Var.f52000b = iArr[0];
        uq0Var.f52001c = iArr[1];
        uq0Var.d = this.f8815b;
        uq0Var.f52009m = null;
        uq0Var.f51999a = imageReceiver;
        if (z10) {
            uq0Var.f52002e = imageReceiver.p();
        }
        uq0Var.h = imageReceiver.E();
        uq0Var.f52003f = this.f8816c;
        uq0Var.f52006j = 0;
        uq0Var.f52005i = 0;
        return uq0Var;
    }

    @Override
    public final boolean L() {
        return true;
    }
}
