package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.x50;
public final class k0 implements RequestDelegate {
    public final int f21646a;
    public final int f21647b;
    public final boolean f21648c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public k0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.f21646a = i11;
        this.d = notificationCenterDelegate;
        this.f21647b = i10;
        this.f21648c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21646a) {
            case 0:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.f21647b, this.f21648c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new j0(this.f21647b, 6, (x50) this.d, tLObject, this.f21648c));
                return;
        }
    }
}
