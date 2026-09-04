package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ke implements RequestDelegate {
    public final int f18165a;
    public final Utilities.Callback4 f18166b;

    public ke(Utilities.Callback4 callback4, int i10) {
        this.f18165a = i10;
        this.f18166b = callback4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18165a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getRemote$0(this.f18166b, tLObject, tL_error);
                return;
            default:
                MessagesController.AnonymousClass4.lambda$getRemote$0(this.f18166b, tLObject, tL_error);
                return;
        }
    }
}
