package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class d0 implements Runnable {
    public final int f19922a;
    public final VoIPService f19923b;
    public final AudioManager f19924c;

    public d0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f19922a = i10;
        this.f19923b = voIPService;
        this.f19924c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19922a) {
            case 0:
                VoIPService.C(this.f19923b, this.f19924c);
                return;
            default:
                VoIPService.g1(this.f19923b, this.f19924c);
                return;
        }
    }
}
