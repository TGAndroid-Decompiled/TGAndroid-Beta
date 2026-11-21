package org.telegram.messenger.voip;
public final class z implements Runnable {
    public final int f27602a;
    public final VoIPService f27603b;
    public final int f27604c;

    public z(VoIPService voIPService, int i7, int i10) {
        this.f27602a = i10;
        this.f27603b = voIPService;
        this.f27604c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27602a) {
            case 0:
                this.f27603b.lambda$onSignalBarCountChanged$122(this.f27604c);
                return;
            case 1:
                this.f27603b.lambda$onConnectionStateChanged$119(this.f27604c);
                return;
            case 2:
                this.f27603b.lambda$startConferenceGroupCall$36(this.f27604c);
                return;
            case 3:
                this.f27603b.lambda$startGroupCall$25(this.f27604c);
                return;
            case 4:
                this.f27603b.lambda$createGroupInstance$72(this.f27604c);
                return;
            case 5:
                this.f27603b.lambda$startScreenCapture$57(this.f27604c);
                return;
            default:
                this.f27603b.lambda$updateConnectionState$81(this.f27604c);
                return;
        }
    }
}
