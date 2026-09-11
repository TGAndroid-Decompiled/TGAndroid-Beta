package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class s0 implements Runnable {
    public final int f19432a;
    public final AudioManager f19433b;

    public s0(AudioManager audioManager, int i10) {
        this.f19432a = i10;
        this.f19433b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19432a) {
            case 0:
                VoIPService.AnonymousClass1.lambda$run$1(this.f19433b);
                return;
            case 1:
                VoIPService.lambda$onDestroy$98(this.f19433b);
                return;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$112(this.f19433b);
                return;
        }
    }
}
