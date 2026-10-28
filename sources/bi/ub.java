package bi;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.iu0;
import org.telegram.ui.su0;
public final class ub extends iu0 {
    public final org.telegram.ui.Components.y9 f5528a;
    public final LinearLayout f5529b;
    public final long f5530c;

    public ub(org.telegram.ui.Components.y9 y9Var, LinearLayout linearLayout, long j10) {
        this.f5528a = y9Var;
        this.f5529b = linearLayout;
        this.f5530c = j10;
    }

    @Override
    public final su0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Components.y9 y9Var = this.f5528a;
        ImageReceiver imageReceiver = y9Var.getImageReceiver();
        int[] iArr = new int[2];
        y9Var.getLocationInWindow(iArr);
        su0 su0Var = new su0();
        su0Var.f43407b = iArr[0];
        su0Var.f43408c = iArr[1];
        su0Var.d = this.f5529b;
        su0Var.f43415m = null;
        su0Var.f43406a = imageReceiver;
        if (z10) {
            su0Var.e = imageReceiver.getBitmapSafe();
        }
        su0Var.h = imageReceiver.getRoundRadius(true);
        su0Var.f43409f = this.f5530c;
        su0Var.f43412j = 0;
        su0Var.f43411i = 0;
        return su0Var;
    }

    @Override
    public final boolean L() {
        return true;
    }
}
