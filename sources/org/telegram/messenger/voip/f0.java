package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class f0 implements Runnable {
    public final int f19589a;
    public final VoIPService f19590b;
    public final AudioManager f19591c;

    public f0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f19589a = i10;
        this.f19590b = voIPService;
        this.f19591c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19589a) {
            case 0:
                VoIPService.C(this.f19590b, this.f19591c);
                return;
            default:
                VoIPService.g1(this.f19590b, this.f19591c);
                return;
        }
    }
}
