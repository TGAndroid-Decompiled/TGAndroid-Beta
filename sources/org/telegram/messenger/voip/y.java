package org.telegram.messenger.voip;
public final class y implements Runnable {
    public final int f19931a;
    public final VoIPService f19932b;
    public final int f19933c;

    public y(VoIPService voIPService, int i10, int i11) {
        this.f19931a = i11;
        this.f19932b = voIPService;
        this.f19933c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19931a) {
            case 0:
                this.f19932b.lambda$onSignalBarCountChanged$122(this.f19933c);
                return;
            case 1:
                this.f19932b.lambda$onConnectionStateChanged$119(this.f19933c);
                return;
            case 2:
                this.f19932b.lambda$startConferenceGroupCall$36(this.f19933c);
                return;
            case 3:
                this.f19932b.lambda$startGroupCall$25(this.f19933c);
                return;
            case 4:
                this.f19932b.lambda$createGroupInstance$72(this.f19933c);
                return;
            case 5:
                this.f19932b.lambda$startScreenCapture$57(this.f19933c);
                return;
            default:
                this.f19932b.lambda$updateConnectionState$81(this.f19933c);
                return;
        }
    }
}
