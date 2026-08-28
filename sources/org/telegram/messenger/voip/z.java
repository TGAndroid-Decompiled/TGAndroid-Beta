package org.telegram.messenger.voip;
public final class z implements Runnable {
    public final int f21974a;
    public final VoIPService f21975b;
    public final int f21976c;

    public z(VoIPService voIPService, int i9, int i10) {
        this.f21974a = i10;
        this.f21975b = voIPService;
        this.f21976c = i9;
    }

    @Override
    public final void run() {
        switch (this.f21974a) {
            case 0:
                this.f21975b.lambda$onSignalBarCountChanged$121(this.f21976c);
                return;
            case 1:
                this.f21975b.lambda$startConferenceGroupCall$36(this.f21976c);
                return;
            case 2:
                this.f21975b.lambda$onConnectionStateChanged$118(this.f21976c);
                return;
            case 3:
                this.f21975b.lambda$startGroupCall$25(this.f21976c);
                return;
            case 4:
                this.f21975b.lambda$createGroupInstance$72(this.f21976c);
                return;
            case 5:
                this.f21975b.lambda$startScreenCapture$57(this.f21976c);
                return;
            default:
                this.f21975b.lambda$updateConnectionState$81(this.f21976c);
                return;
        }
    }
}
