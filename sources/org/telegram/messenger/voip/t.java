package org.telegram.messenger.voip;
public final class t implements Runnable {
    public final int f18554a;
    public final VoIPService f18555b;

    public t(VoIPService voIPService, int i10) {
        this.f18554a = i10;
        this.f18555b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f18554a) {
            case 0:
                this.f18555b.lambda$updateConnectionState$83();
                return;
            case 1:
                this.f18555b.lambda$playConnectedSound$88();
                return;
            case 2:
                this.f18555b.lambda$playStartRecordSound$120();
                return;
            case 3:
                this.f18555b.lambda$playAllowTalkSound$121();
                return;
            case 4:
                this.f18555b.lambda$getConnectionAndStartCall$106();
                return;
            case 5:
                this.f18555b.lambda$callFailed$115();
                return;
            case 6:
                this.f18555b.lambda$callFailed$116();
                return;
            case 7:
                this.f18555b.lambda$callEnded$123();
                return;
            case 8:
                this.f18555b.lambda$callEnded$124();
                return;
            case 9:
                this.f18555b.lambda$callEnded$125();
                return;
            case 10:
                this.f18555b.lambda$callEnded$126();
                return;
            case 11:
                this.f18555b.lambda$onCallUpdated$16();
                return;
            case 12:
                this.f18555b.lambda$onCallUpdated$17();
                return;
            case 13:
                this.f18555b.lambda$onCallUpdated$18();
                return;
            case 14:
                this.f18555b.lambda$setMicMute$0();
                return;
            case 15:
                this.f18555b.lambda$endConnectionServiceCall$127();
                return;
            case 16:
                this.f18555b.lambda$switchToSpeaker$92();
                return;
            case 17:
                this.f18555b.lambda$convertToConferenceCall$30();
                return;
            case 18:
                this.f18555b.lambda$initiateActualEncryptedCall$84();
                return;
            case 19:
                this.f18555b.lambda$loadResources$109();
                return;
            case 20:
                this.f18555b.lambda$setupCaptureDevice$14();
                return;
            case 21:
                this.f18555b.lambda$startOutgoingCall$8();
                return;
            case 22:
                this.f18555b.lambda$onStartCommand$2();
                return;
            case 23:
                this.f18555b.lambda$onStartCommand$3();
                return;
            case 24:
                this.f18555b.lambda$declineIncomingCall$104();
                return;
            case 25:
                this.f18555b.callFailed();
                return;
            case 26:
                this.f18555b.lambda$startGroupCheckShortpoll$65();
                return;
            case 27:
                this.f18555b.lambda$onDestroy$99();
                return;
            case 28:
                this.f18555b.lambda$onConnectionStateChanged$117();
                return;
            default:
                this.f18555b.lambda$startConnectingSound$89();
                return;
        }
    }
}
