package ai;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.cu0;
import org.telegram.ui.mu0;
public final class qc extends cu0 {
    public final org.telegram.ui.Components.w9 f2092a;
    public final LinearLayout f2093b;
    public final long f2094c;

    public qc(org.telegram.ui.Components.w9 w9Var, LinearLayout linearLayout, long j10) {
        this.f2092a = w9Var;
        this.f2093b = linearLayout;
        this.f2094c = j10;
    }

    @Override
    public final mu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Components.w9 w9Var = this.f2092a;
        ImageReceiver imageReceiver = w9Var.getImageReceiver();
        int[] iArr = new int[2];
        w9Var.getLocationInWindow(iArr);
        mu0 mu0Var = new mu0();
        mu0Var.f39693b = iArr[0];
        mu0Var.f39694c = iArr[1];
        mu0Var.d = this.f2093b;
        mu0Var.f39701m = null;
        mu0Var.f39692a = imageReceiver;
        if (z10) {
            mu0Var.e = imageReceiver.getBitmapSafe();
        }
        mu0Var.h = imageReceiver.getRoundRadius(true);
        mu0Var.f39695f = this.f2094c;
        mu0Var.f39698j = 0;
        mu0Var.f39697i = 0;
        return mu0Var;
    }

    @Override
    public final boolean L() {
        return true;
    }
}
