package mh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.fu0;
import org.telegram.ui.qu0;
public final class o9 extends fu0 {
    public final org.telegram.ui.Components.p9 f14547a;
    public final LinearLayout f14548b;
    public final long f14549c;

    public o9(org.telegram.ui.Components.p9 p9Var, LinearLayout linearLayout, long j10) {
        this.f14547a = p9Var;
        this.f14548b = linearLayout;
        this.f14549c = j10;
    }

    @Override
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        org.telegram.ui.Components.p9 p9Var = this.f14547a;
        ImageReceiver imageReceiver = p9Var.getImageReceiver();
        int[] iArr = new int[2];
        p9Var.getLocationInWindow(iArr);
        qu0 qu0Var = new qu0();
        qu0Var.f40679b = iArr[0];
        qu0Var.f40680c = iArr[1];
        qu0Var.d = this.f14548b;
        qu0Var.f40688m = null;
        qu0Var.f40678a = imageReceiver;
        if (z4) {
            qu0Var.f40681e = imageReceiver.getBitmapSafe();
        }
        qu0Var.h = imageReceiver.getRoundRadius(true);
        qu0Var.f40682f = this.f14549c;
        qu0Var.f40685j = 0;
        qu0Var.f40684i = 0;
        return qu0Var;
    }

    @Override
    public final boolean K() {
        return true;
    }
}
