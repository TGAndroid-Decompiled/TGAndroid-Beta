package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class o0 implements Runnable {
    public final int f19441a;
    public final VoIPService f19442b;
    public final AudioManager f19443c;

    public o0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f19441a = i10;
        this.f19442b = voIPService;
        this.f19443c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19441a) {
            case 0:
                VoIPService.z(this.f19442b, this.f19443c);
                return;
            default:
                VoIPService.s1(this.f19442b, this.f19443c);
                return;
        }
    }
}
