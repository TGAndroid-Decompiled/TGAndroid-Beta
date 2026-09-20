package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.i60;
public final class m0 implements RequestDelegate {
    public final int f17903a;
    public final int f17904b;
    public final boolean f17905c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public m0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.f17903a = i11;
        this.d = notificationCenterDelegate;
        this.f17904b = i10;
        this.f17905c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17903a) {
            case 0:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.f17904b, this.f17905c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new l0(this.f17904b, 6, (i60) this.d, tLObject, this.f17905c));
                return;
        }
    }
}
