package org.telegram.messenger.voip;
public final class s implements Runnable {
    public final int f21944a;
    public final VoIPService f21945b;

    public s(VoIPService voIPService, int i9) {
        this.f21944a = i9;
        this.f21945b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f21944a) {
            case 0:
                this.f21945b.lambda$playConnectedSound$88();
                return;
            case 1:
                this.f21945b.lambda$playStartRecordSound$119();
                return;
            case 2:
                this.f21945b.lambda$playAllowTalkSound$120();
                return;
            case 3:
                this.f21945b.lambda$getConnectionAndStartCall$106();
                return;
            case 4:
                this.f21945b.lambda$callFailed$114();
                return;
            case 5:
                this.f21945b.lambda$callFailed$115();
                return;
            case 6:
                this.f21945b.lambda$callEnded$122();
                return;
            case 7:
                this.f21945b.lambda$callEnded$123();
                return;
            case 8:
                this.f21945b.lambda$callEnded$124();
                return;
            case 9:
                this.f21945b.lambda$callEnded$125();
                return;
            case 10:
                this.f21945b.lambda$onCallUpdated$16();
                return;
            case 11:
                this.f21945b.lambda$onCallUpdated$17();
                return;
            case 12:
                this.f21945b.lambda$onCallUpdated$18();
                return;
            case 13:
                this.f21945b.lambda$setMicMute$0();
                return;
            case 14:
                this.f21945b.lambda$switchToSpeaker$92();
                return;
            case 15:
                this.f21945b.lambda$endConnectionServiceCall$126();
                return;
            case 16:
                this.f21945b.lambda$onConnectionStateChanged$116();
                return;
            case 17:
                this.f21945b.lambda$onConnectionStateChanged$117();
                return;
            case 18:
                this.f21945b.lambda$convertToConferenceCall$30();
                return;
            case 19:
                this.f21945b.lambda$initiateActualEncryptedCall$84();
                return;
            case 20:
                this.f21945b.lambda$loadResources$108();
                return;
            case 21:
                this.f21945b.lambda$setupCaptureDevice$14();
                return;
            case 22:
                this.f21945b.lambda$startOutgoingCall$8();
                return;
            case 23:
                this.f21945b.lambda$onStartCommand$2();
                return;
            case 24:
                this.f21945b.lambda$onStartCommand$3();
                return;
            case 25:
                this.f21945b.lambda$declineIncomingCall$104();
                return;
            case 26:
                this.f21945b.callFailed();
                return;
            case 27:
                this.f21945b.lambda$startGroupCheckShortpoll$65();
                return;
            case 28:
                this.f21945b.lambda$onDestroy$99();
                return;
            default:
                this.f21945b.lambda$startConnectingSound$89();
                return;
        }
    }
}
