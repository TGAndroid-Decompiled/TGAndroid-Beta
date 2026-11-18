package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class e0 implements Runnable {
    public final int f27485a;
    public final VoIPService f27486b;
    public final AudioManager f27487c;

    public e0(VoIPService voIPService, AudioManager audioManager, int i7) {
        this.f27485a = i7;
        this.f27486b = voIPService;
        this.f27487c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f27485a) {
            case 0:
                VoIPService.C(this.f27486b, this.f27487c);
                return;
            default:
                VoIPService.g1(this.f27486b, this.f27487c);
                return;
        }
    }
}
