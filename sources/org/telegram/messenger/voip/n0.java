package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.n60;
public final class n0 implements RequestDelegate {
    public final int f18531a;
    public final int f18532b;
    public final boolean f18533c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public n0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.f18531a = i11;
        this.d = notificationCenterDelegate;
        this.f18532b = i10;
        this.f18533c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18531a) {
            case 0:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.f18532b, this.f18533c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new m0(this.f18532b, 6, (n60) this.d, tLObject, this.f18533c));
                return;
        }
    }
}
