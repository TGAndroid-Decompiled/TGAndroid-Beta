package ci;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.eq0;
import org.telegram.ui.mq0;
public final class sa extends eq0 {
    public final org.telegram.ui.Components.k9 f5977a;
    public final LinearLayout f5978b;
    public final long f5979c;

    public sa(org.telegram.ui.Components.k9 k9Var, LinearLayout linearLayout, long j10) {
        this.f5977a = k9Var;
        this.f5978b = linearLayout;
        this.f5979c = j10;
    }

    @Override
    public final mq0 E(zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        org.telegram.ui.Components.k9 k9Var = this.f5977a;
        ImageReceiver imageReceiver = k9Var.getImageReceiver();
        int[] iArr = new int[2];
        k9Var.getLocationInWindow(iArr);
        mq0 mq0Var = new mq0();
        mq0Var.f47752b = iArr[0];
        mq0Var.f47753c = iArr[1];
        mq0Var.d = this.f5978b;
        mq0Var.f47761m = null;
        mq0Var.f47751a = imageReceiver;
        if (z10) {
            mq0Var.f47754e = imageReceiver.p();
        }
        mq0Var.h = imageReceiver.E();
        mq0Var.f47755f = this.f5979c;
        mq0Var.f47758j = 0;
        mq0Var.f47757i = 0;
        return mq0Var;
    }

    @Override
    public final boolean L() {
        return true;
    }
}
