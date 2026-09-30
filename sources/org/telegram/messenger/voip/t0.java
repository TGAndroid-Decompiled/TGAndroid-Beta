package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class t0 implements Runnable {
    public final int f17962a;
    public final AudioManager f17963b;

    public t0(AudioManager audioManager, int i10) {
        this.f17962a = i10;
        this.f17963b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f17962a) {
            case 0:
                VoIPService.AnonymousClass1.lambda$run$1(this.f17963b);
                return;
            case 1:
                VoIPService.lambda$onDestroy$98(this.f17963b);
                return;
            default:
                VoipAudioManager.a(this.f17963b);
                return;
        }
    }
}
