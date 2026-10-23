package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.q50;
public final class l0 implements RequestDelegate {
    public final int f19901a;
    public final int f19902b;
    public final boolean f19903c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public l0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.f19901a = i11;
        this.d = notificationCenterDelegate;
        this.f19902b = i10;
        this.f19903c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19901a) {
            case 0:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.f19902b, this.f19903c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new k0(this.f19902b, 6, (q50) this.d, tLObject, this.f19903c));
                return;
        }
    }
}
