package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class f0 implements Runnable {
    public final int f19548a;
    public final VoIPService f19549b;
    public final AudioManager f19550c;

    public f0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f19548a = i10;
        this.f19549b = voIPService;
        this.f19550c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19548a) {
            case 0:
                this.f19549b.lambda$configureDeviceForCall$111(this.f19550c);
                return;
            default:
                VoIPService.g1(this.f19549b, this.f19550c);
                return;
        }
    }
}
