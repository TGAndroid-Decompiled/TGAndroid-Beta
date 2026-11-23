package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class e0 implements Runnable {
    public final int f27476a;
    public final VoIPService f27477b;
    public final AudioManager f27478c;

    public e0(VoIPService voIPService, AudioManager audioManager, int i7) {
        this.f27476a = i7;
        this.f27477b = voIPService;
        this.f27478c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f27476a) {
            case 0:
                VoIPService.C(this.f27477b, this.f27478c);
                return;
            default:
                VoIPService.g1(this.f27477b, this.f27478c);
                return;
        }
    }
}
