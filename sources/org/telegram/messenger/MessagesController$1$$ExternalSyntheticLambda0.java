package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class MessagesController$1$$ExternalSyntheticLambda0 implements RequestDelegate {
    public final int $r8$classId;
    public final Utilities.Callback4 f$0;

    public MessagesController$1$$ExternalSyntheticLambda0(Utilities.Callback4 callback4, int i) {
        this.$r8$classId = i;
        this.f$0 = callback4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getRemote$0(this.f$0, tLObject, tL_error);
                break;
            default:
                MessagesController.AnonymousClass4.lambda$getRemote$0(this.f$0, tLObject, tL_error);
                break;
        }
    }
}
