package org.telegram.messenger.voip;
public final class z implements Runnable {
    public final int f27529a;
    public final VoIPService f27530b;
    public final int f27531c;

    public z(VoIPService voIPService, int i7, int i10) {
        this.f27529a = i10;
        this.f27530b = voIPService;
        this.f27531c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27529a) {
            case 0:
                this.f27530b.lambda$onSignalBarCountChanged$122(this.f27531c);
                return;
            case 1:
                this.f27530b.lambda$onConnectionStateChanged$119(this.f27531c);
                return;
            case 2:
                this.f27530b.lambda$startConferenceGroupCall$36(this.f27531c);
                return;
            case 3:
                this.f27530b.lambda$startGroupCall$25(this.f27531c);
                return;
            case 4:
                this.f27530b.lambda$createGroupInstance$72(this.f27531c);
                return;
            case 5:
                this.f27530b.lambda$startScreenCapture$57(this.f27531c);
                return;
            default:
                this.f27530b.lambda$updateConnectionState$81(this.f27531c);
                return;
        }
    }
}
