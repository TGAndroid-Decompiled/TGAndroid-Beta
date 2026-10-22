package org.telegram.messenger.voip;
public final class y implements Runnable {
    public final int f19946a;
    public final VoIPService f19947b;
    public final int f19948c;

    public y(VoIPService voIPService, int i10, int i11) {
        this.f19946a = i11;
        this.f19947b = voIPService;
        this.f19948c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19946a) {
            case 0:
                this.f19947b.lambda$onSignalBarCountChanged$122(this.f19948c);
                return;
            case 1:
                this.f19947b.lambda$onConnectionStateChanged$119(this.f19948c);
                return;
            case 2:
                this.f19947b.lambda$startConferenceGroupCall$36(this.f19948c);
                return;
            case 3:
                this.f19947b.lambda$startGroupCall$25(this.f19948c);
                return;
            case 4:
                this.f19947b.lambda$createGroupInstance$72(this.f19948c);
                return;
            case 5:
                this.f19947b.lambda$startScreenCapture$57(this.f19948c);
                return;
            default:
                this.f19947b.lambda$updateConnectionState$81(this.f19948c);
                return;
        }
    }
}
