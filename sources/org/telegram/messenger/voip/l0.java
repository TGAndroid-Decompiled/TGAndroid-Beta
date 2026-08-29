package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.r50;
public final class l0 implements RequestDelegate {
    public final int f21976a;
    public final int f21977b;
    public final boolean f21978c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public l0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.f21976a = i11;
        this.d = notificationCenterDelegate;
        this.f21977b = i10;
        this.f21978c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21976a) {
            case 0:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.f21977b, this.f21978c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new k0(this.f21977b, 6, (r50) this.d, tLObject, this.f21978c));
                return;
        }
    }
}
