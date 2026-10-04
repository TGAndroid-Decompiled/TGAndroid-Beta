package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.h60;
public final class n0 implements RequestDelegate {
    public final int f19584a;
    public final int f19585b;
    public final boolean f19586c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public n0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.f19584a = i11;
        this.d = notificationCenterDelegate;
        this.f19585b = i10;
        this.f19586c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19584a) {
            case 0:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.f19585b, this.f19586c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new m0(this.f19585b, 6, (h60) this.d, tLObject, this.f19586c));
                return;
        }
    }
}
