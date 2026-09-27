package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class je implements RequestDelegate {
    public final int f16735a;
    public final Utilities.Callback4 f16736b;

    public je(Utilities.Callback4 callback4, int i10) {
        this.f16735a = i10;
        this.f16736b = callback4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16735a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getRemote$0(this.f16736b, tLObject, tL_error);
                return;
            default:
                MessagesController.AnonymousClass4.lambda$getRemote$0(this.f16736b, tLObject, tL_error);
                return;
        }
    }
}
