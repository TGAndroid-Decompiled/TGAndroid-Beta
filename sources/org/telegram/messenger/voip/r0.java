package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class r0 implements Runnable {
    public final int f27573a;
    public final AudioManager f27574b;

    public r0(AudioManager audioManager, int i7) {
        this.f27573a = i7;
        this.f27574b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f27573a) {
            case 0:
                VoIPService.AnonymousClass1.lambda$run$1(this.f27574b);
                return;
            case 1:
                VoIPService.lambda$onDestroy$98(this.f27574b);
                return;
            default:
                VoipAudioManager.a(this.f27574b);
                return;
        }
    }
}
