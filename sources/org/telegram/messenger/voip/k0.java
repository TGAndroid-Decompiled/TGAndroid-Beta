package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.o50;
public final class k0 implements RequestDelegate {
    public final int f21906a;
    public final int f21907b;
    public final boolean f21908c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public k0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i9, boolean z10, int i10) {
        this.f21906a = i10;
        this.d = notificationCenterDelegate;
        this.f21907b = i9;
        this.f21908c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21906a) {
            case 0:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.f21907b, this.f21908c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new j0(this.f21907b, 6, (o50) this.d, tLObject, this.f21908c));
                return;
        }
    }
}
