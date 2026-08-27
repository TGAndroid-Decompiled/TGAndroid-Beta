package org.telegram.messenger.voip;

import android.media.AudioManager;

public final class n0 implements Runnable {

    public final int f21946a;

    public final VoIPService f21947b;

    public final AudioManager f21948c;

    public n0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f21946a = i10;
        this.f21947b = voIPService;
        this.f21948c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f21946a) {
            case 0:
                this.f21947b.lambda$configureDeviceForCall$111(this.f21948c);
                break;
            default:
                this.f21947b.lambda$configureDeviceForCall$110(this.f21948c);
                break;
        }
    }
}
