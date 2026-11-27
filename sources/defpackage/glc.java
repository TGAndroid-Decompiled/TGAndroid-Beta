package defpackage;

import org.telegram.messenger.voip.VoIPService;
public final class glc implements Runnable {
    public final byte a;
    public final VoIPService b;

    public glc(VoIPService voIPService, byte b) {
        this.a = b;
        this.b = voIPService;
    }

    @Override
    public final void run() {
        byte b = this.a;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                voIPService.lambda$endConnectionServiceCall$124();
                return;
            case 1:
                voIPService.lambda$playStartRecordSound$117();
                return;
            case 2:
                voIPService.lambda$playAllowTalkSound$118();
                return;
            case 3:
                voIPService.lambda$getConnectionAndStartCall$103();
                return;
            case 4:
                voIPService.lambda$callFailed$112();
                return;
            case 5:
                voIPService.lambda$callFailed$113();
                return;
            case 6:
                voIPService.lambda$callEnded$120();
                return;
            case 7:
                voIPService.lambda$callEnded$121();
                return;
            case 8:
                voIPService.lambda$callEnded$122();
                return;
            case 9:
                voIPService.lambda$callEnded$123();
                return;
            case 10:
                voIPService.lambda$onCallUpdated$19();
                return;
            case 11:
                voIPService.lambda$onCallUpdated$20();
                return;
            case 12:
                voIPService.lambda$setMicMute$0();
                return;
            case 13:
                voIPService.lambda$onCallUpdated$21();
                return;
            case 14:
                voIPService.lambda$switchToSpeaker$89();
                return;
            case 15:
                voIPService.lambda$convertToConferenceCall$33();
                return;
            case 16:
                voIPService.updateBroadcastVideoRequests();
                return;
            case 17:
                voIPService.lambda$initiateActualEncryptedCall$81();
                return;
            case 18:
                voIPService.lambda$loadResources$106();
                return;
            case 19:
                voIPService.lambda$setupCaptureDevice$14();
                return;
            case 20:
                voIPService.lambda$startOutgoingCall$8();
                return;
            case 21:
                voIPService.lambda$onStartCommand$2();
                return;
            case 22:
                voIPService.lambda$onStartCommand$3();
                return;
            case 23:
                voIPService.lambda$createFirstGroupInstance$69();
                return;
            case 24:
                voIPService.lambda$declineIncomingCall$101();
                return;
            case 25:
                voIPService.callFailed();
                return;
            case 26:
                voIPService.lambda$startGroupCheckShortpoll$68();
                return;
            case 27:
                voIPService.lambda$onDestroy$96();
                return;
            case 28:
                voIPService.lambda$startConnectingSound$86();
                return;
            default:
                voIPService.lambda$onGroupCallUpdated$16();
                return;
        }
    }
}
