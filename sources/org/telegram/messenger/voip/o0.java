package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class o0 implements Runnable {
    public final int f19414a;
    public final VoIPService f19415b;
    public final AudioManager f19416c;

    public o0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f19414a = i10;
        this.f19415b = voIPService;
        this.f19416c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19414a) {
            case 0:
                VoIPService.z(this.f19415b, this.f19416c);
                return;
            default:
                VoIPService.s1(this.f19415b, this.f19416c);
                return;
        }
    }
}
