package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.j60;
public final class m0 implements RequestDelegate {
    public final int f19429a;
    public final int f19430b;
    public final boolean f19431c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public m0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.f19429a = i11;
        this.d = notificationCenterDelegate;
        this.f19430b = i10;
        this.f19431c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19429a) {
            case 0:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.f19430b, this.f19431c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new l0(this.f19430b, 6, (j60) this.d, tLObject, this.f19431c));
                return;
        }
    }
}
