package org.telegram.messenger.voip;
public final class z implements Runnable {
    public final int f27576a;
    public final VoIPService f27577b;
    public final int f27578c;

    public z(VoIPService voIPService, int i7, int i10) {
        this.f27576a = i10;
        this.f27577b = voIPService;
        this.f27578c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27576a) {
            case 0:
                this.f27577b.lambda$onSignalBarCountChanged$122(this.f27578c);
                return;
            case 1:
                this.f27577b.lambda$onConnectionStateChanged$119(this.f27578c);
                return;
            case 2:
                this.f27577b.lambda$startConferenceGroupCall$36(this.f27578c);
                return;
            case 3:
                this.f27577b.lambda$startGroupCall$25(this.f27578c);
                return;
            case 4:
                this.f27577b.lambda$createGroupInstance$72(this.f27578c);
                return;
            case 5:
                this.f27577b.lambda$startScreenCapture$57(this.f27578c);
                return;
            default:
                this.f27577b.lambda$updateConnectionState$81(this.f27578c);
                return;
        }
    }
}
