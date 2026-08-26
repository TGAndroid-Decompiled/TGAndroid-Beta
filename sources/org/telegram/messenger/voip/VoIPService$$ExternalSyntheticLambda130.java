package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class VoIPService$$ExternalSyntheticLambda130 implements RequestDelegate {
    public final int $r8$classId;

    public VoIPService$$ExternalSyntheticLambda130(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                VoIPService.lambda$createGroupInstance$67(tLObject, tL_error);
                break;
            default:
                VoIPService.lambda$callFailed$113(tLObject, tL_error);
                break;
        }
    }
}
