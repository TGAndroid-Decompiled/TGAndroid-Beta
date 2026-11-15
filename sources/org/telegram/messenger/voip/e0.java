package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class e0 implements Runnable {
    public final int f27119a;
    public final VoIPService f27120b;
    public final AudioManager f27121c;

    public e0(VoIPService voIPService, AudioManager audioManager, int i7) {
        this.f27119a = i7;
        this.f27120b = voIPService;
        this.f27121c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f27119a) {
            case 0:
                VoIPService.C(this.f27120b, this.f27121c);
                return;
            default:
                VoIPService.g1(this.f27120b, this.f27121c);
                return;
        }
    }
}
