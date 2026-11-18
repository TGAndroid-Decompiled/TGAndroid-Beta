package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class e0 implements Runnable {
    public final int f27487a;
    public final VoIPService f27488b;
    public final AudioManager f27489c;

    public e0(VoIPService voIPService, AudioManager audioManager, int i7) {
        this.f27487a = i7;
        this.f27488b = voIPService;
        this.f27489c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f27487a) {
            case 0:
                VoIPService.C(this.f27488b, this.f27489c);
                return;
            default:
                VoIPService.g1(this.f27488b, this.f27489c);
                return;
        }
    }
}
