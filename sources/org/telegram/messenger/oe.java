package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oe implements RequestDelegate {
    public final int f18003a;
    public final Utilities.Callback4 f18004b;

    public oe(Utilities.Callback4 callback4, int i10) {
        this.f18003a = i10;
        this.f18004b = callback4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18003a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getRemote$0(this.f18004b, tLObject, tL_error);
                return;
            default:
                MessagesController.AnonymousClass4.lambda$getRemote$0(this.f18004b, tLObject, tL_error);
                return;
        }
    }
}
