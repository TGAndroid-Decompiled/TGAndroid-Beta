package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.j60;
public final class m0 implements RequestDelegate {
    public final int f19388a;
    public final int f19389b;
    public final boolean f19390c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public m0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.f19388a = i11;
        this.d = notificationCenterDelegate;
        this.f19389b = i10;
        this.f19390c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19388a) {
            case 0:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.f19389b, this.f19390c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new l0(this.f19389b, 6, (j60) this.d, tLObject, this.f19390c));
                return;
        }
    }
}
