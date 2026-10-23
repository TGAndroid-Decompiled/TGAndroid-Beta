package org.telegram.messenger.voip;
public final class y implements Runnable {
    public final int f19949a;
    public final VoIPService f19950b;
    public final int f19951c;

    public y(VoIPService voIPService, int i10, int i11) {
        this.f19949a = i11;
        this.f19950b = voIPService;
        this.f19951c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19949a) {
            case 0:
                this.f19950b.lambda$onSignalBarCountChanged$122(this.f19951c);
                return;
            case 1:
                this.f19950b.lambda$onConnectionStateChanged$119(this.f19951c);
                return;
            case 2:
                this.f19950b.lambda$startConferenceGroupCall$36(this.f19951c);
                return;
            case 3:
                this.f19950b.lambda$startGroupCall$25(this.f19951c);
                return;
            case 4:
                this.f19950b.lambda$createGroupInstance$72(this.f19951c);
                return;
            case 5:
                this.f19950b.lambda$startScreenCapture$57(this.f19951c);
                return;
            default:
                this.f19950b.lambda$updateConnectionState$81(this.f19951c);
                return;
        }
    }
}
