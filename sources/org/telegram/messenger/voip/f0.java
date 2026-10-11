package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class f0 implements Runnable {
    public final int f19553a;
    public final VoIPService f19554b;
    public final AudioManager f19555c;

    public f0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f19553a = i10;
        this.f19554b = voIPService;
        this.f19555c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19553a) {
            case 0:
                VoIPService.C(this.f19554b, this.f19555c);
                return;
            default:
                VoIPService.g1(this.f19554b, this.f19555c);
                return;
        }
    }
}
