package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class r0 implements Runnable {
    public final int f19910a;
    public final AudioManager f19911b;

    public r0(AudioManager audioManager, int i10) {
        this.f19910a = i10;
        this.f19911b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19910a) {
            case 0:
                VoIPService.AnonymousClass1.b(this.f19911b);
                return;
            case 1:
                VoIPService.K(this.f19911b);
                return;
            default:
                VoipAudioManager.a(this.f19911b);
                return;
        }
    }
}
