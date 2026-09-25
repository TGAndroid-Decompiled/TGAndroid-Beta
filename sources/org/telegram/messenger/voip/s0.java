package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class s0 implements Runnable {
    public final int f17950a;
    public final AudioManager f17951b;

    public s0(AudioManager audioManager, int i10) {
        this.f17950a = i10;
        this.f17951b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f17950a) {
            case 0:
                VoIPService.AnonymousClass1.lambda$run$1(this.f17951b);
                return;
            case 1:
                VoIPService.lambda$onDestroy$98(this.f17951b);
                return;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$112(this.f17951b);
                return;
        }
    }
}
