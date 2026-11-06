package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class d0 implements Runnable {
    public final int f26098a;
    public final VoIPService f26099b;
    public final AudioManager f26100c;

    public d0(VoIPService voIPService, AudioManager audioManager, int i7) {
        this.f26098a = i7;
        this.f26099b = voIPService;
        this.f26100c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f26098a) {
            case 0:
                VoIPService.C(this.f26099b, this.f26100c);
                return;
            default:
                VoIPService.g1(this.f26099b, this.f26100c);
                return;
        }
    }
}
