package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class i0 implements Runnable {
    public final int f18659a;
    public final VoIPService f18660b;
    public final AudioManager f18661c;

    public i0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f18659a = i10;
        this.f18660b = voIPService;
        this.f18661c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f18659a) {
            case 0:
                VoIPService.C(this.f18660b, this.f18661c);
                return;
            default:
                VoIPService.g1(this.f18660b, this.f18661c);
                return;
        }
    }
}
