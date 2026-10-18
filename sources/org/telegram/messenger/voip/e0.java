package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class e0 implements Runnable {
    public final int f19856a;
    public final VoIPService f19857b;
    public final AudioManager f19858c;

    public e0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f19856a = i10;
        this.f19857b = voIPService;
        this.f19858c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19856a) {
            case 0:
                VoIPService.C(this.f19857b, this.f19858c);
                return;
            default:
                VoIPService.g1(this.f19857b, this.f19858c);
                return;
        }
    }
}
