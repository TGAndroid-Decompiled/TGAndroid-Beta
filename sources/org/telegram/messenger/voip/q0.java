package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class q0 implements Runnable {
    public final int f26151a;
    public final AudioManager f26152b;

    public q0(AudioManager audioManager, int i7) {
        this.f26151a = i7;
        this.f26152b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f26151a) {
            case 0:
                VoIPService.AnonymousClass1.b(this.f26152b);
                return;
            case 1:
                VoIPService.K(this.f26152b);
                return;
            default:
                VoipAudioManager.a(this.f26152b);
                return;
        }
    }
}
