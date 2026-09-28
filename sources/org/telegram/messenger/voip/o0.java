package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class o0 implements Runnable {
    public final int f17945a;
    public final VoIPService f17946b;
    public final AudioManager f17947c;

    public o0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f17945a = i10;
        this.f17946b = voIPService;
        this.f17947c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f17945a) {
            case 0:
                VoIPService.z(this.f17946b, this.f17947c);
                return;
            default:
                VoIPService.s1(this.f17946b, this.f17947c);
                return;
        }
    }
}
