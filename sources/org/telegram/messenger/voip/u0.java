package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class u0 implements Runnable {
    public final int f19628a;
    public final AudioManager f19629b;

    public u0(AudioManager audioManager, int i10) {
        this.f19628a = i10;
        this.f19629b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19628a) {
            case 0:
                VoIPService.AnonymousClass1.lambda$run$1(this.f19629b);
                return;
            case 1:
                VoIPService.lambda$onDestroy$98(this.f19629b);
                return;
            default:
                VoipAudioManager.a(this.f19629b);
                return;
        }
    }
}
