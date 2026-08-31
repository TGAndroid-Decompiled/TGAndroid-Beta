package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.d60;
public final class m0 implements RequestDelegate {
    public final int f20439a;
    public final int f20440b;
    public final boolean f20441c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public m0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z4, int i11) {
        this.f20439a = i11;
        this.d = notificationCenterDelegate;
        this.f20440b = i10;
        this.f20441c = z4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20439a) {
            case 0:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.f20440b, this.f20441c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new l0(this.f20440b, 6, (d60) this.d, tLObject, this.f20441c));
                return;
        }
    }
}
