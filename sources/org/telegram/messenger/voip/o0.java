package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class o0 implements Runnable {
    public final int f17944a;
    public final VoIPService f17945b;
    public final AudioManager f17946c;

    public o0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f17944a = i10;
        this.f17945b = voIPService;
        this.f17946c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f17944a) {
            case 0:
                VoIPService.z(this.f17945b, this.f17946c);
                return;
            default:
                VoIPService.s1(this.f17945b, this.f17946c);
                return;
        }
    }
}
