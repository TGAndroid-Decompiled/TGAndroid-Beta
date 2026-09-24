package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class o0 implements Runnable {
    public final int f17919a;
    public final VoIPService f17920b;
    public final AudioManager f17921c;

    public o0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f17919a = i10;
        this.f17920b = voIPService;
        this.f17921c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f17919a) {
            case 0:
                VoIPService.z(this.f17920b, this.f17921c);
                return;
            default:
                VoIPService.s1(this.f17920b, this.f17921c);
                return;
        }
    }
}
