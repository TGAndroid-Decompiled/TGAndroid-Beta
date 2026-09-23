package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class s0 implements Runnable {
    public final int f17691a;
    public final AudioManager f17692b;

    public s0(AudioManager audioManager, int i10) {
        this.f17691a = i10;
        this.f17692b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f17691a) {
            case 0:
                VoIPService.AnonymousClass1.lambda$run$1(this.f17692b);
                return;
            case 1:
                VoIPService.lambda$onDestroy$98(this.f17692b);
                return;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$112(this.f17692b);
                return;
        }
    }
}
