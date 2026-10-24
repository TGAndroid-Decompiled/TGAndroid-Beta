package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class r0 implements Runnable {
    public final int f19985a;
    public final AudioManager f19986b;

    public r0(AudioManager audioManager, int i10) {
        this.f19985a = i10;
        this.f19986b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19985a) {
            case 0:
                VoIPService.AnonymousClass1.lambda$run$1(this.f19986b);
                return;
            case 1:
                VoIPService.lambda$onDestroy$98(this.f19986b);
                return;
            default:
                VoipAudioManager.a(this.f19986b);
                return;
        }
    }
}
