package org.telegram.messenger.voip;
public final class x implements Runnable {
    public final int f21697a;
    public final VoIPService f21698b;
    public final int f21699c;

    public x(VoIPService voIPService, int i10, int i11) {
        this.f21697a = i11;
        this.f21698b = voIPService;
        this.f21699c = i10;
    }

    @Override
    public final void run() {
        switch (this.f21697a) {
            case 0:
                this.f21698b.lambda$onSignalBarCountChanged$122(this.f21699c);
                return;
            case 1:
                this.f21698b.lambda$onConnectionStateChanged$119(this.f21699c);
                return;
            case 2:
                this.f21698b.lambda$startConferenceGroupCall$36(this.f21699c);
                return;
            case 3:
                this.f21698b.lambda$startGroupCall$25(this.f21699c);
                return;
            case 4:
                this.f21698b.lambda$createGroupInstance$72(this.f21699c);
                return;
            case 5:
                this.f21698b.lambda$startScreenCapture$57(this.f21699c);
                return;
            default:
                this.f21698b.lambda$updateConnectionState$81(this.f21699c);
                return;
        }
    }
}
