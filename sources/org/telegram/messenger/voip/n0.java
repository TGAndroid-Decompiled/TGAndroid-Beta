package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.i60;
public final class n0 implements RequestDelegate {
    public final int f19370a;
    public final int f19371b;
    public final boolean f19372c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public n0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.f19370a = i11;
        this.d = notificationCenterDelegate;
        this.f19371b = i10;
        this.f19372c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19370a) {
            case 0:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.f19371b, this.f19372c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new m0(this.f19371b, 6, (i60) this.d, tLObject, this.f19372c));
                return;
        }
    }
}
