package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.e60;
public final class m0 implements RequestDelegate {
    public final int f18790a;
    public final int f18791b;
    public final boolean f18792c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public m0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z4, int i11) {
        this.f18790a = i11;
        this.d = notificationCenterDelegate;
        this.f18791b = i10;
        this.f18792c = z4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18790a) {
            case 0:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.f18791b, this.f18792c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new l0(this.f18791b, 6, (e60) this.d, tLObject, this.f18792c));
                return;
        }
    }
}
