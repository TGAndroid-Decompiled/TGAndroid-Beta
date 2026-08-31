package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class o0 implements Runnable {
    public final int f20450a;
    public final VoIPService f20451b;
    public final AudioManager f20452c;

    public o0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f20450a = i10;
        this.f20451b = voIPService;
        this.f20452c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f20450a) {
            case 0:
                VoIPService.z(this.f20451b, this.f20452c);
                return;
            default:
                VoIPService.s1(this.f20451b, this.f20452c);
                return;
        }
    }
}
