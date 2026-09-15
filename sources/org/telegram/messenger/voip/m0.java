package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.i60;
public final class m0 implements RequestDelegate {
    public final int f17679a;
    public final int f17680b;
    public final boolean f17681c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public m0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.f17679a = i11;
        this.d = notificationCenterDelegate;
        this.f17680b = i10;
        this.f17681c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17679a) {
            case 0:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.f17680b, this.f17681c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new l0(this.f17680b, 6, (i60) this.d, tLObject, this.f17681c));
                return;
        }
    }
}
