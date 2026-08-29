package jh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.pt0;
import org.telegram.ui.zt0;
public final class n9 extends pt0 {
    public final org.telegram.ui.Components.t9 f12521a;
    public final LinearLayout f12522b;
    public final long f12523c;

    public n9(org.telegram.ui.Components.t9 t9Var, LinearLayout linearLayout, long j10) {
        this.f12521a = t9Var;
        this.f12522b = linearLayout;
        this.f12523c = j10;
    }

    @Override
    public final zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Components.t9 t9Var = this.f12521a;
        ImageReceiver imageReceiver = t9Var.getImageReceiver();
        int[] iArr = new int[2];
        t9Var.getLocationInWindow(iArr);
        zt0 zt0Var = new zt0();
        zt0Var.f45317b = iArr[0];
        zt0Var.f45318c = iArr[1];
        zt0Var.d = this.f12522b;
        zt0Var.f45326m = null;
        zt0Var.f45316a = imageReceiver;
        if (z10) {
            zt0Var.f45319e = imageReceiver.getBitmapSafe();
        }
        zt0Var.h = imageReceiver.getRoundRadius(true);
        zt0Var.f45320f = this.f12523c;
        zt0Var.f45323j = 0;
        zt0Var.f45322i = 0;
        return zt0Var;
    }

    @Override
    public final boolean K() {
        return true;
    }
}
