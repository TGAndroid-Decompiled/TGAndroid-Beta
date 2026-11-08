package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class d0 implements Runnable {
    public final int f26104a;
    public final VoIPService f26105b;
    public final AudioManager f26106c;

    public d0(VoIPService voIPService, AudioManager audioManager, int i7) {
        this.f26104a = i7;
        this.f26105b = voIPService;
        this.f26106c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f26104a) {
            case 0:
                VoIPService.C(this.f26105b, this.f26106c);
                return;
            default:
                VoIPService.g1(this.f26105b, this.f26106c);
                return;
        }
    }
}
