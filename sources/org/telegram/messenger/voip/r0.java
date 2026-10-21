package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class r0 implements Runnable {
    public final int f19901a;
    public final AudioManager f19902b;

    public r0(AudioManager audioManager, int i10) {
        this.f19901a = i10;
        this.f19902b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19901a) {
            case 0:
                VoIPService.AnonymousClass1.lambda$run$1(this.f19902b);
                return;
            case 1:
                VoIPService.lambda$onDestroy$98(this.f19902b);
                return;
            default:
                VoipAudioManager.a(this.f19902b);
                return;
        }
    }
}
