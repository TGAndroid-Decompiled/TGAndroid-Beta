package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class d0 implements Runnable {
    public final int f19927a;
    public final VoIPService f19928b;
    public final AudioManager f19929c;

    public d0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f19927a = i10;
        this.f19928b = voIPService;
        this.f19929c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19927a) {
            case 0:
                VoIPService.C(this.f19928b, this.f19929c);
                return;
            default:
                VoIPService.g1(this.f19928b, this.f19929c);
                return;
        }
    }
}
