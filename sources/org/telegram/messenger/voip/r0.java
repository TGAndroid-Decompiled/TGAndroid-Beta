package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class r0 implements Runnable {
    public final int f19925a;
    public final AudioManager f19926b;

    public r0(AudioManager audioManager, int i10) {
        this.f19925a = i10;
        this.f19926b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19925a) {
            case 0:
                VoIPService.AnonymousClass1.lambda$run$1(this.f19926b);
                return;
            case 1:
                VoIPService.lambda$onDestroy$98(this.f19926b);
                return;
            default:
                VoipAudioManager.a(this.f19926b);
                return;
        }
    }
}
