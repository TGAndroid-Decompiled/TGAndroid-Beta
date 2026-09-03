package lh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.fu0;
import org.telegram.ui.qu0;
public final class o9 extends fu0 {
    public final org.telegram.ui.Components.p9 f12878a;
    public final LinearLayout f12879b;
    public final long f12880c;

    public o9(org.telegram.ui.Components.p9 p9Var, LinearLayout linearLayout, long j10) {
        this.f12878a = p9Var;
        this.f12879b = linearLayout;
        this.f12880c = j10;
    }

    @Override
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        org.telegram.ui.Components.p9 p9Var = this.f12878a;
        ImageReceiver imageReceiver = p9Var.getImageReceiver();
        int[] iArr = new int[2];
        p9Var.getLocationInWindow(iArr);
        qu0 qu0Var = new qu0();
        qu0Var.f37488b = iArr[0];
        qu0Var.f37489c = iArr[1];
        qu0Var.d = this.f12879b;
        qu0Var.f37496m = null;
        qu0Var.f37487a = imageReceiver;
        if (z4) {
            qu0Var.e = imageReceiver.getBitmapSafe();
        }
        qu0Var.h = imageReceiver.getRoundRadius(true);
        qu0Var.f37490f = this.f12880c;
        qu0Var.f37493j = 0;
        qu0Var.f37492i = 0;
        return qu0Var;
    }

    @Override
    public final boolean K() {
        return true;
    }
}
