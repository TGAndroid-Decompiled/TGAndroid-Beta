package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class o0 implements Runnable {
    public final int f17675a;
    public final VoIPService f17676b;
    public final AudioManager f17677c;

    public o0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f17675a = i10;
        this.f17676b = voIPService;
        this.f17677c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f17675a) {
            case 0:
                VoIPService.z(this.f17676b, this.f17677c);
                return;
            default:
                VoIPService.s1(this.f17676b, this.f17677c);
                return;
        }
    }
}
