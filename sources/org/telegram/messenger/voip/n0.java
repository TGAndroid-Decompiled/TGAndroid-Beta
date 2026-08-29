package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class n0 implements Runnable {
    public final int f21987a;
    public final VoIPService f21988b;
    public final AudioManager f21989c;

    public n0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f21987a = i10;
        this.f21988b = voIPService;
        this.f21989c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f21987a) {
            case 0:
                this.f21988b.lambda$configureDeviceForCall$111(this.f21989c);
                return;
            default:
                this.f21988b.lambda$configureDeviceForCall$110(this.f21989c);
                return;
        }
    }
}
