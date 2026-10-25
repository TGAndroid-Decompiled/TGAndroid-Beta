package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class r0 implements Runnable {
    public final int f21687a;
    public final AudioManager f21688b;

    public r0(AudioManager audioManager, int i10) {
        this.f21687a = i10;
        this.f21688b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f21687a) {
            case 0:
                VoIPService.AnonymousClass1.lambda$run$1(this.f21688b);
                return;
            case 1:
                VoIPService.lambda$onDestroy$98(this.f21688b);
                return;
            default:
                VoipAudioManager.a(this.f21688b);
                return;
        }
    }
}
