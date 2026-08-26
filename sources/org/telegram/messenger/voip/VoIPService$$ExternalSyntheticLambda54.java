package org.telegram.messenger.voip;

public final class VoIPService$$ExternalSyntheticLambda54 implements Runnable {
    public final int $r8$classId;

    public VoIPService$$ExternalSyntheticLambda54(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                VoIPService.lambda$acceptIncomingCall$100();
                break;
            case 1:
                VideoCapturerDevice.AnonymousClass1.lambda$onStop$0();
                break;
            case 2:
                VideoCapturerDevice.AnonymousClass2.lambda$onFirstFrameAvailable$0();
                break;
            case 3:
                VoIPPreNotificationService.lambda$dismiss$5();
                break;
            case 4:
                VoIPService.lambda$startConferenceGroupCall$35();
                break;
            case 5:
                VoIPService.lambda$startOutgoingCall$6();
                break;
            case 6:
                VoIPService.lambda$startGroupCall$24();
                break;
            case 7:
                VoIPService.lambda$onDestroy$97();
                break;
            default:
                VoIPService.lambda$configureDeviceForCall$109();
                break;
        }
    }
}
