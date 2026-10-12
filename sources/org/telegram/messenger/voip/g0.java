package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class g0 implements Runnable {
    public final int f18802a;
    public final VoIPService f18803b;
    public final AudioManager f18804c;

    public g0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f18802a = i10;
        this.f18803b = voIPService;
        this.f18804c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f18802a) {
            case 0:
                VoIPService.C(this.f18803b, this.f18804c);
                return;
            default:
                VoIPService.g1(this.f18803b, this.f18804c);
                return;
        }
    }
}
