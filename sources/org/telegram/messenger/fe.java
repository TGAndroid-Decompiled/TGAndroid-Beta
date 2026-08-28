package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fe implements RequestDelegate {
    public final int f20288a;
    public final Utilities.Callback4 f20289b;

    public fe(Utilities.Callback4 callback4, int i9) {
        this.f20288a = i9;
        this.f20289b = callback4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20288a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getRemote$0(this.f20289b, tLObject, tL_error);
                return;
            default:
                MessagesController.AnonymousClass4.lambda$getRemote$0(this.f20289b, tLObject, tL_error);
                return;
        }
    }
}
