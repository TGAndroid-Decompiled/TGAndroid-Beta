package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class c0 implements Runnable {
    public final int f25983a;
    public final VoIPService f25984b;
    public final AudioManager f25985c;

    public c0(VoIPService voIPService, AudioManager audioManager, int i3) {
        this.f25983a = i3;
        this.f25984b = voIPService;
        this.f25985c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f25983a) {
            case 0:
                VoIPService.C(this.f25984b, this.f25985c);
                return;
            default:
                VoIPService.g1(this.f25984b, this.f25985c);
                return;
        }
    }
}
