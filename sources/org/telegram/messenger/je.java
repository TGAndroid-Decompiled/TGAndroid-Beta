package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class je implements RequestDelegate {

    public final int f20676a;

    public final Utilities.Callback4 f20677b;

    public je(Utilities.Callback4 callback4, int i10) {
        this.f20676a = i10;
        this.f20677b = callback4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20676a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getRemote$0(this.f20677b, tLObject, tL_error);
                break;
            default:
                MessagesController.AnonymousClass4.lambda$getRemote$0(this.f20677b, tLObject, tL_error);
                break;
        }
    }
}
