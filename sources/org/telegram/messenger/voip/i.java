package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VideoCapturerDevice;
public final class i implements Runnable {
    public final int f21958a;

    public i(int i10) {
        this.f21958a = i10;
    }

    @Override
    public final void run() {
        switch (this.f21958a) {
            case 0:
                VideoCapturerDevice.AnonymousClass1.lambda$onStop$0();
                return;
            case 1:
                VideoCapturerDevice.AnonymousClass2.lambda$onFirstFrameAvailable$0();
                return;
            case 2:
                VoIPPreNotificationService.d();
                return;
            case 3:
                VoIPService.lambda$startConferenceGroupCall$35();
                return;
            case 4:
                VoIPService.lambda$startOutgoingCall$6();
                return;
            case 5:
                VoIPService.lambda$startGroupCall$24();
                return;
            case 6:
                VoIPService.lambda$onDestroy$97();
                return;
            case 7:
                VoIPService.lambda$configureDeviceForCall$109();
                return;
            default:
                VoIPService.lambda$acceptIncomingCall$100();
                return;
        }
    }
}
