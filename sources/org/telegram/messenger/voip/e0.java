package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class e0 implements Runnable {
    public final int f27118a;
    public final VoIPService f27119b;
    public final AudioManager f27120c;

    public e0(VoIPService voIPService, AudioManager audioManager, int i7) {
        this.f27118a = i7;
        this.f27119b = voIPService;
        this.f27120c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f27118a) {
            case 0:
                VoIPService.C(this.f27119b, this.f27120c);
                return;
            default:
                VoIPService.g1(this.f27119b, this.f27120c);
                return;
        }
    }
}
