package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.id0;
public final class p1 implements RequestDelegate {
    public final int f16016a;
    public final long f16017b;
    public final Object f16018c;

    public p1(Object obj, long j3, int i10) {
        this.f16016a = i10;
        this.f16018c = obj;
        this.f16017b = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16016a) {
            case 0:
                ((ContactsController) this.f16018c).lambda$loadContacts$28(this.f16017b, tLObject, tL_error);
                return;
            case 1:
                ((LocationController) this.f16018c).lambda$loadLiveLocations$26(this.f16017b, tLObject, tL_error);
                return;
            case 2:
                ((SavedMessagesController) this.f16018c).lambda$hasSavedMessages$15(this.f16017b, tLObject, tL_error);
                return;
            case 3:
                ((SecretChatHelper) this.f16018c).lambda$declineSecretChat$20(this.f16017b, tLObject, tL_error);
                return;
            case 4:
                ((SendMessagesHelper) this.f16018c).lambda$sendGame$47(this.f16017b, tLObject, tL_error);
                return;
            case 5:
                id0 id0Var = (id0) this.f16018c;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new a3.h0(id0Var, tLObject, this.f16017b, 22));
                    return;
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new a3.h0((zh.i5) this.f16018c, this.f16017b, tLObject, 29));
                return;
        }
    }
}
