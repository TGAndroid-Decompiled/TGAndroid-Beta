package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class le implements RequestDelegate {
    public final int f18959a;
    public final Utilities.Callback4 f18960b;

    public le(Utilities.Callback4 callback4, int i10) {
        this.f18959a = i10;
        this.f18960b = callback4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18959a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getRemote$0(this.f18960b, tLObject, tL_error);
                return;
            default:
                MessagesController.AnonymousClass4.lambda$getRemote$0(this.f18960b, tLObject, tL_error);
                return;
        }
    }
}
