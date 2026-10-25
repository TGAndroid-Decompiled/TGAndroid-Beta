package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.v50;
public final class k0 implements RequestDelegate {
    public final int f21658a;
    public final int f21659b;
    public final boolean f21660c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public k0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.f21658a = i11;
        this.d = notificationCenterDelegate;
        this.f21659b = i10;
        this.f21660c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21658a) {
            case 0:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.f21659b, this.f21660c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new j0(this.f21659b, 6, (v50) this.d, tLObject, this.f21660c));
                return;
        }
    }
}
