package org.telegram.messenger.voip;
public final class z implements Runnable {
    public final int f19930a;
    public final VoIPService f19931b;
    public final int f19932c;

    public z(VoIPService voIPService, int i10, int i11) {
        this.f19930a = i11;
        this.f19931b = voIPService;
        this.f19932c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19930a) {
            case 0:
                this.f19931b.lambda$onSignalBarCountChanged$122(this.f19932c);
                return;
            case 1:
                this.f19931b.lambda$onConnectionStateChanged$119(this.f19932c);
                return;
            case 2:
                this.f19931b.lambda$startConferenceGroupCall$36(this.f19932c);
                return;
            case 3:
                this.f19931b.lambda$startGroupCall$25(this.f19932c);
                return;
            case 4:
                this.f19931b.lambda$createGroupInstance$72(this.f19932c);
                return;
            case 5:
                this.f19931b.lambda$startScreenCapture$57(this.f19932c);
                return;
            default:
                this.f19931b.lambda$updateConnectionState$81(this.f19932c);
                return;
        }
    }
}
