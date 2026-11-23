package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class e0 implements Runnable {
    public final int f27440a;
    public final VoIPService f27441b;
    public final AudioManager f27442c;

    public e0(VoIPService voIPService, AudioManager audioManager, int i7) {
        this.f27440a = i7;
        this.f27441b = voIPService;
        this.f27442c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f27440a) {
            case 0:
                VoIPService.C(this.f27441b, this.f27442c);
                return;
            default:
                VoIPService.g1(this.f27441b, this.f27442c);
                return;
        }
    }
}
