package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class u0 implements Runnable {
    public final int f19632a;
    public final AudioManager f19633b;

    public u0(AudioManager audioManager, int i10) {
        this.f19632a = i10;
        this.f19633b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19632a) {
            case 0:
                VoIPService.AnonymousClass1.lambda$run$1(this.f19633b);
                return;
            case 1:
                VoIPService.lambda$onDestroy$98(this.f19633b);
                return;
            default:
                VoipAudioManager.a(this.f19633b);
                return;
        }
    }
}
