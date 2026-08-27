package org.telegram.messenger.voip;

public final class s implements Runnable {

    public final int f21968a;

    public final VoIPService f21969b;

    public s(VoIPService voIPService, int i10) {
        this.f21968a = i10;
        this.f21969b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f21968a) {
            case 0:
                this.f21969b.lambda$playConnectedSound$88();
                break;
            case 1:
                this.f21969b.lambda$playStartRecordSound$119();
                break;
            case 2:
                this.f21969b.lambda$playAllowTalkSound$120();
                break;
            case 3:
                this.f21969b.lambda$getConnectionAndStartCall$106();
                break;
            case 4:
                this.f21969b.lambda$callFailed$114();
                break;
            case 5:
                this.f21969b.lambda$callFailed$115();
                break;
            case 6:
                this.f21969b.lambda$callEnded$122();
                break;
            case 7:
                this.f21969b.lambda$callEnded$123();
                break;
            case 8:
                this.f21969b.lambda$callEnded$124();
                break;
            case 9:
                this.f21969b.lambda$callEnded$125();
                break;
            case 10:
                this.f21969b.lambda$onCallUpdated$16();
                break;
            case 11:
                this.f21969b.lambda$onCallUpdated$17();
                break;
            case 12:
                this.f21969b.lambda$onCallUpdated$18();
                break;
            case 13:
                this.f21969b.lambda$setMicMute$0();
                break;
            case 14:
                this.f21969b.lambda$switchToSpeaker$92();
                break;
            case 15:
                this.f21969b.lambda$endConnectionServiceCall$126();
                break;
            case 16:
                this.f21969b.lambda$onConnectionStateChanged$116();
                break;
            case 17:
                this.f21969b.lambda$onConnectionStateChanged$117();
                break;
            case 18:
                this.f21969b.lambda$convertToConferenceCall$30();
                break;
            case 19:
                this.f21969b.lambda$initiateActualEncryptedCall$84();
                break;
            case 20:
                this.f21969b.lambda$loadResources$108();
                break;
            case 21:
                this.f21969b.lambda$setupCaptureDevice$14();
                break;
            case 22:
                this.f21969b.lambda$startOutgoingCall$8();
                break;
            case 23:
                this.f21969b.lambda$onStartCommand$2();
                break;
            case 24:
                this.f21969b.lambda$onStartCommand$3();
                break;
            case 25:
                this.f21969b.lambda$declineIncomingCall$104();
                break;
            case 26:
                this.f21969b.callFailed();
                break;
            case 27:
                this.f21969b.lambda$startGroupCheckShortpoll$65();
                break;
            case 28:
                this.f21969b.lambda$onDestroy$99();
                break;
            default:
                this.f21969b.lambda$startConnectingSound$89();
                break;
        }
    }
}
