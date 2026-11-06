package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VideoCapturerDevice;
public final class i implements Runnable {
    public final int f26113a;

    public i(int i7) {
        this.f26113a = i7;
    }

    @Override
    public final void run() {
        switch (this.f26113a) {
            case 0:
                VideoCapturerDevice.AnonymousClass1.a();
                return;
            case 1:
                VideoCapturerDevice.AnonymousClass2.a();
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
