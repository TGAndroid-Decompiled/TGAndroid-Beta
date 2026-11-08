package org.telegram.messenger.voip;
public final class y implements Runnable {
    public final int f26194a;
    public final VoIPService f26195b;
    public final int f26196c;

    public y(VoIPService voIPService, int i7, int i10) {
        this.f26194a = i10;
        this.f26195b = voIPService;
        this.f26196c = i7;
    }

    @Override
    public final void run() {
        switch (this.f26194a) {
            case 0:
                this.f26195b.lambda$onSignalBarCountChanged$122(this.f26196c);
                return;
            case 1:
                this.f26195b.lambda$onConnectionStateChanged$119(this.f26196c);
                return;
            case 2:
                this.f26195b.lambda$startConferenceGroupCall$36(this.f26196c);
                return;
            case 3:
                this.f26195b.lambda$startGroupCall$25(this.f26196c);
                return;
            case 4:
                this.f26195b.lambda$createGroupInstance$72(this.f26196c);
                return;
            case 5:
                this.f26195b.lambda$startScreenCapture$57(this.f26196c);
                return;
            default:
                this.f26195b.lambda$updateConnectionState$81(this.f26196c);
                return;
        }
    }
}
