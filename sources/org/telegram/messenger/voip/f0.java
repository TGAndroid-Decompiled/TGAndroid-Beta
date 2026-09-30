package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class f0 implements Runnable {
    public final int f17900a;
    public final VoIPService f17901b;
    public final AudioManager f17902c;

    public f0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f17900a = i10;
        this.f17901b = voIPService;
        this.f17902c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f17900a) {
            case 0:
                this.f17901b.lambda$configureDeviceForCall$111(this.f17902c);
                return;
            default:
                this.f17901b.lambda$configureDeviceForCall$112(this.f17902c);
                return;
        }
    }
}
