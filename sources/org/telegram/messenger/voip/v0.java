package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class v0 implements Runnable {
    public final int f16795a;
    public final AudioManager f16796b;

    public v0(AudioManager audioManager, int i10) {
        this.f16795a = i10;
        this.f16796b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f16795a) {
            case 0:
                VoIPService.AnonymousClass1.b(this.f16796b);
                return;
            case 1:
                VoIPService.G(this.f16796b);
                return;
            default:
                VoIPService.n1(this.f16796b);
                return;
        }
    }
}
