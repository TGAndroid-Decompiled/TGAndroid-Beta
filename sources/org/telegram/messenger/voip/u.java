package org.telegram.messenger.voip;
public final class u implements Runnable {
    public final int f19440a;
    public final VoIPService f19441b;

    public u(VoIPService voIPService, int i10) {
        this.f19440a = i10;
        this.f19441b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f19440a) {
            case 0:
                this.f19441b.lambda$playConnectedSound$88();
                return;
            case 1:
                this.f19441b.lambda$playStartRecordSound$119();
                return;
            case 2:
                this.f19441b.lambda$playAllowTalkSound$120();
                return;
            case 3:
                this.f19441b.lambda$getConnectionAndStartCall$106();
                return;
            case 4:
                this.f19441b.lambda$callFailed$114();
                return;
            case 5:
                this.f19441b.lambda$callFailed$115();
                return;
            case 6:
                this.f19441b.lambda$callEnded$122();
                return;
            case 7:
                this.f19441b.lambda$callEnded$123();
                return;
            case 8:
                this.f19441b.lambda$callEnded$124();
                return;
            case 9:
                this.f19441b.lambda$callEnded$125();
                return;
            case 10:
                this.f19441b.lambda$onCallUpdated$16();
                return;
            case 11:
                this.f19441b.lambda$onCallUpdated$17();
                return;
            case 12:
                this.f19441b.lambda$onCallUpdated$18();
                return;
            case 13:
                this.f19441b.lambda$setMicMute$0();
                return;
            case 14:
                this.f19441b.lambda$switchToSpeaker$92();
                return;
            case 15:
                this.f19441b.lambda$endConnectionServiceCall$126();
                return;
            case 16:
                this.f19441b.lambda$onConnectionStateChanged$116();
                return;
            case 17:
                this.f19441b.lambda$onConnectionStateChanged$117();
                return;
            case 18:
                this.f19441b.lambda$convertToConferenceCall$30();
                return;
            case 19:
                this.f19441b.lambda$initiateActualEncryptedCall$84();
                return;
            case 20:
                this.f19441b.lambda$loadResources$108();
                return;
            case 21:
                this.f19441b.lambda$setupCaptureDevice$14();
                return;
            case 22:
                this.f19441b.lambda$startOutgoingCall$8();
                return;
            case 23:
                this.f19441b.lambda$onStartCommand$2();
                return;
            case 24:
                this.f19441b.lambda$onStartCommand$3();
                return;
            case 25:
                this.f19441b.lambda$declineIncomingCall$104();
                return;
            case 26:
                this.f19441b.callFailed();
                return;
            case 27:
                this.f19441b.lambda$startGroupCheckShortpoll$65();
                return;
            case 28:
                this.f19441b.lambda$onDestroy$99();
                return;
            default:
                this.f19441b.lambda$startConnectingSound$89();
                return;
        }
    }
}
