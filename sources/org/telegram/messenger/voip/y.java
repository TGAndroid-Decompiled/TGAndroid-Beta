package org.telegram.messenger.voip;
public final class y implements Runnable {
    public final int f19925a;
    public final VoIPService f19926b;
    public final int f19927c;

    public y(VoIPService voIPService, int i10, int i11) {
        this.f19925a = i11;
        this.f19926b = voIPService;
        this.f19927c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19925a) {
            case 0:
                this.f19926b.lambda$onSignalBarCountChanged$122(this.f19927c);
                return;
            case 1:
                this.f19926b.lambda$onConnectionStateChanged$119(this.f19927c);
                return;
            case 2:
                this.f19926b.lambda$startConferenceGroupCall$36(this.f19927c);
                return;
            case 3:
                this.f19926b.lambda$startGroupCall$25(this.f19927c);
                return;
            case 4:
                this.f19926b.lambda$createGroupInstance$72(this.f19927c);
                return;
            case 5:
                this.f19926b.lambda$startScreenCapture$57(this.f19927c);
                return;
            default:
                this.f19926b.lambda$updateConnectionState$81(this.f19927c);
                return;
        }
    }
}
