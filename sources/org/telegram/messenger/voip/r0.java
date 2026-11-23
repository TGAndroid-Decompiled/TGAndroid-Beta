package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class r0 implements Runnable {
    public final int f27536a;
    public final AudioManager f27537b;

    public r0(AudioManager audioManager, int i7) {
        this.f27536a = i7;
        this.f27537b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f27536a) {
            case 0:
                VoIPService.AnonymousClass1.lambda$run$1(this.f27537b);
                return;
            case 1:
                VoIPService.lambda$onDestroy$98(this.f27537b);
                return;
            default:
                VoipAudioManager.a(this.f27537b);
                return;
        }
    }
}
