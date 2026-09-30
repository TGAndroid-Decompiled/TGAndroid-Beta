package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class o0 implements Runnable {
    public final int f17961a;
    public final VoIPService f17962b;
    public final AudioManager f17963c;

    public o0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f17961a = i10;
        this.f17962b = voIPService;
        this.f17963c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f17961a) {
            case 0:
                this.f17962b.lambda$configureDeviceForCall$111(this.f17963c);
                return;
            default:
                this.f17962b.lambda$configureDeviceForCall$110(this.f17963c);
                return;
        }
    }
}
