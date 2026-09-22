package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class o0 implements Runnable {
    public final int f17686a;
    public final VoIPService f17687b;
    public final AudioManager f17688c;

    public o0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f17686a = i10;
        this.f17687b = voIPService;
        this.f17688c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f17686a) {
            case 0:
                VoIPService.z(this.f17687b, this.f17688c);
                return;
            default:
                VoIPService.s1(this.f17687b, this.f17688c);
                return;
        }
    }
}
