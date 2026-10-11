package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class t0 implements Runnable {
    public final int f19619a;
    public final AudioManager f19620b;

    public t0(AudioManager audioManager, int i10) {
        this.f19619a = i10;
        this.f19620b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19619a) {
            case 0:
                VoIPService.AnonymousClass1.lambda$run$1(this.f19620b);
                return;
            case 1:
                VoIPService.lambda$onDestroy$98(this.f19620b);
                return;
            default:
                VoipAudioManager.a(this.f19620b);
                return;
        }
    }
}
