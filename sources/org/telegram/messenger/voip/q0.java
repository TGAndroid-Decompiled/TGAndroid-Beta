package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class q0 implements Runnable {
    public final int f26165a;
    public final AudioManager f26166b;

    public q0(AudioManager audioManager, int i7) {
        this.f26165a = i7;
        this.f26166b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f26165a) {
            case 0:
                VoIPService.AnonymousClass1.lambda$run$1(this.f26166b);
                return;
            case 1:
                VoIPService.lambda$onDestroy$98(this.f26166b);
                return;
            default:
                VoipAudioManager.a(this.f26166b);
                return;
        }
    }
}
