package di;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.oq0;
import org.telegram.ui.wq0;
public final class la extends oq0 {
    public final org.telegram.ui.Components.p9 f9262a;
    public final LinearLayout f9263b;
    public final long f9264c;

    public la(org.telegram.ui.Components.p9 p9Var, LinearLayout linearLayout, long j3) {
        this.f9262a = p9Var;
        this.f9263b = linearLayout;
        this.f9264c = j3;
    }

    @Override
    public final wq0 E(fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        org.telegram.ui.Components.p9 p9Var = this.f9262a;
        ImageReceiver imageReceiver = p9Var.getImageReceiver();
        int[] iArr = new int[2];
        p9Var.getLocationInWindow(iArr);
        wq0 wq0Var = new wq0();
        wq0Var.f53727b = iArr[0];
        wq0Var.f53728c = iArr[1];
        wq0Var.d = this.f9263b;
        wq0Var.f53736m = null;
        wq0Var.f53726a = imageReceiver;
        if (z10) {
            wq0Var.f53729e = imageReceiver.p();
        }
        wq0Var.h = imageReceiver.F();
        wq0Var.f53730f = this.f9264c;
        wq0Var.f53733j = 0;
        wq0Var.f53732i = 0;
        return wq0Var;
    }

    @Override
    public final boolean L() {
        return true;
    }
}
