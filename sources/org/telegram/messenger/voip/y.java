package org.telegram.messenger.voip;
public final class y implements Runnable {
    public final int f20009a;
    public final VoIPService f20010b;
    public final int f20011c;

    public y(VoIPService voIPService, int i10, int i11) {
        this.f20009a = i11;
        this.f20010b = voIPService;
        this.f20011c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20009a) {
            case 0:
                this.f20010b.lambda$onSignalBarCountChanged$122(this.f20011c);
                return;
            case 1:
                this.f20010b.lambda$onConnectionStateChanged$119(this.f20011c);
                return;
            case 2:
                this.f20010b.lambda$startConferenceGroupCall$36(this.f20011c);
                return;
            case 3:
                this.f20010b.lambda$startGroupCall$25(this.f20011c);
                return;
            case 4:
                this.f20010b.lambda$createGroupInstance$72(this.f20011c);
                return;
            case 5:
                this.f20010b.lambda$startScreenCapture$57(this.f20011c);
                return;
            default:
                this.f20010b.lambda$updateConnectionState$81(this.f20011c);
                return;
        }
    }
}
