package org.telegram.messenger.voip;
public final class z implements Runnable {
    public final int f27574a;
    public final VoIPService f27575b;
    public final int f27576c;

    public z(VoIPService voIPService, int i7, int i10) {
        this.f27574a = i10;
        this.f27575b = voIPService;
        this.f27576c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27574a) {
            case 0:
                this.f27575b.lambda$onSignalBarCountChanged$122(this.f27576c);
                return;
            case 1:
                this.f27575b.lambda$onConnectionStateChanged$119(this.f27576c);
                return;
            case 2:
                this.f27575b.lambda$startConferenceGroupCall$36(this.f27576c);
                return;
            case 3:
                this.f27575b.lambda$startGroupCall$25(this.f27576c);
                return;
            case 4:
                this.f27575b.lambda$createGroupInstance$72(this.f27576c);
                return;
            case 5:
                this.f27575b.lambda$startScreenCapture$57(this.f27576c);
                return;
            default:
                this.f27575b.lambda$updateConnectionState$81(this.f27576c);
                return;
        }
    }
}
