package bi;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.gu0;
import org.telegram.ui.qu0;
public final class ub extends gu0 {
    public final org.telegram.ui.Components.y9 f5528a;
    public final LinearLayout f5529b;
    public final long f5530c;

    public ub(org.telegram.ui.Components.y9 y9Var, LinearLayout linearLayout, long j10) {
        this.f5528a = y9Var;
        this.f5529b = linearLayout;
        this.f5530c = j10;
    }

    @Override
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Components.y9 y9Var = this.f5528a;
        ImageReceiver imageReceiver = y9Var.getImageReceiver();
        int[] iArr = new int[2];
        y9Var.getLocationInWindow(iArr);
        qu0 qu0Var = new qu0();
        qu0Var.f42917b = iArr[0];
        qu0Var.f42918c = iArr[1];
        qu0Var.d = this.f5529b;
        qu0Var.f42925m = null;
        qu0Var.f42916a = imageReceiver;
        if (z10) {
            qu0Var.e = imageReceiver.getBitmapSafe();
        }
        qu0Var.h = imageReceiver.getRoundRadius(true);
        qu0Var.f42919f = this.f5530c;
        qu0Var.f42922j = 0;
        qu0Var.f42921i = 0;
        return qu0Var;
    }

    @Override
    public final boolean L() {
        return true;
    }
}
