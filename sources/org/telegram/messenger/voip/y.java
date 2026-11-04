package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y implements RequestDelegate {
    public final int f26079a;

    public y(int i3) {
        this.f26079a = i3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26079a) {
            case 0:
                VoIPService.lambda$callFailed$114(tLObject, tL_error);
                return;
            default:
                VoIPService.lambda$createGroupInstance$67(tLObject, tL_error);
                return;
        }
    }
}
