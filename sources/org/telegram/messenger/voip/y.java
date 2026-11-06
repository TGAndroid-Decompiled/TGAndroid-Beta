package org.telegram.messenger.voip;
public final class y implements Runnable {
    public final int f26188a;
    public final VoIPService f26189b;
    public final int f26190c;

    public y(VoIPService voIPService, int i7, int i10) {
        this.f26188a = i10;
        this.f26189b = voIPService;
        this.f26190c = i7;
    }

    @Override
    public final void run() {
        switch (this.f26188a) {
            case 0:
                this.f26189b.lambda$onSignalBarCountChanged$122(this.f26190c);
                return;
            case 1:
                this.f26189b.lambda$onConnectionStateChanged$119(this.f26190c);
                return;
            case 2:
                this.f26189b.lambda$startConferenceGroupCall$36(this.f26190c);
                return;
            case 3:
                this.f26189b.lambda$startGroupCall$25(this.f26190c);
                return;
            case 4:
                this.f26189b.lambda$createGroupInstance$72(this.f26190c);
                return;
            case 5:
                this.f26189b.lambda$startScreenCapture$57(this.f26190c);
                return;
            default:
                this.f26189b.lambda$updateConnectionState$81(this.f26190c);
                return;
        }
    }
}
