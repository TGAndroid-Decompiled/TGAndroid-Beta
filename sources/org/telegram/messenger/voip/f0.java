package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class f0 implements Runnable {
    public final int f19330a;
    public final VoIPService f19331b;
    public final AudioManager f19332c;

    public f0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f19330a = i10;
        this.f19331b = voIPService;
        this.f19332c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19330a) {
            case 0:
                VoIPService.C(this.f19331b, this.f19332c);
                return;
            default:
                VoIPService.g1(this.f19331b, this.f19332c);
                return;
        }
    }
}
