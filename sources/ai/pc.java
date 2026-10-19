package ai;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ju0;
import org.telegram.ui.zt0;
public final class pc extends zt0 {
    public final org.telegram.ui.Components.w9 f2037a;
    public final LinearLayout f2038b;
    public final long f2039c;

    public pc(org.telegram.ui.Components.w9 w9Var, LinearLayout linearLayout, long j10) {
        this.f2037a = w9Var;
        this.f2038b = linearLayout;
        this.f2039c = j10;
    }

    @Override
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Components.w9 w9Var = this.f2037a;
        ImageReceiver imageReceiver = w9Var.getImageReceiver();
        int[] iArr = new int[2];
        w9Var.getLocationInWindow(iArr);
        ju0 ju0Var = new ju0();
        ju0Var.f38344b = iArr[0];
        ju0Var.f38345c = iArr[1];
        ju0Var.d = this.f2038b;
        ju0Var.f38352m = null;
        ju0Var.f38343a = imageReceiver;
        if (z10) {
            ju0Var.e = imageReceiver.getBitmapSafe();
        }
        ju0Var.h = imageReceiver.getRoundRadius(true);
        ju0Var.f38346f = this.f2039c;
        ju0Var.f38349j = 0;
        ju0Var.f38348i = 0;
        return ju0Var;
    }

    @Override
    public final boolean L() {
        return true;
    }
}
