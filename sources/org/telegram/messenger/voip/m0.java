package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.d60;
public final class m0 implements RequestDelegate {
    public final int f17932a;
    public final int f17933b;
    public final boolean f17934c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public m0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.f17932a = i11;
        this.d = notificationCenterDelegate;
        this.f17933b = i10;
        this.f17934c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17932a) {
            case 0:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.f17933b, this.f17934c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new l0(this.f17933b, 6, (d60) this.d, tLObject, this.f17934c));
                return;
        }
    }
}
