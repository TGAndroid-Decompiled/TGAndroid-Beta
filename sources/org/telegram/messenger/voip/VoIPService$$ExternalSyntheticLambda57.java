package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;

public final class VoIPService$$ExternalSyntheticLambda57 implements Runnable {
    public final int $r8$classId;
    public final VoIPService f$0;
    public final TLRPC.GroupCallParticipant f$1;

    public VoIPService$$ExternalSyntheticLambda57(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i) {
        this.$r8$classId = i;
        this.f$0 = voIPService;
        this.f$1 = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$startConferenceGroupCall$37(this.f$1);
                break;
            default:
                this.f$0.lambda$startGroupCall$26(this.f$1);
                break;
        }
    }
}
