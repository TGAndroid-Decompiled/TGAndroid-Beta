package org.telegram.messenger.voip;
public final class x implements Runnable {
    public final int f26076a;
    public final VoIPService f26077b;
    public final int f26078c;

    public x(VoIPService voIPService, int i3, int i10) {
        this.f26076a = i10;
        this.f26077b = voIPService;
        this.f26078c = i3;
    }

    @Override
    public final void run() {
        switch (this.f26076a) {
            case 0:
                this.f26077b.lambda$onSignalBarCountChanged$122(this.f26078c);
                return;
            case 1:
                this.f26077b.lambda$onConnectionStateChanged$119(this.f26078c);
                return;
            case 2:
                this.f26077b.lambda$startConferenceGroupCall$36(this.f26078c);
                return;
            case 3:
                this.f26077b.lambda$startGroupCall$25(this.f26078c);
                return;
            case 4:
                this.f26077b.lambda$createGroupInstance$72(this.f26078c);
                return;
            case 5:
                this.f26077b.lambda$startScreenCapture$57(this.f26078c);
                return;
            default:
                this.f26077b.lambda$updateConnectionState$81(this.f26078c);
                return;
        }
    }
}
