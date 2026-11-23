package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class e0 implements Runnable {
    public final int f27581a;
    public final VoIPService f27582b;
    public final AudioManager f27583c;

    public e0(VoIPService voIPService, AudioManager audioManager, int i7) {
        this.f27581a = i7;
        this.f27582b = voIPService;
        this.f27583c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f27581a) {
            case 0:
                VoIPService.C(this.f27582b, this.f27583c);
                return;
            default:
                VoIPService.g1(this.f27582b, this.f27583c);
                return;
        }
    }
}
