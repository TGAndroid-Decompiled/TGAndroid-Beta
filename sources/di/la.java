package di;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.oq0;
import org.telegram.ui.wq0;
public final class la extends oq0 {
    public final org.telegram.ui.Components.q9 f9301a;
    public final LinearLayout f9302b;
    public final long f9303c;

    public la(org.telegram.ui.Components.q9 q9Var, LinearLayout linearLayout, long j3) {
        this.f9301a = q9Var;
        this.f9302b = linearLayout;
        this.f9303c = j3;
    }

    @Override
    public final wq0 E(gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        org.telegram.ui.Components.q9 q9Var = this.f9301a;
        ImageReceiver imageReceiver = q9Var.getImageReceiver();
        int[] iArr = new int[2];
        q9Var.getLocationInWindow(iArr);
        wq0 wq0Var = new wq0();
        wq0Var.f53498b = iArr[0];
        wq0Var.f53499c = iArr[1];
        wq0Var.d = this.f9302b;
        wq0Var.f53507m = null;
        wq0Var.f53497a = imageReceiver;
        if (z10) {
            wq0Var.f53500e = imageReceiver.p();
        }
        wq0Var.h = imageReceiver.E();
        wq0Var.f53501f = this.f9303c;
        wq0Var.f53504j = 0;
        wq0Var.f53503i = 0;
        return wq0Var;
    }

    @Override
    public final boolean L() {
        return true;
    }
}
