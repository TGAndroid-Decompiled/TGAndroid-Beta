package hh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.cu0;
import org.telegram.ui.st0;

public final class r9 extends st0 {

    public final org.telegram.ui.Components.n9 f10005a;

    public final LinearLayout f10006b;

    public final long f10007c;

    public r9(org.telegram.ui.Components.n9 n9Var, LinearLayout linearLayout, long j10) {
        this.f10005a = n9Var;
        this.f10006b = linearLayout;
        this.f10007c = j10;
    }

    @Override
    public final cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Components.n9 n9Var = this.f10005a;
        ImageReceiver imageReceiver = n9Var.getImageReceiver();
        int[] iArr = new int[2];
        n9Var.getLocationInWindow(iArr);
        cu0 cu0Var = new cu0();
        cu0Var.f37154b = iArr[0];
        cu0Var.f37155c = iArr[1];
        cu0Var.d = this.f10006b;
        cu0Var.f37163m = null;
        cu0Var.f37153a = imageReceiver;
        if (z10) {
            cu0Var.f37156e = imageReceiver.getBitmapSafe();
        }
        cu0Var.h = imageReceiver.getRoundRadius(true);
        cu0Var.f37157f = this.f10007c;
        cu0Var.f37160j = 0;
        cu0Var.f37159i = 0;
        return cu0Var;
    }

    @Override
    public final boolean K() {
        return true;
    }
}
