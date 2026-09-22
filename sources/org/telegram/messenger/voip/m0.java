package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.i60;
public final class m0 implements RequestDelegate {
    public final int f17674a;
    public final int f17675b;
    public final boolean f17676c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public m0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.f17674a = i11;
        this.d = notificationCenterDelegate;
        this.f17675b = i10;
        this.f17676c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17674a) {
            case 0:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.f17675b, this.f17676c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new l0(this.f17675b, 6, (i60) this.d, tLObject, this.f17676c));
                return;
        }
    }
}
