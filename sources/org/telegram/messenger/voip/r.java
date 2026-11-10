package org.telegram.messenger.voip;
public final class r implements Runnable {
    public final int f26171a;
    public final VoIPService f26172b;

    public r(VoIPService voIPService, int i7) {
        this.f26171a = i7;
        this.f26172b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f26171a) {
            case 0:
                this.f26172b.lambda$updateConnectionState$83();
                return;
            case 1:
                this.f26172b.lambda$playConnectedSound$88();
                return;
            case 2:
                this.f26172b.lambda$playStartRecordSound$120();
                return;
            case 3:
                this.f26172b.lambda$playAllowTalkSound$121();
                return;
            case 4:
                this.f26172b.lambda$getConnectionAndStartCall$106();
                return;
            case 5:
                this.f26172b.lambda$callFailed$115();
                return;
            case 6:
                this.f26172b.lambda$callFailed$116();
                return;
            case 7:
                this.f26172b.lambda$callEnded$123();
                return;
            case 8:
                this.f26172b.lambda$callEnded$124();
                return;
            case 9:
                this.f26172b.lambda$callEnded$125();
                return;
            case 10:
                this.f26172b.lambda$callEnded$126();
                return;
            case 11:
                this.f26172b.lambda$onCallUpdated$16();
                return;
            case 12:
                this.f26172b.lambda$onCallUpdated$17();
                return;
            case 13:
                this.f26172b.lambda$onCallUpdated$18();
                return;
            case 14:
                this.f26172b.lambda$setMicMute$0();
                return;
            case 15:
                this.f26172b.lambda$endConnectionServiceCall$127();
                return;
            case 16:
                this.f26172b.lambda$switchToSpeaker$92();
                return;
            case 17:
                this.f26172b.lambda$convertToConferenceCall$30();
                return;
            case 18:
                this.f26172b.lambda$initiateActualEncryptedCall$84();
                return;
            case 19:
                this.f26172b.lambda$loadResources$109();
                return;
            case 20:
                this.f26172b.lambda$setupCaptureDevice$14();
                return;
            case 21:
                this.f26172b.lambda$startOutgoingCall$8();
                return;
            case 22:
                this.f26172b.lambda$onStartCommand$2();
                return;
            case 23:
                this.f26172b.lambda$onStartCommand$3();
                return;
            case 24:
                this.f26172b.lambda$declineIncomingCall$104();
                return;
            case 25:
                this.f26172b.callFailed();
                return;
            case 26:
                this.f26172b.lambda$startGroupCheckShortpoll$65();
                return;
            case 27:
                this.f26172b.lambda$onDestroy$99();
                return;
            case 28:
                this.f26172b.lambda$onConnectionStateChanged$117();
                return;
            default:
                this.f26172b.lambda$startConnectingSound$89();
                return;
        }
    }
}
