package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.j60;
public final class p0 implements RequestDelegate {
    public final int f16768a;
    public final int f16769b;
    public final boolean f16770c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public p0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.f16768a = i11;
        this.d = notificationCenterDelegate;
        this.f16769b = i10;
        this.f16770c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16768a) {
            case 0:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.f16769b, this.f16770c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new o0(this.f16769b, 6, (j60) this.d, tLObject, this.f16770c));
                return;
        }
    }
}
