package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class q0 implements Runnable {
    public final int f26049a;
    public final AudioManager f26050b;

    public q0(AudioManager audioManager, int i3) {
        this.f26049a = i3;
        this.f26050b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f26049a) {
            case 0:
                VoIPService.AnonymousClass1.b(this.f26050b);
                return;
            case 1:
                VoIPService.K(this.f26050b);
                return;
            default:
                VoipAudioManager.a(this.f26050b);
                return;
        }
    }
}
