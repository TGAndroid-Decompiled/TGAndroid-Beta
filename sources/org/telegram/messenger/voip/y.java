package org.telegram.messenger.voip;
public final class y implements Runnable {
    public final int f26198a;
    public final VoIPService f26199b;
    public final int f26200c;

    public y(VoIPService voIPService, int i7, int i10) {
        this.f26198a = i10;
        this.f26199b = voIPService;
        this.f26200c = i7;
    }

    @Override
    public final void run() {
        switch (this.f26198a) {
            case 0:
                this.f26199b.lambda$onSignalBarCountChanged$122(this.f26200c);
                return;
            case 1:
                this.f26199b.lambda$onConnectionStateChanged$119(this.f26200c);
                return;
            case 2:
                this.f26199b.lambda$startConferenceGroupCall$36(this.f26200c);
                return;
            case 3:
                this.f26199b.lambda$startGroupCall$25(this.f26200c);
                return;
            case 4:
                this.f26199b.lambda$createGroupInstance$72(this.f26200c);
                return;
            case 5:
                this.f26199b.lambda$startScreenCapture$57(this.f26200c);
                return;
            default:
                this.f26199b.lambda$updateConnectionState$81(this.f26200c);
                return;
        }
    }
}
