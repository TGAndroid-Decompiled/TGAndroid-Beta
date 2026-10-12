package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class u0 implements Runnable {
    public final int f18864a;
    public final AudioManager f18865b;

    public u0(AudioManager audioManager, int i10) {
        this.f18864a = i10;
        this.f18865b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f18864a) {
            case 0:
                VoIPService.AnonymousClass1.lambda$run$1(this.f18865b);
                return;
            case 1:
                VoIPService.lambda$onDestroy$98(this.f18865b);
                return;
            default:
                VoipAudioManager.a(this.f18865b);
                return;
        }
    }
}
