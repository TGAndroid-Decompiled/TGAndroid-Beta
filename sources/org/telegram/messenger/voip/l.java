package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VideoCapturerDevice;
public final class l implements Runnable {
    public final int f18834a;

    public l(int i10) {
        this.f18834a = i10;
    }

    @Override
    public final void run() {
        switch (this.f18834a) {
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
