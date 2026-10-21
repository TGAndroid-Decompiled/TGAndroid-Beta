package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class d0 implements Runnable {
    public final int f19838a;
    public final VoIPService f19839b;
    public final AudioManager f19840c;

    public d0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f19838a = i10;
        this.f19839b = voIPService;
        this.f19840c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19838a) {
            case 0:
                VoIPService.C(this.f19839b, this.f19840c);
                return;
            default:
                VoIPService.g1(this.f19839b, this.f19840c);
                return;
        }
    }
}
