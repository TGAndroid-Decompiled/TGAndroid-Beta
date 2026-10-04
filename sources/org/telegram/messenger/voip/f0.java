package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class f0 implements Runnable {
    public final int f19551a;
    public final VoIPService f19552b;
    public final AudioManager f19553c;

    public f0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f19551a = i10;
        this.f19552b = voIPService;
        this.f19553c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19551a) {
            case 0:
                VoIPService.C(this.f19552b, this.f19553c);
                return;
            default:
                VoIPService.g1(this.f19552b, this.f19553c);
                return;
        }
    }
}
