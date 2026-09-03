package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class t0 implements Runnable {
    public final int f18822a;
    public final AudioManager f18823b;

    public t0(AudioManager audioManager, int i10) {
        this.f18822a = i10;
        this.f18823b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f18822a) {
            case 0:
                VoIPService.AnonymousClass1.b(this.f18823b);
                return;
            case 1:
                VoIPService.G(this.f18823b);
                return;
            default:
                VoIPService.n1(this.f18823b);
                return;
        }
    }
}
