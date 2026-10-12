package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.n60;
public final class o0 implements RequestDelegate {
    public final int f18840a;
    public final int f18841b;
    public final boolean f18842c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public o0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.f18840a = i11;
        this.d = notificationCenterDelegate;
        this.f18841b = i10;
        this.f18842c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18840a) {
            case 0:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.f18841b, this.f18842c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new n0(this.f18841b, 6, (n60) this.d, tLObject, this.f18842c));
                return;
        }
    }
}
