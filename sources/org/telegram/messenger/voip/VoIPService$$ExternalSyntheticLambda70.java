package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;

public final class VoIPService$$ExternalSyntheticLambda70 implements Runnable {
    public final int $r8$classId;
    public final VoIPService f$0;
    public final TLRPC.TL_error f$1;

    public VoIPService$$ExternalSyntheticLambda70(VoIPService voIPService, TLRPC.TL_error tL_error, int i) {
        this.$r8$classId = i;
        this.f$0 = voIPService;
        this.f$1 = tL_error;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$startGroupCall$28(this.f$1);
                break;
            case 1:
                this.f$0.lambda$startScreenCapture$59(this.f$1);
                break;
            default:
                this.f$0.lambda$startGroupCall$22(this.f$1);
                break;
        }
    }
}
