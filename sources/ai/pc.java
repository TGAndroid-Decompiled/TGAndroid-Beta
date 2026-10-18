package ai;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bu0;
import org.telegram.ui.lu0;
public final class pc extends bu0 {
    public final org.telegram.ui.Components.w9 f2038a;
    public final LinearLayout f2039b;
    public final long f2040c;

    public pc(org.telegram.ui.Components.w9 w9Var, LinearLayout linearLayout, long j10) {
        this.f2038a = w9Var;
        this.f2039b = linearLayout;
        this.f2040c = j10;
    }

    @Override
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Components.w9 w9Var = this.f2038a;
        ImageReceiver imageReceiver = w9Var.getImageReceiver();
        int[] iArr = new int[2];
        w9Var.getLocationInWindow(iArr);
        lu0 lu0Var = new lu0();
        lu0Var.f38962b = iArr[0];
        lu0Var.f38963c = iArr[1];
        lu0Var.d = this.f2039b;
        lu0Var.f38970m = null;
        lu0Var.f38961a = imageReceiver;
        if (z10) {
            lu0Var.e = imageReceiver.getBitmapSafe();
        }
        lu0Var.h = imageReceiver.getRoundRadius(true);
        lu0Var.f38964f = this.f2040c;
        lu0Var.f38967j = 0;
        lu0Var.f38966i = 0;
        return lu0Var;
    }

    @Override
    public final boolean L() {
        return true;
    }
}
