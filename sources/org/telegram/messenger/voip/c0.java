package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class c0 implements Runnable {
    public final int f21609a;
    public final VoIPService f21610b;
    public final AudioManager f21611c;

    public c0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f21609a = i10;
        this.f21610b = voIPService;
        this.f21611c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f21609a) {
            case 0:
                VoIPService.C(this.f21610b, this.f21611c);
                return;
            default:
                VoIPService.g1(this.f21610b, this.f21611c);
                return;
        }
    }
}
