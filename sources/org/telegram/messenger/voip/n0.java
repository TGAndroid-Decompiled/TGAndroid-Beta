package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.d60;
public final class n0 implements RequestDelegate {
    public final int f17937a;
    public final int f17938b;
    public final boolean f17939c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public n0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.f17937a = i11;
        this.d = notificationCenterDelegate;
        this.f17938b = i10;
        this.f17939c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17937a) {
            case 0:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.f17938b, this.f17939c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new m0(this.f17938b, 6, (d60) this.d, tLObject, this.f17939c));
                return;
        }
    }
}
