package org.telegram.messenger.voip;

public final class z implements Runnable {

    public final int f21998a;

    public final VoIPService f21999b;

    public final int f22000c;

    public z(VoIPService voIPService, int i10, int i11) {
        this.f21998a = i11;
        this.f21999b = voIPService;
        this.f22000c = i10;
    }

    @Override
    public final void run() {
        switch (this.f21998a) {
            case 0:
                this.f21999b.lambda$onSignalBarCountChanged$121(this.f22000c);
                break;
            case 1:
                this.f21999b.lambda$startConferenceGroupCall$36(this.f22000c);
                break;
            case 2:
                this.f21999b.lambda$onConnectionStateChanged$118(this.f22000c);
                break;
            case 3:
                this.f21999b.lambda$startGroupCall$25(this.f22000c);
                break;
            case 4:
                this.f21999b.lambda$createGroupInstance$72(this.f22000c);
                break;
            case 5:
                this.f21999b.lambda$startScreenCapture$57(this.f22000c);
                break;
            default:
                this.f21999b.lambda$updateConnectionState$81(this.f22000c);
                break;
        }
    }
}
