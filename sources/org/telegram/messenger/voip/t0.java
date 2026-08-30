package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class t0 implements Runnable {
    public final int f18840a;
    public final AudioManager f18841b;

    public t0(AudioManager audioManager, int i10) {
        this.f18840a = i10;
        this.f18841b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f18840a) {
            case 0:
                VoIPService.AnonymousClass1.lambda$run$1(this.f18841b);
                return;
            case 1:
                VoIPService.lambda$onDestroy$98(this.f18841b);
                return;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$112(this.f18841b);
                return;
        }
    }
}
