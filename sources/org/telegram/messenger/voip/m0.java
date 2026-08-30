package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.c60;
public final class m0 implements RequestDelegate {
    public final int f18808a;
    public final int f18809b;
    public final boolean f18810c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public m0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z4, int i11) {
        this.f18808a = i11;
        this.d = notificationCenterDelegate;
        this.f18809b = i10;
        this.f18810c = z4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18808a) {
            case 0:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.f18809b, this.f18810c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new l0(this.f18809b, 6, (c60) this.d, tLObject, this.f18810c));
                return;
        }
    }
}
