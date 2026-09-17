package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class s0 implements Runnable {
    public final int f19459a;
    public final AudioManager f19460b;

    public s0(AudioManager audioManager, int i10) {
        this.f19459a = i10;
        this.f19460b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19459a) {
            case 0:
                VoIPService.AnonymousClass1.lambda$run$1(this.f19460b);
                return;
            case 1:
                VoIPService.lambda$onDestroy$98(this.f19460b);
                return;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$112(this.f19460b);
                return;
        }
    }
}
