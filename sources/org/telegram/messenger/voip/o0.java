package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class o0 implements Runnable {
    public final int f17928a;
    public final VoIPService f17929b;
    public final AudioManager f17930c;

    public o0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f17928a = i10;
        this.f17929b = voIPService;
        this.f17930c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f17928a) {
            case 0:
                VoIPService.z(this.f17929b, this.f17930c);
                return;
            default:
                VoIPService.s1(this.f17929b, this.f17930c);
                return;
        }
    }
}
