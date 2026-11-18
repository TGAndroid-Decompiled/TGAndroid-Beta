package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class r0 implements Runnable {
    public final int f27547a;
    public final AudioManager f27548b;

    public r0(AudioManager audioManager, int i7) {
        this.f27547a = i7;
        this.f27548b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f27547a) {
            case 0:
                VoIPService.AnonymousClass1.lambda$run$1(this.f27548b);
                return;
            case 1:
                VoIPService.lambda$onDestroy$98(this.f27548b);
                return;
            default:
                VoipAudioManager.a(this.f27548b);
                return;
        }
    }
}
