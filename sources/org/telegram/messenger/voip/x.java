package org.telegram.messenger.voip;
public final class x implements Runnable {
    public final int f21709a;
    public final VoIPService f21710b;
    public final int f21711c;

    public x(VoIPService voIPService, int i10, int i11) {
        this.f21709a = i11;
        this.f21710b = voIPService;
        this.f21711c = i10;
    }

    @Override
    public final void run() {
        switch (this.f21709a) {
            case 0:
                this.f21710b.lambda$onSignalBarCountChanged$122(this.f21711c);
                return;
            case 1:
                this.f21710b.lambda$onConnectionStateChanged$119(this.f21711c);
                return;
            case 2:
                this.f21710b.lambda$startConferenceGroupCall$36(this.f21711c);
                return;
            case 3:
                this.f21710b.lambda$startGroupCall$25(this.f21711c);
                return;
            case 4:
                this.f21710b.lambda$createGroupInstance$72(this.f21711c);
                return;
            case 5:
                this.f21710b.lambda$startScreenCapture$57(this.f21711c);
                return;
            default:
                this.f21710b.lambda$updateConnectionState$81(this.f21711c);
                return;
        }
    }
}
