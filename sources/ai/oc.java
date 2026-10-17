package ai;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bu0;
import org.telegram.ui.lu0;
public final class oc extends bu0 {
    public final org.telegram.ui.Components.w9 f1983a;
    public final LinearLayout f1984b;
    public final long f1985c;

    public oc(org.telegram.ui.Components.w9 w9Var, LinearLayout linearLayout, long j10) {
        this.f1983a = w9Var;
        this.f1984b = linearLayout;
        this.f1985c = j10;
    }

    @Override
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Components.w9 w9Var = this.f1983a;
        ImageReceiver imageReceiver = w9Var.getImageReceiver();
        int[] iArr = new int[2];
        w9Var.getLocationInWindow(iArr);
        lu0 lu0Var = new lu0();
        lu0Var.f38938b = iArr[0];
        lu0Var.f38939c = iArr[1];
        lu0Var.d = this.f1984b;
        lu0Var.f38946m = null;
        lu0Var.f38937a = imageReceiver;
        if (z10) {
            lu0Var.e = imageReceiver.getBitmapSafe();
        }
        lu0Var.h = imageReceiver.getRoundRadius(true);
        lu0Var.f38940f = this.f1985c;
        lu0Var.f38943j = 0;
        lu0Var.f38942i = 0;
        return lu0Var;
    }

    @Override
    public final boolean L() {
        return true;
    }
}
