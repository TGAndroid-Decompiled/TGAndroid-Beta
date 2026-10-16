package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class u0 implements Runnable {
    public final int f18560a;
    public final AudioManager f18561b;

    public u0(AudioManager audioManager, int i10) {
        this.f18560a = i10;
        this.f18561b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f18560a) {
            case 0:
                VoIPService.AnonymousClass1.lambda$run$1(this.f18561b);
                return;
            case 1:
                VoIPService.lambda$onDestroy$98(this.f18561b);
                return;
            default:
                VoipAudioManager.a(this.f18561b);
                return;
        }
    }
}
