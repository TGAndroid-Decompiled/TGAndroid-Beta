package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class s0 implements Runnable {
    public final int f22010a;
    public final AudioManager f22011b;

    public s0(AudioManager audioManager, int i10) {
        this.f22010a = i10;
        this.f22011b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f22010a) {
            case 0:
                VoIPService.AnonymousClass1.lambda$run$1(this.f22011b);
                return;
            case 1:
                VoIPService.lambda$onDestroy$98(this.f22011b);
                return;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$112(this.f22011b);
                return;
        }
    }
}
