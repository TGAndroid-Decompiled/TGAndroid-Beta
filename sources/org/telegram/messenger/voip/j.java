package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VideoCapturerDevice;
public final class j implements Runnable {
    public final int f27533a;

    public j(int i7) {
        this.f27533a = i7;
    }

    @Override
    public final void run() {
        switch (this.f27533a) {
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
                VoIPService.r0();
                return;
            case 4:
                VoIPService.S0();
                return;
            case 5:
                VoIPService.H();
                return;
            case 6:
                VoIPService.R0();
                return;
            case 7:
                VoIPService.S();
                return;
            default:
                VoIPService.d1();
                return;
        }
    }
}
