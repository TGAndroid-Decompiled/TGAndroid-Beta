package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class s0 implements Runnable {
    public final int f19906a;
    public final AudioManager f19907b;

    public s0(AudioManager audioManager, int i10) {
        this.f19906a = i10;
        this.f19907b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19906a) {
            case 0:
                VoIPService.AnonymousClass1.lambda$run$1(this.f19907b);
                return;
            case 1:
                VoIPService.lambda$onDestroy$98(this.f19907b);
                return;
            default:
                VoipAudioManager.a(this.f19907b);
                return;
        }
    }
}
