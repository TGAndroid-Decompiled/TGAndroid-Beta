package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class a0 implements RequestDelegate {

    public final int f21883a;

    public a0(int i10) {
        this.f21883a = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21883a) {
            case 0:
                VoIPService.lambda$callFailed$113(tLObject, tL_error);
                break;
            default:
                VoIPService.lambda$createGroupInstance$67(tLObject, tL_error);
                break;
        }
    }
}
