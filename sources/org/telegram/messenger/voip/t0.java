package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class t0 implements Runnable {
    public final int f20473a;
    public final AudioManager f20474b;

    public t0(AudioManager audioManager, int i10) {
        this.f20473a = i10;
        this.f20474b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f20473a) {
            case 0:
                VoIPService.AnonymousClass1.b(this.f20474b);
                return;
            case 1:
                VoIPService.G(this.f20474b);
                return;
            default:
                VoIPService.n1(this.f20474b);
                return;
        }
    }
}
