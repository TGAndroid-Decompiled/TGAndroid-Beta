package org.telegram.messenger.voip;
public final class z implements Runnable {
    public final int f27207a;
    public final VoIPService f27208b;
    public final int f27209c;

    public z(VoIPService voIPService, int i7, int i10) {
        this.f27207a = i10;
        this.f27208b = voIPService;
        this.f27209c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27207a) {
            case 0:
                this.f27208b.lambda$onSignalBarCountChanged$122(this.f27209c);
                return;
            case 1:
                this.f27208b.lambda$onConnectionStateChanged$119(this.f27209c);
                return;
            case 2:
                this.f27208b.lambda$startConferenceGroupCall$36(this.f27209c);
                return;
            case 3:
                this.f27208b.lambda$startGroupCall$25(this.f27209c);
                return;
            case 4:
                this.f27208b.lambda$createGroupInstance$72(this.f27209c);
                return;
            case 5:
                this.f27208b.lambda$startScreenCapture$57(this.f27209c);
                return;
            default:
                this.f27208b.lambda$updateConnectionState$81(this.f27209c);
                return;
        }
    }
}
