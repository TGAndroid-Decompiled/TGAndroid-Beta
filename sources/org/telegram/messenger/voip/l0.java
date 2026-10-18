package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.s50;
public final class l0 implements RequestDelegate {
    public final int f19880a;
    public final int f19881b;
    public final boolean f19882c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public l0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.f19880a = i11;
        this.d = notificationCenterDelegate;
        this.f19881b = i10;
        this.f19882c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19880a) {
            case 0:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.f19881b, this.f19882c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new k0(this.f19881b, 6, (s50) this.d, tLObject, this.f19882c));
                return;
        }
    }
}
