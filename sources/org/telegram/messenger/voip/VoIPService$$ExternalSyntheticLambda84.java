package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;

public final class VoIPService$$ExternalSyntheticLambda84 implements Runnable {
    public final int $r8$classId;
    public final VoIPService f$0;
    public final TLRPC.Updates f$1;
    public final long f$2;

    public VoIPService$$ExternalSyntheticLambda84(VoIPService voIPService, TLRPC.Updates updates, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = voIPService;
        this.f$1 = updates;
        this.f$2 = j;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$startConferenceGroupCall$46(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$startConferenceGroupCall$38(this.f$1, this.f$2);
                break;
        }
    }
}
