package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class o0 implements Runnable {
    public final int f20452a;
    public final VoIPService f20453b;
    public final AudioManager f20454c;

    public o0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f20452a = i10;
        this.f20453b = voIPService;
        this.f20454c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f20452a) {
            case 0:
                VoIPService.z(this.f20453b, this.f20454c);
                return;
            default:
                VoIPService.s1(this.f20453b, this.f20454c);
                return;
        }
    }
}
