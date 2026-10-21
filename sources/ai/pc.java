package ai;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ju0;
import org.telegram.ui.zt0;
public final class pc extends zt0 {
    public final org.telegram.ui.Components.w9 f2035a;
    public final LinearLayout f2036b;
    public final long f2037c;

    public pc(org.telegram.ui.Components.w9 w9Var, LinearLayout linearLayout, long j10) {
        this.f2035a = w9Var;
        this.f2036b = linearLayout;
        this.f2037c = j10;
    }

    @Override
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Components.w9 w9Var = this.f2035a;
        ImageReceiver imageReceiver = w9Var.getImageReceiver();
        int[] iArr = new int[2];
        w9Var.getLocationInWindow(iArr);
        ju0 ju0Var = new ju0();
        ju0Var.f38352b = iArr[0];
        ju0Var.f38353c = iArr[1];
        ju0Var.d = this.f2036b;
        ju0Var.f38360m = null;
        ju0Var.f38351a = imageReceiver;
        if (z10) {
            ju0Var.e = imageReceiver.getBitmapSafe();
        }
        ju0Var.h = imageReceiver.getRoundRadius(true);
        ju0Var.f38354f = this.f2037c;
        ju0Var.f38357j = 0;
        ju0Var.f38356i = 0;
        return ju0Var;
    }

    @Override
    public final boolean L() {
        return true;
    }
}
