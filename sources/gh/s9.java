package gh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bu0;
import org.telegram.ui.rt0;
public final class s9 extends rt0 {
    public final org.telegram.ui.Components.o9 f8887a;
    public final LinearLayout f8888b;
    public final long f8889c;

    public s9(org.telegram.ui.Components.o9 o9Var, LinearLayout linearLayout, long j10) {
        this.f8887a = o9Var;
        this.f8888b = linearLayout;
        this.f8889c = j10;
    }

    @Override
    public final bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        org.telegram.ui.Components.o9 o9Var = this.f8887a;
        ImageReceiver imageReceiver = o9Var.getImageReceiver();
        int[] iArr = new int[2];
        o9Var.getLocationInWindow(iArr);
        bu0 bu0Var = new bu0();
        bu0Var.f36979b = iArr[0];
        bu0Var.f36980c = iArr[1];
        bu0Var.d = this.f8888b;
        bu0Var.f36988m = null;
        bu0Var.f36978a = imageReceiver;
        if (z10) {
            bu0Var.f36981e = imageReceiver.getBitmapSafe();
        }
        bu0Var.h = imageReceiver.getRoundRadius(true);
        bu0Var.f36982f = this.f8889c;
        bu0Var.f36985j = 0;
        bu0Var.f36984i = 0;
        return bu0Var;
    }

    @Override
    public final boolean K() {
        return true;
    }
}
