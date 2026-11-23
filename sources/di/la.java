package di;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.pq0;
import org.telegram.ui.xq0;
public final class la extends pq0 {
    public final org.telegram.ui.Components.q9 f9266a;
    public final LinearLayout f9267b;
    public final long f9268c;

    public la(org.telegram.ui.Components.q9 q9Var, LinearLayout linearLayout, long j3) {
        this.f9266a = q9Var;
        this.f9267b = linearLayout;
        this.f9268c = j3;
    }

    @Override
    public final xq0 E(gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        org.telegram.ui.Components.q9 q9Var = this.f9266a;
        ImageReceiver imageReceiver = q9Var.getImageReceiver();
        int[] iArr = new int[2];
        q9Var.getLocationInWindow(iArr);
        xq0 xq0Var = new xq0();
        xq0Var.f53899b = iArr[0];
        xq0Var.f53900c = iArr[1];
        xq0Var.d = this.f9267b;
        xq0Var.f53908m = null;
        xq0Var.f53898a = imageReceiver;
        if (z10) {
            xq0Var.f53901e = imageReceiver.p();
        }
        xq0Var.h = imageReceiver.E();
        xq0Var.f53902f = this.f9268c;
        xq0Var.f53905j = 0;
        xq0Var.f53904i = 0;
        return xq0Var;
    }

    @Override
    public final boolean L() {
        return true;
    }
}
