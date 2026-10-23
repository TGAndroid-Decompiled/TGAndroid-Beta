package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class r0 implements Runnable {
    public final int f19990a;
    public final AudioManager f19991b;

    public r0(AudioManager audioManager, int i10) {
        this.f19990a = i10;
        this.f19991b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19990a) {
            case 0:
                VoIPService.AnonymousClass1.lambda$run$1(this.f19991b);
                return;
            case 1:
                VoIPService.lambda$onDestroy$98(this.f19991b);
                return;
            default:
                VoipAudioManager.a(this.f19991b);
                return;
        }
    }
}
