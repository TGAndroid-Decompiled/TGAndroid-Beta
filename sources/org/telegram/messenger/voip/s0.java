package org.telegram.messenger.voip;

import android.media.AudioManager;

public final class s0 implements Runnable {

    public final int f21970a;

    public final AudioManager f21971b;

    public s0(AudioManager audioManager, int i10) {
        this.f21970a = i10;
        this.f21971b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f21970a) {
            case 0:
                VoIPService.AnonymousClass1.lambda$run$1(this.f21971b);
                break;
            case 1:
                VoIPService.lambda$onDestroy$98(this.f21971b);
                break;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$112(this.f21971b);
                break;
        }
    }
}
