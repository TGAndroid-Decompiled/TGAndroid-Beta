package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c0 implements RequestDelegate {
    public final int f20390a;

    public c0(int i10) {
        this.f20390a = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20390a) {
            case 0:
                VoIPService.lambda$callFailed$113(tLObject, tL_error);
                return;
            default:
                VoIPService.lambda$createGroupInstance$67(tLObject, tL_error);
                return;
        }
    }
}
