package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class d0 implements Runnable {
    public final int f19862a;
    public final VoIPService f19863b;
    public final AudioManager f19864c;

    public d0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f19862a = i10;
        this.f19863b = voIPService;
        this.f19864c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19862a) {
            case 0:
                VoIPService.C(this.f19863b, this.f19864c);
                return;
            default:
                VoIPService.g1(this.f19863b, this.f19864c);
                return;
        }
    }
}
