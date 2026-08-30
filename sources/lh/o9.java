package lh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ju0;
import org.telegram.ui.yt0;
public final class o9 extends yt0 {
    public final org.telegram.ui.Components.p9 f12894a;
    public final LinearLayout f12895b;
    public final long f12896c;

    public o9(org.telegram.ui.Components.p9 p9Var, LinearLayout linearLayout, long j10) {
        this.f12894a = p9Var;
        this.f12895b = linearLayout;
        this.f12896c = j10;
    }

    @Override
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        org.telegram.ui.Components.p9 p9Var = this.f12894a;
        ImageReceiver imageReceiver = p9Var.getImageReceiver();
        int[] iArr = new int[2];
        p9Var.getLocationInWindow(iArr);
        ju0 ju0Var = new ju0();
        ju0Var.f35496b = iArr[0];
        ju0Var.f35497c = iArr[1];
        ju0Var.d = this.f12895b;
        ju0Var.f35504m = null;
        ju0Var.f35495a = imageReceiver;
        if (z4) {
            ju0Var.e = imageReceiver.getBitmapSafe();
        }
        ju0Var.h = imageReceiver.getRoundRadius(true);
        ju0Var.f35498f = this.f12896c;
        ju0Var.f35501j = 0;
        ju0Var.f35500i = 0;
        return ju0Var;
    }

    @Override
    public final boolean K() {
        return true;
    }
}
