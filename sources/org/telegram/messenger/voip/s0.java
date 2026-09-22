package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class s0 implements Runnable {
    public final int f17946a;
    public final AudioManager f17947b;

    public s0(AudioManager audioManager, int i10) {
        this.f17946a = i10;
        this.f17947b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f17946a) {
            case 0:
                VoIPService.AnonymousClass1.lambda$run$1(this.f17947b);
                return;
            case 1:
                VoIPService.lambda$onDestroy$98(this.f17947b);
                return;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$112(this.f17947b);
                return;
        }
    }
}
