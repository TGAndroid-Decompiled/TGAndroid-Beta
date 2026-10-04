package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class f0 implements Runnable {
    public final int f19550a;
    public final VoIPService f19551b;
    public final AudioManager f19552c;

    public f0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f19550a = i10;
        this.f19551b = voIPService;
        this.f19552c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19550a) {
            case 0:
                VoIPService.C(this.f19551b, this.f19552c);
                return;
            default:
                VoIPService.g1(this.f19551b, this.f19552c);
                return;
        }
    }
}
