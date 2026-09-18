package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class o0 implements Runnable {
    public final int f17700a;
    public final VoIPService f17701b;
    public final AudioManager f17702c;

    public o0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f17700a = i10;
        this.f17701b = voIPService;
        this.f17702c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f17700a) {
            case 0:
                VoIPService.z(this.f17701b, this.f17702c);
                return;
            default:
                VoIPService.s1(this.f17701b, this.f17702c);
                return;
        }
    }
}
