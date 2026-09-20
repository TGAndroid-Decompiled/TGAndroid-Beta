package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class o0 implements Runnable {
    public final int f17915a;
    public final VoIPService f17916b;
    public final AudioManager f17917c;

    public o0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f17915a = i10;
        this.f17916b = voIPService;
        this.f17917c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f17915a) {
            case 0:
                VoIPService.z(this.f17916b, this.f17917c);
                return;
            default:
                VoIPService.s1(this.f17916b, this.f17917c);
                return;
        }
    }
}
