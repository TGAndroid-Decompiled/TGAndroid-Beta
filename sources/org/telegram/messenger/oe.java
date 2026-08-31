package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oe implements RequestDelegate {
    public final int f19569a;
    public final Utilities.Callback4 f19570b;

    public oe(Utilities.Callback4 callback4, int i10) {
        this.f19569a = i10;
        this.f19570b = callback4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19569a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getRemote$0(this.f19570b, tLObject, tL_error);
                return;
            default:
                MessagesController.AnonymousClass4.lambda$getRemote$0(this.f19570b, tLObject, tL_error);
                return;
        }
    }
}
