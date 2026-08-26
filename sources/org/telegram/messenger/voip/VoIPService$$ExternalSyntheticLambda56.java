package org.telegram.messenger.voip;

public final class VoIPService$$ExternalSyntheticLambda56 implements Runnable {
    public final int $r8$classId;
    public final VoIPService f$0;
    public final int f$1;

    public VoIPService$$ExternalSyntheticLambda56(VoIPService voIPService, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = voIPService;
        this.f$1 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$startConferenceGroupCall$36(this.f$1);
                break;
            case 1:
                this.f$0.lambda$startScreenCapture$57(this.f$1);
                break;
            case 2:
                this.f$0.lambda$updateConnectionState$81(this.f$1);
                break;
            case 3:
                this.f$0.lambda$onSignalBarCountChanged$121(this.f$1);
                break;
            case 4:
                this.f$0.lambda$onConnectionStateChanged$118(this.f$1);
                break;
            case 5:
                this.f$0.lambda$startGroupCall$25(this.f$1);
                break;
            default:
                this.f$0.lambda$createGroupInstance$72(this.f$1);
                break;
        }
    }
}
