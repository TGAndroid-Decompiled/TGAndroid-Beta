package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class q0 implements Runnable {
    public final int f26169a;
    public final AudioManager f26170b;

    public q0(AudioManager audioManager, int i7) {
        this.f26169a = i7;
        this.f26170b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f26169a) {
            case 0:
                VoIPService.AnonymousClass1.lambda$run$1(this.f26170b);
                return;
            case 1:
                VoIPService.lambda$onDestroy$98(this.f26170b);
                return;
            default:
                VoipAudioManager.a(this.f26170b);
                return;
        }
    }
}
