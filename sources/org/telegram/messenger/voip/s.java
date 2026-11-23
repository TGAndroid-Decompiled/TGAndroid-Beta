package org.telegram.messenger.voip;
public final class s implements Runnable {
    public final int f27502a;
    public final VoIPService f27503b;

    public s(VoIPService voIPService, int i7) {
        this.f27502a = i7;
        this.f27503b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f27502a) {
            case 0:
                this.f27503b.lambda$updateConnectionState$83();
                return;
            case 1:
                this.f27503b.lambda$playConnectedSound$88();
                return;
            case 2:
                this.f27503b.lambda$playStartRecordSound$120();
                return;
            case 3:
                this.f27503b.lambda$playAllowTalkSound$121();
                return;
            case 4:
                this.f27503b.lambda$getConnectionAndStartCall$106();
                return;
            case 5:
                this.f27503b.lambda$callFailed$115();
                return;
            case 6:
                this.f27503b.lambda$callFailed$116();
                return;
            case 7:
                this.f27503b.lambda$callEnded$123();
                return;
            case 8:
                this.f27503b.lambda$callEnded$124();
                return;
            case 9:
                this.f27503b.lambda$callEnded$125();
                return;
            case 10:
                this.f27503b.lambda$callEnded$126();
                return;
            case 11:
                this.f27503b.lambda$onCallUpdated$16();
                return;
            case 12:
                this.f27503b.lambda$onCallUpdated$17();
                return;
            case 13:
                this.f27503b.lambda$onCallUpdated$18();
                return;
            case 14:
                this.f27503b.lambda$setMicMute$0();
                return;
            case 15:
                this.f27503b.lambda$endConnectionServiceCall$127();
                return;
            case 16:
                this.f27503b.lambda$switchToSpeaker$92();
                return;
            case 17:
                this.f27503b.lambda$convertToConferenceCall$30();
                return;
            case 18:
                this.f27503b.lambda$initiateActualEncryptedCall$84();
                return;
            case 19:
                this.f27503b.lambda$loadResources$109();
                return;
            case 20:
                this.f27503b.lambda$setupCaptureDevice$14();
                return;
            case 21:
                this.f27503b.lambda$startOutgoingCall$8();
                return;
            case 22:
                this.f27503b.lambda$onStartCommand$2();
                return;
            case 23:
                this.f27503b.lambda$onStartCommand$3();
                return;
            case 24:
                this.f27503b.lambda$declineIncomingCall$104();
                return;
            case 25:
                this.f27503b.callFailed();
                return;
            case 26:
                this.f27503b.lambda$startGroupCheckShortpoll$65();
                return;
            case 27:
                this.f27503b.lambda$onDestroy$99();
                return;
            case 28:
                this.f27503b.lambda$onConnectionStateChanged$117();
                return;
            default:
                this.f27503b.lambda$startConnectingSound$89();
                return;
        }
    }
}
