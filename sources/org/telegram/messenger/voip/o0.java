package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class o0 implements Runnable {
    public final int f19427a;
    public final VoIPService f19428b;
    public final AudioManager f19429c;

    public o0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f19427a = i10;
        this.f19428b = voIPService;
        this.f19429c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19427a) {
            case 0:
                VoIPService.z(this.f19428b, this.f19429c);
                return;
            default:
                VoIPService.s1(this.f19428b, this.f19429c);
                return;
        }
    }
}
