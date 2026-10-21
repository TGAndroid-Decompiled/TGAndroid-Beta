package org.telegram.messenger.voip;
public final class r implements Runnable {
    public final int f19899a;
    public final VoIPService f19900b;

    public r(VoIPService voIPService, int i10) {
        this.f19899a = i10;
        this.f19900b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f19899a) {
            case 0:
                this.f19900b.lambda$updateConnectionState$83();
                return;
            case 1:
                this.f19900b.lambda$playConnectedSound$88();
                return;
            case 2:
                VoIPService.v0(this.f19900b);
                return;
            case 3:
                this.f19900b.lambda$playAllowTalkSound$121();
                return;
            case 4:
                this.f19900b.lambda$getConnectionAndStartCall$106();
                return;
            case 5:
                this.f19900b.lambda$callFailed$115();
                return;
            case 6:
                VoIPService.z(this.f19900b);
                return;
            case 7:
                this.f19900b.lambda$callEnded$123();
                return;
            case 8:
                VoIPService.v1(this.f19900b);
                return;
            case 9:
                this.f19900b.lambda$callEnded$125();
                return;
            case 10:
                this.f19900b.lambda$callEnded$126();
                return;
            case 11:
                VoIPService.w1(this.f19900b);
                return;
            case 12:
                this.f19900b.lambda$onCallUpdated$17();
                return;
            case 13:
                VoIPService.j1(this.f19900b);
                return;
            case 14:
                this.f19900b.lambda$setMicMute$0();
                return;
            case 15:
                this.f19900b.lambda$endConnectionServiceCall$127();
                return;
            case 16:
                this.f19900b.lambda$switchToSpeaker$92();
                return;
            case 17:
                VoIPService.z0(this.f19900b);
                return;
            case 18:
                VoIPService.t(this.f19900b);
                return;
            case 19:
                VoIPService.u(this.f19900b);
                return;
            case 20:
                this.f19900b.lambda$setupCaptureDevice$14();
                return;
            case 21:
                VoIPService.e1(this.f19900b);
                return;
            case 22:
                this.f19900b.lambda$onStartCommand$2();
                return;
            case 23:
                VoIPService.n1(this.f19900b);
                return;
            case 24:
                VoIPService.w(this.f19900b);
                return;
            case 25:
                VoIPService.r(this.f19900b);
                return;
            case 26:
                this.f19900b.lambda$startGroupCheckShortpoll$65();
                return;
            case 27:
                VoIPService.i1(this.f19900b);
                return;
            case 28:
                this.f19900b.lambda$onConnectionStateChanged$117();
                return;
            default:
                this.f19900b.lambda$startConnectingSound$89();
                return;
        }
    }
}
