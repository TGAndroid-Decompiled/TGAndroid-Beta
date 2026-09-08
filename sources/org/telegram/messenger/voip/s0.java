package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class s0 implements Runnable {
    public final int f19445a;
    public final AudioManager f19446b;

    public s0(AudioManager audioManager, int i10) {
        this.f19445a = i10;
        this.f19446b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19445a) {
            case 0:
                VoIPService.AnonymousClass1.lambda$run$1(this.f19446b);
                return;
            case 1:
                VoIPService.lambda$onDestroy$98(this.f19446b);
                return;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$112(this.f19446b);
                return;
        }
    }
}
