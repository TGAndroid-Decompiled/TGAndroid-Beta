package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class s0 implements Runnable {
    public final int f21946a;
    public final AudioManager f21947b;

    public s0(AudioManager audioManager, int i9) {
        this.f21946a = i9;
        this.f21947b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f21946a) {
            case 0:
                VoIPService.AnonymousClass1.lambda$run$1(this.f21947b);
                return;
            case 1:
                VoIPService.lambda$onDestroy$98(this.f21947b);
                return;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$112(this.f21947b);
                return;
        }
    }
}
