package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class o0 implements Runnable {
    public final int f18819a;
    public final VoIPService f18820b;
    public final AudioManager f18821c;

    public o0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f18819a = i10;
        this.f18820b = voIPService;
        this.f18821c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f18819a) {
            case 0:
                this.f18820b.lambda$configureDeviceForCall$111(this.f18821c);
                return;
            default:
                this.f18820b.lambda$configureDeviceForCall$110(this.f18821c);
                return;
        }
    }
}
