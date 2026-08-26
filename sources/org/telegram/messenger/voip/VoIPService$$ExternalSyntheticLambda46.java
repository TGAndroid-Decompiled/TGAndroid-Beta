package org.telegram.messenger.voip;

public final class VoIPService$$ExternalSyntheticLambda46 implements Runnable {
    public final int $r8$classId;
    public final VoIPService f$0;

    public VoIPService$$ExternalSyntheticLambda46(VoIPService voIPService, int i) {
        this.$r8$classId = i;
        this.f$0 = voIPService;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$endConnectionServiceCall$126();
                break;
            case 1:
                this.f$0.callFailed();
                break;
            case 2:
                this.f$0.lambda$startGroupCheckShortpoll$65();
                break;
            case 3:
                this.f$0.lambda$onDestroy$99();
                break;
            case 4:
                this.f$0.lambda$startConnectingSound$89();
                break;
            case 5:
                this.f$0.destroyConverting();
                break;
            case 6:
                this.f$0.lambda$updateConnectionState$82();
                break;
            case 7:
                this.f$0.lambda$updateConnectionState$83();
                break;
            case 8:
                this.f$0.lambda$playConnectedSound$88();
                break;
            case 9:
                this.f$0.lambda$playStartRecordSound$119();
                break;
            case 10:
                this.f$0.lambda$playAllowTalkSound$120();
                break;
            case 11:
                this.f$0.lambda$getConnectionAndStartCall$106();
                break;
            case 12:
                this.f$0.lambda$callFailed$114();
                break;
            case 13:
                this.f$0.lambda$callFailed$115();
                break;
            case 14:
                this.f$0.lambda$callEnded$122();
                break;
            case 15:
                this.f$0.lambda$callEnded$123();
                break;
            case 16:
                this.f$0.lambda$callEnded$124();
                break;
            case 17:
                this.f$0.lambda$callEnded$125();
                break;
            case 18:
                this.f$0.lambda$onCallUpdated$16();
                break;
            case 19:
                this.f$0.lambda$onCallUpdated$17();
                break;
            case 20:
                this.f$0.lambda$onCallUpdated$18();
                break;
            case 21:
                this.f$0.lambda$initiateActualEncryptedCall$84();
                break;
            case 22:
                this.f$0.lambda$setMicMute$0();
                break;
            case 23:
                this.f$0.lambda$switchToSpeaker$92();
                break;
            case 24:
                this.f$0.lambda$onConnectionStateChanged$116();
                break;
            case 25:
                this.f$0.lambda$onConnectionStateChanged$117();
                break;
            case 26:
                this.f$0.lambda$convertToConferenceCall$30();
                break;
            case 27:
                this.f$0.lambda$loadResources$108();
                break;
            case 28:
                this.f$0.lambda$setupCaptureDevice$14();
                break;
            default:
                this.f$0.lambda$startOutgoingCall$8();
                break;
        }
    }
}
