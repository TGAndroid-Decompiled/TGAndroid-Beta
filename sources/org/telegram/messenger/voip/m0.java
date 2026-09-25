package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.d60;
public final class m0 implements RequestDelegate {
    public final int f17922a;
    public final int f17923b;
    public final boolean f17924c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public m0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.f17922a = i11;
        this.d = notificationCenterDelegate;
        this.f17923b = i10;
        this.f17924c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17922a) {
            case 0:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.f17923b, this.f17924c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new l0(this.f17923b, 6, (d60) this.d, tLObject, this.f17924c));
                return;
        }
    }
}
