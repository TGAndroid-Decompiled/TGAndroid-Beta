package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class f0 implements Runnable {
    public final int f19329a;
    public final VoIPService f19330b;
    public final AudioManager f19331c;

    public f0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f19329a = i10;
        this.f19330b = voIPService;
        this.f19331c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19329a) {
            case 0:
                VoIPService.C(this.f19330b, this.f19331c);
                return;
            default:
                VoIPService.g1(this.f19330b, this.f19331c);
                return;
        }
    }
}
