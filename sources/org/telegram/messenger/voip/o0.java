package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class o0 implements Runnable {
    public final int f18801a;
    public final VoIPService f18802b;
    public final AudioManager f18803c;

    public o0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f18801a = i10;
        this.f18802b = voIPService;
        this.f18803c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f18801a) {
            case 0:
                VoIPService.z(this.f18802b, this.f18803c);
                return;
            default:
                VoIPService.s1(this.f18802b, this.f18803c);
                return;
        }
    }
}
