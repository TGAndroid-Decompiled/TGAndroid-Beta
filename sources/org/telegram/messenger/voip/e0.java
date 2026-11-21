package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class e0 implements Runnable {
    public final int f27513a;
    public final VoIPService f27514b;
    public final AudioManager f27515c;

    public e0(VoIPService voIPService, AudioManager audioManager, int i7) {
        this.f27513a = i7;
        this.f27514b = voIPService;
        this.f27515c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f27513a) {
            case 0:
                VoIPService.C(this.f27514b, this.f27515c);
                return;
            default:
                VoIPService.g1(this.f27514b, this.f27515c);
                return;
        }
    }
}
