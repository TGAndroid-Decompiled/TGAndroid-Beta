package org.telegram.messenger.voip;
public final class t implements Runnable {
    public final int f17960a;
    public final VoIPService f17961b;

    public t(VoIPService voIPService, int i10) {
        this.f17960a = i10;
        this.f17961b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f17960a) {
            case 0:
                this.f17961b.lambda$updateConnectionState$83();
                return;
            case 1:
                this.f17961b.lambda$playConnectedSound$88();
                return;
            case 2:
                this.f17961b.lambda$playStartRecordSound$120();
                return;
            case 3:
                this.f17961b.lambda$playAllowTalkSound$121();
                return;
            case 4:
                this.f17961b.lambda$getConnectionAndStartCall$106();
                return;
            case 5:
                this.f17961b.lambda$callFailed$115();
                return;
            case 6:
                this.f17961b.lambda$callFailed$116();
                return;
            case 7:
                this.f17961b.lambda$callEnded$123();
                return;
            case 8:
                this.f17961b.lambda$callEnded$124();
                return;
            case 9:
                this.f17961b.lambda$callEnded$125();
                return;
            case 10:
                this.f17961b.lambda$callEnded$126();
                return;
            case 11:
                this.f17961b.lambda$onCallUpdated$16();
                return;
            case 12:
                this.f17961b.lambda$onCallUpdated$17();
                return;
            case 13:
                this.f17961b.lambda$onCallUpdated$18();
                return;
            case 14:
                this.f17961b.lambda$setMicMute$0();
                return;
            case 15:
                this.f17961b.lambda$endConnectionServiceCall$127();
                return;
            case 16:
                this.f17961b.lambda$switchToSpeaker$92();
                return;
            case 17:
                this.f17961b.lambda$convertToConferenceCall$30();
                return;
            case 18:
                this.f17961b.lambda$initiateActualEncryptedCall$84();
                return;
            case 19:
                this.f17961b.lambda$loadResources$109();
                return;
            case 20:
                this.f17961b.lambda$setupCaptureDevice$14();
                return;
            case 21:
                this.f17961b.lambda$startOutgoingCall$8();
                return;
            case 22:
                this.f17961b.lambda$onStartCommand$2();
                return;
            case 23:
                this.f17961b.lambda$onStartCommand$3();
                return;
            case 24:
                this.f17961b.lambda$declineIncomingCall$104();
                return;
            case 25:
                this.f17961b.callFailed();
                return;
            case 26:
                this.f17961b.lambda$startGroupCheckShortpoll$65();
                return;
            case 27:
                this.f17961b.lambda$onDestroy$99();
                return;
            case 28:
                this.f17961b.lambda$onConnectionStateChanged$117();
                return;
            default:
                this.f17961b.lambda$startConnectingSound$89();
                return;
        }
    }
}
