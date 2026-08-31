package mh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.au0;
import org.telegram.ui.lu0;
public final class o9 extends au0 {
    public final org.telegram.ui.Components.p9 f14545a;
    public final LinearLayout f14546b;
    public final long f14547c;

    public o9(org.telegram.ui.Components.p9 p9Var, LinearLayout linearLayout, long j10) {
        this.f14545a = p9Var;
        this.f14546b = linearLayout;
        this.f14547c = j10;
    }

    @Override
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        org.telegram.ui.Components.p9 p9Var = this.f14545a;
        ImageReceiver imageReceiver = p9Var.getImageReceiver();
        int[] iArr = new int[2];
        p9Var.getLocationInWindow(iArr);
        lu0 lu0Var = new lu0();
        lu0Var.f38865b = iArr[0];
        lu0Var.f38866c = iArr[1];
        lu0Var.d = this.f14546b;
        lu0Var.f38874m = null;
        lu0Var.f38864a = imageReceiver;
        if (z4) {
            lu0Var.f38867e = imageReceiver.getBitmapSafe();
        }
        lu0Var.h = imageReceiver.getRoundRadius(true);
        lu0Var.f38868f = this.f14547c;
        lu0Var.f38871j = 0;
        lu0Var.f38870i = 0;
        return lu0Var;
    }

    @Override
    public final boolean K() {
        return true;
    }
}
