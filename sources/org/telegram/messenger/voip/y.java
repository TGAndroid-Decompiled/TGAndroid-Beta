package org.telegram.messenger.voip;
public final class y implements Runnable {
    public final int f19934a;
    public final VoIPService f19935b;
    public final int f19936c;

    public y(VoIPService voIPService, int i10, int i11) {
        this.f19934a = i11;
        this.f19935b = voIPService;
        this.f19936c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19934a) {
            case 0:
                this.f19935b.lambda$onSignalBarCountChanged$122(this.f19936c);
                return;
            case 1:
                this.f19935b.lambda$onConnectionStateChanged$119(this.f19936c);
                return;
            case 2:
                this.f19935b.lambda$startConferenceGroupCall$36(this.f19936c);
                return;
            case 3:
                this.f19935b.lambda$startGroupCall$25(this.f19936c);
                return;
            case 4:
                this.f19935b.lambda$createGroupInstance$72(this.f19936c);
                return;
            case 5:
                this.f19935b.lambda$startScreenCapture$57(this.f19936c);
                return;
            default:
                this.f19935b.lambda$updateConnectionState$81(this.f19936c);
                return;
        }
    }
}
