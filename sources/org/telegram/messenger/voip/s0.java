package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class s0 implements Runnable {
    public final int f17935a;
    public final AudioManager f17936b;

    public s0(AudioManager audioManager, int i10) {
        this.f17935a = i10;
        this.f17936b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f17935a) {
            case 0:
                VoIPService.AnonymousClass1.lambda$run$1(this.f17936b);
                return;
            case 1:
                VoIPService.lambda$onDestroy$98(this.f17936b);
                return;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$112(this.f17936b);
                return;
        }
    }
}
