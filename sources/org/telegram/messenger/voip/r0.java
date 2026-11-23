package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class r0 implements Runnable {
    public final int f27500a;
    public final AudioManager f27501b;

    public r0(AudioManager audioManager, int i7) {
        this.f27500a = i7;
        this.f27501b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f27500a) {
            case 0:
                VoIPService.AnonymousClass1.lambda$run$1(this.f27501b);
                return;
            case 1:
                VoIPService.lambda$onDestroy$98(this.f27501b);
                return;
            default:
                VoipAudioManager.a(this.f27501b);
                return;
        }
    }
}
