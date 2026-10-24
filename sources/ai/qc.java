package ai;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bu0;
import org.telegram.ui.lu0;
public final class qc extends bu0 {
    public final org.telegram.ui.Components.u9 f2092a;
    public final LinearLayout f2093b;
    public final long f2094c;

    public qc(org.telegram.ui.Components.u9 u9Var, LinearLayout linearLayout, long j10) {
        this.f2092a = u9Var;
        this.f2093b = linearLayout;
        this.f2094c = j10;
    }

    @Override
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Components.u9 u9Var = this.f2092a;
        ImageReceiver imageReceiver = u9Var.getImageReceiver();
        int[] iArr = new int[2];
        u9Var.getLocationInWindow(iArr);
        lu0 lu0Var = new lu0();
        lu0Var.f39382b = iArr[0];
        lu0Var.f39383c = iArr[1];
        lu0Var.d = this.f2093b;
        lu0Var.f39390m = null;
        lu0Var.f39381a = imageReceiver;
        if (z10) {
            lu0Var.e = imageReceiver.getBitmapSafe();
        }
        lu0Var.h = imageReceiver.getRoundRadius(true);
        lu0Var.f39384f = this.f2094c;
        lu0Var.f39387j = 0;
        lu0Var.f39386i = 0;
        return lu0Var;
    }

    @Override
    public final boolean L() {
        return true;
    }
}
