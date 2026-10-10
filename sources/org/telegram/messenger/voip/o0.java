package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.g60;
public final class o0 implements RequestDelegate {
    public final int f19605a;
    public final int f19606b;
    public final boolean f19607c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public o0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.f19605a = i11;
        this.d = notificationCenterDelegate;
        this.f19606b = i10;
        this.f19607c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19605a) {
            case 0:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.f19606b, this.f19607c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new n0(this.f19606b, 6, (g60) this.d, tLObject, this.f19607c));
                return;
        }
    }
}
