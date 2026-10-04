package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class t0 implements Runnable {
    public final int f19618a;
    public final AudioManager f19619b;

    public t0(AudioManager audioManager, int i10) {
        this.f19618a = i10;
        this.f19619b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19618a) {
            case 0:
                VoIPService.AnonymousClass1.lambda$run$1(this.f19619b);
                return;
            case 1:
                VoIPService.lambda$onDestroy$98(this.f19619b);
                return;
            default:
                VoipAudioManager.a(this.f19619b);
                return;
        }
    }
}
