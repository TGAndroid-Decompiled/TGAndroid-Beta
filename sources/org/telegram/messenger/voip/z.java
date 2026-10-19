package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z implements RequestDelegate {
    public final int f19937a;

    public z(int i10) {
        this.f19937a = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19937a) {
            case 0:
                VoIPService.lambda$callFailed$114(tLObject, tL_error);
                return;
            default:
                VoIPService.lambda$createGroupInstance$67(tLObject, tL_error);
                return;
        }
    }
}
