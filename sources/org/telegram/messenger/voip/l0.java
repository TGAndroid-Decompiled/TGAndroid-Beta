package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.q50;
public final class l0 implements RequestDelegate {
    public final int f19886a;
    public final int f19887b;
    public final boolean f19888c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public l0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.f19886a = i11;
        this.d = notificationCenterDelegate;
        this.f19887b = i10;
        this.f19888c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19886a) {
            case 0:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.f19887b, this.f19888c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new k0(this.f19887b, 6, (q50) this.d, tLObject, this.f19888c));
                return;
        }
    }
}
