package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class s0 implements Runnable {
    public final int f17893a;
    public final AudioManager f17894b;

    public s0(AudioManager audioManager, int i10) {
        this.f17893a = i10;
        this.f17894b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f17893a) {
            case 0:
                VoIPService.AnonymousClass1.lambda$run$1(this.f17894b);
                return;
            case 1:
                VoIPService.lambda$onDestroy$98(this.f17894b);
                return;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$112(this.f17894b);
                return;
        }
    }
}
