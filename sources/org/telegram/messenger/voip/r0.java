package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class r0 implements Runnable {
    public final int f16778a;
    public final VoIPService f16779b;
    public final AudioManager f16780c;

    public r0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f16778a = i10;
        this.f16779b = voIPService;
        this.f16780c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f16778a) {
            case 0:
                VoIPService.z(this.f16779b, this.f16780c);
                return;
            default:
                VoIPService.s1(this.f16779b, this.f16780c);
                return;
        }
    }
}
