package org.telegram.messenger.voip;
public final class z implements Runnable {
    public final int f19941a;
    public final VoIPService f19942b;
    public final int f19943c;

    public z(VoIPService voIPService, int i10, int i11) {
        this.f19941a = i11;
        this.f19942b = voIPService;
        this.f19943c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19941a) {
            case 0:
                this.f19942b.lambda$onSignalBarCountChanged$122(this.f19943c);
                return;
            case 1:
                this.f19942b.lambda$onConnectionStateChanged$119(this.f19943c);
                return;
            case 2:
                this.f19942b.lambda$startConferenceGroupCall$36(this.f19943c);
                return;
            case 3:
                this.f19942b.lambda$startGroupCall$25(this.f19943c);
                return;
            case 4:
                this.f19942b.lambda$createGroupInstance$72(this.f19943c);
                return;
            case 5:
                this.f19942b.lambda$startScreenCapture$57(this.f19943c);
                return;
            default:
                this.f19942b.lambda$updateConnectionState$81(this.f19943c);
                return;
        }
    }
}
