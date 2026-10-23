package org.telegram.messenger.voip;
public final class y implements Runnable {
    public final int f20014a;
    public final VoIPService f20015b;
    public final int f20016c;

    public y(VoIPService voIPService, int i10, int i11) {
        this.f20014a = i11;
        this.f20015b = voIPService;
        this.f20016c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20014a) {
            case 0:
                this.f20015b.lambda$onSignalBarCountChanged$122(this.f20016c);
                return;
            case 1:
                this.f20015b.lambda$onConnectionStateChanged$119(this.f20016c);
                return;
            case 2:
                this.f20015b.lambda$startConferenceGroupCall$36(this.f20016c);
                return;
            case 3:
                this.f20015b.lambda$startGroupCall$25(this.f20016c);
                return;
            case 4:
                this.f20015b.lambda$createGroupInstance$72(this.f20016c);
                return;
            case 5:
                this.f20015b.lambda$startScreenCapture$57(this.f20016c);
                return;
            default:
                this.f20015b.lambda$updateConnectionState$81(this.f20016c);
                return;
        }
    }
}
