package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class t0 implements Runnable {
    public final int f19395a;
    public final AudioManager f19396b;

    public t0(AudioManager audioManager, int i10) {
        this.f19395a = i10;
        this.f19396b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19395a) {
            case 0:
                VoIPService.AnonymousClass1.lambda$run$1(this.f19396b);
                return;
            case 1:
                VoIPService.lambda$onDestroy$98(this.f19396b);
                return;
            default:
                VoipAudioManager.a(this.f19396b);
                return;
        }
    }
}
