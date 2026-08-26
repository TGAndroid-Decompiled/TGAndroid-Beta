package org.telegram.messenger.voip;

public final class VoIPService$$ExternalSyntheticLambda82 implements Runnable {
    public final int $r8$classId;
    public final VoIPService f$0;

    public VoIPService$$ExternalSyntheticLambda82(VoIPService voIPService, int i) {
        this.$r8$classId = i;
        this.f$0 = voIPService;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onStartCommand$2();
                break;
            case 1:
                this.f$0.lambda$onStartCommand$3();
                break;
            default:
                this.f$0.lambda$declineIncomingCall$104();
                break;
        }
    }
}
