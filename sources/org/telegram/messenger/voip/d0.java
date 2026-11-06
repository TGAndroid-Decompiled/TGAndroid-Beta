package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class d0 implements Runnable {
    public final int f26090a;
    public final VoIPService f26091b;
    public final AudioManager f26092c;

    public d0(VoIPService voIPService, AudioManager audioManager, int i7) {
        this.f26090a = i7;
        this.f26091b = voIPService;
        this.f26092c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f26090a) {
            case 0:
                VoIPService.C(this.f26091b, this.f26092c);
                return;
            default:
                VoIPService.g1(this.f26091b, this.f26092c);
                return;
        }
    }
}
