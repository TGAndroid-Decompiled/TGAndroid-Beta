package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.s50;

public final class k0 implements RequestDelegate {

    public final int f21930a;

    public final int f21931b;

    public final boolean f21932c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public k0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.f21930a = i11;
        this.d = notificationCenterDelegate;
        this.f21931b = i10;
        this.f21932c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21930a) {
            case 0:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.f21931b, this.f21932c, tLObject, tL_error);
                break;
            default:
                s50 s50Var = (s50) this.d;
                AndroidUtilities.runOnUIThread(new j0(this.f21931b, 6, s50Var, tLObject, this.f21932c));
                break;
        }
    }
}
