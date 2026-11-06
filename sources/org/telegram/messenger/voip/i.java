package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VideoCapturerDevice;
public final class i implements Runnable {
    public final int f26121a;

    public i(int i7) {
        this.f26121a = i7;
    }

    @Override
    public final void run() {
        switch (this.f26121a) {
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
                VoIPService.lambda$acceptIncomingCall$100();
                return;
            case 4:
                VoIPService.lambda$configureDeviceForCall$110();
                return;
            case 5:
                VoIPService.lambda$startConferenceGroupCall$35();
                return;
            case 6:
                VoIPService.lambda$startOutgoingCall$6();
                return;
            case 7:
                VoIPService.lambda$startGroupCall$24();
                return;
            default:
                VoIPService.lambda$onDestroy$97();
                return;
        }
    }
}
