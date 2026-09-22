package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class o0 implements Runnable {
    public final int f17930a;
    public final VoIPService f17931b;
    public final AudioManager f17932c;

    public o0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f17930a = i10;
        this.f17931b = voIPService;
        this.f17932c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f17930a) {
            case 0:
                this.f17931b.lambda$configureDeviceForCall$111(this.f17932c);
                return;
            default:
                this.f17931b.lambda$configureDeviceForCall$110(this.f17932c);
                return;
        }
    }
}
