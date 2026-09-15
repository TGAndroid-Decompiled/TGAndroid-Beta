package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class o0 implements Runnable {
    public final int f17691a;
    public final VoIPService f17692b;
    public final AudioManager f17693c;

    public o0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f17691a = i10;
        this.f17692b = voIPService;
        this.f17693c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f17691a) {
            case 0:
                VoIPService.z(this.f17692b, this.f17693c);
                return;
            default:
                this.f17692b.lambda$configureDeviceForCall$110(this.f17693c);
                return;
        }
    }
}
