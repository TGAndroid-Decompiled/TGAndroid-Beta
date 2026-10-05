package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class t0 implements Runnable {
    public final int f19616a;
    public final AudioManager f19617b;

    public t0(AudioManager audioManager, int i10) {
        this.f19616a = i10;
        this.f19617b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19616a) {
            case 0:
                VoIPService.AnonymousClass1.lambda$run$1(this.f19617b);
                return;
            case 1:
                VoIPService.lambda$onDestroy$98(this.f19617b);
                return;
            default:
                VoipAudioManager.a(this.f19617b);
                return;
        }
    }
}
