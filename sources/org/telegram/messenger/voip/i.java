package org.telegram.messenger.voip;

public final class i implements Runnable {

    public final int f21916a;

    public i(int i10) {
        this.f21916a = i10;
    }

    @Override
    public final void run() {
        switch (this.f21916a) {
            case 0:
                VideoCapturerDevice.AnonymousClass1.lambda$onStop$0();
                break;
            case 1:
                VideoCapturerDevice.AnonymousClass2.lambda$onFirstFrameAvailable$0();
                break;
            case 2:
                VoIPPreNotificationService.lambda$dismiss$5();
                break;
            case 3:
                VoIPService.lambda$startConferenceGroupCall$35();
                break;
            case 4:
                VoIPService.lambda$startOutgoingCall$6();
                break;
            case 5:
                VoIPService.lambda$startGroupCall$24();
                break;
            case 6:
                VoIPService.lambda$onDestroy$97();
                break;
            case 7:
                VoIPService.lambda$configureDeviceForCall$109();
                break;
            default:
                VoIPService.lambda$acceptIncomingCall$100();
                break;
        }
    }
}
