package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class t0 implements Runnable {
    public final int f20475a;
    public final AudioManager f20476b;

    public t0(AudioManager audioManager, int i10) {
        this.f20475a = i10;
        this.f20476b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f20475a) {
            case 0:
                VoIPService.AnonymousClass1.b(this.f20476b);
                return;
            case 1:
                VoIPService.G(this.f20476b);
                return;
            default:
                VoIPService.n1(this.f20476b);
                return;
        }
    }
}
