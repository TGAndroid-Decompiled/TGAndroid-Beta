package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class n0 implements Runnable {
    public final int f21922a;
    public final VoIPService f21923b;
    public final AudioManager f21924c;

    public n0(VoIPService voIPService, AudioManager audioManager, int i9) {
        this.f21922a = i9;
        this.f21923b = voIPService;
        this.f21924c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f21922a) {
            case 0:
                VoIPService.z(this.f21923b, this.f21924c);
                return;
            default:
                VoIPService.s1(this.f21923b, this.f21924c);
                return;
        }
    }
}
