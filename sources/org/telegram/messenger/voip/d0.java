package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class d0 implements Runnable {
    public final int f19859a;
    public final VoIPService f19860b;
    public final AudioManager f19861c;

    public d0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f19859a = i10;
        this.f19860b = voIPService;
        this.f19861c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19859a) {
            case 0:
                VoIPService.C(this.f19860b, this.f19861c);
                return;
            default:
                VoIPService.g1(this.f19860b, this.f19861c);
                return;
        }
    }
}
