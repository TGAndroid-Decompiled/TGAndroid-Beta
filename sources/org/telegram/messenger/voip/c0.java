package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class c0 implements Runnable {
    public final int f21621a;
    public final VoIPService f21622b;
    public final AudioManager f21623c;

    public c0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f21621a = i10;
        this.f21622b = voIPService;
        this.f21623c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f21621a) {
            case 0:
                VoIPService.C(this.f21622b, this.f21623c);
                return;
            default:
                VoIPService.g1(this.f21622b, this.f21623c);
                return;
        }
    }
}
