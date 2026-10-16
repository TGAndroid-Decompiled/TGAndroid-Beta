package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class f0 implements Runnable {
    public final int f18494a;
    public final VoIPService f18495b;
    public final AudioManager f18496c;

    public f0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f18494a = i10;
        this.f18495b = voIPService;
        this.f18496c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f18494a) {
            case 0:
                this.f18495b.lambda$configureDeviceForCall$111(this.f18496c);
                return;
            default:
                this.f18495b.lambda$configureDeviceForCall$112(this.f18496c);
                return;
        }
    }
}
