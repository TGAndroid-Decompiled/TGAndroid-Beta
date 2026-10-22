package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class r0 implements Runnable {
    public final int f19922a;
    public final AudioManager f19923b;

    public r0(AudioManager audioManager, int i10) {
        this.f19922a = i10;
        this.f19923b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19922a) {
            case 0:
                VoIPService.AnonymousClass1.lambda$run$1(this.f19923b);
                return;
            case 1:
                VoIPService.lambda$onDestroy$98(this.f19923b);
                return;
            default:
                VoipAudioManager.a(this.f19923b);
                return;
        }
    }
}
