package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VideoCapturerDevice;
public final class j implements Runnable {
    public final int f20421a;

    public j(int i10) {
        this.f20421a = i10;
    }

    @Override
    public final void run() {
        switch (this.f20421a) {
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
                VoIPService.E();
                return;
            case 4:
                VoIPService.R0();
                return;
            case 5:
                VoIPService.O();
                return;
            case 6:
                VoIPService.a1();
                return;
            case 7:
                VoIPService.n0();
                return;
            default:
                VoIPService.r0();
                return;
        }
    }
}
