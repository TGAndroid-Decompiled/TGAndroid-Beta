package org.telegram.messenger.voip;
public final class z implements Runnable {
    public final int f27670a;
    public final VoIPService f27671b;
    public final int f27672c;

    public z(VoIPService voIPService, int i7, int i10) {
        this.f27670a = i10;
        this.f27671b = voIPService;
        this.f27672c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27670a) {
            case 0:
                this.f27671b.lambda$onSignalBarCountChanged$122(this.f27672c);
                return;
            case 1:
                this.f27671b.lambda$onConnectionStateChanged$119(this.f27672c);
                return;
            case 2:
                this.f27671b.lambda$startConferenceGroupCall$36(this.f27672c);
                return;
            case 3:
                this.f27671b.lambda$startGroupCall$25(this.f27672c);
                return;
            case 4:
                this.f27671b.lambda$createGroupInstance$72(this.f27672c);
                return;
            case 5:
                this.f27671b.lambda$startScreenCapture$57(this.f27672c);
                return;
            default:
                this.f27671b.lambda$updateConnectionState$81(this.f27672c);
                return;
        }
    }
}
