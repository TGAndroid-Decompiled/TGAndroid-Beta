package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.u50;
public final class l0 implements RequestDelegate {
    public final int f19966a;
    public final int f19967b;
    public final boolean f19968c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public l0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.f19966a = i11;
        this.d = notificationCenterDelegate;
        this.f19967b = i10;
        this.f19968c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19966a) {
            case 0:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.f19967b, this.f19968c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new k0(this.f19967b, 6, (u50) this.d, tLObject, this.f19968c));
                return;
        }
    }
}
