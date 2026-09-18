package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class o0 implements Runnable {
    public final int f17877a;
    public final VoIPService f17878b;
    public final AudioManager f17879c;

    public o0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f17877a = i10;
        this.f17878b = voIPService;
        this.f17879c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f17877a) {
            case 0:
                VoIPService.z(this.f17878b, this.f17879c);
                return;
            default:
                VoIPService.s1(this.f17878b, this.f17879c);
                return;
        }
    }
}
