package org.telegram.messenger.voip;
public final class z implements Runnable {
    public final int f27208a;
    public final VoIPService f27209b;
    public final int f27210c;

    public z(VoIPService voIPService, int i7, int i10) {
        this.f27208a = i10;
        this.f27209b = voIPService;
        this.f27210c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27208a) {
            case 0:
                this.f27209b.lambda$onSignalBarCountChanged$122(this.f27210c);
                return;
            case 1:
                this.f27209b.lambda$onConnectionStateChanged$119(this.f27210c);
                return;
            case 2:
                this.f27209b.lambda$startConferenceGroupCall$36(this.f27210c);
                return;
            case 3:
                this.f27209b.lambda$startGroupCall$25(this.f27210c);
                return;
            case 4:
                this.f27209b.lambda$createGroupInstance$72(this.f27210c);
                return;
            case 5:
                this.f27209b.lambda$startScreenCapture$57(this.f27210c);
                return;
            default:
                this.f27209b.lambda$updateConnectionState$81(this.f27210c);
                return;
        }
    }
}
