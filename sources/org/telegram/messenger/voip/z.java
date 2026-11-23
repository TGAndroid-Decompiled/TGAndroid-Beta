package org.telegram.messenger.voip;
public final class z implements Runnable {
    public final int f27565a;
    public final VoIPService f27566b;
    public final int f27567c;

    public z(VoIPService voIPService, int i7, int i10) {
        this.f27565a = i10;
        this.f27566b = voIPService;
        this.f27567c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27565a) {
            case 0:
                this.f27566b.lambda$onSignalBarCountChanged$122(this.f27567c);
                return;
            case 1:
                this.f27566b.lambda$onConnectionStateChanged$119(this.f27567c);
                return;
            case 2:
                this.f27566b.lambda$startConferenceGroupCall$36(this.f27567c);
                return;
            case 3:
                this.f27566b.lambda$startGroupCall$25(this.f27567c);
                return;
            case 4:
                this.f27566b.lambda$createGroupInstance$72(this.f27567c);
                return;
            case 5:
                this.f27566b.lambda$startScreenCapture$57(this.f27567c);
                return;
            default:
                this.f27566b.lambda$updateConnectionState$81(this.f27567c);
                return;
        }
    }
}
