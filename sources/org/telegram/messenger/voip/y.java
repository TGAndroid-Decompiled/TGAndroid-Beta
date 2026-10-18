package org.telegram.messenger.voip;
public final class y implements Runnable {
    public final int f19928a;
    public final VoIPService f19929b;
    public final int f19930c;

    public y(VoIPService voIPService, int i10, int i11) {
        this.f19928a = i11;
        this.f19929b = voIPService;
        this.f19930c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19928a) {
            case 0:
                this.f19929b.lambda$onSignalBarCountChanged$122(this.f19930c);
                return;
            case 1:
                this.f19929b.lambda$onConnectionStateChanged$119(this.f19930c);
                return;
            case 2:
                this.f19929b.lambda$startConferenceGroupCall$36(this.f19930c);
                return;
            case 3:
                this.f19929b.lambda$startGroupCall$25(this.f19930c);
                return;
            case 4:
                this.f19929b.lambda$createGroupInstance$72(this.f19930c);
                return;
            case 5:
                this.f19929b.lambda$startScreenCapture$57(this.f19930c);
                return;
            default:
                this.f19929b.lambda$updateConnectionState$81(this.f19930c);
                return;
        }
    }
}
